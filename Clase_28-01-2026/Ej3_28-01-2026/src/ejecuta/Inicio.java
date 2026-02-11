package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		// int[][] tabla = new int[3][2];
		int[][] tabla = {{1, 2}, {3, 4},{5, 6}};
		
		
		for(int fila=0; fila<3; fila++)
		{
			for(int columna=0; columna<2; columna++)
			{
				System.out.print( tabla[fila][columna] + "   ");
			}
			System.out.println();
		}
		
		
		
	}
}
