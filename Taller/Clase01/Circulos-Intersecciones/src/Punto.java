
public class Punto {
	
	int x, y;
	
	public Punto(int _x, int _y)
	{
		x = _x;
		y = _y;
	}
	
	public double distanciaCon(Punto p)
	{
		double a = Math.pow((p.x - x), 2);
		double b = Math.pow((p.y - y), 2);
		
		return Math.sqrt(a + b);
	}
	
}
