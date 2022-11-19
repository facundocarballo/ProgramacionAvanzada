import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;


public class ConflictoReinasTest {

	Archivo arch1, arch2;
	Mapa map1, map2;


	@Before
	public void setUp() {
		
		arch1 = new Archivo("reinas");
		arch2 = new Archivo("reinas2");
		
		map1 = arch1.leerArchivo();
		map2 = arch2.leerArchivo();
	}

	@Test
	public void reinas_sin_conflictos() {
				
		for (Reina reina : map1.reinas) {
			map1.obtener_conflictos(reina);		
			Assert.assertEquals(0, reina.conflictos.size());
		}
		
//		try {
//			byte[] f1 = Files.readAllBytes(Path.of(this.PATH_OUT + "/reinas.out"));
//			byte[] f2 = Files.readAllBytes(Path.of(this.PATH_OUT_ESP + "/reinas.out"));
//			
//			Assert.assertArrayEquals(f1, f2);
//		} catch (IOException e) {
//			Assert.fail();
//		}
		
	}
	
	
}
