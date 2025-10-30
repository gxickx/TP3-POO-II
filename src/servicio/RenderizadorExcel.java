package servicio;
import modelos.Reporte;

public class RenderizadorExcel implements IRenderizador {

    @Override
    public void renderizar(Reporte reporte){ //aca tb va Reporte reporte
        System.out.println("Renderizando Excel");
    }

}
