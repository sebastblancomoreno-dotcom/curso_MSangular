/*
27. Realiza un programa que cargue desde teclado una tabla de enteros de dimensión 3x3. 
El programa mostrará la columna en la que la suma de sus elementos sea menor. 
 */

package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args)
	{
		int[][] tabla = {{7, 4, 5}, {1, 1, 1}, {0, 0, 0}};
		int minimo = Integer.MAX_VALUE;
		int suma = 0;
		int columna = 0; // columna con la suma más pequeña
		Scanner sc = new Scanner(System.in);
		
		for(int col=0; col < tabla[0].length; col++)
		{
			suma = 0;
			for(int fila=0; fila<tabla.length; fila++)
			{
				suma += tabla[fila][col];
			}
			
			if(suma < minimo)
			{
				minimo = suma;
				columna = col;
			}
		}
		
		System.out.println("La columna con la suma más pequeña es la número " + columna);
		
		sc.close();
	}
}
