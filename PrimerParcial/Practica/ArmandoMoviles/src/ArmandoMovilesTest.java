import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArmandoMovilesTest {
	
	Artesano artesano;

	@Before
	public void setUp() throws Exception {
		this.artesano = new Artesano();
	}

	@Test
	public void caso_loom() {
		Archivo arch = new Archivo("colgantes");
		
		artesano.armar_moviles(arch.leerArchivo());
		
		arch.guardarArchivo(artesano.peso_total_moviles(), artesano.moviles.size());
		try {
			
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/out/colgantes.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/out esperado/colgantes.out"));
			
			Assert.assertArrayEquals(f2, f1);
			
		} catch (IOException e) {
			Assert.fail();
		}
		
	}
	
	@Test
	public void fatiga() {
		Archivo arch = new Archivo("fatiga");
		
		artesano.armar_moviles(arch.leerArchivo());
		
		arch.guardarArchivo(artesano.peso_total_moviles(), artesano.moviles.size());
		try {
			
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/out/fatiga.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/out esperado/fatiga.out"));
			
			Assert.assertArrayEquals(f2, f1);
			
		} catch (IOException e) {
			Assert.fail();
		}
		
	}

}
