import java.util.ArrayList;

public class Main {

	
public static void main(String[] args) {
	Archivo arch = new Archivo("caso00");
	Evaluador evaluador = arch.leerArchivo();
	ArrayList<Resultado> res = evaluador.obtener_resultado();
	arch.guardarArchivo(res);
}
}
