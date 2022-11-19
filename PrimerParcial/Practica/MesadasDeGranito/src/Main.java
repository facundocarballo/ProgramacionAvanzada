
public class Main {

	public static void main(String[] args) {
		
		Archivo arch = new Archivo("fatiga");
		Negocio negocio = new Negocio();
		
		int cant = negocio.apilar_mesadas(arch.leerArchivo());
		
		arch.guardarArchivo(cant);
		
	}

}
