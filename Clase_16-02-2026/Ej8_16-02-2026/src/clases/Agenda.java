package clases;

public class Agenda 
{
	public Agenda() 
	{
	}
	public Agenda(String nombre, String telefono) 
	{
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public Agenda(String nombre, String telefono, String email) 
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public String nombre;
	public String telefono;
	public String email;
	
	@Override
	public String toString() 
	{
		return "NOMBRE: " + this.nombre + ", TELEFONO: " + this.telefono + ", EMAIL: " + this.email; 
	}
}
