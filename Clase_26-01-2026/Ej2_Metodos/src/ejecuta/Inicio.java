package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		double numero = 1036.48913521D;
		double numeroRedondeado;
		
		numeroRedondeado = redondear(numero, 2);
		System.out.println(numeroRedondeado);
		
		numeroRedondeado = redondear(numero, 3);
		System.out.println(numeroRedondeado);
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
