package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		int puntos;
		float precio;
		
		System.out.println("Introduce NOMBRE: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduce PUNTOS: ");
		puntos = Integer.valueOf( sc.nextLine() );
		//                        -------------
		//                           "HOLA"
		//       --------------------------------
		//                   100
		
		System.out.println("Introduce APELLIDO: ");
		apellido = sc.nextLine();
		
		System.out.println("Introduce PRECIO: ");
		precio = Float.valueOf( sc.nextLine() );
		
		System.out.println("FIN");
	}
}