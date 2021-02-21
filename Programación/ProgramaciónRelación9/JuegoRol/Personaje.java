package JuegoRol;

public abstract class Personaje {

	public static final int VALOR_MINIMO = 0;
	public static final int CARACTERISTICAS_MAXIMAS = 20;
	public static final int VIDA_MAXIMA = 100;
	
	private String nombre;
	private TipoRaza raza;
	protected int fuerza;
	protected int inteligencia;
	protected int vidaMaxima;
	protected int vidaActual;
	
	public Personaje(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
		super();
		setNombre(nombre);
		setRaza(raza);
		setFuerza(fuerza);
		setInteligencia(inteligencia);
		setVidaMaxima(vidaMaxima);
		setVidaActual(getVidaMaxima());
	}
	
	//Getter & setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoRaza getRaza() {
		return raza;
	}

	public void setRaza(TipoRaza raza) {
		this.raza = raza;
	}

	public int getFuerza() {
		return fuerza;
	}

	/**
	 * Modifica la fuerza del personaje comprobando que esta en rango adecuado y si no, lanza una excepcion
	 * @param fuerza
	 * @throws PersonajeException
	 */
	public void setFuerza(int fuerza) throws PersonajeException {
		
		if (fuerza <= VALOR_MINIMO || fuerza > CARACTERISTICAS_MAXIMAS) {
			throw new PersonajeException("La fuerza tiene que estrar entre " + VALOR_MINIMO + " y " + CARACTERISTICAS_MAXIMAS);
		}
		this.fuerza = fuerza;
	}
	
	public int getInteligencia() {
		return inteligencia;
	}

	/**
	 * Modifica la inteligencia del personaje comprobando que esta en rango adecuado y si no, lanza una excepcion
	 * @return
	 */
	public void setInteligencia(int inteligencia) throws PersonajeException {
		
		if (inteligencia <= VALOR_MINIMO || inteligencia > CARACTERISTICAS_MAXIMAS) {
			throw new PersonajeException("La inteligencia tiene que estrar entre " + VALOR_MINIMO + " y " + CARACTERISTICAS_MAXIMAS);
		}
		this.inteligencia = inteligencia;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	/**
	 * Modifica la vida maxima del personaje. No puede ser inferior a la vida actual, ni superar el maximo
	 * @param vidaMaxima
	 * @throws PersonajeException
	 */
	public void setVidaMaxima(int vidaMaxima) throws PersonajeException {
		
		if (vidaMaxima < vidaActual || vidaMaxima > VIDA_MAXIMA) {
			throw new PersonajeException("El personaje no puede tener una vida inferior a  " + vidaActual + " y  tampoco superar " + CARACTERISTICAS_MAXIMAS);
		}
		
		this.vidaMaxima = vidaMaxima;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) throws PersonajeException {
		
		if (vidaActual < VALOR_MINIMO) {
			//throw new PersonajeException("El personaje " + this.getNombre() + " no puede tener vida negativa");
		}
		
		if (vidaActual > VIDA_MAXIMA) {
			vidaActual = VIDA_MAXIMA;
		}
		this.vidaActual = vidaActual;
	}
	
	public boolean equals(Personaje otro) {
		return this.nombre.equals(otro.getNombre());
	}

	@Override
	public String toString() {
		return nombre + ", de raza" + raza + ", tiene una fuerza de" + fuerza + ", una inteligencia de "
				+ inteligencia + ", una vida maxima de " + vidaMaxima + ", y su vida Actual es " + vidaActual + ".";
	}



}
