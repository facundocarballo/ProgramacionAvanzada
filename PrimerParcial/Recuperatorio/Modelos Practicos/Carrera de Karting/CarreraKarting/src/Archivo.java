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
	
	public int[][] leerArchiv() {
		File file = null;
		Scanner scanner = null;
				
		try {
			
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			
			int m = scanner.nextInt();
			
			int[][] matriz = new int[m][m];
			
			for(int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					matriz[i][j] = scanner.nextInt();
				}
			}
			
			return matriz;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		
		return null;
	}

	public void guardarArchivo(EvaluadorLocal evaluador) {
		FileWriter fileWritter = null;
		PrintWriter printWritter = null;
		
		try {
			
			fileWritter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWritter = new PrintWriter(fileWritter);
			
			if (evaluador.k == 0) {
				printWritter.print("Sin pista");
			} else {
				Punto inicio = evaluador.reg.getInicio();
				Punto fin = evaluador.reg.getFin();
				Punto curva = evaluador.reg.getCurva();
				
				printWritter.println("El largo de la pista es: " + evaluador.reg.getMovimientos());
				printWritter.println("Hay " + evaluador.k + " inicios de pistas");
				printWritter.print("Inicio: (" + inicio.getX() + "," + inicio.getY() + ") Curva: (" + curva.getX() + "," + curva.getY() + ") Fin: (" + fin.getX() + "," + fin.getY() + ")");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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
