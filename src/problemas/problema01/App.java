package problemas.problema01;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Coordenada c1 = new Coordenada(1, 2);
		Coordenada c2 = new Coordenada(2, 1);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		
		Camino camino = new Camino();
		
		Coordenada p1 = new Coordenada(1, 1);
		Coordenada p2 = new Coordenada(2, 1);
		Coordenada p3 = new Coordenada(2.1, 1);
		
		camino.agregar(c1);
		camino.agregar(p1);
		camino.agregar(p2);
		camino.agregar(p3);
		
		Coordenada no = new Coordenada(2, 0);
		Coordenada se = new Coordenada(0, 2);
		

		
		List<Coordenada> lista = camino.buscar(no, se);
		
		System.out.println(lista);
		
		
		
		
	}

}
