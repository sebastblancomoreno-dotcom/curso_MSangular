package clases;

public class Avion implements IVolador
{
	@Override
	public void despegar() 
	{
		System.out.println("El avión está despegando");
	}

	@Override
	public void aterrizar() 
	{
		System.out.println("El avión está aterrizando");
	}
}
