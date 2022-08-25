import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	// Atributos Privados
	File file = null;
	Scanner scanner = null;
	PrintWriter printerWriter = null;
	
	public Archivo(String nombreArchivo) {
		file = new File(nombreArchivo);
	}

	public double[] leerArchivo() {
		double[] ret = {0};
		try {
			scanner = new Scanner(file);
			
			int cant = scanner.nextInt();
			ret = new double[cant];
			
			for(int i = 0; i < cant; i++)
			{
				ret[i] = scanner.nextDouble();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			// Cerrar el archivo, eso es mucho muy importante
			scanner.close();
		}
		
		return ret;
	}

	public void guardarArchivo(double[] datos) {
		// TODO Auto-generated method stub
		try {
			printerWriter = new PrintWriter(file);
			
			for (int i = 0; i < datos.length; i++)
				printerWriter.println(datos[i]);
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}  finally {
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
