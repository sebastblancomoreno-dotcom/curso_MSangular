package clases;

public class Presentacion extends Evento
{
	// Constructores
	// -------------
	public Presentacion()
	{
		this("", "", 0, 
			 0, "");
	}
	public Presentacion(String p_escritor, String p_tituloLibro, int p_paginas,
						int p_precio, String p_tipo)
	{
		super(p_precio, p_tipo);
		
		setEscritor(p_escritor);
		setTituloLibro(p_tituloLibro);
		setPaginas(p_paginas);
	}
	
	// Campos
	// ------
	private String escritor;
	private String tituloLibro;
	private int paginas;
	
	// Métodos
	// -------
	// - Invalidados
	@Override 
	public String toString()
	{
		return super.toString() 
				+ "ESCRITOR: " + getEscritor() + "\n"
				+ "TÍTULO LIBRO: " + getTituloLibro() + "\n"
				+ "PÁGINAS: " + getPaginas() + "\n";
	}
	
	// - Getters y setters
	//  Campo escritor...
	public String getEscritor()
	{
		return this.escritor;
	}
	public void setEscritor(String p_escritor)
	{
		this.escritor = p_escritor;
	}
	
	// Campo tituloLibro...
	public String getTituloLibro()
	{
		return this.tituloLibro;
	}
	public void setTituloLibro(String p_tituloLibro)
	{
		this.tituloLibro = p_tituloLibro;
	}
	
	// Campo paginas
	public int getPaginas()
	{
		return this.paginas;
	}
	public void setPaginas(int p_paginas)
	{
		this.paginas = p_paginas;
	}
	
}
