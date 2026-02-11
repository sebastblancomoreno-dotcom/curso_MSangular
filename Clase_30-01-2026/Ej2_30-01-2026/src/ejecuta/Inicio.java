package ejecuta;

import java.util.Arrays;


public class Inicio 
{
	public static void main(String[] args) 
	{
		//int[] numeros = {15, 1, 7, 3, 45, 89, 0};
	
		//Arrays.sort(numeros, (a,b)-> b-a);
		
		String[] apellidos = {"LOPEZ", "GARCIA", "SANTOS", "NUÑEZ", "SANZ"};
		/*
		Arrays.sort(apellidos);
		
		System.out.println("Listado de apellidos por orden ASCENDENTE: ");
		for(int i=0; i<apellidos.length; i++)
		{
			System.out.println(apellidos[i]);
		}
		*/
		
		System.out.println("Listado de apellidos por orden DESCENDENTE: ");
		// Arrays.sort(apellidos, (a, b)-> b.compareTo(a) );		
		
		Arrays.sort(apellidos, (String p_apellido1, String p_apellido2)-> {
															System.out.println("Comparando " + p_apellido1 + " con " + p_apellido2);
															return p_apellido2.compareTo(p_apellido1);
														}
					);
		
		
		for(int i=0; i<apellidos.length; i++)
		{
			System.out.println(apellidos[i]);
		}
		
	}
}