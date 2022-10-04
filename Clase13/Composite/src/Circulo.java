
public class Circulo implements Figura{

	protected double r;
	
	public Circulo(double r){
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return r*r*Math.PI;
	}
	
}
