
public class Ejercicio04 {

	// Atributos
	
	// Constructor
	public Ejercicio04() {}
	
	// Metodos
	public void imprimirMatriz(int[][] matriz)
	{
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		for (int i = 0; i < filas; i++)
		{
			for (int j = 0; j < columnas; j++)
			{
				System.out.print(matriz[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
		}
	}
	
	public int[][] obtenerMatriz(int[][] matriz)
	{
		// Se supone que los espacios en blanco equivalen a cero.
		// Recibi ayuda en este ejercicio de Victor Povoli Olivera.
		// :)
		
		int[][] nuevaMatriz = new int[(matriz.length * 2) - 1][matriz.length];
		
		for (int i = (matriz.length - 1); i >= 0; i--)
		{
			for (int j = 0; j < (matriz.length - i); j++)
			{
				nuevaMatriz[matriz.length - i - 1][j] = matriz[i+j][j];
			}
		}
		
		for (int k = 1; k < matriz.length; k++)
		{
			for (int l = 0; l < matriz.length - k; l++)
			{
				nuevaMatriz[matriz.length + k - 1][l] = matriz[l][k+l];
			}
		}
		
		
		return nuevaMatriz;
	}

}
