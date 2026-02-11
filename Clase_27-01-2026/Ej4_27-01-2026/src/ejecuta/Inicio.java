package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		boolean continuar;
		int nota;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Introduce NOTA entre 0 y 10:");
			nota = sc.nextInt();
			
			if(nota<0 || nota>10)
			{
				System.out.println("Nota incorrecta, debe estar comprendida entre 0 y 10");
				continuar = true;
			}
			else
			{
				continuar = false;
			}
		}while(continuar);

		System.out.println("FIN");
	}
}
