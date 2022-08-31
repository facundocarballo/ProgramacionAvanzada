package Productos;

import java.util.Date;

public class CongeladosPorAgua extends ProductoConTemperatura {
	
	// Constantes
	
	// Atributos
	private double gramosDeSalPorLitroDeAgua;
	
	// Constructores
	public CongeladosPorAgua
	(
			Date fechaCaducidad, 
			Date fechaEnvasado,
			double numeroLote,
			String paisDeOrigen,
			double temperaturaDeMantenimiento,
			double gramosDeSalPorLitroDeAgua
	)
	{
		super(fechaCaducidad, fechaEnvasado, numeroLote, paisDeOrigen, temperaturaDeMantenimiento);
		this.gramosDeSalPorLitroDeAgua = gramosDeSalPorLitroDeAgua;
	}
	
	public CongeladosPorAgua() { }
	
	// Metodos
	
	// Overrides
	
	
}
