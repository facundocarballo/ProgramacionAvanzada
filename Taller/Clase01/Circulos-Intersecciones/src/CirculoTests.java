import org.junit.Assert;
import org.junit.Test;

public class CirculoTests {
	
	@Test
	public void interseccionValida()
	{
		// Arrange
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(3,3);
		Circulo c1 = new Circulo(p1, 1);
		Circulo c2 = new Circulo(p2, 5);
		
		// Act
		boolean res = c1.interseccionCon(c2);
		
		// Assert
		Assert.assertEquals(true, res);
		
		// Annihilate
		c1 = null;
		c2 = null;
		p1 = null;
		p2 = null;
	}
	
	@Test
	public void interseccionNoValida()
	{
		// Arrange
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(-2,3);
		Circulo c1 = new Circulo(p1, 1);
		Circulo c2 = new Circulo(p2, 1);
		
		// Act
		boolean res = c1.interseccionCon(c2);
		
		// Assert
		Assert.assertEquals(false, res);
		
		// Annihilate
		c1 = null;
		c2 = null;
		p1 = null;
		p2 = null;
	}
}
