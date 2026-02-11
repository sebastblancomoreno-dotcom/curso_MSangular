// 5. Programa que nos informa si un número introducido es primo o no.

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numero;
		int resto;
		boolean esPrimo = true;
		
		System.out.println("Introduce un NÚMERO: ");
		numero = sc.nextInt();
		
		// Si el número es 14, probamos a dividir entre los números 
		// que van desde el 2 hasta el 13. Si alguno de estos logra 
		// dividir al número, el número ya no será primo.
		
		for(int candidatoDivisor = 2; esPrimo == true && candidatoDivisor < numero; candidatoDivisor++)
		{
			resto = numero % candidatoDivisor;
			if(resto == 0)
			{
				esPrimo = false;
			}
		}
		
		if(esPrimo == true)
		{
			System.out.println("Es primo");
		}
		else
		{
			System.out.println("No es primo");
		}
		
	}
}
