package ejecuta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clases.Producto;

public class Inicio 
{

	public static void main(String[] args) 
	{
		// ---------------
		// | p1 | p2 | p3 |   datos
		// ---------------
		//   A    B    C
		
		
		HashMap<String, Producto> datos = new HashMap<String, Producto>();
		//      ------  --------
		//      clave    valor
		//       "A"      new Producto("A", "Monitor ASUS", 200)
		//	     "B"      new Producto("B", "Monitor Apple", 1500)
		//		 "C"	  new Producto("C", "Ratón Logitech", 20)
		
		// var datos = new HashMap<String, Producto>();
		Producto producto;
		
		Iterator<String> itClaves;
		Iterator< Map.Entry<String, Producto> > itItem;
		
		String clave;
		Map.Entry<String, Producto> item;
		

		datos.put("A", new Producto("A", "Monitor ASUS", 200));
		datos.put("B", new Producto("B", "Monitor Apple", 1500));
		
		datos.put("C", new Producto("C", "Ratón Logitech", 20));
		datos.put("C", new Producto("C", "Ratón Logitech", 33));
		
		// Buscamos un producto...
		if(datos.containsKey("J"))
		{
			System.out.println("¡Encontrado!!");
			producto = datos.get("J");
			
			System.out.println(producto);
		}
		else
		{
			System.out.println("No se ha encontrado");
		}
		
		// Obtenemos el número de elementos
		System.out.println( "Total " + datos.size()  + " producto(s)");
		
		// Eliminamos un producto
		if(datos.containsKey("A"))
		{
			// producto = datos.remove("A");
			datos.remove("A");
			System.out.println("¡Eliminado!");
		}
		else
		{
			System.out.println("No se ha eliminado, porque el producto no existe.");
		}
		
		
		// Recorremos la colección
		// =======================
		System.out.println("Listado de productos: ");
		
		// - Utilizando forEach con expresión lambda
		// datos.forEach( (p_clave, p_valor)-> System.out.println(p_valor) );
		
		// - Iterando las claves
		/*
		itClaves = datos.keySet().iterator();
		
		while(itClaves.hasNext())
		{
			clave = itClaves.next();
			producto = datos.get(clave);
			
			System.out.println(producto);
		}
		*/
		
		/*
		// - Iterando los Map.Entry
		itItem = datos.entrySet().iterator();
		
		while(itItem.hasNext())
		{
			item = itItem.next();
			
			clave = item.getKey();
			producto = item.getValue();
			
			System.out.println("La referencia es: " + clave);
			System.out.println("El producto es: \n" + producto);
		}
		*/
		
		// - Con un foreach sin lambda
		for(String referenciaProducto: datos.keySet())
		{
			producto = datos.get(referenciaProducto);
			System.out.println(producto);
		}
		
		
	}
}