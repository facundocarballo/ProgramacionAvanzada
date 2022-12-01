
public class Main {

	public static void main(String[] args) {
		
		Archivo arch = new Archivo("caso1");
		EvaluadorLocal evaluador = arch.leerArchivo();
		arch.guardarArchivo(evaluador.paloGol());
		
	}

}
