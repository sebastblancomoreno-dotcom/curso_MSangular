package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		String numero;
		String letraUsuario;
		String letraCalculada;
		String cadenaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";  // length vale 23
		//					   012345678..          22
		int posicion;

		// Pedimos el número y la letra
		System.out.println("Introduce número: ");
		numero = sc.nextLine();
		
		System.out.println("Introduce letra: ");
		letraUsuario = sc.nextLine();
		
		// Comprobamos el documento
		
		// Primero obtenemos la posición que ocupa la letra dentro de cadenaLetras
		posicion = Integer.valueOf(numero) % 23;
		
		// A partir de esta, obtenemos la letra correcta
		letraCalculada = String.valueOf( cadenaLetras.charAt(posicion) );
		
		
		// Comparamos la letra correcta con la letra que ha introducido el usuario
		if( letraUsuario.equalsIgnoreCase(letraCalculada) )
		{
			System.out.println("El documento es correcto.");
		}
		else
		{
			System.out.println("El documento no es correcto.");
		}
		
		sc.close();
	}
}