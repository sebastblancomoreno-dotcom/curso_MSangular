package clases;

public class Presentacion extends Evento {

	public Presentacion() {
		this("", "", 0,0,"");
	}

	public Presentacion(String escritor, String titulolibro, int paginas,int precio, String tipo) {
		super();
		setEscritor(escritor);
		setTitulolibro(titulolibro);
		setPaginas(paginas);
	}

	private String escritor;
	private String titulolibro;
	private int paginas;

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public String getTitulolibro() {
		return titulolibro;
	}

	public void setTitulolibro(String titulolibro) {
		this.titulolibro = titulolibro;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		super.toString();
		return "Presentacion [escritor=" + this.getEscritor() + ", titulolibro=" + this.getTitulolibro() + ", paginas="
				+ this.paginas + "]";
	}
}
