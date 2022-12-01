
public class Main {

	public static void main(String[] args) {
		Archivo arch = new Archivo("caso1");
		EvaluadorLocal evaluador = new EvaluadorLocal();
		
		evaluador.curva(arch.leerArchiv());
		
		arch.guardarArchivo(evaluador);
	}
	
}
