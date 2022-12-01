import java.util.ArrayList;

public class Ronda {

	private ArrayList<Integer> aventureros, desplazamientos, no_cebadores;
	private int cebador;
	
	public Ronda(ArrayList<Integer> aventureros,  ArrayList<Integer> desplazamientos) {
		this.aventureros = aventureros;
		this.desplazamientos = desplazamientos;
		this.no_cebadores = new ArrayList<Integer>();
	}
	
	// Complejidad Computacional O(n)
	public void resolver() {
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> aventureros_aux = (ArrayList<Integer>) this.aventureros.clone();
		
		int posActual = 0;
		
		for (int i = 0; i < this.desplazamientos.size(); i++) {
			
			int desplazamiento = this.desplazamientos.get(i);
			
			posActual = (posActual + desplazamiento) % aventureros_aux.size();
			
			if (posActual == aventureros_aux.size()) {
				posActual = 0;
			}
			
			this.no_cebadores.add(aventureros_aux.remove(posActual));
			
		}
		
		cebador = aventureros_aux.get(0);
	
	}
	
	public int getCebador() {
		return this.cebador;
	}
	
	public ArrayList<Integer> get_no_cebadores() {
		return this.no_cebadores;
	}
	
}
