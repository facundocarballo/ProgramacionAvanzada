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
		ArrayList<Contribuidor> contribuidores = new ArrayList<Contribuidor>();
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			int cant_preguntas = scanner.nextInt();
			int cant_contribuidores = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0; i < cant_contribuidores; i++) {
				String cadena = scanner.nextLine();
				contribuidores.add(new Contribuidor(cadena.toCharArray()));
			}
			
			return new Evaluador(contribuidores, cant_preguntas);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
				
		return null;
	}
	
	public void guardarArchivo(Equipo equipo) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			 fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			 printWriter = new PrintWriter(fileWriter);
			 
			 printWriter.println(equipo.puntaje);
			 for (int i = 0; i < equipo.respuestas.size(); i++) {
				if (i != (equipo.respuestas.size() - 1)) {
					 printWriter.print(equipo.respuestas.get(i) + "");
				} else {
					 printWriter.print(equipo.respuestas.get(i));
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
