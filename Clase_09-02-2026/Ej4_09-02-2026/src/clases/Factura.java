package clases;

public class Factura
{
	public Factura()
	{
		Factura.idFactura++;
		this.numero = Factura.idFactura;
	}
	
	private static int idFactura = 0; 
	
	public int numero;
	public int total;
	public String cliente;
	
	@Override 
	public String toString()
	{
		return "NÚMERO FACT.: " + this.numero + "\n"
				+ "TOTAL: " + this.total + "€\n"
				+ "CLIENTE: " + this.cliente + "\n";
	}
}
