
public class Main {

	public static void main(String[] args) {
		Competencia c;
		Archivo arch;
		arch = new Archivo("carrera");

		c = arch.leerArch();

		
		arch.guardarArch(c);
		
	}

}
