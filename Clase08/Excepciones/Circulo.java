
public class Circulo {
	double r;
	
	public Circulo(double r)
	{
		try {
			setR(r);
		} catch (RadioNegativoException e) {
			e.printStackTrace();
		}
	}
	
	public void setR(double r) throws RadioNegativoException {
		
		if (r < 0) {
			throw new RadioNegativoException("Radio Negativo");
		}
		
		this.r = r;
	}
}
