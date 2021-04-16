package problemas.problema02;

import java.util.List;
import java.util.ArrayList;


public class Cadete {
	List<Pedido> listaPedidos;
	
	//////////////// CONSTRUCTOR ////////////////
	
	public Cadete() {
		this.listaPedidos = new ArrayList<>();
	}
	
	
	//////////////// Metodos Requeridos ////////////////
	
	public void agregarPedido(Pedido p) {
		this.listaPedidos.add(p);
	}
	
	
	public float comisiones() {
		float comisiones = 0;
		
		for (Pedido p : this.listaPedidos) {
			comisiones += p.comision();
		}
		
		return comisiones;
	}
}
