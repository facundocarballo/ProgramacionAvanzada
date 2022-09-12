
public class CodeGolf {
	
	public int difFiguritas(int[] c, int[] v)
	{
		// Contar la cantidad de repetidas de cada coleccionista
		// cantidad de figuritas - repetidas => cant. figuritas
		
		int r = 0, d = 0, i;
		
		for (i = 0; i < c.length; i++)
		{
			for (int j : c)
			{
				if (i == j)
				{
					r++;
				}
			}
		}
		
		for (i = 0; i < v.length; i++)
		{
			for (int j : v)
			{
				if (i == j)
				{
					d++;
				}
			}
		}
		
		return ((c.length - r) - (v.length - d));
		
	}
	
}
