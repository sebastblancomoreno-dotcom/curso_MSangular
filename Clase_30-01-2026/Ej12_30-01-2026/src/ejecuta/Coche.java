package ejecuta;

public class Coche 
{
	// Constructor
	public Coche()
	{
		
	}
	public Coche(String fabricante, String combustible, String color)
	{
		this.fabricante = fabricante;
		this.combustible = combustible;
		this.color = color;
	}
	
	// Campos
	public String fabricante;
	public String combustible;
	public String color;
	
	@Override
	public String toString()
	{
		return "FABRICANTE: " + this.fabricante + "\n"
				+ "COMBUSTIBLE: " + this.combustible + "\n"
				+ "COLOR: " + this.color + "\n";
		
	}
}
