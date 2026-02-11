package ejecuta;

import java.util.Scanner;

public class Inicio 
{

	public static void main(String[] args) 
	{
		String numero;
		char letraUsuario;
		boolean ok;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce número del DNI: ");
		numero = sc.nextLine();
		
		System.out.println("Introduce letra: ");
		letraUsuario =  sc.nextLine().toUpperCase().charAt(0);

		ok = validarDni(numero, letraUsuario);
		
		if(ok == true)
		{
			System.out.println("Es correcto.");
		}
		else if(ok == false)
		{
			System.out.println("DNI incorrecto");
		}

		
		// System.out.println(  (validarDni(numero, letraUsuario) == true) ? "Es correcto.":"DNI incorrecto" );
		
		sc.close();
	}
	
	public static boolean validarDni(String p_numero, char p_letraUsuario)
	{
		boolean respuesta;
		
		// instrucciones
		String cadenaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letraCalculada;
		int posicion;
		
		posicion = Integer.valueOf(p_numero) % cadenaLetras.length();
		letraCalculada = cadenaLetras.charAt(posicion);
		
		if(p_letraUsuario == letraCalculada)
		{
			respuesta = true;
		}
		else
		{
			respuesta = false;
		}
		
		return respuesta;
	}

}
