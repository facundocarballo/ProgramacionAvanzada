import org.junit.Assert;
import org.junit.Test;

public class PuntoTest {
	
	@Test
	public void distanciaConPuntoNegativo()
	{
		// Arrange
		Punto p = new Punto(-1,-1);
		Punto p2 = new Punto(4,3);
		
		// Act
		double res = p.distanciaCon(p2);
		
		// Assert
		Assert.assertEquals(true, res >= 0); // Una distancia tiene que ser siempre positiva
		
		// Annihilate
		p = null;
		p2 = null;
	}
	
	@Test
	public void distanciaNula()
	{
		// Arrange
		Punto p = new Punto(0,0);
		Punto p2 = new Punto(0,0);
		
		// Act
		double res = p.distanciaCon(p2);
		
		// Assert
		Assert.assertEquals(true, res >= 0); // Una distancia tiene que ser siempre positiva
		
		// Annihilate
		p = null;
		p2 = null;
	}
}
