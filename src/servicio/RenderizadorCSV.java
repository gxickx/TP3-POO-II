package servicio;
import modelos.Reporte;

public class RenderizadorCSV implements IRenderizador {
    @Override
    public void renderizar(Reporte reporte){ //aca tb va Reporte reporte
        System.out.println("Renderizando CSV");
    }
}
