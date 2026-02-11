package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		//  ----------
		//  |  |  |  |    cantidad es 3
		//  ----------
// posicion  0  1  2    3
		//   |--------->     
		int[] numeros;
		int num;
		int cantidad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos números quieres introducir?");
		cantidad = sc.nextInt();
		
		// Inicializamos el array
		numeros = new int[cantidad];
		
		// Poblamos el array
		System.out.println("Introduce " + cantidad + " números:");
		for(int posicion = 0; posicion < cantidad; posicion++)
		{
			num = sc.nextInt();
			numeros[posicion] = num;
		}
		
		// Imprimimos
		System.out.println("Contenido del array:");
		
		/*
		for(int posicion = 0; posicion < cantidad; posicion++)
		{
			num = numeros[posicion];
			System.out.println(num);
		}
		*/
		
		for(int n : numeros) System.out.println(n);
		
		
	}
}
