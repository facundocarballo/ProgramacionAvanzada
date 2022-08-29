
public class Main {

	public static void main(String[] args) {
		
		Archivo arch = new Archivo("src/numerosAleatorios.in");
		
		arch.crear();
		
		arch.obtenerDatos();
		
		arch.imprimirDatos("src/resultado.out");
		
		
		System.out.println("Finish!!");
	}

}
