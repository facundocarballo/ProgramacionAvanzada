
public class Triangulo implements Figura{
	protected double b;
	protected double h;
	
	public Triangulo(double b, double h){
		this.b = b;
		this.h = h;
	}
	
	@Override
	public double getArea() {
		return b * h;
	}

}
