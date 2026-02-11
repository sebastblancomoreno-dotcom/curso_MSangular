package ejecuta;

import java.util.Arrays;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int[] numeros = {15, 1, 3, 2, 45};  //  numeros.length vale 5
		//     i         0  1  2  3   4
		//  		     |-->  
		//               0     .. 3   4
		//				 <------------|
		
		Arrays.sort(numeros);
		
		//                   5
		//              ------------
		
		System.out.println("Listado de números de menor a mayor");
		for(int i=0; i<numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
		
		System.out.println("Listado de números de mayor a menor");
		for(int i = numeros.length-1; i>=0; i--)
		{
			System.out.println(numeros[i]);
		}
		
	}
}


