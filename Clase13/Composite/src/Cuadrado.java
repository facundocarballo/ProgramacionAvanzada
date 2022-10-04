
public class Cuadrado implements Figura{
	protected double lado;
	
	public Cuadrado(double lado){
		this.lado = lado;
	}
		
	@Override
	public double getArea() {
		return lado*lado;
	}
}
