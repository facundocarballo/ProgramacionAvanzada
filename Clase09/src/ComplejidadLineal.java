
public class ComplejidadLineal {

	// Entrada: [1,2,3,4,5]
	// Salida:  [2+3+4+5, 1+3+4+5, 1+2+4+5, 1+2+3+5, 1+2+3+4]
	// Salida:  [14, 13, 12, 11, 10]
	
	public static void main(String[] args) {
		
		int[] vec = {1, 3, 5, 2, 76, 321, 54, 321};
		int[] res = solucionLineal(vec);
		
		
		System.out.print("[ ");
		for (int i : res) {
			System.out.print(i + " ");
		}
		System.out.print("]");

	}
	
	public static int[] solucionLineal(int[] vec)
	{
		int[] vecAux = new int[vec.length];
		int acum = 0;
		
		for (int i : vec) acum += i;
		
		for (int j = 0; j < vec.length; ++j)
		{
			vecAux[j] = acum - vec[j];
		}
		
		return vecAux;
	}

}
