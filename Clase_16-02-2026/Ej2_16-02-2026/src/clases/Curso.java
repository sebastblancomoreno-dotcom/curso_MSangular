package clases;

public class Curso 
{
	public Curso()
	{
	}
	public Curso(String p_nombre, int p_horas)
	{
		this.nombre = p_nombre; 
		this.horas = p_horas;
	}
	
	public String nombre;
	public int horas;
	
	@Override
	public String toString() 
	{
		return "NOMBRE: " + this.nombre + "\n"
				+ "HORAS: " + this.horas + "\n";
	}
	
	@Override
	public int hashCode() 
	{
		return this.nombre.hashCode();
	}
	@Override
	public boolean equals(Object p_OtroCurso) 
	{
		return this.nombre.equals( ((Curso)p_OtroCurso).nombre );
	}
}
