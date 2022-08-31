
public class Punto2D {

	// Constantes
	
	// Atributos
	private double x, y;
	
	// Constructores
	public Punto2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Punto2D()
	{	
		this(0, 0);	
	}
	
	
	// Metodos
	public void desplazar(Punto2D p)
	{
		this.x += p.x;
		this.y += p.y;
	}
	
	public void desplazar(double d)
	{
		this.x += d;
		this.y += d;
	}
	
	public Punto2D sumar(Punto2D p)
	{
		return new Punto2D(this.x + p.x, this.y + p.y);
	}
	
	public double distanciaA(Punto2D otro)
	{
		double a = Math.pow((otro.x - this.x), 2);
		double b = Math.pow((otro.y - this.y), 2);
		
		return Math.sqrt(a + b);
	}
	
	public double distanciaAlOrigen()
	{
		return Math.hypot(x, y);
	}
	
	// Getters
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	// Overrides
	@Override
	public String toString()
	{
		return "( " + this.x + ", " + this.y + " )";
	}
	
}
