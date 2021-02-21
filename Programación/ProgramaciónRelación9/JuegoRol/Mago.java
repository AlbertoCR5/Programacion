package JuegoRol;

public class Mago extends Personaje {

	public static final int INTELIGENCIA_MINIMA = 17;
	public static final int FUERZA_MAXIMA = 15;
	
	private TipoHechizo hechizo;
	
	public Mago(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		setHechizo(hechizo);
	}

	public TipoHechizo getHechizo() {
		return hechizo;
	}

	public void setHechizo(TipoHechizo hechizo) {
		this.hechizo = hechizo;
	}

	@Override
	public void setFuerza(int fuerza) throws PersonajeException {
		
		if (fuerza > FUERZA_MAXIMA) {
			throw new PersonajeException("La fuerza del mago no puede ser superior a " + FUERZA_MAXIMA);
		}
		this.fuerza = fuerza;
	}

	@Override
	public void setInteligencia(int inteligencia) throws PersonajeException {
		
		if (inteligencia < INTELIGENCIA_MINIMA) {
			throw new PersonajeException("La inteligencia minima del mago es " + INTELIGENCIA_MINIMA);
		}
		this.inteligencia = inteligencia;
	}
	
	public void recibirHabilidad() {

		
	}
	
	@Override
	public String toString() {

		if (hechizo == null) {
			return "El mago " + super.toString() + " Aun no ha aprendido hechizos.";
		}
	
		return "El mago " + super.toString() + hechizo;
	}


}
