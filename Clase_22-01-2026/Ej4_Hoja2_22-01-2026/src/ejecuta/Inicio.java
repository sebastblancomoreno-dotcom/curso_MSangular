// 4. Programa que muestra todos los divisores de un número introducido. 
//    Entre los divisores no se incluirá el propio número.

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int numero;
		int resto;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un NÚMERO: ");
		numero = sc.nextInt();
		
		System.out.println("Los divisores son: ");
		
		for(int divisor = 1; divisor<numero; divisor++)
		{
			resto = numero % divisor;
			
			if(resto == 0)
			{
				System.out.println(divisor);
			}
		}
		
		sc.close();
	}
}