package clases;

public class Pajaro implements IVolador 
{
	@Override
	public void despegar() 
	{
		System.out.println("El pájaro está despegando");
	}

	@Override
	public void aterrizar() 
	{
		System.out.println("El pájaro está aterrizando");
	}
}