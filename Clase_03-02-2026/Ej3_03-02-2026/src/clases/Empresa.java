package clases;

public class Empresa
{
	public Empresa() 
	{
	}	
	
	public Empresa(String nombre, int numeroEmpleados) 
	{
		this.nombre = nombre;
		this.numeroEmpleados = numeroEmpleados;
	}

	public String nombre;
	public int numeroEmpleados;
	
	@Override
	public String toString() 
	{
		String cadena;
		
		cadena = "NOMBRE EMPRESA: " + this.nombre + "\n" 
				+ "NUMERO EMPLEADOS: " + this.numeroEmpleados + "\n";
		
		return cadena;
	}

	@Override
	public boolean equals(Object p_otraEmpresa) 
	{
		Empresa otraEmpresa = (Empresa) p_otraEmpresa;
		boolean iguales = this.nombre.equals(otraEmpresa.nombre);
		
		return iguales;
	}
	
	
}
