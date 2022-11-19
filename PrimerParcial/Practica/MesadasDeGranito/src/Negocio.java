import java.util.ArrayList;
//import java.util.Iterator;

public class Negocio {
	
	// Atributos
	protected ArrayList<Mesada> pilas = new ArrayList<Mesada>();
		
	// Metodo
	
	// Complejidad computacional n^2
	public int apilar_mesadas(Mesada[] mesadas) {

		pilas.add(mesadas[0]);
		
		// Complejidad computacional n
		for (int i = 1; i < mesadas.length; i++) {
			
			// Complejidad computacional n
			if (!insertar_en_pila_disponible(mesadas[i])) {
				pilas.add(mesadas[i]);
			}
			
		}
		
		return pilas.size();
	}
	
	// Complejidad computacional n
	private boolean insertar_en_pila_disponible(Mesada mesada) {
		
		boolean aceptado = false;
		int i = 0;
		
		while(!aceptado && i < pilas.size()) {
			
			aceptado = mesada.encaja(pilas.get(i));
			i++;
		}
		
		if (aceptado) {
			pilas.set(i - 1, mesada);
		}
		
		return aceptado;
	}
	
}
