
public class Main {

	public static void main(String[] args) {
		Archivo arch = new Archivo("caso00");
		Rapigrama rapigrama = arch.leerArchivo();
		rapigrama.resolver();
		arch.guardarArchivo(rapigrama.palabras);

	}

}
