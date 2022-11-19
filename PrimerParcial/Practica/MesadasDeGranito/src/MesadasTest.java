import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MesadasTest {
	
	Archivo arch;
	Negocio negocio;
	
	@Before
	public void setUp() {
		negocio = new Negocio();
	}

	@Test
	public void ejemplo_loom() {
		
		Archivo arch = new Archivo("mesadas");
		
		int cant = negocio.apilar_mesadas(arch.leerArchivo());
		
		arch.guardarArchivo(cant);
		
		try {
			
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/out/mesadas.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/out esperado/mesadas.out"));
		
			Assert.assertArrayEquals(f1, f2);
			
		} catch (IOException e) {
			Assert.fail();
		}

	}

	@Test
	public void fatiga() {
		Archivo arch = new Archivo("fatiga");
		
		int cant = negocio.apilar_mesadas(arch.leerArchivo());
		
		arch.guardarArchivo(cant);
		
		try {
			
			byte[] f1 = Files.readAllBytes(Paths.get("casos de prueba/out/fatiga.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("casos de prueba/out esperado/fatiga.out"));
		
			Assert.assertArrayEquals(f1, f2);
			
		} catch (IOException e) {
			Assert.fail();
		}
	}
	
}
