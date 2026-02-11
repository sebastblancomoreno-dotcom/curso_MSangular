package ejecuta;

import clases.Pc;

public class Inicio 
{
	public static void main(String[] args) 
	{
		Pc pc1 = new Pc();
		Pc pc2 = new Pc();
		
		pc1.fabricante = "DELL";
		pc1.precio = 600.25F;
		pc1.ram = 32;
		
		pc2.fabricante = "HP";
		pc2.precio = 500.25F;
		pc2.ram = 16;


		if( pc1.equals(pc2) )
		{
			System.out.println("IGUALES");
		}
		else if( pc1.equals(pc2) == false )
		{
			System.out.println("DISTINTOS");
		}
		
	}
}
