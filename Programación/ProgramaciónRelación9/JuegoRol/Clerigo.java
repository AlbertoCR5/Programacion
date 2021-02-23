package JuegoRol;

public class Clerigo extends Personaje {

	public static final int INTELIGENCIA_MINIMA = 12; //Inteligencia minima de un clerigo
	public static final int INTELIGENCIA_MAXIMA = 16; //Inteligencia maxima de un clerigo
	public static final int FUERZA_MINIMA = 18;	//Fuerza minima de un clerigo
	public static final int PUNTOS_CURACION = 10; //Puntos de curacion que recibe un personaje

	private String dios;
	
	public Clerigo(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima, String dios) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		setDios(dios);
		this.setInteligencia(inteligencia);
		this.setFuerza(fuerza);
	}

	public String getDios() {
		return dios;
	}

	public void setDios(String dios) {
		this.dios = dios;
	}

	/**
	 * Modifica la fuerza del clerigo, controlando que este en rango, si no, lanzara la excepcion
	 * @param Fuerza ajustada al clerigo
	 */
	@Override
	public void setFuerza(int fuerza) throws PersonajeException {
		
		if (fuerza < FUERZA_MINIMA) {
			throw new PersonajeException("La fuerza del clerigo no puede ser inferior a " + FUERZA_MINIMA);
		}
		super.setFuerza(fuerza);
	}
	
	/**
	 * Modifica la inteligencia del clerigo, controlando que este en rango, si no, lanzara la excepcion
	 * @param Inteligencia ajustada al clerigo
	 */
	@Override
	public void setInteligencia(int inteligencia) throws PersonajeException {

		if (inteligencia < INTELIGENCIA_MINIMA || inteligencia > INTELIGENCIA_MAXIMA) {
			throw new PersonajeException("La inteligencia del clerigo debe de estar entre " + INTELIGENCIA_MINIMA + " y " + INTELIGENCIA_MAXIMA);
		}
		super.setInteligencia(inteligencia);
	}
	
	/**
	 * Metodo para curar a un personaje. Curar a un personaje le aumenta la vida en 10 puntos, siendo el limite la vida maxima.
	 * No se puede curar a un personaje con vida 0, en ese caso, se lanzara la excepcion.
	 * @param otro personaje que se va a curar
	 * @throws PersonajeException
	 */
	public void curar(Personaje otro) throws PersonajeException {
		
		if (this.equals(otro)) {
			throw new PersonajeException("No se puede curar a si mismo");
		}
		
		if (super.getVidaActual() == VIDA_MAXIMA) {
			throw new PersonajeException("No se puede curar a un personaje con la vida actual al maximo");
		}
		
		if (super.getVidaActual() == VALOR_MINIMO) {
			throw new PersonajeException("No se puede curar a un personaje con la vida actual al maximo");
		}
		
		otro.setVidaActual(otro.getVidaActual() + PUNTOS_CURACION);
	
	}

	@Override
	public String toString() {
		return "Clerigo " + super.toString() + " dios " + dios;
	}

}
