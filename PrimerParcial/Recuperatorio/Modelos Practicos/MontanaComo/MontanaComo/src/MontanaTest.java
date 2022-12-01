
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class MontanaTest {

	Archivo arch;
	Montana montana;
	String nombre_archivo;
	String base_uri = "casos de prueba/";

	@Test
	public void caso00() {
		nombre_archivo = "caso00";
		arch = new Archivo(nombre_archivo);
		montana = arch.leerArchivo();
		arch.guardarArchivo(montana.resolver());

		try {
			byte[] esperados = Files
					.readAllBytes(Paths.get(this.base_uri + "/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get(this.base_uri + "out/" + this.nombre_archivo + ".out"));

			Assert.assertArrayEquals(esperados, obtenidos);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
