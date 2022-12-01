
public class Main {
	public static void main(String[] args) {
		Archivo arch = new Archivo("caso00");
		Imagenes imagenes = arch.leerArchivo();
		arch.guardarArchivo(imagenes.comprimrImagen(), 
				imagenes.descomprimirImagen());
	}
}
