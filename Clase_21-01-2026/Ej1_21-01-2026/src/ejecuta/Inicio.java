package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos las variables
		Scanner sc = new Scanner(System.in);
		float salario;
		float total = 0;
		float maximo = Float.MIN_VALUE;
		float minimo = Float.MAX_VALUE;
		float media;
		
		for(int contador = 1; contador <= 4; contador++)
		{
			System.out.println("Introduce SALARIO: ");
			salario = sc.nextFloat();
			
			total = total + salario;
			
			if(salario > maximo)
			{
				maximo = salario;
			}
			
			if(salario < minimo)
			{
				minimo = salario;
			}
		}
		
		media = total / 4;
		
		System.out.println("TOTAL: " + total);
		System.out.println("MEDIA: " + media);
		System.out.println("MÍNIMO: " + minimo);
		System.out.println("MÁXIMO: " + maximo);
		
		sc.close();
	}
}