import org.junit.Assert;
import org.junit.Test;

public class Ejercicio01Test {

	@Test
	public void matrizConCeros()
	{
		// Arrange
		int[][] matriz = {
				{1, 2, 1}, 
				{2, 1, 9}, 
				{1, 3, 0},
		};
		
		Ejercicio01 ejercicio = new Ejercicio01();
		
		// Act
		boolean res = ejercicio.cumpleLaCondicion(matriz);
		
		// Assert
		Assert.assertFalse(res);
		
		// Annihilate
		ejercicio = null;
	}

	@Test
	public void matrizSinCeros()
	{
		// Arrange
		int[][] matriz = {
				{1, 2, 1}, 
				{2, 1, 9}, 
				{1, 3, 1},
		};
		
		Ejercicio01 ejercicio = new Ejercicio01();
		
		// Act
		boolean res = ejercicio.cumpleLaCondicion(matriz);
		
		// Assert
		Assert.assertTrue(res);
		
		// Annihilate
		ejercicio = null;
	}
}
