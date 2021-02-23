package JuegoRol;

public class ListaPersonajes implements Comparable<Personaje>{

	private Personaje listaPersonajes[];
	private int cantidadPersonajes;
	private TipoHechizo hechizos[];
	
	/**
	 * Se encarga de inicializar el array con la cantidad del array que se le pasa por parametro
	 * @param capacidad de personajes que se pueden almacenar en el array
	 * @throws PersonajeException se lanzara si la capacidad es 0 o negativa
	 */
	public ListaPersonajes(int capacidad) throws PersonajeException {
		
		if (capacidad <= 0) {
			throw new PersonajeException("Error, la cantidad de la lista tiene que ser mayor que 0");
		}
		
		listaPersonajes = new Personaje[capacidad];
		cantidadPersonajes = 0;
	}
	
	/**
	 * Se encarga de annadir en el array el personaje pasado por parametro
	 * @param personajeAnnadir Objeto personaje que se va annadir
	 * @throws PersonajeException Al comprobar que el personaje ya existe y tambien si no hay mas espacio en el array
	 */
	public void incorporarPersonaje (Personaje personajeIncorporado) throws PersonajeException {
		
		int posicion;
		int posicionInsercion;
		
		posicion = buscarPersonaje(personajeIncorporado.getNombre());
		if (posicion != -1) { //Se encontro un coche con esa matricula
			throw new PersonajeException("Ya existe un personaje con ese nombre");
		}
		
		posicionInsercion = buscarPosicionLibre();
		listaPersonajes[posicionInsercion] = personajeIncorporado;
		
	}
	
	private int buscarPersonaje(String nombre) {
		
		boolean existe = false;
		int posicion = -1;
		
		for (int i = 0; i < listaPersonajes.length && existe == false; i++) {
			
			if (listaPersonajes[i] != null && nombre.equalsIgnoreCase(listaPersonajes[i].getNombre())) {
				existe = true;
				posicion = i;
			}
			
		}
		
		return posicion;

	}

	private int buscarPosicionLibre() throws PersonajeException {
		
		int posicion = -1;
		boolean encontrado = false;
		
		for (int i = 0; i < listaPersonajes.length && !encontrado; i++) {
			
			Personaje personaje = listaPersonajes[i];
			
			if (personaje == null) {
				posicion = i;
				encontrado = true;
			}
		}

		if (!encontrado) {
			throw new PersonajeException("No se pueden incorporar mas personajes");
		}
		
		return posicion;
	}


	/**
	 * Se encarga de añadir el hechizo al objeto personaje
	 * @param nombreMago String nombre del mago que aprende el hechizo
	 * @param nombreHechizo String nombre del hechizo que va a aprender el mago
	 * @throws PersonajeException En el metodo comprobarPersonajeExiste, cuando se comprueba que si el objeto
	 * de array es un mago
	 */
	public void aprenderHechizoMago(String nombreMago, TipoHechizo hechizo) throws PersonajeException {
		
		int posicion = -1;
		int posicionInsercion;
		
		posicion = buscarHechizo(hechizo);
		
		if (posicion != -1) {
			throw new PersonajeException("Este personaje ya sabe ese hechizo" + hechizo);
		}
		
		posicionInsercion = buscarPosicionLibre();
		
		hechizos[posicionInsercion] = hechizo;
		
	}
	
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
	 * Se encarga de buscar el nombre del mago, su hechizo y nombre del personaje
	 * @param nombreMagoAtaca String nombre del mago que ataca
	 * @param nombrePersonajeDefiende String nombre del personaje que es atacado
	 * @param nombreHechizo String del hechizo del mago que ataca
	 * @throws PersonajeException Se utiliza en el metodo comprobarPersonajeExiste, si nombreMagoAtaca
	 * es un mago y que si nombreMagoAtaca esta en la misma posicion nombrePersonajeDefiende no se ataca
	 * asi mismo comprobando la posicion en el array
	 * @throws MuerteException 
	 */
	public void lanzarHechizoPersonaje (String nombreMagoAtacante, String nombreMagoDefensor, TipoHechizo hechizo) throws PersonajeException {
		
		int posicion;
		
		if (nombreMagoAtacante.equalsIgnoreCase(nombreMagoDefensor)) {
			throw new PersonajeException("No se puede lanzar un hechizo a si mismo");
		}
		posicion = buscarHechizo(hechizo);
		
		if (posicion == -1) {
			throw new PersonajeException("No existe ese hechizo" +  hechizo);

		}
		
		hacerDanno(nombreMagoDefensor);
		
		hechizos[posicion] = null;
	}
	
	private void hacerDanno(String nombreMagoDefensor) {

		
	}

	/**
	 * Se encarga de buscar un clerigo y buscar un personaje, y el clerigo cura al personaje.
	 * @param nombreClerigo String que contiene el nombre del clerigo que va a curar
	 * @param nombrePersonaje String que contiene el nombre del personaje que se va a curar
	 * @throws PersonajeException En el metodo comprobarPersonajeExiste, si es un clerigo en la posClerigo del array y
	 * si la posClerigo y posPersonaje no son iguales para comprobar que no se cura asi mismo 
	 */
	public void curarPersonaje (String nombreClerigo, String nombrePersonaje) {
//		
//		clerigo = (Clerigo)personajeClerigo;
//		if (nombreClerigo.equalsIgnoreCase(nombrePersonaje)){
//			throw new PersonajeException("No se puede curar a si mismo");
//		}
//		
//		if (super.getVidaActual() == VIDA_MAXIMA) {
//			throw new PersonajeException("No se puede curar a un personaje con la vida actual al maximo");
//		}
//		
//		if (super.getVidaActual() == VALOR_MINIMO) {
//			throw new PersonajeException("No se puede curar a un personaje con la vida actual al maximo");
//		}
//		
//		otro.setVidaActual(otro.getVidaActual() + PUNTOS_CURACION);
//	
//		clerigo.curar(personajeCurado);
	}
	
	/**
	 * Ordena el array de personajes por el numero de vida actual
	 *  de mayor a menor y luego lo muesta en forma de String
	 * @param numeroPersonajes 
	 * @param listaPersonajes 
	 * @return String del array ya ordenado
	 */
	public String mostrarListadoPuntosActuales (){
		return null;
		
		
		
	}
	
	/**
	 * Almacena en un String todos los personajes almacenados en el array
	 * @return String de todos los personajes creados
	 */
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
	
		for (int i = 0; i < cantidadPersonajes; i++) {
			sb.append((i+1) + ". " + listaPersonajes[i] + "\n");
		
		}
		
		return sb.toString();
	}

	@Override
	public int compareTo(Personaje arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
