package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		int[] numeros = {10, 1, 7, 3, 14};
		int contadorIntercambios;
		int auxiliar;
		
		do
		{
			contadorIntercambios = 0;
			
			for(int i=0; i<numeros.length-1; i++)
			{
				if(numeros[i]>numeros[i+1])
				{
					auxiliar = numeros[i];
					numeros[i] = numeros[i+1];
					numeros[i+1] = auxiliar;
					
					contadorIntercambios++;
				}
			}
		}while(contadorIntercambios > 0);

		// Terminamos de ordenar y después imprimimos
		for(int i=0; i<numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
		
	}
}
