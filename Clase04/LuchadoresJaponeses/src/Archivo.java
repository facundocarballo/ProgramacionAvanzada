import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/*
 * Para los archivos, crear una carpeta que se llame "Casos de Prueba", que dentro de esta carpeta contenga otras 3 carpetas ("in", "out", "outObtenido").
 * En la carpeta "in" estaran los archivos que ingresan al sistema
 * En la carpeta "out" estaran los archivos que deberiamos obtener con el sistema
 * En la carpeta "outObtenido" estaran los archivos que obtuvimos finalmente nosotros con nuestro sistema 
 */


public class Archivo {
	
	// Metodos
	public void cargarArchivo(String nombreArchivo, Luchador[] luchadores)
	{
		FileWriter  fileWriter = null;
		PrintWriter printWriter = null;
		
		try {
			
			fileWriter = new FileWriter("src/CasosDePrueba/in/" + nombreArchivo + ".in");
			printWriter = new PrintWriter(fileWriter);
			
			printWriter.println(luchadores.length);
			
			for (Luchador luchador : luchadores)
			{
				printWriter.println(luchador);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (fileWriter != null)
			{
				try {
					fileWriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	public Luchador[] obtenerLuchadoresDesdeArchivo(String nombreArchivo)
	{
		Scanner scanner = null;
		int cantidadALeer = 0, i, peso, altura;
		
		try {
			File file = new File("src/CasosDePrueba/in/sumo.in");
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);
			
			cantidadALeer = scanner.nextInt();
			
			Luchador[] luchadores = new Luchador[cantidadALeer];
			
			for (i = 0; i < cantidadALeer; i++)
			{
				peso = scanner.nextInt();
				altura = scanner.nextInt();
				
				luchadores[i] = new Luchador(altura, peso);
			}
			
			scanner.close();
			
			return luchadores;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
	public void generarArchivoCantidadDominantes(String nombreArchivo, Luchador[] luchadores)
	{
		FileWriter  fileWriter = null;
		PrintWriter printWriter = null;
		int i, dominados = 0;
		
		try {
			
			fileWriter = new FileWriter("src/CasosDePrueba/out/" + nombreArchivo + ".out");
			printWriter = new PrintWriter(fileWriter);
						
			for (Luchador luchador : luchadores)
			{
				
				for (i = 0; i < luchadores.length; i++)
				{
					if (luchador.dominaA(luchadores[i]))
					{
						dominados++;						
					}
						
				}
				
				printWriter.println(dominados);
				
				dominados = 0;
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (fileWriter != null)
			{
				try {
					fileWriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
