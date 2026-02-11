package ejecuta;

import clases.Libro;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Libro libro1 = new Libro(1, "Microservicios", "Jhon", 499, 
								10, "Garceta", "123456789");

		System.out.println( libro1 );
	}

}
