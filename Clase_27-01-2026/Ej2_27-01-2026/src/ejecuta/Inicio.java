/*
20. Realiza un programa que lea desde teclado 3 números. A continuación nos pedirá que
busquemos un número entre los introducidos, y nos dirá si ha sido encontrado o no. En el
caso en el que haya sido encontrado, nos indicará cuántas veces se ha introducido. 

El programa nos preguntará si queremos seguir buscando más números o no: “¿Desea
seguir buscando?(s/n)”.
*/

package ejecuta;

import java.util.Scanner;

public class Inicio 
{

	public static void main(String[] args)
	{
		final int CANTIDAD = 3;
		int[] numeros = new int[CANTIDAD];
		int busqueda;
		int contador = 0; // lleva la cuenta de las veces que aparece un número 
		Scanner sc = new Scanner(System.in);
		char continuar;
		
		System.out.println("Introduce " + CANTIDAD + " números: ");
		for(int i=0; i < CANTIDAD; i++)
		{
			numeros[i] = Integer.valueOf( sc.nextLine() ); 
		}
		
		do
		{
			System.out.println("Introduce un número para buscar: ");
			busqueda = Integer.valueOf( sc.nextLine() );
			
			for(int i=0; i < numeros.length; i++)
			{
				if(busqueda == numeros[i])
				{
					contador++;
				}
			}
			
			if(contador == 0)
			{
				System.out.println("NO ENCONTRADO");
			}
			else if(contador == 1)
			{
				System.out.println("ENCONTRADO");
				System.out.println("APARECE 1 VEZ");
			}
			else if(contador > 1)
			{
				System.out.println("ENCONTRADO");
				System.out.println("APARECE " + contador + " VECES");
			}
			
			System.out.println("¿Desea seguir buscando?(s/n)");
			continuar = sc.nextLine().charAt(0);

		} while(continuar == 's' || continuar == 'S');
		
		System.out.println("FIN");
		
	}
}









