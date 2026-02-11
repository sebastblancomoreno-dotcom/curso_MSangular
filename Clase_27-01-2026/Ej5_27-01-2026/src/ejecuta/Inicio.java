// Pedir un número por teclado y preguntar "¿Deseas continuar?(s/n)", 
// si la respuesta es s volvemos a pedir el número, si es n el programa mostrará la suma 
// de los números introducidos y finalizará.

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int numero;
		int suma = 0;
		String respuesta;
		
		do
		{
			System.out.println("Introduce un NÚMERO: ");
			numero = Integer.valueOf( sc.nextLine() );
			
			// suma = suma + numero;
			suma += numero;

			do
			{
				System.out.println("¿Deseas continuar?(s/n)");
				respuesta = sc.nextLine();
			}while(respuesta.equalsIgnoreCase("s")==false && respuesta.equalsIgnoreCase("n")==false);
			
		}while( respuesta.equalsIgnoreCase("s") );

		System.out.println("La suma es " + suma);
		
	}
}
