
public class ComplejidadCuadratica {

	
	// Entrada: [1,2,3,4,5]
	// Salida:  [2+3+4+5, 1+3+4+5, 1+2+4+5, 1+2+3+5, 1+2+3+4]
	// Salida:  [14, 13, 12, 11, 10]
	
	public static void main(String[] args) {
		
		int[] vec = {1, 3, 5, 2, 76, 321, 54, 321};
		int[] res = solucionCuadratica(vec);
		
		
		System.out.print("[ ");
		for (int i : res) {
			System.out.print(i + " ");
		}
		System.out.print("]");

		
	}
	
	public static int[] solucionCuadratica(int[] vec)
	{
		int[] vecAux = new int[vec.length];
		int j = 0;
		
		for (int i = 0; i < vec.length; i++)
		{
			while(j < vec.length)
			{
				if (j != i) 
				{
					vecAux[i] += vec[j];
				}
				j++;
			}
			j=0;
		}
		
		return vecAux;
	}

}
