package clases;

public class Telefono 
{
	// Constructores
	// -------------
	public Telefono()
	{
		this("", "", 0, 0F);
	}
	public Telefono(String p_fabricante, String p_modelo, int p_memoria, float p_precio)
	{
		Telefono.id++;
		this.idTelefono = Telefono.id;
		
		setFabricante(p_fabricante);
		setModelo(p_modelo);
		setMemoria(p_memoria);
		setPrecio(p_precio);
	}
	
	// Campos
	// ------
	private static int id = 0;
	
	private int idTelefono;
	private String fabricante;
	private String modelo;
	private int memoria;
	private float precio;

	
	// Métodos
	// -------
	// - De las instancias de esta clase
	
	// - Getters y Setters
	public int getIdTelefono() {
		return idTelefono;
	}
	public void setIdTelefono(int idTelefono) {
		this.idTelefono = idTelefono;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	// - Invalidados
	@Override
	public String toString() 
	{
		return String.format("ID TELEFONO: %d\nFABRICANTE: %s\nMODELO: %s\nMEMORIA: %d\nPRECIO: %.2f\n", 
							  getIdTelefono(), getFabricante(), getModelo(), getMemoria(), getPrecio() );
	}
	
	@Override
	public boolean equals(Object p_otroTelefono) 
	{
		boolean sonIguales;
		
		sonIguales = this.idTelefono == ( (Telefono)p_otroTelefono ).idTelefono;
		
		return sonIguales;
	}
	
}
