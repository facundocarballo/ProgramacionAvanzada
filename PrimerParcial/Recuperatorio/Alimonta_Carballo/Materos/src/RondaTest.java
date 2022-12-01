import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class RondaTest {

	private Archivo archivo;
	private Ronda ronda;
	private String nombre_archivo;
	
	@Test
	public void caso00() {
		
		// Arrange
		this.nombre_archivo = "caso00";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso01() {
		
		// Arrange
		this.nombre_archivo = "caso01";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}
	
	@Test
	public void caso02() {
		
		// Arrange
		this.nombre_archivo = "caso02";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}
	
	@Test
	public void caso03() {
		
		// Arrange
		this.nombre_archivo = "caso03";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso04() {
		
		// Arrange
		this.nombre_archivo = "caso04";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso05() {
		
		// Arrange
		this.nombre_archivo = "caso05";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso06() {
		
		// Arrange
		this.nombre_archivo = "caso06";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso07() {
		
		// Arrange
		this.nombre_archivo = "caso07";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso08() {
		
		// Arrange
		this.nombre_archivo = "caso08";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso09() {
		
		// Arrange
		this.nombre_archivo = "caso09";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	@Test
	public void caso10() {
		
		// Arrange
		this.nombre_archivo = "caso10";
		this.archivo = new Archivo(this.nombre_archivo);
		this.ronda = this.archivo.leerArchivo();
		
		// Act
		this.ronda.resolver();
		this.archivo.guardarArchivo(ronda);
		
		// Assert
		try {
			byte[] esperados = Files.readAllBytes(Paths.get("casos de prueba/out esperado/" + this.nombre_archivo + ".out"));
			byte[] obtenidos = Files.readAllBytes(Paths.get("casos de prueba/out/" + this.nombre_archivo + ".out"));
			
			Assert.assertArrayEquals(esperados, obtenidos);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// Annihilate
			this.archivo = null;
			this.nombre_archivo = null;
			this.ronda = null;
		}
		
	}

	
}
