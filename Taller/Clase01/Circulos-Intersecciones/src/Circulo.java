
public class Circulo {
	double radio;
	Punto p;
	
	public Circulo(Punto _p, double _radio)
	{
		p = _p;
		radio = _radio;
	}
	
	public boolean interseccionCon(Circulo c)
	{
		if ((p.distanciaCon(c.p) - radio - c.radio) < 0) return true;
		
		return false;
	}
}
