import modelos.*;
import servicio.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa desarrollado por Menacho Natalia M. & Roko María G.");
        System.out.println("Tests demonstrando el uso de los patrones Builder, Singleton y Factory.\n");

    // Singleton: configurar y leer valores
    GestorConfiguracion cfg = GestorConfiguracion.getInstance();
        cfg.setUrlBd("postgresql://postgres:postgres@localhost:5432/epico");
        cfg.setUserBd("admin");
    System.out.println("GestorConfiguracion 1: " + cfg + "\n");

    GestorConfiguracion cfg2 = GestorConfiguracion.getInstance();
        cfg2.setPathReportes("C:/temp/reportes");
    System.out.println("GestorConfiguracion 2: " + cfg2 + "\n");

    // comparamos y vemos que cfg tiene este cambio aunque no dijimos cfg.setPathReportes(path)
    System.out.println("GestorConfiguracion 1: " + cfg);
    System.out.println("Son iguales porque son el mismo GestorConfiguración.\n");

    // Builder: construir un reporte (título y cuerpo son obligatorios)
    Reporte reporte = Reporte.crear("Informe","Contenido del informe")
        .conEncabezado("Empresa Maravilla")
        .conAutor("Claudio Biale")
        .conFecha(java.time.LocalDate.now())
        .conOrientacion(Orientacion.HORIZONTAL);

    System.out.println("Reporte construido: " + reporte + "\n");

    
    // Factory: renderizando en tiempo de ejecución
    IRenderizador elegido = null;

    while (elegido == null) {
        System.out.print("Ingrese tipo de renderizador (pdf, excel, csv): ");
        String entrada = scanner.nextLine();
        if (entrada == null) break;
        entrada = entrada.trim();
        try {
            elegido = RenderizadorFactory.crearRenderizador(entrada);
        } catch (IllegalArgumentException ex) {
            System.out.println("Tipo inválido. Intente: pdf, excel o csv.");
        }
    }

    if (elegido != null) {
        System.out.println("Llamando al renderizador seleccionado:");
        elegido.renderizar(reporte);
    }
    scanner.close();


    }
}
