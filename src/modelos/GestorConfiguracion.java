package modelos;

public class GestorConfiguracion {

	private static GestorConfiguracion instance = null;

	private String urlBd;
	private String userBd;
	private String pathReportes;

	// constructor privado
	private GestorConfiguracion() {
	}

	// maneja única instancia
	public static synchronized GestorConfiguracion getInstance() {
		if (instance == null) {
			instance = new GestorConfiguracion();
		}
		return instance;
	}


	// getters
	public String getUrlBd() {
		return urlBd;
	}

	public String getUserBd() {
		return userBd;
	}

	
	public String getPathReportes() {
		return pathReportes;
	}


	// setters
	public synchronized void setUrlBd(String urlBd) {
		this.urlBd = urlBd;
	}


	public synchronized void setUserBd(String userBd) {
		this.userBd = userBd;
	}


	public synchronized void setPathReportes(String pathReportes) {
		this.pathReportes = pathReportes;
	}

	@Override
	public String toString() {
		return "GestorConfiguracion{" +
				"urlBd='" + urlBd + '\'' +
				", userBd='" + userBd + '\'' +
				", pathReportes='" + pathReportes + '\'' +
				'}';
	}
}
 
