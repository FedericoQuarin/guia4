package problemas.problema02;

public class Producto {
	String descripcion;
	float costo;
	
	public Producto(String descripcion, float costo) {
		this.descripcion = descripcion;
		this.costo = costo;
	}
	
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
}
