import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {
	
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public Mesada[] leerArchivo() {
		Scanner scanner = null;
		File file = null;
		Mesada[] mesadas = null;
		
		try {
			file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			
			scanner.useLocale(Locale.ENGLISH);
			
			int cantMesadas = scanner.nextInt();
			
			// Inicializamos un array de mesadas
			mesadas = new Mesada[cantMesadas];
			
			for (int i = 0; i < cantMesadas; i++) {
				
				int ancho = scanner.nextInt();
				int largo = scanner.nextInt();
				
				mesadas[i] = new Mesada(ancho, largo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return mesadas;
	}
	
	public void guardarArchivo(int cant) {
		FileWriter file = null;
		PrintWriter printerWriter = null;
		
		try {
			file = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			printerWriter = new PrintWriter(file);
			
			// Escribir la cantidad de mesadas necesarias.
			printerWriter.print(cant);
			
		} catch (Exception e) {
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
	
}
