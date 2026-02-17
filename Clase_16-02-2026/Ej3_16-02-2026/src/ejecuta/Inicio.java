package ejecuta;

import java.util.Iterator;
import java.util.TreeSet;

public class Inicio 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> datos = new TreeSet<Integer>();
		Iterator<Integer> it;
		Integer elemento;
	
		datos.add(3);
		datos.add(1);
		datos.add(7);
		datos.add(7);
		
		it = datos.iterator();
		
		while(it.hasNext())
		{
			elemento = it.next();
			System.out.println(elemento);
		}
		
	}
}
