import java.util.LinkedList;
import java.util.List;

public class ListaEnlazada {
	
	// Constantes
	
	// Atributos
	
	// Constructor
	
	// Metodos
	
	// Overrides

	public static void main(String[] args) {
		
		List<Integer> lista = new LinkedList<Integer>();
		
		// Agregamos elementos a la lista
		for (int i = 0; i < 10; i++)
		{
			lista.add(i);
		}
		
		// Mostramos la lista
		System.out.println(lista);
		
		// Insertamos elemento a la lista
		lista.add(5, 15);
		
		// Mostramos la lista
		System.out.println("");
		System.out.println(lista);
		System.out.println("");
		
		// Eliminamos un elemento de la lisata
		lista.remove(5);
		
		// Mostramos la lista
		System.out.println("");
		System.out.println(lista);
		System.out.println("");
		
		// Buscamos en la lista
		System.out.println("Elemento encontrado: " + lista.indexOf(5));
		
		
		// Recorrer la lista
		
		for (Integer elem : lista) {
			System.out.println("=> " + elem);
		}
		
		// (Imprimir) Mostramos la lista
		System.out.println("");
		System.out.println(lista);
		System.out.println("");
		
		
		// Lista vacia
		lista.clear();
				
		// Mostramos la lista
		System.out.println("");
		System.out.println(lista);
		System.out.println("");
		
		// Tama�o
		System.out.println("List Size => " + lista.size());
		
		// Esta vacia?
		System.out.println("Lista vacia => " + lista.isEmpty());
	}

}
