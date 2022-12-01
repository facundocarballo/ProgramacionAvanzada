import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

	private String path;
	
	public Archivo(String str) {
		this.path = str;
	}
	
	public Ronda leerArchivo() {
		File file = null;
		Scanner scanner = null;
		Ronda ronda = null;
		ArrayList<Integer> desplazamientos = null;
		ArrayList<Integer> aventureros = null;
		
		try {
			
			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);
			desplazamientos = new ArrayList<Integer>();
			aventureros = new ArrayList<Integer>();
			
			int cant_aventureros = scanner.nextInt();
			
			for (int i = 1; i < cant_aventureros; i++) {
				int desplazamiento = scanner.nextInt();
				desplazamientos.add(desplazamiento);
				aventureros.add(i);
			}
			
			aventureros.add(cant_aventureros);
			
			ronda = new Ronda(aventureros, desplazamientos);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		
		
		return ronda;
	}
	
	public void guardarArchivo(Ronda ronda) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			
			int size = ronda.get_no_cebadores().size();
			
			for (int i = 0; i < size; i++) {
				if (i == (size-1)) {
					printWriter.println(ronda.get_no_cebadores().get(i));
				} else {
					printWriter.print("" + ronda.get_no_cebadores().get(i) + " ");
				}
			}
			
			printWriter.print(ronda.getCebador());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void generarArchivoFatiga() {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("casos de prueba/in/" + this.path + ".in");
			printWriter = new PrintWriter(fileWriter);
			
			int aventureros = 400000;
			
			printWriter.println(aventureros);
			
			for (int i = 1; i < aventureros; i++) {
				if (i == (aventureros-1)) {
					printWriter.print("0");
				} else {
					printWriter.print("0 ");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void generarArchivoFatigaEsperado() {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("casos de prueba/out esperado/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);
			
			int aventureros = 400000;
			
			
			for (int i = 1; i < aventureros; i++) {
				if (i == (aventureros-1)) {
					printWriter.println(i);
				} else {
					printWriter.print(i + " ");
				}
			}
			

			printWriter.print(aventureros);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
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
