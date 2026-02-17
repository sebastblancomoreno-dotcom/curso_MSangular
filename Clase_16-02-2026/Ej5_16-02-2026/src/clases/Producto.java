package clases;

public class Producto 
{
	public Producto() 
	{
	}
	public Producto(String referencia, String nombre, int precio) 
	{
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String referencia;
	public String nombre;
	public int precio;
	
	@Override
	public String toString() 
	{
		return "REFERENCIA: " + this.referencia + "\n"
				+ "NOMBRE: " + this.nombre + "\n"
				+ "PRECIO: " + this.precio + "\n";
	}
	
}
