import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	
	// Constantes
	private final String BASE_PATH = "casos de prueba/in/";
	private final String LECTURA_EXT = ".in";
	private final String ESCRITURA_EXT = ".out";
	
	// Atributos
	private String path;
	
	// Constructores
	public Archivo(String path) {
		this.path = path;
	}
	
	// Metodos
	
	
	public Mapa leerArchivo() {
		Scanner scanner = null;
		File file = null;
		Mapa map = null;
		
		try {
			file = new File(this.BASE_PATH + this.path + this.LECTURA_EXT);
			scanner = new Scanner(file);
			
			scanner.useLocale(Locale.ENGLISH);
			
			// Leemos el tamanio del tablero
			int tam = scanner.nextInt();
			int cantReinas = scanner.nextInt();
			
			// Creamos cada una de las reinas y las almacenamos en una lista
			ArrayList<Reina> reinas = new ArrayList<Reina>();
			int coorX, coorY;
			
			for (int i = 0; i < cantReinas; i++) {
				coorX = scanner.nextInt();
				coorY = scanner.nextInt();
				
				reinas.add(new Reina(coorX - 1, coorY - 1, i+1));
				
			}
			
			map = new Mapa(tam, reinas);	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return map;
	}

	public void guardarArchivo(ArrayList<Reina> reinas) {
		FileWriter file = null;
		PrintWriter printerWriter = null;
		
		try {
			file = new FileWriter("casos de prueba/out/"+ this.path + this.ESCRITURA_EXT);
			printerWriter = new PrintWriter(file);
			
			for (Reina r : reinas) {
				printerWriter.print(r.conflictos.size() + " ");
				for (Integer c : r.conflictos) {
					printerWriter.print(c + " ");
				}
				printerWriter.println();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// Overrides
	
}
