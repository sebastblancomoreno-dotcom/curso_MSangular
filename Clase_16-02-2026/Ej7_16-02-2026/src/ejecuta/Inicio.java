package ejecuta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Inicio 
{

	public static void main(String[] args) 
	{
		HashMap<String, String> agenda = new HashMap<String, String>();
		TreeMap<String, String> agendaOrdenada;
		String nombre; 		// es la clave
		String telefono; 	// es el valor
		
		Iterator<Map.Entry<String, String>> itItems;
		Map.Entry<String, String> item;
		
		
		agenda.put("MARIA", "123");
		agenda.put("PEDRO", "456");
		agenda.put("SUSANA", "333");
		agenda.put("RAUL", "999");
		
		// Convertimos el Hashmap a TreeMap
		agendaOrdenada = new TreeMap<String, String>(agenda);
		
		// Recorremos los datos para imprimir (ya se han ordenado solos, porque la colección es un TreeMap)
		itItems = agendaOrdenada.entrySet().iterator();
		
		System.out.println("Listado de contactos: ");
		while(itItems.hasNext())
		{
			item = itItems.next();
			
			nombre = item.getKey();
			telefono = item.getValue();
			
			System.out.println("NOMBRE: " + nombre + ", TELEFONO: " + telefono);
		}
		
		
	}

}
