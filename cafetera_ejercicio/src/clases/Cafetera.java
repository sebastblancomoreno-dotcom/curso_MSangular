package clases;

public class Cafetera {

	// Atributos
	private int capacidadTotal;
	private int capacidadRestante;
	private int volumenTaza;
	private int volumenVaso;
	private boolean estadoCafetera;

	// Constructores
	public Cafetera() {
	}

	public Cafetera(int capacidadTotal, int capacidadRestante, int volumenTaza, int volumenVaso, boolean estadoCafetera)
			throws Exception {
		if (capacidadRestante > capacidadTotal)
			throw new CafeteraException("El valor restante es superior a la capacidad total");
		else {
			try {
				setCapacidadTotal(capacidadTotal);
				setCapacidadRestante(capacidadRestante);
				setVolumenTaza(volumenTaza);
				setVolumenVaso(volumenVaso);
				setEstadoCafetera(estadoCafetera);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		}
	}

	public boolean getEstadoCafetera() {
		return estadoCafetera;
	}

	public void setEstadoCafetera(boolean estadoCafetera) {
		this.estadoCafetera = estadoCafetera;
	}

	// metodos
	public String servirTaza() throws Exception {
		if (getCapacidadRestante() >= getVolumenTaza() && estadoCafetera) {
			setCapacidadRestante(getCapacidadRestante() - getVolumenTaza());

			// this.capacidadRestante = this.capacidadRestante - this.volumenTaza;
		} else if (!estadoCafetera) {

			throw new CafeteraException("No se puede servir,la cafetera esta apagada");

		} else {
			throw new CafeteraException("No se puede servir,la cafetera no tiene suficiente agua");
		}
		return "Taza servida";
	}

	public String servirVaso() throws Exception {
		if (getCapacidadRestante() >= getVolumenVaso() && estadoCafetera) {
			setCapacidadRestante(getCapacidadRestante() - getVolumenVaso());
		} else if (!estadoCafetera) {

			throw new CafeteraException("No se puede servir,la cafetera esta apagada");

		} else {
			throw new CafeteraException("No se puede servir,la cafetera no tiene suficiente agua");
		}

		return "Vaso servido";
	}

	public void Encender() {
		estadoCafetera = true;
		System.out.println("La cafetera esta encendida");
	}

	public void Apagar() {
		estadoCafetera = false;
		System.out.println("La cafetera esta apagada");
	}

	public void Rellenar() {
		try {
			setCapacidadRestante(getCapacidadTotal());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public String obtenerCapacidadActual() throws Exception {
		return "Queda(n) " + getCapacidadRestante() + " ml de agua.";
	}

	// Getter y Setter
	public int getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(int capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public int getCapacidadRestante() {
		return capacidadRestante;
	}

	public void setCapacidadRestante(int capacidadRestante) throws Exception {
		if (capacidadRestante > capacidadTotal) {
			throw new CafeteraException("El valor restante es superior a la capacidad total");
		}
		this.capacidadRestante = capacidadRestante;
	}

	public int getVolumenTaza() {
		return volumenTaza;
	}

	public void setVolumenTaza(int volumenTza) {
		this.volumenTaza = volumenTza;
	}

	public int getVolumenVaso() {
		return volumenVaso;
	}

	public void setVolumenVaso(int volumenVaso) {
		this.volumenVaso = volumenVaso;
	}

}
