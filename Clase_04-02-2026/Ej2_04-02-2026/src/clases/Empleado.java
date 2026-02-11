package clases;

public class Empleado extends Empresa
{
	public Empleado() 
	{
		super();
	}
	public Empleado(int idEmpleado, String apellido, String departamento, 
				    int idEmpresa, String nombreEmpresa, String telefonoEmpresa)
	{
		super(idEmpresa, nombreEmpresa, telefonoEmpresa);
		
		this.idEmpleado = idEmpleado;
		this.apellido = apellido;
		this.departamento = departamento;
	}
	
	public int idEmpleado;
	public String apellido;
	public String departamento;
	
	@Override
	public String toString() 
	{
		return super.toString()
				+ "ID: " + this.idEmpleado + "\n" 
				+ "APELLIDO: "  + this.apellido + "\n"
				+ "DEPARTAMENTO: " + this.departamento + "\n";
	}
}
