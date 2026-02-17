package ejecuta;

import java.util.HashSet;
import java.util.Iterator;

import clases.Curso;

public class Inicio 
{
	public static void main(String[] args) 
	{
		HashSet<Curso> datos = new HashSet<Curso>();
		Iterator<Curso> it;
		Curso item;
		
		// ------------------
		// | c1 | c2  | c3  |
		// ------------------
		
		datos.add( new Curso("Java", 210) );
		datos.add( new Curso("SQL", 90) );
		datos.add( new Curso("Spring Boot", 40) );
		datos.add( new Curso("Spring Boot", 40) );
		
		it = datos.iterator();
		
		while( it.hasNext() )
		{
			item = it.next();
			
			System.out.println(item);
		}
	}
}
