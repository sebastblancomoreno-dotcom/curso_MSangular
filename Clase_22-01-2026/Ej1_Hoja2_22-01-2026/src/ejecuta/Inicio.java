// 1. Programa que lee dos números A y B, y nos informa si B es divisor de A o no.

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int numero1;
		int numero2;
		int resto;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		numero2 = sc.nextInt();
		
		resto = numero1 % numero2;
		
		if(resto == 0)
		{
			System.out.println("El número es divisible");
		}
		else
		{
			System.out.println("El número no es divisible");
		}
		
		sc.close();
	}
}
