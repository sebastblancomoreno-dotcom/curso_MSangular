package ejecuta;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Inicio 
{

	public static void main(String[] args) 
	{
		// ----------------------
		// | "123..." | "456..." |  agenda
		// ----------------------
		//  "MARIA"     "PEDRO"
		
		// Declaración de variables
		// ------------------------
		HashMap<String, String> agenda = new HashMap<String, String>();
		//      ------  ------
		//      clave    valor
		
		String nombre; 		// es la clave
		String telefono; 	// es el valor

		Scanner sc = new Scanner(System.in);
		String opcion; // ¿desea eliminar el registro? (s/n)
		
		Iterator<Map.Entry<String, String>> itItems;
		Map.Entry<String, String> item;
		
		// Poblamos el hashmap
		// -------------------
		agenda.put("MARIA", "123");
		agenda.put("PEDRO", "456");
		agenda.put("SUSANA", "333");
		agenda.put("RAUL", "999");
		
		// Recorremos y preguntamos por cada item si se desea borrar
		
		itItems = agenda.entrySet().iterator();
		while(itItems.hasNext())
		{
			item = itItems.next();
			
			nombre = item.getKey();
			telefono = item.getValue();
			
			do
			{
				System.out.println("NOMBRE: " + nombre + ", TELEFONO: " + telefono + "¿ELIMINAR?(s/n)");
				opcion = sc.nextLine().toLowerCase();				
			}while(opcion.equals("s")==false && opcion.equals("n")==false);
		
			if(opcion.equals("s"))
			{
				itItems.remove();
			}
		}
		
		// Recorremos la colección para imprimir
		System.out.println("Listando " + agenda.size() + " registro(s):");
		agenda.forEach( (p_nombre, p_telefono)-> System.out.println("NOMBRE: " + p_nombre 
																	+ ", TELEFONO: " + p_telefono ) );
		
	}
}