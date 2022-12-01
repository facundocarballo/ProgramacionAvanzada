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
	
	public Antivirus leerArchivo() {
		File file = null;
		Scanner scanner = null;
		
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			int cant_caracteres = scanner.nextInt();
			String linea_con_letras = scanner.nextLine();
			String texto_infectado = scanner.nextLine();
			
			char[] vec_letras = linea_con_letras.toCharArray();
			char primera_letra = vec_letras[1];
			char segunda_letra = vec_letras[3];
			
			char[] vec_texto_infectado = texto_infectado.toCharArray();
			
			return new Antivirus(primera_letra, segunda_letra, vec_texto_infectado, cant_caracteres);
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return null;
	}


	public void guardarArchivo(char[] vec_texto_desinfectado, int cant_letras) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			
			printWriter.println(cant_letras);
			
			for (Character c : vec_texto_desinfectado) {
				printWriter.print(c);
			}
			
		}catch(Exception e) {
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
