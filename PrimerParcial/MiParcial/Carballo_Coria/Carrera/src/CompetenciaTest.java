// CARBALLO FACUNDO
// CORIA LAUTARO
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class CompetenciaTest {
	Competencia c;
	Archivo arch;
	
	@Test
	public void testParcial(){
		
		arch = new Archivo("carrera");
		
		c = arch.leerArch();
		
		arch.guardarArch(c);
		
		try {
			byte[] f1 = Files.readAllBytes(Paths.get("caso de prueba/out/carrera.out"));
			byte[] f2 = Files.readAllBytes(Paths.get("caso de prueba/out esperado/carrera.out"));
			
			Assert.assertArrayEquals(f1, f2);
		}catch (IOException e) {
			Assert.fail();
		}
		
		
	}
}
