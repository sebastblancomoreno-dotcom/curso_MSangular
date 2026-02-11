package ejecuta;

import java.util.InputMismatchException;
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
		
		for(int contador = 1; contador<=3; contador++)
		{
			try
			{
				System.out.println("Introduce LADO 1:");
				lado1 = Integer.valueOf( sc.nextLine() );
	
				System.out.println("Introduce LADO 2:");
				lado2 = Integer.valueOf( sc.nextLine() );
				
				rectangulo = new Rectangulo(lado1, lado2);
				
				resultado = rectangulo.calcularArea();
				System.out.println("El área es " + resultado);
				
				resultado = rectangulo.calcularPerimetro();
				System.out.println(resultado);				
			}
			catch (RectanguloException e) 
			{
				System.out.println( e.getMessage() );
			}
			catch (NumberFormatException e) 
			{
				System.out.println( "Lado incorrecto, solo números." );
			}
			catch(Exception e)
			{
				System.out.println( e.getMessage() );
			}
		}
		
		System.out.println("FIN");
	}
}



