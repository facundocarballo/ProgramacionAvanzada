import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Archivo archivo = new Archivo("caso00_enunciado");
		Calles calle = archivo.leerArchivo();
		ArrayList<Integer> camino = new ArrayList<Integer>();
		
		int[] distancia = calle.grafo.dijkstra(calle.desde);
		
		int[] predecedente = calle.grafo.predecedentes;
		for (int i : predecedente) {
			System.out.println(i);
		}
		int costo = distancia[calle.hasta];
		
		int[] distanciaModif = calle.grafo.dijkstraModificado(calle.desde);
		
		int costoModif = distanciaModif[calle.hasta];
		System.out.println();
		int[] predecedenteModif = calle.grafo.predecedentes;
		for (int i : predecedenteModif) {
			System.out.println(i);
		}
		for(int i = calle.hasta; i > 0; i--){
			if(predecedente[i] != predecedenteModif[i]){
				camino.add(predecedente[i]);
			}
		}
		
		System.out.println("Camino: " + camino.toString());
		
		if (costoModif < costo) {
			archivo.guardarArchivo(costoModif, camino);
		} else {
			archivo.guardarArchivo(costo, camino);
		}
		
		/* ANTES ESTABA ASI
		if(costoModif < costo){
		}
			archivo.guardarArchivo(costoModif, camino);
		
		*/
	}
}