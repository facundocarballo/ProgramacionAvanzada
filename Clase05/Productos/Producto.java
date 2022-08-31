package Productos;

import java.util.Date;

public class Producto {
	
	// Constantes
	
	// Atributos
	private Date fechaCaducidad, fechaEnvasado;
	private double numeroLote;
	private String paisDeOrigen;
	
	// Constructores
	public Producto
	(
			Date fechaCaducidad, 
			Date fechaEnvasado,
			double numeroLote,
			String paisDeOrigen
	) 
	{
		this.fechaCaducidad = fechaCaducidad;
		this.fechaEnvasado = fechaEnvasado;
		this.numeroLote = numeroLote;
		this.paisDeOrigen = paisDeOrigen;
	}
	
	public Producto() { }

	// Metodos
	
	// Overrides
	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", fechaEnvasado=" + fechaEnvasado + ", numeroLote="
				+ numeroLote + ", paisDeOrigen=" + paisDeOrigen + "]";
	}
}
