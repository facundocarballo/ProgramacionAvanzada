import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	private String path;
	
	public Archivo(String p) {
		this.path = p;
	}
	
	
	public Imagenes leerArchivo() {
		File file = null;
		Scanner scanner = null;
		Imagenes imagenes = null;
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			String imagen_descomprimida = scanner.nextLine();
			String imagen_comprimida = scanner.nextLine();
			
			imagenes = new Imagenes(imagen_comprimida, imagen_descomprimida);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return imagenes;
	}
	
	
	public void guardarArchivo(String comprimido, String descomprimido) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			
			printWriter.println(comprimido);
			printWriter.print(descomprimido);
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
