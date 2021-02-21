package JuegoRol;

public class Clerigo extends Personaje {

	public static final int INTELIGENCIA_MINIMA = 12;
	public static final int INTELIGENCIA_MAXIMA = 16;
	public static final int FUERZA_MINIMA = 18;
	public static final int PUNTOS_CURACION = 10;
	
	private String dios;
	
	public Clerigo(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima, String dios) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		setDios(dios);
	}

	public String getDios() {
		return dios;
	}

	public void setDios(String dios) {
		this.dios = dios;
	}

	@Override
	public void setFuerza(int fuerza) throws PersonajeException {
		
		if (fuerza < FUERZA_MINIMA) {
			throw new PersonajeException("La fuerza del clerigo no puede ser inferior a " + FUERZA_MINIMA);
		}
		super.setFuerza(fuerza);
	}

	@Override
	public void setInteligencia(int inteligencia) throws PersonajeException {

		if (inteligencia < INTELIGENCIA_MINIMA || inteligencia > INTELIGENCIA_MAXIMA) {
			throw new PersonajeException("La inteligencia del clerigo debe de estar entre " + INTELIGENCIA_MINIMA + " y " + INTELIGENCIA_MAXIMA);
		}
		super.setInteligencia(inteligencia);
	}
	
	public int curarPersonaje() throws PersonajeException {
		
		if (super.getVidaActual() == VIDA_MAXIMA) {
			throw new PersonajeException("No se puede curar a un personaje con la vida actual al maximo");
		}
			
		this.vidaActual = VIDA_MAXIMA;
			
		return vidaActual;
	
		
	}

}
