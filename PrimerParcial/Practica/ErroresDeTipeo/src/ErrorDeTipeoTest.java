import org.junit.Assert;
import org.junit.Test;

public class ErrorDeTipeoTest {
	
	
	@Test
	public void caso00() {
		String correcto = "Estamos pintando!";
		String incorrecto = "ostant!Em inpados";
		
		Assert.assertEquals(40, Main.procesador(correcto, incorrecto));
	}
	
	@Test
	public void caso01() {
		String correcto = "Hola";
		String incorrecto = "aloH";
		
		Assert.assertEquals(6, Main.procesador(correcto, incorrecto));
	}

}
