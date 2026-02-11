package ejecuta;

public class Inicio 
{

	public static void main(String[] args) 
	{
		int[] numeros = {1, 10, 7, 3};  // length vale 4
		//               -- -- -- --
		//               0   1  2  3   4
		//           i   |------------->
		
		for(int i=0; i < numeros.length; i++)
		{
			System.out.println( numeros[i] ); 
		}

	}
}
