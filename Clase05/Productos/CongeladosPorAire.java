package Productos;

import java.util.Date;

public class CongeladosPorAire extends ProductoConTemperatura {

	// Constantes
	
	// Atributos
	private double porcentajeNitrogeno, porcentajeOxigeno, porcentajeDioxidoDeCarbono, porcentajeVaporDeAgua;
	
	// Constructores
	public CongeladosPorAire
	(
			Date fechaCaducidad, 
			Date fechaEnvasado,
			double numeroLote,
			String paisDeOrigen,
			double temperaturaDeMantenimiento,
			double porcentajeNitrogeno,
			double porcentajeOxigeno,
			double porcentajeDioxidoDeCarbono,
			double porcentajeVaporDeAgua
	)
	{
		super(fechaCaducidad, fechaEnvasado, numeroLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeDioxidoDeCarbono = porcentajeDioxidoDeCarbono;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
	}
	
	public CongeladosPorAire() { }
	
	// Metodos
	
	// Overrides
	
	
}
