package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos las variables
		int numero;
		int contadorValidos = 0;
		int contadorNoValidos = 0;
		int maximo = 19;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Introduce un número entre 20 y 40");
			numero = sc.nextInt();
			
			if(numero >= 20 && numero <= 40)
			{
				contadorValidos++;
				
				if(numero > maximo)
				{
					maximo = numero;
				}
			}
			else
			{
				contadorNoValidos++;
				System.out.println("El número no es válido.");
			}
		}while(contadorValidos < 3);
		
		// Mostramos el resultado
		System.out.println("MÁXIMO: " + maximo);
		System.out.println("CANTIDAD NO VALIDOS: " + contadorNoValidos);
		
	}
}
