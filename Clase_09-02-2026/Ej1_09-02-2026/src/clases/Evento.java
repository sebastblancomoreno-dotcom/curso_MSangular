package clases;

public class Evento
{
	// Constructores
	// -------------
	public Evento()
	{
		this(0, "");
	}
	public Evento(int p_precio, String p_tipo)
	{
		setPrecio(p_precio);
		setTipo(p_tipo);
	}
	
	// Campos
	// ------
	private int precio;
	private String tipo;
	
	// Métodos
	// -------
	// - De esta clase. Método de instancia, se invoca desde los objetos
	public String imprimir()
	{
		String cadena = "";
		
		if(this instanceof Concierto)
		{
			cadena = ( (Concierto)this).toString();
		}
		else if(this instanceof Presentacion)
		{
			cadena = ( (Presentacion)this).toString();
		}
		return cadena;
	}
	
	// - De esta clase. Método estático, se invoca desde la clase
	public static String imprimirEstatico(Evento p_evento)
	{
		String cadena = "";
		
		if(p_evento instanceof Concierto)
		{
			cadena = ( (Concierto)p_evento ).toString();
		}
		else if(p_evento instanceof Presentacion)
		{
			cadena = ( (Presentacion)p_evento ).toString();
		}
		return cadena;		
	}
	
	
	// - Invalidados
	@Override
	public String toString()
	{
		// Interpolar
		// return String.format("PRECIO: %d\nTIPO EVENTO: %s", getPrecio(), getTipo());
		
		// Concatenar
		return "PRECIO: " + getPrecio() + "\n" 
			   + "TIPO EVENTO: " + getTipo() + "\n";
	}
	
	
	// - Getters y setters
	// Campo precio...
	public int getPrecio()
	{
		return this.precio;
	}
	public void setPrecio(int p_precio)
	{
		this.precio = p_precio;
	}
	
	// Campo tipo...
	public String getTipo()
	{
		return this.tipo;
	}
	public void setTipo(String p_tipo)
	{
		this.tipo = p_tipo;
	}
}
