import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Archivo {

	// Constantes
	public static final int MIN_NUMEROS_ALEATORIOS = 10000;
	public static final int MAX_NUMEROS_ALEATORIOS = 20000;
	public static final int MIN_NUM = 0;
	public static final int MAX_NUM = 12000;
	
	// Atributos
	private int maximo, minimo, promedio, cantidadDeNumeros;
	private String path;
	
	// Constructores
	public Archivo(String path)
	{
		this.path = path;
	}
	
	// Metodos Privados
	private int obtenerCantNumerosDelArchivo()
	{
		return (int)Math.floor(Math.random() * (MAX_NUMEROS_ALEATORIOS - MIN_NUMEROS_ALEATORIOS + 1) + MIN_NUMEROS_ALEATORIOS );
	}
	
	private int obtenerNumeroAleatorio()
	{
		return (int)Math.floor(Math.random() * (MAX_NUM - MIN_NUM + 1) + MIN_NUM ); 
	}
	
	private int obtenerCantidadDeEspacios(int n)
	{
		if (n == 0) return 7;
		
		int res = 8;
		
		while(n >= 1)
		{
			res--;
			n /= 10;
		}
		
		return res;
	}
	
	// Metodos Publicos
	public void crear()
	{
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		int i, numero;
		
		try {
			
			fileWriter = new FileWriter(this.path);
			printWriter = new PrintWriter(fileWriter);
			
			// Obtenemos la cantidad de numeros que contendra el archivo
			this.cantidadDeNumeros = this.obtenerCantNumerosDelArchivo();
			
			for (i = 0; i < this.cantidadDeNumeros; i++)
			{
				// Obtenemos el numero aleatorio
				numero = this.obtenerNumeroAleatorio();
				
				// Lo escribimos dentro del archivo
				printWriter.println(numero);
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

	public void obtenerDatos()
	{
		Scanner scanner = null;
		
		int num = 0, suma = 0, max = MIN_NUM - 1, min = MAX_NUM + 1; 
		// El maximo lo inicializo en el minimo numero posible - 1 para garantizarme que el maximo esta dentro del archivo.
		// El minimo lo inicializo en el maximo numero posible + 1 para garantizarme que el minimo esta dentro del archivo.
		
		try {
			
			File file = new File(this.path);
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);
			
			// Leemos el archivo mientras exista y buscamos los datos
			while(scanner.hasNext())
			{
				num = scanner.nextInt();
				
				if (num > max) max = num;
				
				if (num < min) min = num;
				
				suma += num;
			}
			
			// Seteamos los valores obtenidos
			
			// El promedio
			this.promedio = suma / this.cantidadDeNumeros;
			
			// El maximo
			this.maximo = max;
			
			// El minimo
			this.minimo = min;
			
			scanner.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void imprimirDatos(String path)
	{
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		int i = 1;
		
		
		try {
			fileWriter = new FileWriter(path);
			printWriter = new PrintWriter(fileWriter);
			
			printWriter.println("+------------+--------+");
			
			printWriter.print("| Maximo     |");
			
			// Imprimimos los espacios
			for(i = 1; i < this.obtenerCantidadDeEspacios(this.maximo); i++)
			{
				printWriter.print(" ");
			}
			
			// Imprimimos el numero
			printWriter.print(this.maximo);
			
			// Salto de linea
			printWriter.println(" |");
			
			printWriter.println("+------------+--------+");
			
			printWriter.print("| Minimo     |");
			
			// Imprimimos los espacios
			for(i = 1; i < this.obtenerCantidadDeEspacios(this.minimo); i++)
			{
				printWriter.print(" ");
			}
			
			// Imprimimos el numero
			printWriter.print(this.minimo);
			
			// Salto de linea
			printWriter.println(" |");
			
			printWriter.println("+------------+--------+");
			
			printWriter.print("| Promedio   |");
			
			// Imprimimos los espacios
			for(i = 1; i < this.obtenerCantidadDeEspacios(this.promedio); i++)
			{
				printWriter.print(" ");
			}
			
			// Imprimimos el numero
			printWriter.print(this.promedio);
			
			// Salto de linea
			printWriter.println(" |");
			
			printWriter.println("+------------+--------+");
			
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
	
	public int getMax() 
	{
		return this.maximo;
	}
	
	public int getMin()
	{
		return this.minimo;
	}
	
	public int getPromedio()
	{
		return this.promedio;
	}
	
	// Overrides
	
}
