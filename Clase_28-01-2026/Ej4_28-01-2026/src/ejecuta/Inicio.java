package ejecuta;

import java.util.Scanner;

public class Inicio 
{

	public static void main(String[] args) 
	{
		int[][] tabla = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		// Poblamos la tabla:
		for(int fila = 0; fila < 2; fila++)
		{
			System.out.println("Introduce los datos de la fila " + fila);
			for(int columna = 0; columna < 3; columna++)
			{
				tabla[fila][columna] = sc.nextInt();
			}
		}
		
		// Imprimimos la tabla:
		System.out.println("Los datos de la tabla son: ");
		
		for(int fila = 0; fila < tabla.length; fila++)
		{
			for(int columna = 0; columna < tabla[0].length; columna++)
			{
				System.out.print( tabla[fila][columna] + "  ");
			}
			System.out.println();
		}
		
		
	}

}
