
public class Punto {
	
	// Atributos privados, coordenadas.
	private double x, y;
	
	/*
	 * Dentro de las implementaciones de los metodos siempre utilizar el (this) cuando quiera hacer referencia a mi objeto. Porque es una convencion y ademas permite una mejor lectura y seguimiento del codigo. 
	 */
	
	// Constructor
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Punto()
	{
		/*
			this.corX = 0;
			this.corY = 0;
		*/
		
		this(0, 0);
		
	}
		
	
	// Metodos
	public void desplazar(Punto p)
	{
		this.x += p.x;
		this.y += p.y;
	}
	
	public void desplazar(double d)
	{
		this.x += d;
		this.y += d;
	}
	
	public Punto sumar(Punto p)
	{
		return new Punto(this.x + p.x, this.y + p.y);
	}
	
	
	
	// Overrides
	
	@Override
	public String toString()
	{
		return "( " + this.x + ", " + this.y + " )";
	}
	
}
