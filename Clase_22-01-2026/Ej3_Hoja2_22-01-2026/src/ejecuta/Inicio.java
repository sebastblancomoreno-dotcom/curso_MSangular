/*
3.Programa que lee de manera consecutiva números hasta que se introducen dos números iguales seguidos. 
 */
package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int numero;
		int auxiliar;
		boolean continuar;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un NÚMERO: ");
		auxiliar = sc.nextInt();
		
		do
		{
			System.out.println("Introduce un NÚMERO: ");
			numero = sc.nextInt();
			
			if(auxiliar != numero)
			{
				auxiliar = numero;
				continuar = true;
			}
			else
			{
				continuar = false;
			}
		}while(continuar == true);

		System.out.println("Fin");
	}
}
