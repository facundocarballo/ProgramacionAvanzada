
public class Main {

	public static void main(String[] args) {
		
		Archivo arch = new Archivo();
		
		Luchador[] luchadores = arch.obtenerLuchadoresDesdeArchivo("sumo");
		
		arch.generarArchivoCantidadDominantes("sumo", luchadores);
		
		System.out.println("Finished!");
	}

}
