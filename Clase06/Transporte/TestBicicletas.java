import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBicicletas {

	Bicicleta bici;
	Paquete paquetePesado;
	Paquete paqueteGrande;
	Paquete paqueteNormal;
	
	@Before
	public void before()
	{
		bici = new Bicicleta();
		paquetePesado = new Paquete(11, 0.3, "Ramos Mejia");
		paqueteGrande = new Paquete(9, 1.2, "San Justo");
		paqueteNormal = new Paquete(9, 0.7, "Villa Luzuriaga");
	}
	
	@Test
	public void excesoDePeso() 
	{
		Assert.assertFalse(bici.cargar(paquetePesado));
	}
	
	@Test
	public void excesoDeDiametro() 
	{
		Assert.assertFalse(bici.cargar(paqueteGrande));
	}
	
	@Test
	public void envioAprobado() 
	{
		Assert.assertTrue(bici.cargar(paqueteNormal));
	}

}
