import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {

	private String path;
	
	public Archivo(String path) {
		this.path = path;
	}
	
	public EvaluadorLocal leerArchivo() {
		File file = null;
		Scanner scanner = null;
		
		try {
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			scanner.useLocale(Locale.ENGLISH);
			
			ArrayList<Disparo> disparos = new ArrayList<>();
			int cantidad_disparos = scanner.nextInt();
			
			for (int i = 0; i < cantidad_disparos; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				
				Disparo disparo = new Disparo(x, y);	
				
				disparos.add(disparo);
			}
			
			return new EvaluadorLocal(disparos);
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return null;
		
	}
	
	public void guardarArchivo(ArrayList<String> res) {
		FileWriter fileWritter = null;
		PrintWriter printerWritter = null;
		
		try {
			fileWritter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printerWritter = new PrintWriter(fileWritter);
			
			for (int i = 0; i < res.size(); i++) {
				if (i == res.size() - 1) {
					printerWritter.print(res.get(i));
				} else {
					printerWritter.println(res.get(i));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (fileWritter != null) {
				try {
					fileWritter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
