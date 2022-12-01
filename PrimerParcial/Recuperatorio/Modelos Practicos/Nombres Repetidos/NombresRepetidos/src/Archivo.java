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
	
	public Evaluador leerArchivo() {
		File file = null;
		Scanner scanner = null;
		ArrayList<String> lista = new ArrayList<String>();
		int cant_a_buscar = 0;
		
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			int cant_nombres = scanner.nextInt();
			cant_a_buscar = scanner.nextInt();
			
			for (int i = 0; i <= cant_nombres; i++) {
				lista.add(scanner.nextLine());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return new Evaluador(lista, cant_a_buscar);
	}

	public void guardarArchivo(ArrayList<Resultado> resultados) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			
			for (int i = 0; i < resultados.size(); i++) {
				Resultado resultado = resultados.get(i);
				if (i == resultados.size() - 1) {
					printWriter.print(resultado.nombre + " " + resultado.cant);
				} else {
					printWriter.println(resultado.nombre + " " + resultado.cant);
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null ) { 
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
