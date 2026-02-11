package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		String nombre = "Miguel";
		int edad = 46;
		float nota = 8.25F;
		String cadena;

		// "Buenos días Miguel"
		//              ------
		//              nombre
		
		cadena = String.format("Buenos días %s, tienes %d años y tu nota media es %.2f", nombre, edad, nota);
		
		System.out.println(cadena);
	}
}
