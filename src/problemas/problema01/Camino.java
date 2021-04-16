package problemas.problema01;

import java.util.ArrayList;
import java.util.List;

public class Camino{
	List<Coordenada> puntosRecorrido;
	
	
	///////////// CONSTRUCTORES /////////////
	
	public Camino() {
		puntosRecorrido = new ArrayList<Coordenada>();
	}
	
	
	///////////// OTROS METODOS /////////////
	
	public void agregar(Coordenada x) {
		puntosRecorrido.add(x);
	}
	
	
	public void agregar(double lat, double lng) {
		Coordenada aux = new Coordenada(lat, lng);
		
		puntosRecorrido.add(aux);
	}
	
	
	public List<Coordenada> buscar(Coordenada no, Coordenada se) {
		List<Coordenada> retorno = new ArrayList<Coordenada>();
		Coordenada aux;
		
		for (int i=0; i<this.puntosRecorrido.size(); i++) {
			aux = (Coordenada) puntosRecorrido.get(i).clone();
			
			if (aux.estaDentroLimites(no, se)) {
				retorno.add(aux);
			}
		}
		
		
		return retorno;
	}
}
