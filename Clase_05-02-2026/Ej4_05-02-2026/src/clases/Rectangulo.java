package clases;

public class Rectangulo 
{
	// Constructor
	// -----------
	public Rectangulo(int p_lado1, int p_lado2) throws RectanguloException
	{
		if(p_lado1 <=0 || p_lado2 <= 0)
		{
			throw new RectanguloException("Los lados deben tener una medida mayor que cero");
		}
		
		this.lado1 = p_lado1;
		this.lado2 = p_lado2;
	}
	
	// Campos
	// ------
	private int lado1;
	private int lado2;
	
	// Métodos
	// -------
	public int calcularArea()
	{
		int resultado;
		
		resultado = this.lado1 * this.lado2;
		
		return resultado;
	}
	
	public int calcularPerimetro()
	{
		return 2*(this.lado1 + this.lado2);
	}
}
