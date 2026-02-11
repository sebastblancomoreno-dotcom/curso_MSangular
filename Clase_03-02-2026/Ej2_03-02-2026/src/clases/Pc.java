package clases;

public class Pc 
{
	public Pc()
	{
		
	}
	
	public Pc(String p_fabricante, int p_ram, float p_precio)
	{
		this.fabricante = p_fabricante;
		this.ram = p_ram;
		this.precio = p_precio;
	}
	
	public String fabricante;
	public int ram;
	public float precio;
	
	
	@Override
	public String toString() 
	{
		/*
		String cadena;
		
		cadena = "FABRICANTE: " + this.fabricante + "\n"
				+ "RAM: " + this.ram + "\n"
				+ "PRECIO: " + this.precio + "\n";
		
		return cadena;
		*/
		
			return "FABRICANTE: " + this.fabricante + "\n"
					+ "RAM: " + this.ram + "\n"
					+ "PRECIO: " + this.precio + "\n";
	}

	@Override
	public boolean equals(Object p_otroPc) 
	{
		return this.fabricante.equals( ((Pc)p_otroPc).fabricante );
	}
	
}






