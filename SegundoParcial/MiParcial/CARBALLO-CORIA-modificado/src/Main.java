import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Archivo archivo = new Archivo("caso07– 8milx25milCalles");
		Calles calle = archivo.leerArchivo();
		ArrayList<Integer> camino = new ArrayList<Integer>();
		
		int[] distancia = calle.grafo.dijkstra(calle.desde);
		
		int[] predecedente = calle.grafo.predecedentes.clone();
		
		int costo = distancia[calle.hasta];
		
		int[] distanciaModif = calle.grafo.dijkstraModificado(calle.desde);
		
		int costoModif = distanciaModif[calle.hasta];
		
		
		int[] predecedenteModif = calle.grafo.predecedentes;
		
		
		for(int i = calle.hasta; i > 0; i--){
			if(predecedente[i] != predecedenteModif[i]){
				
				int p = i;
				
				calle.grafo.sentidoContrarioMin.forEach((key, value) -> {
					for (Nodo n : value) {
						if (n.getId() == p) {
							camino.add(n.getNumArista());
						}
					}
				});
			}
		}
		
		
		if (costoModif < costo) {
			archivo.guardarArchivo(costoModif, camino);
		} else {
			archivo.guardarArchivo(costo, camino);
		}
		
	}
}