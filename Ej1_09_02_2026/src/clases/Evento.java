package clases;

public class Evento {

	private int precio;
	private String tipo;

	public Evento() {
		this(0, "");
	}

	public Evento(int precio, String tipo) {
		setPrecio(precio);
		setTipo(tipo);
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String imprimir(Evento e) {
		String cadena="";
	if(e instanceof Concierto) {
		cadena =((Concierto)e).toString();
	
	}
	else if(e instanceof Presentacion) {
		cadena=((Presentacion)e).toString();

	}
	return cadena;
	}
	@Override
	//con interpolacion:
	public String toString() {
		return String.format("Evento Precio: %d\nTIPO EVENTO: %s\n " , this.getPrecio() , this.getTipo());
	}

}
