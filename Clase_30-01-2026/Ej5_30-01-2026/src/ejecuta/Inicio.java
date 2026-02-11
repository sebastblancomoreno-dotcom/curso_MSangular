package ejecuta;

public class Inicio 
{

	public static void main(String[] args) 
	{
		// Ordenar descendentemente
		String[] ciudades = {"Avila", "Madrid", "Segovia"};

		ordenarDescendente(ciudades);
		
		System.out.println("Listado de ciudades por ORDEN DESCENDENTE: ");
		for(int i=0; i<ciudades.length; i++)
		{
			System.out.println(ciudades[i]);
		}
		
		ordenarAscendente(ciudades);
		System.out.println("Listado de ciudades por ORDEN ASCENDENTE: ");
		for(int i=0; i<ciudades.length; i++)
		{
			System.out.println(ciudades[i]);
		}		
	}
	
	public static void ordenarDescendente(String[] p_datos)
	{
		// instrucciones..
		int contadorIntercambios;
		String auxiliar;
		
		do
		{
			contadorIntercambios = 0;
			
			for(int i=0; i<p_datos.length-1; i++)
			{
				// compareTo entiende que p_datos[i] es anterior alfabéticamente a p_datos[i+1]
				// cuando devuelve un valor menor que 0
				if( p_datos[i].compareTo(p_datos[i+1]) < 0 )
				{ // ---------           ------------
				  //  "Avila"			  "Madrid"
					
				  // Le damos la vuelta, cambiando "Avila" por "Madrid"
					auxiliar = p_datos[i];
					p_datos[i] = p_datos[i+1];
					p_datos[i+1] = auxiliar;
					
					contadorIntercambios++;
				}
			}
			
		}while(contadorIntercambios >0);
	}
	
	public static void ordenarAscendente(String[] p_datos)
	{
		// instrucciones..
		int contadorIntercambios;
		String auxiliar;
		
		do
		{
			contadorIntercambios = 0;
			
			for(int i=0; i<p_datos.length-1; i++)
			{
				// compareTo entiende que p_datos[i] es posterior alfabéticamente a p_datos[i+1]
				// cuando devuelve un valor mayor que 0
				if( p_datos[i].compareTo(p_datos[i+1]) > 0 )
				{ // ---------           ------------
				  //  "Madrid"			  "Avila"
					
				  // Le damos la vuelta, cambiando "Madrid" por "Avila"
					auxiliar = p_datos[i];
					p_datos[i] = p_datos[i+1];
					p_datos[i+1] = auxiliar;
					
					contadorIntercambios++;
				}
			}
			
		}while(contadorIntercambios >0);
	}	

}
