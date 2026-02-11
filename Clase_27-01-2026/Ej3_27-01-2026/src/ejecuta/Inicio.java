/*
 * Pedir una nota por teclado, deberá estar comprendida entre 0 y 10. 
 * Si no es correcta se volvera a pedir otra vez hasta que sea correcta.
 */

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int nota;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Introduce NOTA entre 0 y 10: ");
			nota = sc.nextInt();
		}
		// while(nota<0 || nota>10);
		while( !(nota>=0 && nota<=10) );
		
		System.out.println("FIN");

	}
}