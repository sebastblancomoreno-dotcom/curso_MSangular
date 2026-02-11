package ejecuta;

import java.awt.Rectangle;
import java.util.Scanner;

import clases.Rectangulo;
import clases.RectanguloException;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Rectangulo rectangulo;
		int lado1;
		int lado2;
		int resultado;
		
		try
		{
			// Primer rectángulo
			System.out.println("Introduce LADO1: ");
			lado1 = sc.nextInt();
			
			System.out.println("Introduce LADO2: ");
			lado2 = sc.nextInt();
	
			rectangulo = new Rectangulo(lado1, lado2);	
			
			resultado = rectangulo.calcularArea();
			System.out.println("El área es " + resultado);
			
			resultado = rectangulo.calcularPerimetro();
			System.out.println("El perímetro es " + resultado);
		}
		catch(RectanguloException e)
		{
			System.out.println( e.getMessage() );
		}
		
		System.out.println("FIN");
	}
}



