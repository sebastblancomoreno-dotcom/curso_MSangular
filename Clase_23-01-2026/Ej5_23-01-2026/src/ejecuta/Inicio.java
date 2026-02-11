package ejecuta;

import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre1;
		String nombre2;

		System.out.println("Introduzca el primer nombre: ");
		nombre1 = sc.nextLine();

		System.out.println("Introduzca el segundo nombre: ");
		nombre2 = sc.nextLine();

		if (nombre1.equalsIgnoreCase(nombre2) == true) 
		{
			System.out.println("Son iguales");
		} 
		else 
		{
			System.out.println("Son distintos");
		}

		sc.close();
	}
}
