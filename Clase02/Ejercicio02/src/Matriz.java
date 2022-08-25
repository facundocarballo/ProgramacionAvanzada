
public class Matriz {
	
	public static void main(String[] args)
	{
		int[][] matriz = {{8, 2, -3, 4}, {5, -6, -6, 20}, {21, 1, -5, 0}};
		
		
		
		imprimirMatriz(matriz);
		
		matriz = convertir(matriz);
		
		System.out.println();
		
		imprimirMatriz(matriz);	
		
	}
	
	private static void imprimirMatriz(int[][] matriz)
	{
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		for (int i = 0; i < filas; i++)
		{
			for (int j = 0; j < columnas; j++)
			{
				System.out.print(matriz[i][j]);
				System.out.print("  ");
			}
			
			System.out.println();
		}
	}
	
	private static int obtenerNuevoValor(int[][] _matriz, int i, int j)
	{
		int filas = _matriz.length;
		int columnas = _matriz[0].length;
			
		int suma = _matriz[i][j];
				
		// Sumamos el de arriba
		if (i-1 >= 0)
		{
			//System.out.println("suma = " + suma + " + " + _matriz[i-1][j]);
			suma += _matriz[i-1][j];
		}
				
		// Sumamos el de abajo
		if (i+1 < filas)
		{
			//System.out.println("suma = " + suma + " + " + _matriz[i+1][j]);
			suma += _matriz[i+1][j];
		}
				
		// Suma de la derecha
		if (j+1 < columnas)
		{
			//System.out.println("suma = " + suma + " + " + _matriz[i][j+1]);
			suma += _matriz[i][j+1];
		}
				
		// Suma de la izquierda
		if (j-1 >= 0)
		{
			//System.out.println("suma = " + suma + " + " + _matriz[i][j-1]);
			suma += _matriz[i][j-1];
		}
				
		//System.out.println("Termianmos de sumar....");
		//System.out.println(suma);
		
		return suma;
		
	}
	
	private static int[][] copiar(int[][] _matrizOriginal, int[][] _matrizDestino)
	{
		
		for(int i = 0; i < _matrizOriginal.length; i++)
		{
			for(int j = 0; j < _matrizOriginal[0].length; j++)
			{
				_matrizDestino[i][j] = _matrizOriginal[i][j];
			}
		}
		
		return _matrizDestino;
	}
	
	public static int[][] convertir(int[][] _matriz)
	{
		
		int filas = _matriz.length;
		int columnas = _matriz[0].length;
		
		int[][] matrizAux = new int[filas][columnas];
		copiar(_matriz, matrizAux);
		//System.out.println("Copia...");
		
		imprimirMatriz(matrizAux);
		
		int suma = 0;
		
		for (int i = 0; i < filas; i++)
		{
			for (int j = 0; j < columnas; j++)
			{
				
				suma = obtenerNuevoValor(_matriz, i, j);
				
				matrizAux[i][j] = suma;
			}
		}
		
		return matrizAux;
	}
	
}
