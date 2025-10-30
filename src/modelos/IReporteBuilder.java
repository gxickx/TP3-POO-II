package modelos;
import java.time.LocalDate;

public interface IReporteBuilder {

    public void reset ();
    public void setEncabeado (String valor);
    public void setPiePagina (String valor);
    public void setFecha (LocalDate fecha);
    public void setAutor (String valor);
    public void setOrientacion (Orientacion valor);

}
