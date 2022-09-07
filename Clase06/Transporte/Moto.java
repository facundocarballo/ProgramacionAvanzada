
public class Moto extends Transporte {

	// Constantes
	public final static int CANT_MAX_PAQUETES = 3;
	public final static double PESO_MAX = 50;
	public final static double DIAMETRO_MAX = 1;
	
	// Atributos

	
	// Constructores
	public Moto() {}
	
	// Metodos
	private boolean mismaCiudad(Paquete paquete) {
		if (this.paquetes.isEmpty()) {
			return true;
		}
		if (this.paquetes.get(0).ciudad != paquete.ciudad)
			return false;
		
		return true;
	}
	
	// Overrides
	public boolean puedoCargar(Paquete paquete) {
		
//		System.out.println("1) " + this.paquetes.size() + " == " + CANT_MAX_PAQUETES + " ?");
//		System.out.println("2) " + this.pesoActual() + " > " + PESO_MAX + " ?");
//		System.out.println("3) " + this.diametroActual() + " > " + DIAMETRO_MAX + " ?");
//		System.out.println("4) " + !this.paquetes.isEmpty() + " && " + this.paquetes.get(0).ciudad + " != " + paquete.ciudad + " ?");
//		System.out.println("");
		
		return this.paquetes.size() < CANT_MAX_PAQUETES
				&& (this.pesoActual() + paquete.peso) <= PESO_MAX
				&& (this.diametroActual() + paquete.diametro) <= DIAMETRO_MAX
				&& this.mismaCiudad(paquete);
	}
	
}
