package ejecuta;

public class Inicio 
{

	public static void main(String[] args) 
	{
		int[] numeros = {0, 0, 0};
		
		anadirNumero(numeros, 9, 0);
		
		System.out.println(numeros[0]);
	}
	
	public static void cumplirAnos(int p_edad)
	{
		p_edad++;
		
		System.out.println("La edad desde dentro del método vale: " + p_edad);
	}
	
	public static void finalizarCadena(String p_cadena)
	{
		p_cadena = p_cadena + ".";
	}
	
	public static void anadirNumero(int[] p_numeros, int p_numero, int p_posicion)
	{
		p_numeros[p_posicion] = p_numero; 
	}

}
