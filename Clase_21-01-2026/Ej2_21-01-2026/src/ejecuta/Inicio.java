package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		double numero = 1234.579419D;
		double numeroRedondeo;
		
		double otroNumero = 5799.43987D;
		String otroNumeroRedondeo;
		double resultado;
		
		// Redondeamos sin decimales, nos quedamos solo con la parte entera.
		numeroRedondeo = Math.round(numero);
		System.out.println(numeroRedondeo);
		
		// Redondeamos a dos decimales
		// Tenemos en cuenta que se sustituye el punto por una coma
		otroNumeroRedondeo = String.format("%.2f", otroNumero);
		otroNumeroRedondeo = otroNumeroRedondeo.replace(',', '.');
		
		// Sumamos 1
		resultado = Double.valueOf( otroNumeroRedondeo ) + 1;
		System.out.println(resultado);
	}
}