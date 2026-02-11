package ejecuta;

import clases.Concierto;
import clases.Evento;
// import clases.Gato;
import clases.Presentacion;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// Declaramos las variables
		// ------------------------
		Evento e;
		Concierto c;
		Presentacion p;
		
		Concierto concierto1 = new Concierto("Juan", "Aire libre", 9, "Concierto");
		Concierto concierto2 = new Concierto("María", "Sala", 12, "Concierto");
		Presentacion presentacion1 = new Presentacion("Susana", "Programación Microservicios", 400, 
													  11, "Presentación libro");
		// Gato miGato = new Gato();
				 

		Evento[] eventosFebrero = new Evento[3];
		
		eventosFebrero[0] = concierto1; // boxing, se convierte de Concierto a Evento
		eventosFebrero[1] = concierto2; // ...
		eventosFebrero[2] = presentacion1; // boxing, se convierte de Presentacion a Evento
		
		// eventosFebrero[2] = miGato;
		
		
		// Recorremos el array de eventos para imprimir su contenido:
		System.out.println("Listado de eventos: ");
		for(int i=0; i<eventosFebrero.length; i++)
		{
			e = eventosFebrero[i];
			
			// Llamada al método imprimir de instancia...
			System.out.println( e.imprimir() );
			
			// Llamada al método imprimir estático
			System.out.println( Evento.imprimirEstatico(e) );
		}
		
		/*
		// Recorremos el array de eventos para imprimir su contenido:
		System.out.println("Listado de eventos: ");
		
		for(int i=0; i<eventosFebrero.length; i++)
		{
			e = eventosFebrero[i];
			
			if(e instanceof Concierto)
			{
				c = (Concierto) e; // unboxing, se convierte de Evento a Concierto
				System.out.println(c);
			}
			else if(e instanceof Presentacion)
			{
				p = (Presentacion) e; // unboxing, se convierte de Evento a Presentacion
				System.out.println(p);
			}
		}
		*/
		
	}
}




