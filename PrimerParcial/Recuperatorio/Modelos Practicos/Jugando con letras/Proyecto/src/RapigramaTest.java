import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class RapigramaTest {

	Archivo archivo = null;
	Rapigrama rapigrama = null;
	
	@Test
	public void caso00() {
		String nombre_archivo = "caso00";
		archivo = new Archivo(nombre_archivo);
		rapigrama = archivo.leerArchivo();
		rapigrama.resolver();
		archivo.guardarArchivo(rapigrama.palabras);
		
		try {
			byte[] bytes_esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + nombre_archivo + ".out"));
			byte[] bytes_encontrados = Files.readAllBytes(Paths.get("casos de prueba/out/" + nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(bytes_esperados, bytes_encontrados);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
