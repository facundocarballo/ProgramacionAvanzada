
public class Ejercicio01 {
	
	// Atributos
	
	// Constructor
	public Ejercicio01() {}
	
	
	// Metodos
	public boolean cumpleLaCondicion(int[][] matriz)
	{
		/*
		 
		 * Retorna true si la multiplicacion de sus componentes es != 0 (distinto de cero)
		 * Retorna false si la multiplicacion de sus componentes es == 0 (igual a cero)
		 
		 */
		
		
		boolean cumple = true;
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		int i = 0;
		int j = 0;
		
		while(cumple && i < filas)
		{
			while(cumple && j < columnas)
			{
				if (matriz[i][j] == 0) cumple = false;
				
				j++;
			}
			
			j=0;
			i++;
		}
		
		
		return cumple;
		
	}
	
}
