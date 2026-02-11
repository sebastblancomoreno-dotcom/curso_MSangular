/*
25. Realiza un programa que cargue desde teclado una tabla bidimensional de 2x3 de números
enteros. Posteriormente el programa pedirá un número a buscar, y en caso de encontrarlo
indicará el número de fila y columna donde se ha encontrado por primera vez. 

El programa ofrecerá al usuario la opción de seguir buscando más números: “¿Desea seguir
buscando?(s/n)”.
*/
package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args)
	{
		int[][] matriz = new int[2][3];
		boolean encontrado;
		String respuesta;
		int busqueda; // número que se introduce por teclado para buscar en la matriz
		
		Scanner sc = new Scanner(System.in);
		
		// Poblamos la matriz
		for(int fila=0; fila<matriz.length; fila++)
		{
			System.out.println("Introduce tres números para la fila " + fila);
			
			for(int columna=0; columna < matriz[fila].length; columna++)
			{
				// matriz[fila][columna] = sc.nextInt();
				matriz[fila][columna] = Integer.valueOf( sc.nextLine() );
			}
		}
		
		do
		{
			// Hacemos la búsqueda
			System.out.println("Introduce el valor a buscar: ");
			// busqueda = sc.nextInt();
			busqueda = Integer.valueOf( sc.nextLine() );
			
			encontrado = false;
			for(int fila = 0; encontrado == false && fila<matriz.length; fila++)
			{
				for(int columna = 0; encontrado == false && columna<matriz[fila].length; columna++)
				{
					if(busqueda == matriz[fila][columna])
					{
						encontrado = true;
						
						System.out.println("Encontrado en la fila " + fila + " y la columna " + columna);
					}
				}
			}
			
			// Informamos si ha encontrado el valor de la búsqueda
			if(encontrado == false)
			{
				System.out.println("No se ha encontrado");
			}

			do
			{
				System.out.println("¿Desea seguir buscando?(s/n)");
				respuesta = sc.nextLine();				
			}while(respuesta.equalsIgnoreCase("s") == false && respuesta.equalsIgnoreCase("n") == false);
		}while( respuesta.equalsIgnoreCase("s") );
		
		System.out.println("FIN");
	}
}



