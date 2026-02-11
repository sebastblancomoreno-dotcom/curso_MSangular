package clases;

public class Producto 
{
	// Constructores
	// -------------
	public Producto(String p_nombre, double p_precio)
	{
		this.nombre = p_nombre;
		this.precio = p_precio;
	}
	
	// Campos
	// ------
	private String nombre;
	private double precio;
	
	// Métodos
	// -------
	// - Getters y setters
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public double getPrecio() 
	{
		return precio;
	}
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	// - Invalidados
	@Override
	public boolean equals(Object p_otroProducto) 
	{
		return this.nombre.equalsIgnoreCase( ( (Producto)p_otroProducto).getNombre() );
	}
	
}
