package clases;

public class Vehiculo 
{
	// Constructores
	public Vehiculo() 
	{
	}
	public Vehiculo(int idVehiculo, String fabricante, String modelo, String color, float precio) {
		this.idVehiculo = idVehiculo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}
	
	// Campos
	public int idVehiculo;
	public String fabricante;
	public String modelo;
	public String color;
	public float precio;
	
	// Métodos
}
