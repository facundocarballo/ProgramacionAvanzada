import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUtilitarias {

	Utilitarias utilitarias;
	Paquete paquetePesado;
	Paquete paqueteGrande;
	Paquete paqueteNormal;
	Paquete paqueteNormal1;
	Paquete paqueteNormal2;
	Paquete paqueteNormal3;
	Paquete paqueteNormal4;
	Paquete paqueteNormal5;
	Paquete paqueteNormal6;
	
	@Before
	public void before()
	{
		utilitarias = new Utilitarias(6);
		paquetePesado = new Paquete(701, 0.3, "Ramos Mejia");
		paqueteGrande = new Paquete(9, 3.2, "San Justo");
		paqueteNormal = new Paquete(9, 0.1, "Villa Luzuriaga");
		paqueteNormal1 = new Paquete(3, 0.1, "Ramos Mejia");
		paqueteNormal2 = new Paquete(3, 0.1, "Ciudadela");
		paqueteNormal3 = new Paquete(3, 0.1, "Casseros");
		paqueteNormal4 = new Paquete(3, 0.1, "Capital Federal");
		paqueteNormal5 = new Paquete(3, 0.1, "Ramos Mejia");
		paqueteNormal6 = new Paquete(3, 0.1, "Ramos Mejia");
	}
	
	@Test
	public void excesoDePeso() 
	{
		Assert.assertFalse(utilitarias.cargar(paquetePesado));
	}
	
	@Test
	public void excesoDeDiametro() 
	{
		Assert.assertFalse(utilitarias.cargar(paqueteGrande));
	}
	
	@Test
	public void envioAprobado() 
	{
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
	}
	
	@Test
	public void envioCompletoValido()
	{
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal2));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal2));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal2));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal3));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal3));
	}
	
	@Test
	public void excesoDePaquetes()
	{
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertFalse(utilitarias.cargar(paqueteNormal));
	}
	
	@Test
	public void excesoDePesoEnVariosPaquetes()
	{
		Paquete p = new Paquete(300, 0.3, "Villa Luzuriaga");
		
		Assert.assertTrue(utilitarias.cargar(p));
		Assert.assertTrue(utilitarias.cargar(p));
		Assert.assertFalse(utilitarias.cargar(p));
	}
	
	@Test
	public void excesoDeDiametroEnVariosPaquetes()
	{
		Paquete p = new Paquete(13, 1.2, "Villa Luzuriaga");
		
		Assert.assertTrue(utilitarias.cargar(p));
		Assert.assertTrue(utilitarias.cargar(p));
		Assert.assertFalse(utilitarias.cargar(p));
	}

	public void excesoDeCiudades()
	{		
		Assert.assertTrue(utilitarias.cargar(paqueteNormal));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal1));
		Assert.assertTrue(utilitarias.cargar(paqueteNormal2));
		Assert.assertFalse(utilitarias.cargar(paqueteNormal3));
	}


}
