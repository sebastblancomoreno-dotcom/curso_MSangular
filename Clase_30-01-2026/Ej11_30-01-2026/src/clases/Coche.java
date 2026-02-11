package clases;

public class Coche
{
	// Constructores
	// =============
	public Coche()
	{
		
	}
	public Coche(String p_fabricante, String p_combustible, String p_color)
	{
		this.fabricante = p_fabricante;
		this.combustible = p_combustible;
		this.color = p_color;
	}
	
	// Campos
	// ======
	public String fabricante;
	public String combustible;
	public String color;
	
	// Métodos
	// =======
	public String imprimir()
	{
		String respuesta;
		
		respuesta = "FABRICANTE: " + this.fabricante + "\n"
				  + "COMBUSTIBLE: " + this.combustible + "\n"
				  + "COLOR: " + this.color + "\n";
		
		return respuesta;
	}
	
	@Override
	public String toString()
	{
		String respuesta;
		
		respuesta = "FABRICANTE: " + this.fabricante + "\n"
				  + "COMBUSTIBLE: " + this.combustible + "\n"
				  + "COLOR: " + this.color + "\n";
		
		return respuesta;
	}
	
}