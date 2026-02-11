package ejecuta;

import java.util.Scanner;

import clases.Viaje;

public class Inicio 
{

	public static void main(String[] args) 
	{
		Viaje viaje;     // variable para guardar 1 viaje
		Viaje[] viajes = new Viaje[3]; // listado de 3 viajes

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < viajes.length; i++)
		{
			viaje = new Viaje();
			
			System.out.println("A continuación, se le pedirán los datos del viaje " + (i + 1) );
			
			System.out.println("\tIntroduce ID VIAJE: ");
			viaje.idViaje = Integer.valueOf( sc.nextLine() );
			
			System.out.println("\tIntroduce DESTINO: ");
			viaje.destino = sc.nextLine();
			
			System.out.println("\tIntroduce DURACIÓN: ");
			viaje.duracion = Integer.valueOf( sc.nextLine() );
			
			viajes[i] = viaje;
		}
		
		// Mostramos los viajes que tienen una duración de más de 1 semana
		System.out.println("Listado de viajes de duración superior a una semana: ");
		
		for(int i=0; i<viajes.length; i++)
		{
			viaje = viajes[i];
			
			if(viaje.duracion > 7)
			{
				System.out.println( viaje.toString() );
			}
		}

	}
}



