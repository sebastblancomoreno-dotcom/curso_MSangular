package ejecuta;

public class Alumno 
{
	// Campos
	// ------
	public String nombre;
	public final static String ACADEMIA = "Dicampus"; // campo constante y estático
	
	// Método de instancia
	// Puede utilizar campos estáticos y de instancia
	public String imprimir()
	{
		// this.nombre es un campo de instancia, mientras que Alumno.ACADEMIA es un campo estático
		return "NOMBRE: " + this.nombre + "\n"
				+ "ACADEMIA: " + Alumno.ACADEMIA;
	}
	
	// Método estático
	// Solo puede utilizar campos estáticos, no permite this.nombre porque es un campo de instancia
	public static String imprimirEstatico()
	{
		return "NOMBRE: " + this.nombre + "\n"
				+ "ACADEMIA: " + Alumno.ACADEMIA; 
	}
}
