package JuegoRol;

public class Mago extends Personaje {

	public static final int INTELIGENCIA_MINIMA = 17; //Inteligencia minima del mago
	public static final int FUERZA_MAXIMA = 15; //Fuerza maxima del mago
	public static final int HECHIZOS_MAXIMOS = 4; //Numero maximo de hechizos que puede aprender un mago
	public static final int PUNTOS_DANNO = 4; //Puntos de danno
	private TipoHechizo hechizos[];
	
	public Mago(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		this.setFuerza(fuerza);
		this.setInteligencia(inteligencia);
		hechizos = new TipoHechizo[HECHIZOS_MAXIMOS];
	}

	public TipoHechizo[] getHechizo() {
		return hechizos;
	}

	public void setHechizo(TipoHechizo[] hechizos) {
		this.hechizos = hechizos;
	}

	/**
	 * Modifica la fuerza del mago controlando que esta en rango, si no, lanzara la excepcion.
	 * @param Fuerza ajustada
	 */
	@Override
	public void setFuerza(int fuerza) throws PersonajeException {
		
		if (fuerza > FUERZA_MAXIMA) {
			throw new PersonajeException("La fuerza del mago no puede ser superior a " + FUERZA_MAXIMA);
		}
		super.setFuerza(fuerza);
	}

	/**
	 * Modifica la inteligencia del mago controlando que esta en rango, si no, lanzara la excepcion.
	 * @param Inteligencia ajustada
	 */
	@Override
	public void setInteligencia(int inteligencia) throws PersonajeException {
		
		if (inteligencia < INTELIGENCIA_MINIMA) {
			throw new PersonajeException("La inteligencia minima del mago es " + INTELIGENCIA_MINIMA);
		}
		super.setInteligencia(inteligencia);
	}
	
	/**
	 * Aprende un nuevo hechizo, insertandolo en el array de hechizos. Si ya conoce ese hechizo, lanzara una excepcion
	 * 
	 * @param hechizo
	 * @throws PersonajeException
	 */
	public void aprenderHechizo(TipoHechizo hechizo) throws PersonajeException {
		
		int posicion = -1;
		int posicionInsercion;
		
		posicion = buscarHechizo(hechizo);
		
		if (posicion != -1) {
			throw new PersonajeException("Este personaje ya sabe ese hechizo" + hechizo);
		}
		
		posicionInsercion = buscarPosicionLibre();
		
		hechizos[posicionInsercion] = hechizo;
			
		
	}

	/**
	 * BUsca una posicion null en el array de hechizos
	 * @return posicion donde esta el primer (null) o -1 si no existe hueco, en este caso lanzara una excepcion
	 * @throws PersonajeException
	 */
	private int buscarPosicionLibre() throws PersonajeException {

		int posicion = -1;
		boolean encontrado = false;
		
		for (int i = 0; i < HECHIZOS_MAXIMOS && !encontrado; i++) {

			
			if (hechizos[i] == null) {
				posicion = i;
				encontrado = true;
			}
			
		}
		
		if (!encontrado) {
			throw new PersonajeException("No se pueden aprender mas hechizos");
		}
		
		return posicion;
	}

	/**
	 * Busca la posicion de un hechizo en el array de hechizos
	 * @param hechizo que se va a buscar
	 * @return posicion del hechizo en el array, o -1 si no lo encuentra
	 */
	private int buscarHechizo(TipoHechizo hechizo) {
		
		boolean existe = false;
		int posicion = -1;
		
		for (int i = 0; i < hechizos.length && existe == false; i++) {
			
			if (hechizos[i] != null && hechizos[i].equals(hechizo)) {
				existe = true;
				posicion = i;
			}
			
		}

		return posicion;
	}
	
	/**
	 * Lanza un hechizo ya aprendido sobre un personaje
	 * @param hechizo ya aprendido, Si no estuviera en el array de hechizos, lanzara una excepcion
	 * cuando se lanza un hechizo, se olvida.
	 * @param otro personaje sobre el cual se lanzará el hechizo
	 * @throws PersonajeException
	 */
	public void lanzarHechizo(TipoHechizo hechizo, Personaje otro) throws PersonajeException {
	
		int posicion;
		
		if (this.equals(otro)) {
			throw new PersonajeException("No se puede lanzar un hechizo a si mismo");
		}
		posicion = buscarHechizo(hechizo);
		
		if (posicion == -1) {
			throw new PersonajeException("No existe ese hechizo" +  hechizo);

		}
		
		hacerDanno(otro);
		
		hechizos[posicion] = null;
		
	}

	/**
	 * Decrementa la vida del personaje, si al hacerlo el resultado de la vida fuese negativo o cero, se lanza una excepcion
	 * @param otro nombre del personaje que se va a restar puntos de su vida
	 * @throws PersonajeException
	 */
	private void hacerDanno(Personaje otro) throws PersonajeException {

		if (otro.getVidaActual() - PUNTOS_DANNO <= 0) { //Si al dañar la vida es negativa, esta pasa a ser 0
			otro.setVidaActual(0);
			throw new PersonajeException("El personaje " + otro.getNombre() + " is dead. RIP");
		}
		
		otro.setVidaActual(otro.getVidaActual() - PUNTOS_DANNO);
	}

	@Override
	public String toString() {
		
		StringBuilder cadena = new StringBuilder(200);
		
		cadena.append("Mago " + super.toString() + "\n libro de hechizos");
		
		for (int i = 0; i < HECHIZOS_MAXIMOS; i++) {
			
			if (hechizos[i] != null) {
				cadena.append(hechizos[i] + " ");
			}
		}
		
		cadena.append("\n");
		
		return cadena.toString();
	}

		


}
