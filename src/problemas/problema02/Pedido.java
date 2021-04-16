package problemas.problema02;

import java.util.List;
import java.util.ArrayList;

public abstract class Pedido {
	protected List<Producto> listaProductos;
	protected int maxPedidos;
	
	
	//////////////// CONSTRUCTOR ////////////////
	
	public Pedido(int maxPedidos) {
		this.listaProductos = new ArrayList<>();
		this.maxPedidos = maxPedidos;
	}
	
	//////////////// Metodos Requeridos ////////////////
	
	public Boolean agregarProducto(Producto p) {
		if (this.listaProductos.size() < this.maxPedidos) {
			this.listaProductos.add(p);
			return true;
		}
		else {
			return false;
		}
	}
	
	public abstract float precio();
	
	public abstract float comision();
	
	
	//////////////// Otros ////////////////
	
	public Boolean pedidoVacio() {
		return this.listaProductos.size() == 0;
	}
}
