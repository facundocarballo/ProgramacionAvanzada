import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMotos {

	
	@Before
	public void before()
	{
	}
	
	@Test
	public void excesoDePeso() 
	{
		Moto moto = new Moto();
		Paquete paquetePesado = new Paquete(52, 0.3, "Ramos Mejia");
		
		Assert.assertFalse("JA", moto.cargar(paquetePesado));
	}
	
	@Test
	public void excesoDeDiametro() 
	{
		Moto moto = new Moto();
		Paquete paqueteGrande = new Paquete(9, 1.2, "San Justo");
		Assert.assertFalse(moto.cargar(paqueteGrande));
	}
	
	@Test
	public void envioAprobado() 
	{
		Moto moto = new Moto();
		Paquete paqueteNormal = new Paquete(9, 0.2, "Villa Luzuriaga");
		Assert.assertTrue(moto.cargar(paqueteNormal));
	}
	
	@Test
	public void envioCompletoValido()
	{
		Moto moto = new Moto();
		Paquete paqueteNormal = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete paqueteNormal2 = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete paqueteNormal3 = new Paquete(9, 0.2, "Villa Luzuriaga");
		
		Assert.assertTrue(moto.cargar(paqueteNormal));
		Assert.assertTrue(moto.cargar(paqueteNormal2));
		Assert.assertTrue(moto.cargar(paqueteNormal3));
	}
	
	@Test
	public void excesoDePaquetes()
	{
		Moto moto = new Moto();
		Paquete paqueteNormal = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete paqueteNormal2 = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete paqueteNormal3 = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete paqueteNormal4 = new Paquete(8, 0.2, "Villa Luzuriaga");
		
		Assert.assertTrue(moto.cargar(paqueteNormal));
		Assert.assertTrue(moto.cargar(paqueteNormal2));
		Assert.assertTrue(moto.cargar(paqueteNormal3));
		Assert.assertFalse(moto.cargar(paqueteNormal4));
	}
	
	@Test
	public void excesoDePesoEnVariosPaquetes()
	{	
		Moto moto = new Moto();
		Paquete paquetePesado = new Paquete(51, 0.3, "Ramos Mejia");
		Paquete paqueteNormal = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete paqueteNormal2 = new Paquete(9, 0.2, "Villa Luzuriaga");
		
		Assert.assertTrue(moto.cargar(paqueteNormal));
		Assert.assertTrue(moto.cargar(paqueteNormal2));
		Assert.assertFalse(moto.cargar(paquetePesado));
	}
	
	@Test
	public void excesoDeDiametroEnVariosPaquetes()
	{
		
		Moto moto = new Moto();
		Paquete p = new Paquete(13, 0.4, "Villa Luzuriaga");
		
		Assert.assertTrue(moto.cargar(p));
		Assert.assertTrue(moto.cargar(p));
		Assert.assertFalse(moto.cargar(p));
	}

	public void envioDistintasCiudades()
	{
		Moto moto = new Moto();
		Paquete paqueteNormal = new Paquete(9, 0.2, "Villa Luzuriaga");
		Paquete p = new Paquete(23, 0.3, "Ramos Mejia");
		
		Assert.assertTrue(moto.cargar(paqueteNormal));
		Assert.assertFalse(moto.cargar(p));
	}

}
