
public class Main {

	public static void main(String[] args) {
		Archivo arch = new Archivo("caso00");
		Antivirus antivirus = arch.leerArchivo();
		antivirus.desinfectar();
		arch.guardarArchivo(antivirus.getTextoOriginal(), antivirus.getCantLetrasOriginal());
	}

}
