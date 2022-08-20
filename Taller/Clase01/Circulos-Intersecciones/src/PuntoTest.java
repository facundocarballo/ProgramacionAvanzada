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
	}
}
