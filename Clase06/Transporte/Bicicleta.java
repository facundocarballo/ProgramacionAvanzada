
public class Bicicleta extends Transporte {

	// Constantes
	public final static int CANT_MAX_PAQUETES = 1;
	public final static double PESO_MAX = 10;
	public final static double DIAMETRO_MAX = 1;

	
	// Atributos
	
	// Constructores
	
	// Metodos
	
	
	// Overrides
	@Override
	public boolean puedoCargar(Paquete paquete) {
		return this.paquetes.size() < CANT_MAX_PAQUETES
				&& (this.pesoActual() + paquete.peso) <= PESO_MAX
				&& (this.diametroActual() + paquete.diametro) <= DIAMETRO_MAX;
	}
}
