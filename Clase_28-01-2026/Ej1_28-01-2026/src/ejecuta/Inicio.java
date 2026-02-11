/*
23. Realiza un programa que lea desde teclado 3 números y posteriormente los muestre. 
    Los números que estuvieran repetidos solo se deben mostrar una vez. 
 */

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int num;
		int[] numeros = new int[3];
		boolean encontrado;
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		
		System.out.println("Introduce 3 numeros: ");
		for(int i=0; i<numeros.length; i++)
		{
			num = sc.nextInt();
			
			encontrado = false;
			for(int j=0; encontrado == false && j<posicion; j++)
			{
				if(num == numeros[j])
				{
					encontrado = true;
				}
			}
			
			// Añadimos el número en el array cuando no lo hemos encontrado
			if(encontrado == false)
			{
				numeros[posicion] = num;
				posicion++;
			}
		}
		
		// Recorremos el array para mostrar el contenido, es decir, los números sin repetir
		
		System.out.println("Los números sin repetir son: ");
		for(int i=0; i<posicion; i++)
		{
			System.out.println(numeros[i]);
		}
		
	}
}