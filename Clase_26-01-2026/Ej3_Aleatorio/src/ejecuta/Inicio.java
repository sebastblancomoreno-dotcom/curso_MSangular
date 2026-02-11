package ejecuta;

import java.util.Random;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		int numero;
		
		// Generar tres números al azar entre 1 y 10
		/*
		numero = r.nextInt(1, 11);
		System.out.println(numero);
		
		numero = r.nextInt(1, 11);
		System.out.println(numero);
		
		numero = r.nextInt(1, 11);
		System.out.println(numero);
		*/
		
		for(int contador = 1; contador <= 30; contador++)
		{
			numero = r.nextInt(1, 11);
			System.out.println(numero);
		}
		
	}
}