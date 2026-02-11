package clase;

public class Ecuacion 
{
	public int[] grado2(int a, int b, int c) throws Exception
	{
		int[] soluciones = new int[2];
		int sol1;
		int sol2;
		int discriminante;
		int denominador;
		
		discriminante = b*b - 4*a*c; 
		denominador = 2*a;
		
		if(denominador == 0)
		{
			throw new Exception("No hay solución. El denominador no puede ser cero.");
		}
		
		if(discriminante < 0)
		{
			throw new Exception("No hay solución. El discriminante no puede ser negativo.");
		}
		
		sol1 = (-1*b + (int)Math.sqrt(discriminante)) / denominador; 
		sol2 = (-1*b - (int)Math.sqrt(discriminante)) / denominador;
		
		soluciones[0] = sol1;
		soluciones[1] = sol2;
		
		return soluciones;
	}
}
