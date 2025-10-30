package servicio;
import modelos.Reporte;

public interface IRenderizador {

    // Interfaz renderizador, unica interfaz que conoce el cliente

    //debe incluir la clase Reporte del requerimiento 2 para renderizar

    void renderizar(Reporte reporte);

}
