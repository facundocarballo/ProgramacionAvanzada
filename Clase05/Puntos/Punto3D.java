
public class Punto3D extends Punto2D {

	// Constantes
	
	// Atributos
	private double z;
	
	// Constructores
	public Punto3D()
	{
		super();
		z = 0;
	}
	
	public Punto3D(double x, double y, double z)
	{
		super(x, y);
		this.z = z;
	}
	
	// Metodos
	public double distanciaA(Punto3D otro)
	{
		double a = Math.pow((otro.getX() - this.getX()), 2);
		double b = Math.pow((otro.getY() - this.getY()), 2);
		double c = Math.pow((otro.getZ() - z), 2);
		
		return Math.sqrt(a + b + c);
	}
	
	@Override
	public double distanciaAlOrigen()
	{
		double a = Math.pow(this.getX(), 2);
		double b = Math.pow(this.getY(), 2);
		double c = Math.pow(z, 2);
		
		return Math.sqrt(a + b + c);
	}
	
	// Getters
	public double getZ()
	{
		return z;
	}
	
	// Overrides
	@Override
	public String toString() {
		return "( " + super.getX() + ", " + super.getY() + ", " + z + " )"; 
	}
}
