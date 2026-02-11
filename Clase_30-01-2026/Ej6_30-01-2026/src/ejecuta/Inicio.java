package ejecuta;

public class Inicio 
{

	public static void main(String[] args) 
	{
	
		int resultado;
		
		resultado = "Segovia".compareTo("Segovia");
		// CompareTo puede devolver:
		// - 0 sin son iguales
		// - un valor > 0 si "Madrid" es alfabeticamente mayor a Segovia.
		// - un valor <0 si "Madrid" es alfabeticamente menor que Segovia.
		
		System.out.println(resultado);
	}

}
