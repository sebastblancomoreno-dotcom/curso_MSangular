package clases;

public class Concierto extends Evento {

	public Concierto() {
		this("", "", 0, "");
	}

	public Concierto(String cantante, String tipoEscenario, int precio, String tipo) {
		// añadimos la llamada al constructor padre Evento,solo se pude invocar a uno
		super(precio, tipo);
		setCantante(cantante);
		setTipoEscenario(tipoEscenario);
	}

//campos
	private String cantante;
	private String tipoEscenario;

//métodos
//---------
//estandar

//getter y setter
	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public String getTipoEscenario() {
		return tipoEscenario;
	}

	public void setTipoEscenario(String tipoEscenario) {
		this.tipoEscenario = tipoEscenario;
	}

	// Sobreescritos
	@Override
	public String toString() {
		return 
		"CANTANTE: " + this.getCantante() + "\n" 
		+ "TIPO ESCENARIO: " + this.getTipoEscenario() + "\n"
		+ "PRECIO: " + this.getPrecio() + "\n" 
		+ "TIPO EVENTO: " + this.getTipo() + "\n";
	}
}
