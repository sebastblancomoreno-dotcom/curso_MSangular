/*
 * 8. Programa que lee 87 números. Al finalizar mostrará el máximo introducido, 
  y cuántas veces se repite dicho máximo.
 */

package ejecuta;

import java.util.Scanner;

public class Inicio
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numero;
		int contadorApariciones = 0;
		int maximo = Integer.MIN_VALUE;

		System.out.println("Introduce 3 números: ");
		for(int contador=1; contador<=3; contador++)
		{
			numero = sc.nextInt();
			
			if(numero > maximo)
			{
				maximo = numero;
				contadorApariciones = 1;
			}
			else if(numero == maximo)
			{
				contadorApariciones++;
			}
		}
		
		System.out.println("El máximo " + maximo + " aparece " + contadorApariciones + " veces");
		
	}
}
