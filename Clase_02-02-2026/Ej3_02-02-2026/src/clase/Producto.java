package clase;

public class Producto 
{
	// Constructores
	public Producto()
	{
		
	}
	public Producto(int p_referencia, String p_nombre, float p_precio)
	{
		setReferencia(p_referencia);
		setNombre(p_nombre);
		setPrecio(p_precio);
	}
	
	// Campos
	private int referencia;
	private String nombre;
	private float precio;

	
	// Métodos
	// -------
	// Invalidados...
	@Override
	public String toString()
	{
		/*
		return "REFERENCIA: " + this.referencia + "\n" 
				+ "NOMBRE: " + this.nombre + "\n"
				+ "PRECIO: " + this.precio + "\n";
		*/
		
		return "REFERENCIA: " + this.getReferencia() + "\n"
				+ "NOMBRE: " + this.getNombre() + "\n"
				+ "PRECIO: " + this.getPrecio() + "\n";
	}
	
	// Getters y setters
	// -----------------
	//  - Campo referencia
	public int getReferencia()
	{
		return this.referencia;
	}
	public void setReferencia(int p_referencia)
	{
		if(p_referencia < 0)
		{
			System.out.println("El campo referencia no admite valores negativos.");
		}
		else
		{
			this.referencia = p_referencia;	
		}
	}
	
	// - Campo nombre
	public String getNombre()
	{
		return this.nombre.toUpperCase();
	}
	public void setNombre(String p_nombre)
	{
		p_nombre = p_nombre.trim(); // "   "
		
		if(p_nombre.length() == 0)
		{
			System.out.println("El nombre es obligatorio.");
		}
		else if(p_nombre.length()<3 || p_nombre.length()>15)
		{
			System.out.println("Campo NOMBRE, entre 3 y 15 caracteres");
		}
		else
		{
			this.nombre = p_nombre;
		}
	}
	
	// - Campo precio
	public float getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(float p_precio)
	{
		if(p_precio < 0)
		{
			System.out.println("Campo PRECIO, no puede ser negativo");
		}
		else
		{
			this.precio = p_precio;	
		}
	}
	
}
