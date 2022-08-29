
public class VectorOrdenado {
	
	// Constantes
	public static final String DESORDENADO = "Desordenado";
	public static final String ASCENDENTE = "Ascendente";
	public static final String DESCENDENTE = "Descendente";
	
	// Metodos
	public static String estadoDelVector(int[] vec)
	{
		boolean descendente = false;
		boolean ascendente = false;
		
		int i = 0;
		
		if (vec.length > 1)
		{
			
			while(i < vec.length && vec[i] == vec[i+1]) i++;
			
			if (vec[i] < vec[i+1]) ascendente = true;
			
			if (vec[i] > vec[i+1]) descendente = true;
			
			i++;
		}
		
		while((i < (vec.length - 1)) && (ascendente || descendente))
		{
			if (ascendente && vec[i] > vec[i+1]) ascendente = false;
			
			if (descendente && vec[i] < vec[i+1]) descendente = false;
			
			i++;
		}
		
		if (ascendente) return ASCENDENTE;
		
		if (descendente) return DESCENDENTE;
		
		return DESORDENADO;
	}
	
}
