package Productos;

import java.util.Date;

public class Refrigerados extends ProductoConTemperatura {
	
	// Constantes
	
	// Atributos
	private double codigoSupervisionAlimentaria;
	
	// Constructores
	public Refrigerados
	(
			Date fechaCaducidad, 
			Date fechaEnvasado,
			double numeroLote,
			String paisDeOrigen,
			double temperaturaDeMantenimiento,
			double codigoSupervisionAlimentaria
	)
	{
		super(fechaCaducidad, fechaEnvasado, numeroLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}
	
	public Refrigerados() { }
	
	// Metodos
	
	// Overrides
	
	
}
