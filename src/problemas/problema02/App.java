package problemas.problema02;

public class App {
	public static void main(String[] args) {
		Pedido ped1 = new PedidoPremium();
		Pedido ped2 = new PedidoBasico(false);
		Pedido ped3 = new PedidoPremium();
		Pedido ped4 = new PedidoPremium();
		
		Producto p1 = new Producto("Naranjas", 100);
		Producto p2 = new Producto("Manzanas", 150);
		Producto p3 = new Producto("Bananas", 80);
		Producto p4 = new Producto("Kiwis", 205);
		Producto p5 = new Producto("Peras", 33);
		Producto p6 = new Producto("Duraznos", 130);
		Producto p7 = new Producto("Ciruelas", 140);
		Producto p8 = new Producto("Paltas", 200);
		Producto p9 = new Producto("Un ananá", 80);
		Producto p10 = new Producto("Papas", 100);
		Producto p11 = new Producto("Cebollas", 90);
		Producto p12 = new Producto("Un morron", 500);
		
		System.out.println("p1 agregado a ped1: " + ped1.agregarProducto(p1));
		System.out.println("p2 agregado a ped1: " + ped1.agregarProducto(p2));
		System.out.println("p3 agregado a ped1: " + ped1.agregarProducto(p3));
		System.out.println("p4 agregado a ped1: " + ped1.agregarProducto(p4));
		System.out.println("p5 agregado a ped1: " + ped1.agregarProducto(p5));
		System.out.println("p6 agregado a ped1: " + ped1.agregarProducto(p6));
		
		System.out.println(ped1.precio());
		System.out.println(ped1.comision());
		
	}
}
