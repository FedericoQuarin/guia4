package problemas.problema02;

public class PedidoBasico extends Pedido {
	Boolean express;
	
	
	//////////////// CONSTRUCTOR ////////////////
	
	public PedidoBasico(Boolean express) {
		super(5);
		this.express = express;
	}
	
	//////////////// Metodos requeridos ////////////////
	
	public float precio() {
		float costo = 0;
		
		for (Producto p : this.listaProductos) {
			costo += p.getCosto();
		}
		
		costo += costo * 0.05f;
		
		if (express) costo += costo * 0.2f;
		
		return Math.round(costo * 100.0) / 100.0f;
	}
	
	public float comision() {
		return Math.round(this.precio() * 0.1f * 100.0) / 100.0f;
	}
}
