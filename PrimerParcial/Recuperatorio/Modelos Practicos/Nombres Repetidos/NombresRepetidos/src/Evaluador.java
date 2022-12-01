import java.util.ArrayList;
import java.util.HashMap;

public class Evaluador {

	private HashMap<String, Integer> map_nombres = new HashMap<String, Integer>();
	private ArrayList<String> lista_nombres;
	private int cant_a_buscar;

	public Evaluador(ArrayList<String> lista_nombres, int cant_a_buscar) {
		this.lista_nombres = lista_nombres;
		this.cant_a_buscar = cant_a_buscar;
		
		this.fill_map();
	}

	// Complejidad Computacional O(n)
	public ArrayList<Resultado> obtener_resultado() {
		ArrayList<Resultado> res = new ArrayList<>();
		ArrayList<String> aux_lista_nombres = this.lista_nombres;

		for (int i = 0; i < this.cant_a_buscar; i++) {
			Resultado maximo = get_max(aux_lista_nombres);
			res.add(maximo);
			this.remove_name_from_list(maximo.nombre, aux_lista_nombres);
		}

		return res;
	}

	// Complejidad Computacional O(n)
	private void fill_map() {
		for (String nombre : lista_nombres) {
			Integer cant = map_nombres.getOrDefault(nombre, 0);
			map_nombres.put(nombre, cant + 1);
		}
	}
	
	// Complejidad Computacional O(n)
	private void remove_name_from_list(String name, ArrayList<String> list) {
		while(list.contains(name)) {
			list.remove(list.indexOf(name));
		}
	}
	
	// Complejidad Computacional O(n)
	public Resultado get_max(ArrayList<String> lista) {
		Resultado res = new Resultado(null, 0);

		// Buscamos el maximo
		for (String nombre : lista) {
			Integer value = map_nombres.getOrDefault(nombre, 0);
			if (res.cant < value) {
				res.nombre = nombre;
				res.cant = value;
			}
		}

		return res;
	}
}
