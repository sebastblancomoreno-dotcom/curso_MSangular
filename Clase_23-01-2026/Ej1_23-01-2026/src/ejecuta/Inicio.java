package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		float nota;
		String notaLetra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce NOTA, entre 0 y 10: ");
		nota = sc.nextFloat();
		
		notaLetra = (nota >= 0 && nota < 5) ? "Insuficiente" :
					(nota >= 5 && nota < 7) ? "Suficiente" :
					(nota >= 7 && nota <9) ? "Notable" :
					(nota >= 9 && nota <= 10) ? "Sobresaliente" : "Nota incorrecta";
		
		System.out.println(notaLetra);
		
		sc.close();
	}
}
