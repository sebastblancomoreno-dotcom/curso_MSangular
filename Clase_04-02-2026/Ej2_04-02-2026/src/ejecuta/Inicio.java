package ejecuta;

import clases.Empleado;

public class Inicio 
{

	public static void main(String[] args) 
	{
		Empleado empleado1 = new Empleado(1, "GARCIA", "INFORMATICA", 10, "MOVISTAR", "123456789");
		System.out.println(empleado1);
		
		Empleado empleado2 = new Empleado();
		System.out.println(empleado2);
	}

}
