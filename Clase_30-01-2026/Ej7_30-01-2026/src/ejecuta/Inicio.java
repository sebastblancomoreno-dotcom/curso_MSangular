package ejecuta;


public class Inicio 
{
	public static void main(String[] args) 
	{
		String nombre = "MARIA";
		
		finalizarCadena(nombre);
		
		System.out.println(nombre);
	}
	
	public static void finalizarCadena(String p_cadena)
	{
		p_cadena = p_cadena + ".";
	}
	


}
