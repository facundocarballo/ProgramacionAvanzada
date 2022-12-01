import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

	private String path;
	
	public Archivo(String p) {
		this.path = p;
	}
	
	
	public Rapigrama leerArchivo() {
		File file = null ;
		Scanner scanner = null;
		Rapigrama rapigrama = null;
		
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			int dimension = scanner.nextInt();
			int cant_palabras = scanner.nextInt();
			scanner.nextLine();
			char[][] crucigrama = new char[dimension][dimension];
			ArrayList<Palabra> palabras = new ArrayList<Palabra>();
			Palabra palabra = null;
			
			
			
			for (int i = 0; i < dimension; i++) {
				char[] fila = scanner.nextLine().toCharArray();
				for (int j = 0; j < fila.length; j++) {
					crucigrama[i][j] = fila[j];
				}
			}
						
			for (int i = 0; i < cant_palabras; i++) {
				palabra = new Palabra(scanner.nextLine(), i+1);
				palabras.add(palabra);
			}
						
			rapigrama = new Rapigrama(crucigrama, palabras);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return rapigrama;
	}
	
	public void guardarArchivo(ArrayList<Palabra> palabras) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
	
		try {
			
			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			Palabra palabra = null;
			for (int i = 0; i < palabras.size(); i++) {
				palabra = palabras.get(i);
				
				if (palabra.direccion != '\0') {
					if (i == palabras.size() - 1) {
						printWriter.print("" + palabras.get(i).id + " " + palabras.get(i).direccion);
					} else {
						printWriter.println("" + palabras.get(i).id + " " + palabras.get(i).direccion);
					}
				}
				

			}
			
			
		} catch(Exception e) {
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
