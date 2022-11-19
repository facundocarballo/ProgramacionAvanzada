
public class Main {

	public static void main(String[] args) {
		
		Archivo arch = new Archivo("fatiga");
		
		Artesano artesano = new Artesano();
		
		artesano.armar_moviles(arch.leerArchivo());
		
		arch.guardarArchivo(artesano.peso_total_moviles(), artesano.moviles.size());
		
	}

}
