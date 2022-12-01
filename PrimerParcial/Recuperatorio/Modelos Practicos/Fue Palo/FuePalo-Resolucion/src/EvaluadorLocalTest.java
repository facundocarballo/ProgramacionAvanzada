import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class EvaluadorLocalTest {
	
	private Archivo arch;
	private EvaluadorLocal evaluador;

	@Test
	public void caso0() {
		String name = "caso0";
		arch = new Archivo("caso0");
		evaluador = arch.leerArchivo();
		arch.guardarArchivo(evaluador.paloGol());
		
		try {
			byte[] objetivo = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + name + ".out"));
			byte[] resultado = Files.readAllBytes(Paths.get("casos de prueba/out/" + name + ".out"));
			
			Assert.assertArrayEquals(objetivo, resultado);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void caso1() {
		String name = "caso1";
		arch = new Archivo(name);
		evaluador = arch.leerArchivo();
		arch.guardarArchivo(evaluador.paloGol());
		
		try {
			byte[] objetivo = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + name + ".out"));
			byte[] resultado = Files.readAllBytes(Paths.get("casos de prueba/out/" + name + ".out"));
			
			Assert.assertArrayEquals(objetivo, resultado);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
