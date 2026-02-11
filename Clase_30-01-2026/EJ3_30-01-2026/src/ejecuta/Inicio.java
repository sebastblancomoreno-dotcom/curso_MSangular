package ejecuta;

import java.util.Arrays;

public class Inicio 
{

	public static void main(String[] args) 
	{
		int[] numeros = {15, 1, 7, 3, 45, 89, 0};
		
		// El método sort no trabaja con arrays de tipo primitivo
		
		Arrays.sort(numeros, (a, b)->{
			 return a - b;	
		} );
	}

}
