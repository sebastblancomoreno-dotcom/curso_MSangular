package ejecuta;

import java.util.Iterator;
import java.util.TreeSet;

public class Inicio 
{
	public static void main(String[] args) 
	{
		TreeSet<Curso> datos = new TreeSet<Curso>();
		Iterator<Curso> it;
		Curso elemento;
		
		datos.add(new Curso("Java", 210));
		datos.add(new Curso("SQL", 90));
		datos.add(new Curso("SQL", 90));
		datos.add(new Curso("Angular", 100));
		
		it = datos.iterator();
		
		while(it.hasNext())
		{
			elemento = it.next();
			System.out.println(elemento);
		}
		
		// Consultamos si un curso se encuentra 
		// en la colección
		if( datos.contains( new Curso("Angular", 100) ) )
		{
			System.out.println("Encontrado");
		}
		else
		{
			System.out.println("No se ha encontrado");
		}
		
	}
}
