package ejecuta;

public class Curso implements Comparable<Curso>
{
	public Curso() 
	{
	}
	public Curso(String nombre, int horas) 
	{
		this.nombre = nombre;
		this.horas = horas;
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
	public int compareTo(Curso p_otroCurso) 
	{
		return this.nombre.compareTo(p_otroCurso.nombre);
		//return this.horas - p_otroCurso.horas;
	}
	
	
}
