
public class Ejercicio03 {

	// Atributos
	
	// Constructor
	public Ejercicio03() {}
	
	// Metodos
	
	public void imprimirVector(int[] vec)
	{
		int filas = vec.length;
		
		for (int i = 0; i < filas; i++)
		{
			System.out.print(vec[i]);
			System.out.print("  ");
		}
			
	}
	
	public int obtenerModa(int[] vec)
	{
		int moda = vec[0];
		int num;
		int cantidadApariciones = 0;
		int aparicionesMaximas = 0;
		
		for (int i = 0; i < vec.length; i++)
		{
			num = vec[i];
			
			for(int e :vec)
			{
				if (e == num) cantidadApariciones++;
			}
			
			
			if (cantidadApariciones > aparicionesMaximas)
			{
				aparicionesMaximas = cantidadApariciones;
				moda = num;
			}
			
			
			if (cantidadApariciones == aparicionesMaximas && num > moda) moda = num;
				
			
			cantidadApariciones = 0;
		}

		
		return moda;
	}
	
	public int[] obtenerModasDeUnaMatriz(int[][] matriz)
	{
		int moda;
		int[] modas = new int[matriz.length];
		
		for(int i = 0; i < matriz.length; i++)
		{
			moda = this.obtenerModa(matriz[i]);
			modas[i] = moda;
		}
		
		return modas;
	}
	
	
	
}
