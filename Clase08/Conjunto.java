import java.util.HashSet;
import java.util.Set;
// import java.util.TreeSet;

public class Conjunto {

	// Caracteristicas de un conjunto
	// No se repiten
	// No importa el orden

	// Para conjuntos se usa la interfaz Set

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> conjunto = new HashSet<String>();

		
		conjunto.add("Facundo");
		conjunto.add("Gonzalo");
		conjunto.add("Lucila");
		conjunto.add("Diego");
		conjunto.add("Andrea");
		conjunto.add("Mirta");
		conjunto.add("Omar");
		
		// Mostramos la conjunto
		System.out.println(conjunto);

		// Insertamos elemento a la conjunto
		// conjunto.add(5, 15); no puede ingreser en una posicion especifica porque no le importa el orden

		// Mostramos la conjunto
		System.out.println("");
		System.out.println(conjunto);
		System.out.println("");

		// Eliminamos un elemento de la lisata
		conjunto.remove("5");

		// Mostramos la conjunto
		System.out.println("");
		System.out.println(conjunto);
		System.out.println("");

		// Buscamos en la conjunto
		// System.out.println("Elemento encontrado: " + conjunto.indexOf(5)); no tiene index of porque a un conjunto no le importa en que posicion esta un elemento

		// Recorrer la conjunto

		for (String elem : conjunto) {
			System.out.println("=> " + elem);
		}

		// (Imprimir) Mostramos la conjunto
		System.out.println("");
		System.out.println(conjunto);
		System.out.println("");

		// conjunto vacia
		conjunto.clear();

		// Mostramos la conjunto
		System.out.println("");
		System.out.println(conjunto);
		System.out.println("");

		// Tama�o
		System.out.println("Conjunto Size => " + conjunto.size());

		// Esta vacia?
		System.out.println("conjunto vacia => " + conjunto.isEmpty());
	}

}
