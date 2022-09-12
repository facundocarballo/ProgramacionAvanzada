import java.util.HashMap;
import java.util.Map;

public class CodeGolf {
	
	public int difFiguritas(int[] a, int[] b)
	{
		Map<Integer, Integer> c = new HashMap<Integer, Integer>();
		Map<Integer, Integer> d = new HashMap<Integer, Integer>();
		
		int e = 0, f = 0;
		
		for (int g : a)
			if (c.get(g) != null) 
				e++;
			else 
				c.put(g, 1);
		
		for (int g : b)
			if (d.get(g) != null)
				f++;
			else
				d.put(g, 1);

		return ((a.length - e) - (b.length - f));
		
	}
	
}
