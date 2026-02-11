package ejecuta;

import clases.Alumno;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		
		alumno1.apellido = "GARCIA";
		alumno2.apellido = "LOPEZ";
		
		System.out.println(alumno1.apellido);
		System.out.println(alumno2.apellido);
		
		// ---------------------
		// Alumno.nombre = "Juan";
		alumno1.nombre = "Juan";
		alumno2.nombre = "Alberto";
		
		
		System.out.println(alumno1.nombre);
		System.out.println(alumno2.nombre);
		
		// System.out.println(Alumno.nombre);
		
	}
}
