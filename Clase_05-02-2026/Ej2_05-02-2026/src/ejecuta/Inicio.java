package ejecuta;

import clase.Ecuacion;

public class Inicio 
{

	public static void main(String[] args) 
	{
		Ecuacion ecuacion = new Ecuacion();
		int[] soluciones;
		
		try 
		{
			// Discriminante negativo
			soluciones = ecuacion.grado2(1, 0, 1);
			System.out.println(soluciones[0]);
			System.out.println(soluciones[1]);
		}
		catch (Exception e) 
		{
			System.out.println( e.getMessage() );
		}
		
		try
		{
			soluciones = ecuacion.grado2(3, 4, 1);
			System.out.println(soluciones[0]);
			System.out.println(soluciones[1]);			
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage() );
		}
		
		System.out.println("FIN");
	}

}
