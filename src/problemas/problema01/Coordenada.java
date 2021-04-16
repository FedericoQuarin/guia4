package problemas.problema01;


public class Coordenada implements Cloneable{
	private double latitud, longitud;
	
	
	///////////// Constructores /////////////
	
	public Coordenada () {
		this.latitud = 0;
		this.longitud = 0;
	}
	
	public Coordenada (double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	
	///////////// GETTERS - SETTERS /////////////

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	///////////// OTROS METODOS /////////////
	
	// Devuelve true si la coordenada pasada por parametro es igual a la coordenada a la cual se le 
	// envio el mensaje. En caso contrario, retorna false
	
	public boolean equals(Coordenada coordenada) {
		return (this.latitud == coordenada.getLatitud() && this.longitud == coordenada.getLongitud());
	}
	
	public String toString() {
		return "(" + this.latitud + ", " + this.longitud + ")"; 
	}
	
	public Boolean estaDentroLimites(Coordenada no, Coordenada se) {
		return (this.latitud >= se.getLatitud() && this.latitud <= no.getLatitud() &&
				this.longitud >= no.getLongitud() && this.longitud <= se.getLongitud() );
	}
	
	@Override
	protected Object clone() {
		return new Coordenada(this.latitud, this.longitud);
	}
	
}
