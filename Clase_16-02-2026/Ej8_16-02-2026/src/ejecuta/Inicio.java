package ejecuta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import clases.Agenda;

public class Inicio 
{

	public static void main(String[] args) 
	{
		Iterator<Map.Entry<String, String>> itItems;
		Map.Entry<String, String> item;
		Agenda elemento;
		String nombre;
		String telefono;
		
		HashMap<String, String> agenda = new HashMap<String, String>();
		//      ------  ------
		//      clave   valor
		//      "JUAN"   "123"
		//      "MARIA"  "456"
		
		//  -----------------
		// | "123"  | "456" | HashMap agenda
		//  -----------------
		//  "JUAN"    "MARIA"

		ArrayList<Agenda> agendaOrdenada = new ArrayList<Agenda>();
		//       -------
		//		  valor
		//        "123"
		//		  "456"
		
		// -------------------------------------
		// | new Agenda(...) |  new Agenda(...) | ArrayList agendaOrdenada
		// -------------------------------------
		//          0                  1
		

		// Poblamos la agenda
		agenda.put("JUAN", "123");
		agenda.put("MARIA", "456");
		agenda.put("PEDRO", "333");
		agenda.put("ANA", "222");
		
		// Recorremos el HashMap para leer cada item y añadirlo al ArrayList
		itItems = agenda.entrySet().iterator();
		
		while(itItems.hasNext())
		{
			item = itItems.next();
			
			nombre = item.getKey();
			telefono = item.getValue();
			
			elemento = new Agenda(nombre, telefono);
			agendaOrdenada.add(elemento);
		}
		
		// Ordenamos el ArrayList
		agendaOrdenada.sort( (a, b)->  a.nombre.compareTo(b.nombre) );
		
		// Imprimimos el ArrayList
		System.out.println("Listado de contactos: ");
		for(Agenda a: agendaOrdenada) System.out.println(a);
		
	}
}