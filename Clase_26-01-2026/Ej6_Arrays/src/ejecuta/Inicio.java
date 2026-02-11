package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int num;
		int[] numeros = {15, 7, 9, 23};  // length vale 4
		//               ------------
		//        -2 -1   0  1  2   3  
		//                         <|  i
		//	          i   |--------------->
		
		System.out.println("Contenido del array desde el final hasta el principio: ");
		
		// for(int i = numeros.length-1; i > -1 ; i--)
		for(int i = numeros.length-1; i >= 0; i--)
		{
			// System.out.println( numeros[i] );
			
			num = numeros[i];
			System.out.println(num);
		}
		
		
		System.out.println("Contenido del array desde el principio hasta el final: ");
		for(int i=0; i < numeros.length; i++)
		{
			num = numeros[i];
			System.out.println(num);			
		}
		
		
	}
}
