package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos las variables
		String[] apellidos = {"Lopez", "Garcia", "Gonzalez", "Martin"}; // length vale 4
		//                     -----    -------   --------   -------
		//                       0         1          2          3
		//                 i     |------------------------------->
		String busqueda;
		boolean encontrado;
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos por teclado el apellido a buscar
		System.out.println("Introduce el APELLIDO a buscar: ");
		// busqueda = sc.nextLine();
		// busqueda = quitarTildes(busqueda);
		
		busqueda = quitarTildes( sc.nextLine() );
		
		
		// Iniciamos la búsqueda secuencial...
		encontrado = false; 
		
		// for(int i=0; encontrado == false && i < apellidos.length; i++)
		for(int i=0; !encontrado && i < apellidos.length; i++)
		{
			if( busqueda.equalsIgnoreCase(apellidos[i]) )
			{
				encontrado = true;
			}
		}

		// Al finalizar la búsqueda vemos si ha encontrado el apellido, o no
		if(encontrado == true)
		{
			System.out.println("Encontrado");
		}
		else
		{
			System.out.println("No se ha encontrado");
		}
		
		sc.close();
	}
	
	public static String quitarTildes(String p_texto)
	{
		/*
		String resultado = "";
		
		resultado = p_texto.replace('á', 'a');
		resultado = resultado.replace('é', 'e');
		resultado = resultado.replace('í', 'i');
		resultado = resultado.replace('ó', 'o');
		resultado = resultado.replace('ú', 'u');
		
		resultado = resultado.replace('É', 'E');
		resultado = resultado.replace('Í', 'I');
		resultado = resultado.replace('Ó', 'O');
		resultado = resultado.replace('Ú', 'U');		
		
		return resultado;
		*/
		
		return p_texto.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u')
					  .replace('Á', 'A').replace('É', 'E').replace('Í', 'I').replace('Ó', 'O').replace('Ú', 'U');
	}
	
	
}
