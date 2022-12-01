
public class Main {

	public static void main(String[] args) {
		Archivo arch = new Archivo("caso00");
		Evaluador evaluador = arch.leerArchivo();
		Equipo equipo = evaluador.resolver();
		arch.guardarArchivo(equipo);
	}

}
