package servicio;
import modelos.Reporte;

public class RenderizadorPDF implements IRenderizador {

    @Override
    public void renderizar(Reporte reporte){
        System.out.println("Renderizando PDF");
    }


}
