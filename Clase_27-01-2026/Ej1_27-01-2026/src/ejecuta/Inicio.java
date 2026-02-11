/*
19. Realiza un programa que lea desde teclado 3 números y posteriormente muestre
solamente los que sean pares. 
 */

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		
		// Pedimos 3 números para guardarlos en el array
		System.out.println("Introduce 3 números: ");
		
		for(int i=0; i<numeros.length; i++)
		{
			numeros[i] = sc.nextInt();
		}
		
		// Recorremos el array de principio a fin y mostramos los números pares
		System.out.println("Los números pares son:");
		
		for(int i=0; i<numeros.length; i++)
		{
			if( numeros[i] % 2 == 0 )
			{
				System.out.println(numeros[i]);
			}
		}
		
	}
}
