/*
22. Realiza un programa que lea desde teclado 3 números sin repetir. Si el usuario introduce
algún número repetido se le debe notificar, y no ha de ser contabilizado.
 */
package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		int num;
		int contadorNumeros = 0;
		boolean encontrado;
		
		do
		{
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			
			encontrado = false;
			for(int j=0; encontrado == false && j<contadorNumeros; j++)
			{
				if(num == numeros[j])
				{
					encontrado = true;
					System.out.println("Repetido");
				}
			}
			
			if(encontrado == false)
			{
				numeros[contadorNumeros] = num;
				contadorNumeros++;
				// numeros[contadorNumeros++] = num;
			}
		}while(contadorNumeros < 3);
		
		System.out.println("Los 3 números sin repetir son: ");
		for(int i=0; i<numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
		
		sc.close();
	}
}