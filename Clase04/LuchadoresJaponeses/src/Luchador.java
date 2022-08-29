
public class Luchador {
	
	// Atributos
	private int altura, peso;
	
	// Constructor
	public Luchador(int altura, int peso)
	{
		this.altura = altura;
		this.peso = peso;
	}
	
	public Luchador()
	{
		this.altura = 0;
		this.peso = 0;
	}
	
	// Metodos
	public boolean dominaA(Luchador otroLuchador)
	{
		
		if (this.altura > otroLuchador.altura && this.peso > otroLuchador.peso)
			return true;
		
		if (this.altura == otroLuchador.altura && this.peso > otroLuchador.peso)
			return true;
		
		if (this.peso == otroLuchador.peso && this.altura > otroLuchador.altura)
			return true;
		
		return false;
	}

	
	// Overrides
	@Override
	public String toString() {
		return this.peso + " " + this.altura;
	}
	

}
