package clases;

public class Empresa 
{
	public Empresa() 
	{
	}
	
	public Empresa(int idEmpresa, String nombre, String telefono) 
	{
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.telefono = telefono;
	}	
	
	public int idEmpresa;
	public String nombre;
	private String telefono;
	
	@Override
	public String toString() 
	{
		return "ID: " + this.idEmpresa + "\n" 
				+ "NOMBRE EMPRESA: " + this.nombre + "\n"
				+ "TELÉFONO: " + this.telefono + "\n";
	}
}
