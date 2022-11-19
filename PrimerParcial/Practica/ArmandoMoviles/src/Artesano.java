import java.util.ArrayList;
import java.util.HashMap;

public class Artesano {
	
	// Atributos
	protected ArrayList<Movil> moviles = new ArrayList<Movil>();
	
	protected HashMap<Integer, Integer> colgantes = new HashMap<Integer, Integer>();
	// key => peso
	// value => cantidad de colgantes con el mismo peso
	
	// Metodos
	public void armar_moviles(int[] pesosColgantes) {
		
		// Armamos el mapa de colgantes
		for (int i : pesosColgantes) {
			colgantes.put(i, colgantes.getOrDefault(i, 0) + 1);
		}
		
		// Si algun colgante tiene 2 o mas se podran armar los moviles
		colgantes.forEach((peso, cant) -> {
			if (cant >= 2) {
				// Se puede armar el movil
				this.crear_moviles(peso, cant);
			}
		});
	}
	
	public int peso_total_moviles() {
		int pesoTotal = 0;
		
		for (Movil movil : moviles) {
			pesoTotal += movil.peso_del_movil();
		}
		
		return pesoTotal;
	}
	
	private void crear_moviles(int peso, int cant) {
		
		if ((cant % 2) == 0) {
			// puedo armar v/2 moviles
			for (int i = 0; i < (cant/2); i++) {
				moviles.add(new Movil(peso));
			}
			
		} else {
			// puedo crear (v/2)-1 moviles
			for (int i = 0; i < ((cant/2) - 1); i++) {
				moviles.add(new Movil(peso));
			}
		}
		
	}
}
