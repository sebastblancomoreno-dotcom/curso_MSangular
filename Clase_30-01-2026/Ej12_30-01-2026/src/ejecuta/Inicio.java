package ejecuta;

public class Inicio 
{

	public static void main(String[] args) 
	{
		Coche[] coches = new Coche[2];
		Coche c;
		
		coches[0] = new Coche("Opel", "Gasolina", "Verde");
		coches[1] = new Coche("Seat", "Eléctrico", "Amarillo");
		
		for(int i=0; i<coches.length; i++)
		{
			// System.out.println(coches[i]);
			c = coches[i];
			
			System.out.println( c.toString() );
		}

	}

}
