
public class Main {

	public static void main(String[] args) {
		Archivo arch = new Archivo("caso00");
		Montana montana = arch.leerArchivo();
		arch.guardarArchivo(montana.resolver());
	}

}
