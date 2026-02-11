package ejecuta;

import java.util.Scanner;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int codEstado;
		String estado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce CÓDIGO ESTADO: ");
		codEstado = sc.nextInt();
		
		estado = (codEstado == 1) ? "Almacén" :
			 	 (codEstado == 2) ? "Reparto" : 
			     (codEstado == 3) ? "Entregado" : 
			     (codEstado == 4) ? "Incidencia" :"Desconocido";
				 
		System.out.println(estado);
		
		sc.close();
	}
}
