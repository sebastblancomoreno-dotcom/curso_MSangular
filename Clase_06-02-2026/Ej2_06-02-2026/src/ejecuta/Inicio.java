package ejecuta;

import clases.Avion;
import clases.Pajaro;

public class Inicio 
{

	public static void main(String[] args) 
	{
		Pajaro p = new Pajaro();
		Avion a = new Avion();
		
		p.despegar();
		p.aterrizar();
		
		System.out.println();
		
		a.despegar();
		a.aterrizar();

	}

}
