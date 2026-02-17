package ejecuta;

import java.util.HashSet;
import java.util.Iterator;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// ----------------
		// | 10 | 7  | 9  |
		// ----------------
		HashSet<Integer> datos = new HashSet<Integer>();
		Iterator<Integer> it;
		Integer elemento;
		
		datos.add(10);
		datos.add(7);
		datos.add(9);
		datos.add(9);
		datos.add(10);
		
		it = datos.iterator();
		
		// while(it.hasNext() == true)
		while(it.hasNext())
		{
			elemento = it.next();
			
			System.out.println(elemento);
		}

	}
}
