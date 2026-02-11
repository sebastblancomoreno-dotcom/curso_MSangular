package clases;

public class Editorial 
{
	// Constructores
	// -------------
	public Editorial()
	{
		this(0, "", "");
	}
	public Editorial(int p_idEditorial)
	{
		this(p_idEditorial, "", "");
	}
	public Editorial(int p_idEditorial, String p_eNombre)
	{
		this(p_idEditorial, p_eNombre, "");
	}
	public Editorial(int p_idEditorial, String p_eNombre, String p_telefono)
	{
		this.idEditorial = p_idEditorial;
		this.eNombre = p_eNombre;
		this.telefono = p_telefono;
	}

	// Campos
	// ------
	public int idEditorial;
	public String eNombre;
	public String telefono;

	// Métodos
	// -------
	@Override 
	public String toString()
	{
		return String.format("ID EDITORIAL: %d\nNOMBRE EDITORIAL: %s\nTELEFONO: %s", 
							  this.idEditorial, this.eNombre, this.telefono);
	}

}