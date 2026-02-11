package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		//               *      *
		String cadena = "12345678C"; // length() es 9
		//				 012345678
		//               --------
		String subcadena = cadena.substring(0, cadena.length()-1);

		System.out.println(subcadena);
	}
}
