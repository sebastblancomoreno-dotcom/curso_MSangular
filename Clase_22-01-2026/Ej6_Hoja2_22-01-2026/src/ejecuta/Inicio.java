// 6. Programa que lee 9 números, y en el caso en el que el primero 
// introducido sea igual al último, nos muestra la media. 
// En caso contrario, no se mostrará nada.
package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int primero;
		int ultimo = 0;
		int suma = 0;
		float media;
		final int CANTIDAD_NUMEROS = 4;
		
		System.out.println("Introduce un número: ");
		primero = sc.nextInt();
		
		suma = suma + primero;
		
		for(int contador = 2; contador <= CANTIDAD_NUMEROS; contador++)
		{
			System.out.println("Introduce un número: ");
			ultimo = sc.nextInt();
			
			suma = suma + ultimo;
		}
		
		if(ultimo == primero)
		{
			media = (float)suma / CANTIDAD_NUMEROS;
			System.out.println("La media es " + media);
		}
	}
}
