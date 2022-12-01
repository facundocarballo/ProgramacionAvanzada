
public class Main {

	public static void main(String[] args) {
		Archivo arch = new Archivo("caso10");
		Ronda ronda = arch.leerArchivo();
		
		// Complejidad Computacional O(n)
		ronda.resolver();
		
		arch.guardarArchivo(ronda);
		
	}

}
