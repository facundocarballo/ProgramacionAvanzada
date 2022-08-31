package Productos;

import java.util.ArrayList;
import java.util.List;

public class EnvioDeProductos {

	// Constantes
	
	// Atributos
	private List<Producto> productos;
	
	// Constructores
	public EnvioDeProductos(Producto[] productos)
	{
		this.productos = new ArrayList<Producto>();
		
		for (Producto producto : productos)
		{
			this.agregarProducto(producto);
		}
	}
	
	public EnvioDeProductos() 
	{
		this.productos = new ArrayList<Producto>();
	}
	
	// Metodos
	public int cantidadDeProductos()
	{
		return this.productos.size();
	}
	
	public void agregarProducto(Producto producto)
	{
		this.productos.add(producto);
	}
	
	public void mostrar()
	{
		for(Producto producto : this.productos)
		{
			System.out.println(producto);
		}
	}
	
	// Overrides
	
	
}
