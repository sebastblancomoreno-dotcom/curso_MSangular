package clases;

public class Viaje 
{
	// Constructores
	public Viaje()
	{
		
	}
	public Viaje(int p_idViaje, String p_destino, int p_duracion)
	{
		this.idViaje = p_idViaje;
		this.destino = p_destino;
		this.duracion = p_duracion;
	}
	
	
	// Campos
	public int idViaje;
	public String destino;
	public int duracion;
	
	// Métodos
	@Override
	public String toString()
	{
		String cadena;
		
		cadena = "ID VIAJE: " + this.idViaje + "\n"
				+ "DESTINO: " + this.destino + "\n"
				+ "DURACIÓN: "+ this.duracion + "\n";
		
		return cadena;
	}
	
}
