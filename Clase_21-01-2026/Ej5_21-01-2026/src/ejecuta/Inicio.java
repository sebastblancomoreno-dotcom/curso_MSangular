package ejecuta;

import java.util.Scanner;

public class Inicio
{
	public static void main(String[] args) 
	{
		float nota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce NOTA: ");
		nota = sc.nextFloat();
		
		// Insuficiente. Entre 0 y 4.99
		if(nota>=0 && nota<5)
		{
			System.out.println("Insuficiente");
		}
		// Suficiente. Entre 5 y 6.99
		else if(nota >= 5 && nota < 7)
		{
			System.out.println("Suficiente");
		}
		// Notable. Entre 7 y 8.99
		else if(nota >= 7 && nota < 9)
		{
			System.out.println("Notable");
		}
		// Sobresaliente
		else if(nota >= 9 && nota <= 10)
		{
			System.out.println("Sobresaliente");
		}
		
	}
}