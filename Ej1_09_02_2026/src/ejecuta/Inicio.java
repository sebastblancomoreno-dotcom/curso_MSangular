package ejecuta;

import clases.Concierto;
import clases.Evento;
import clases.Presentacion;

public class Inicio {
	public static void main(String[] args) {
		Concierto concierto1 = new Concierto("Juan", "Aire Libre", 9, "Concierto");
		Concierto concierto2 = new Concierto("Maria", "Sala", 12, "Concierto");
		Presentacion presentacion1 = new Presentacion("Susana", "Programacion MIcroservicios", 400, 11,
				"Presentacion libro");
		
		Evento e;
		Concierto c;
		Presentacion p;
		
		Evento[] eventosFebrero = new Evento[3];
		eventosFebrero[0] = concierto1;
		eventosFebrero[1] = concierto2;
		eventosFebrero[2] = presentacion1;

		// recorremos array para imprimir
		for (int i = 0; i < eventosFebrero.length; i++) {
			e = eventosFebrero[i];
			System.out.println(eventosFebrero[i].imprimir(e));
//			if(e instanceof Concierto) {
//				c=(Concierto)e;
//				System.out.println(e);
//			}
//			else if(e instanceof Presentacion) {
//				p=(Presentacion)e;
//				System.out.println(p);
//			}
			
		}
	}
}
