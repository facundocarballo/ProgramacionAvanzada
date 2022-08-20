package com.facundocarballo;

public class Main {
	
	public static void main(String[] args) {
		int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
		int i, j, k;
		
		// En este ciclo, me encargo de los saltos de linea
		for(i = 0; i < intArray.length; i++)
		{
			// Este for se encarga de las separaciones
			for(j = 0; j < (intArray.length - i); j++)
			{
				// Este for imprime los elementos
				for(k = 0; k <= i; k++)
				{
					System.out.print(intArray[k+j]);
				}
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
