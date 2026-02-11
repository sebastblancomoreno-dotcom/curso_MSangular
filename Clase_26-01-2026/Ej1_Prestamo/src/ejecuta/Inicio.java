package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos las variables
		double cuota;
		double periodoInteres;
		double periodoAmortizado;

		double capitalSolicitado; // dinero que se pide al banco
		double c; // capital pendiente
		double i; // interés mensual y porcentual
		double n; // número de cuotas
		double sumaInteres = 0; // el coste de los intereses de todo el préstamo
		double totalPrestamo;   // el coste total del préstamo, son los intereses más el importe solicitado
		
		double numerador;
		double denominador;
		String linea;
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los datos
		System.out.println("Introduce el dinero que quieres solicitar:");
		capitalSolicitado = sc.nextDouble();
		
		System.out.println("Introduce el tipo de interés (TIN): ");
		i = sc.nextDouble();
		i = i / 12 /100;

		System.out.println("Introduce el número de cuotas: ");
		n = sc.nextInt();
		
		
		// Calculamos la cuota 
		numerador = capitalSolicitado * i;
		denominador = 1 - Math.pow(1+i, -n);
		
		
		cuota = numerador / denominador;
		// cuota = Math.round(cuota * 100) / 100D;
		cuota = redondear(cuota, 2);
		
		c = capitalSolicitado;

		System.out.println("PERIODO    |CUOTA      |AMORTIZADO |INTERES    |CAPITAL PTE");
		System.out.println("===========================================================");

		for(int periodo = 1; periodo <= n; periodo++)
		{
			// En cada periodo, calculamos el interés a partir del capital pendiente
			periodoInteres = i * c;
			// periodoInteres = Math.round(periodoInteres * 100) / 100D;
			periodoInteres = redondear(periodoInteres, 2);
			
			// Si nos encontramos en el último periodo, tenemos que hacer un ajuste en la cuota
			if(periodo == n)
			{
				cuota = c + periodoInteres;
				// cuota = Math.round(cuota * 100) / 100D;
				cuota = redondear(cuota, 2);
			}
			
			// La cuota se desglosa en...
			// el capital amortizado (variable periodoAmortizado) y el interés mensual(variable periodoInteres)
			periodoAmortizado = cuota - periodoInteres;
			// periodoAmortizado = Math.round(periodoAmortizado * 100) / 100D;
			periodoAmortizado = redondear(periodoAmortizado, 2);
			
			// Descontamos del capital pendiente(variable c), el capital amortizado (variable periodoAmortizado)
			c = c - periodoAmortizado;
			// c -= periodoAmortizado;
			
			// c = Math.round(c * 100) / 100D;
			c = redondear(c, 2);
			
			
			// Acumulamos los intereses
			sumaInteres = sumaInteres + periodoInteres;
			//sumaInteres += periodoInteres;
			
			// sumaInteres = Math.round(sumaInteres * 100) / 100D;
			sumaInteres = redondear(sumaInteres, 2);
			
			// Imprimimos el periodo
			linea = String.format("%-12s", periodo) + 
					 String.format("%-12s", cuota) + 
					 String.format("%-12s", periodoAmortizado) +
					 String.format("%-12s", periodoInteres) +
					 String.format("%-12s", c);
			
			System.out.println(linea);
		}

		totalPrestamo = capitalSolicitado + sumaInteres;
		// totalPrestamo = Math.round(totalPrestamo * 100) / 100D;
		totalPrestamo = redondear(totalPrestamo, 2);

		
		// Imprimimos 
		/*
		System.out.println("Total interés: " + sumaInteres + "€");
		System.out.println("Total préstamo: " + totalPrestamo + "€");
		*/
		
		System.out.println("Total interés: " + String.format("%.2f", sumaInteres) + "€" );
		System.out.println("Total préstamo: " + String.format("%.2f", totalPrestamo) + "€");
		
		// Cerramos el escanner
		sc.close();
	}
	
	public static double redondear(double p_numero, int p_decimales)
	{
		double resultado = 0;
		int n = 10;
		
		//   n        p_decimales
		// ------    -------------
		//   10  para    1 decimal      --> 10
		//  100  para    2 decimales    --> 10 * 10
		// 1000  para    3 decimales    --> 10 * 10 * 10
		
		for(int contador = 1; contador < p_decimales; contador++)
		{
			n = n * 10;
		}
		
		resultado = Math.round(p_numero * n) / (double)n;
		
		return resultado;
	}	
	
}
