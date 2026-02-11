package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float nota;
		
		System.out.println("Introduce NOTA: ");
		nota = sc.nextFloat();
		
		/*
		if(nota >= 5) 
		{
			System.out.println("Aprobado");
		}
		else
		{
			System.out.println("Suspenso");
		}
		*/
		
		System.out.println( (nota >=5 )?"Aprobado" : "Suspenso" );
		
		
		
		sc.close();
	}
}
