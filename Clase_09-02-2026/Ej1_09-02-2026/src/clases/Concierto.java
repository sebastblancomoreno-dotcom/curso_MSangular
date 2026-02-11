package clases;

public class Concierto extends Evento
{
	// Constructores
	public Concierto()
	{
		this("", "", 
			 0, "");
	}
	public Concierto(String p_cantante, String p_tipoEscenario,
					 int p_precio, String p_tipo)
	{
		super(p_precio, p_tipo);
		
		setCantante(p_cantante);
		setTipoEsceneario(p_tipoEscenario);
	}
	
	// Campos
	// ------
	private String cantante;
	private String tipoEscenario;
	
	
	// Métodos
	// -------
	// - Invalidados
	@Override
	public String toString()
	{
		return  super.toString()
				+ "CANTANTE: " + this.getCantante() + "\n" 
				+ "TIPO ESCENARIO: " + this.getTipoEscenario() + "\n";
	}
	
	// - Getters y setters
	// Campo cantante...
	public String getCantante()
	{
		return this.cantante;
	}
	public void setCantante(String p_cantante)
	{
		this.cantante = p_cantante;
	}
	
	// Campo tipoEscenario...
	public String getTipoEscenario()
	{
		return this.tipoEscenario;
	}
	public void setTipoEsceneario(String p_tipoEscenario)
	{
		this.tipoEscenario = p_tipoEscenario;
	}
}
