package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce NOTA: ");
		nota = sc.nextInt();
		
		switch(nota)
		{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
				break;
			
			case 5:
			case 6:
				System.out.println("Suficiente");
				break;
			
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			
			default:
				System.out.println("Nota incorrecta");
		}

	}
}
