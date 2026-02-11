package clases;

import java.util.ArrayList;

public class CestaCompra
{
	// Constructor
	// -----------
	public CestaCompra()
	{
		this.productos = new ArrayList<Producto>();
	}
	
	// Campos
	// ------
	private ArrayList<Producto> productos; 
	
	// Métodos
	// -------
	public double obtenerTotal()
	{
		double total = 0;
		
		for(Producto p: productos)
		{
			total += p.getPrecio();
		}
		
		return total;
	}
	
	public void nuevoProducto(Producto p_producto)
	{
		this.productos.add(p_producto);
	}
	
	public void eliminarProducto(Producto p_producto) throws ProductoNotFoundException
	{
		boolean ok;
		
		ok = this.productos.remove(p_producto);
		
		if(ok == false)
		{
			throw new ProductoNotFoundException();
		}
	}
	
	public int contarProductos()
	{
		return this.productos.size();
	}
	
	public void vaciarCesta()
	{
		this.productos = new ArrayList<Producto>();
	}
	
	public boolean hayProductos()
	{
		return ( this.productos.size() != 0 );
	}
	
}
