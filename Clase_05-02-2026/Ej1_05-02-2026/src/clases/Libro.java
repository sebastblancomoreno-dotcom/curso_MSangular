package clases;

public class Libro extends Editorial
{
	// Constructores
	// -------------
	public Libro()
	{
		this(0, "", "", 0,
				0, "", "");
	}
	public Libro(int p_isbn)
	{
		this(p_isbn, "", "", 0, 
				0, "", "");
	}
	
	public Libro(int p_isbn, String p_titulo)
	{
		this(p_isbn, p_titulo, "", 0,
			 0, "", "");
	}
	
	public Libro(int p_isbn, String p_titulo, String p_autor)
	{
		this(p_isbn, p_titulo, p_autor, 0,
			 0, "", "");
	}
	
	public Libro(int p_isbn, String p_titulo, String p_autor, int p_paginas, 
				 int p_idEditorial, String p_eNombre, String p_telefono)
	{
		super(p_idEditorial, p_eNombre, p_telefono);
		
		this.isbn = p_isbn;
		this.titulo = p_titulo;
		this.autor = p_autor;
		this.paginas = p_paginas;
	}
	
	// Campos
	// ------
	public int isbn;
	public String titulo;
	public String autor;
	public int paginas;
	
	// Métodos
	// -------
	@Override
	public String toString()
	{
		return super.toString() 
				+ "ISBN: " + this.isbn + "\n" 
				+ "TÍTULO: " + this.titulo + "\n"
				+ "AUTOR: " + this.autor + "\n"
				+ "PÁGINAS: " + this.paginas + "\n";
	}
}
