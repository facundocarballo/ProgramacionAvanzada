package Productos;

import java.util.Date;

public class ProductoConTemperatura extends Producto {

	// Constantes
	
	// Atributos
	private double temperaturaDeMantenimiento;
	
	// Constructores
	public ProductoConTemperatura
	(
			Date fechaCaducidad, 
			Date fechaEnvasado,
			double numeroLote,
			String paisDeOrigen,
			double temperaturaDeMantenimiento
	)
	{
		super(fechaCaducidad, fechaEnvasado, numeroLote, paisDeOrigen);
		this.temperaturaDeMantenimiento = temperaturaDeMantenimiento;
	}
	
	public ProductoConTemperatura() { }
	
	// Metodos
	
	// Overrides
	
	
}
