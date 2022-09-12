
public class PonyExpress {
	
	// Constantes
	public static final int MAX_MILLAS = 100;
	
	public int jinetes(int[] estaciones)
	{
		int cantJinetes = 1;
		int distanciaAcumulada = 0;
		
		
		for (int i = 0; i < (estaciones.length-1); i++)
		{
			distanciaAcumulada += estaciones[i];
			if ((distanciaAcumulada + estaciones[i+1]) > MAX_MILLAS)
			{
				cantJinetes++;
				distanciaAcumulada = 0;
			}
		}

		
		return cantJinetes;
	}
	
}
