import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

	private String path;
	
	public Archivo(String path) {
		this.path = path;
	}
	
	public Evaluador leerArchivo() {
		File file = null;
		Scanner scanner = null;
		Evaluador evaluador = null;
		
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
			int cant_ciudades = scanner.nextInt();
			
			for (int i = 0; i < cant_ciudades; i++) {
				
				Ciudad ciudad = new Ciudad(i+1);
				
				int cant_registros = scanner.nextInt();
				
				for (int j = 0; j < cant_registros; j++) {
					int min = scanner.nextInt();
					int max = scanner.nextInt();
					
					ciudad.trySetMin(min);
					ciudad.trySetMax(max);
				}
				
				ciudades.add(ciudad);
				
			}
			
			evaluador = new Evaluador(ciudades);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return evaluador;
	}
	
	public void guardarArchivo(ArrayList<Ciudad> ciudades) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			
			for (int i = 0; i < ciudades.size(); i++) {
				if (ciudades.get(i).no_comparaciones > 0) {
					if (i == ciudades.size()-1) {
						printWriter.print(""+ciudades.get(i).id + " " + ciudades.get(i).no_comparaciones);
					}else {
						printWriter.println(""+ciudades.get(i).id + " " + ciudades.get(i).no_comparaciones);
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
