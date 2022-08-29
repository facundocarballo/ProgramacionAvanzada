import org.junit.Assert;
import org.junit.Test;


public class Ejercicio03Test {

	@Test
	public void dosElementosRepetidosMismasVeces() 
	{
		// Arrange
		int[] vec = {1,1,3,3};
		Ejercicio03 ejercicio = new Ejercicio03();
		
		// Act
		int moda = ejercicio.obtenerModa(vec);
		
		// Assert
		Assert.assertEquals(3, moda);
		
		// Annihilate
		ejercicio = null;
	}
	
	@Test
	public void elementosNegativos() 
	{
		// Arrange
		int[] vec = {-1, -3, -4, -2};
		Ejercicio03 ejercicio = new Ejercicio03();
		
		// Act
		int moda = ejercicio.obtenerModa(vec);
		
		// Assert
		Assert.assertEquals(-1, moda);
		
		// Annihilate
		ejercicio = null;
	}
	
	@Test
	public void elementosPositivos() 
	{
		// Arrange
		int[] vec = {1,2,3,4};
		Ejercicio03 ejercicio = new Ejercicio03();
		
		// Act
		int moda = ejercicio.obtenerModa(vec);
		
		// Assert
		Assert.assertEquals(4, moda);
		
		// Annihilate
		ejercicio = null;
	}

}
