import java.util.List;

public class Utilitarias extends Transporte {

	// Constantes
	public final static double PESO_MAX = 700;
	public final static double DIAMETRO_MAX = 3;
	public final static int MAX_CIUDADES = 3;
		
	// Atributos
	public final int CANT_MAX_PAQUETES;
	
	// Constructores
	public Utilitarias(int CANT_MAX_PAQUETES)
	{
		this.CANT_MAX_PAQUETES = CANT_MAX_PAQUETES;
	}


	// Metodos

		
	// Overrides
	@Override
	public boolean puedoCargar(Paquete paquete) {
		
		List<String> ciudades = this.obtenerCiudades();
		
		return (
				this.paquetes.size() < CANT_MAX_PAQUETES
				&& (this.pesoActual() + paquete.peso) <= PESO_MAX
				&& (this.diametroActual() + paquete.diametro) <= DIAMETRO_MAX
				&& (ciudades.size() < MAX_CIUDADES || ciudades.contains(paquete.ciudad))
		);
		
		
	}
	
}
