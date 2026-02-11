package ejecuta;

import java.util.Random;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int puntosJugador1;
		int puntosJugador2;
		Random r = new Random();
		
		// Lanza jugador 1
		puntosJugador1 = r.nextInt(1, 7);
		
		// Lanza jugador2
		puntosJugador2 = r.nextInt(1, 7);

		// Comprobamos el ganador
		System.out.println("Puntuación J1: " + puntosJugador1 + ", Puntuación J2: " + puntosJugador2);
		
		
		if(puntosJugador1 == puntosJugador2)
		{
			System.out.println("Empate");
		}
		else if(puntosJugador1 < puntosJugador2)
		{
			System.out.println("Gana jugador 2");
		}
		else if(puntosJugador1 > puntosJugador2)
		{
			System.out.println("Gana jugador1");
		}
		
	}
}
