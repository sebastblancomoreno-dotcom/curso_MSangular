package ejecuta;

public class Inicio 
{
	public static void main(String[] args) 
	{
		float nota = 6;

		if(nota>=0 && nota<5) System.out.println("Insuficiente");
		else if(nota<7) System.out.println("Suficiente");
		else if(nota<9) System.out.println("Notable");
		else if(nota<=10) System.out.println("Sobresaliente");
		else System.out.println("Nota incorrecta");
	}
}
