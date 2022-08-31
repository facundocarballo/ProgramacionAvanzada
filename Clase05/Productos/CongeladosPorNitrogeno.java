package Productos;

import java.util.Date;

public class CongeladosPorNitrogeno extends ProductoConTemperatura {
	
	// Constantes
	
	// Atributos
	private String metodoDeCongelacion;
	private int tiempoDeExposicion; // en segundos
	
	// Constructores
	public CongeladosPorNitrogeno
	(
			Date fechaCaducidad, 
			Date fechaEnvasado,
			double numeroLote,
			String paisDeOrigen,
			double temperaturaDeMantenimiento,
			String metodoDeCongelacion,
			int tiempoDeExposicion
	)
	{
		super(fechaCaducidad, fechaEnvasado, numeroLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.metodoDeCongelacion = metodoDeCongelacion;
		this.tiempoDeExposicion = tiempoDeExposicion;
	}
	
	public CongeladosPorNitrogeno() { }
	// Metodos
	
	// Overrides
	
	
}
