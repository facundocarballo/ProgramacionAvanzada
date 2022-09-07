import java.util.ArrayList;
import java.util.List;

public abstract class Transporte {
	
	// Constantes
	
	// Atributos
	List<Paquete> paquetes = new ArrayList<Paquete>();

	// Constructores
	public Transporte() {}
		
	// Metodos
	public boolean cargar(Paquete paquete)
	{
		if (puedoCargar(paquete)) 
		{
			paquetes.add(paquete);
			return true;
		}
		
		return false;
	}
	
	public double pesoActual()
	{
		double pesoActual = 0;
		
		for (Paquete paquete : paquetes)
		{
			pesoActual += paquete.peso;
		}
		
		return pesoActual;
	}
	
	public double diametroActual()
	{
		double diametroActual = 0;
		
		for (Paquete paquete : paquetes)
		{
			diametroActual += paquete.diametro;
		}
		
		return diametroActual;
	}
	
	public List<String> obtenerCiudades()
	{
		List<String> ciudades = new ArrayList<String>();
		
		for (Paquete paquete : this.paquetes)
		{
			if (!ciudades.contains(paquete.ciudad))
			{
				ciudades.add(paquete.ciudad);
			}
		}
		
		return ciudades;
	}
	
	public abstract boolean puedoCargar(Paquete paquete);
	
	// Overrides
	
}
