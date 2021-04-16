package problemas.problema02;

public class PedidoPremium extends Pedido {
	
	//////////////// CONSTRUCTOR ////////////////
	
	public PedidoPremium() {
		super(20);
	}
	
	
	//////////////// Metodos requeridos ////////////////
	
	public float precio() {
		float costo = 0;
		
		for (Producto p : this.listaProductos) {
			costo += p.getCosto();
		}
		
		if (this.listaProductos.size() <= 5) {
			costo += costo * 0.2;
		}
		else {
			costo += costo * 0.3;
		}
		
		return Math.round(costo * 100.0) / 100.0f;
	}
	
	public float comision() {
		float comision = this.precio() * (float) 0.15;
		
		if (this.listaProductos.size() > 10) comision += 50;
		
		return Math.round(comision * 100.0) / 100.0f;
	}
}
