package modelos;

import java.time.LocalDate;


public class Reporte {

    private String titulo = "";
    private String cuerpo = "";
    private String encabezado = "";
    private String piePagina = "";
    private String autor = "";
    private LocalDate fecha = null;
    private Orientacion orientacion = Orientacion.VERTICAL;

    // privado para forzar uso de Reporte.crear(titulo,cuerpo)
    private Reporte() { }
    
    // datos obligatorios
    public static Reporte crear(String titulo, String cuerpo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título es obligatorio");
        }
        if (cuerpo == null || cuerpo.trim().isEmpty()) {
            throw new IllegalArgumentException("El cuerpo principal es obligatorio");
        }
        Reporte r = new Reporte();
        r.titulo = titulo;
        r.cuerpo = cuerpo;
        return r;
    }

    // métodos
    public Reporte conEncabezado(String encabezado) { 
        this.encabezado = encabezado; 
        return this; 
    }

    public Reporte conPiePagina(String piePagina) { 
        this.piePagina = piePagina; 
        return this; 
    }
    
    public Reporte conAutor(String autor) { 
        this.autor = autor; 
        return this; 
    }

    public Reporte conFecha(LocalDate fecha) { 
        this.fecha = fecha; 
        return this; 
    }

    public Reporte conOrientacion(Orientacion orientacion) { 
        this.orientacion = orientacion; 
        return this; 
    }

    // getters
    public String getTitulo() { 
        return titulo; 
    }

    public String getCuerpo() { 
        return cuerpo; 
    }

    public String getEncabezado() { 
        return encabezado; 
    }

    public String getPiePagina() { 
        return piePagina; 
    }

    public String getAutor() { 
        return autor; 
    }

    public LocalDate getFecha() { 
        return fecha; 
    }

    public Orientacion getOrientacion() { 
        return orientacion; 
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "titulo='" + titulo + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", encabezado='" + encabezado + '\'' +
                ", piePagina='" + piePagina + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha=" + fecha +
                ", orientacion=" + orientacion +
                '}';
    }
}
