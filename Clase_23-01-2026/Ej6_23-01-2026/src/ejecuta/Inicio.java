/*
7. Programa que pide el número de calificaciones a introducir, y una nota de corte. 
   A continuación, se introducirán las calificaciones, para finalmente indicar cuántas 
   calificaciones han igualado o superado la nota de corte. 
 */

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int cantidadNotas;
		float notaCorte;
		float nota;
		int contadorAprobados = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce NÚMERO CALIFICACIONES: ");
		cantidadNotas = sc.nextInt();
		
		System.out.println("Introduce NOTA DE CORTE: ");
		notaCorte = sc.nextFloat();
		
		System.out.println("Introduce " + cantidadNotas + " calificaciones: ");

		for(int contadorNotas = 1; contadorNotas <= cantidadNotas; contadorNotas++) if(sc.nextFloat() >= notaCorte) contadorAprobados++;
	
		
		/*
		for(int contadorNotas = 1; contadorNotas <= cantidadNotas; contadorNotas++)
		{
			nota = sc.nextFloat();
			if(nota >= notaCorte)
			{
				contadorAprobados++;
			}
		}
		*/
		
		System.out.println("Número aprobados: " + contadorAprobados);
		
	}
}
