package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		double numero = 15092.73619D;
		String apellido = "García";
		
		numero = Math.round(numero * 100) / 100D;
		apellido = apellido.toUpperCase();
		
		
		System.out.println(numero);
		System.out.println(apellido);
	}
}
