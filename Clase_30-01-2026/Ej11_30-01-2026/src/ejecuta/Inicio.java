package ejecuta;

import clases.Coche;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos e inicializamos los objetos coche1, coche2 y coche3
		
		/*
		Coche coche1 = new Coche("Seat", "Eléctrico", "Verde");
		Coche coche2 = new Coche("Renault", "Gasolina", "Amarillo");
		Coche coche3 = new Coche("Opel", "Gasolina", "Gris");
		
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(coche3);
		*/
		
		System.out.println( new Coche("Seat", "Eléctrico", "Verde") );
		System.out.println( new Coche("Renault", "Gasolina", "Amarillo") );
		System.out.println( new Coche("Opel", "Gasolina", "Gris") );
		
		
	}
}
