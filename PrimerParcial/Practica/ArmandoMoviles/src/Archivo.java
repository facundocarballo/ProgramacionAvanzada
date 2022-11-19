import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {
	
	private String nombre;
	
	// Constructor
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public int[] leerArchivo() {
		
		File file = null;
		Scanner scanner = null;
		int[] colgantes = null;
		
		try {
			
			file = new File("casos de prueba/in/" + this.nombre + ".in");
			scanner = new Scanner(file);
			
			int cantColgantes = scanner.nextInt();
			
			colgantes = new int[cantColgantes];
			
			for (int i = 0; i < cantColgantes; i++) {
				colgantes[i] = scanner.nextInt();
			}
			
			return colgantes;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return null;
	}

	public void guardarArchivo(int pesoTotal, int cantMoviles) {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			
			fileWriter = new FileWriter("casos de prueba/out/" + this.nombre + ".out");
			printer = new PrintWriter(fileWriter);
			
			// Imprimimos el peso total de los moviles y la cantidad de moviles que pudimos hacer
			if (cantMoviles == 0) {
				printer.print("no se puede");
			} else {
				printer.print(pesoTotal + " " + cantMoviles);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
}
