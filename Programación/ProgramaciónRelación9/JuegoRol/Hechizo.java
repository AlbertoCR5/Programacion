package JuegoRol;

public class Hechizo {

	public static final int HECHIZO_MINIMOS = 1;
	public static final int HECHIZO_MAXIMOS = 4;
	private Mago hechizos[];
	
	public Hechizo(int cantidadHechizos) throws PersonajeException {
		if (cantidadHechizos < HECHIZO_MINIMOS || cantidadHechizos > HECHIZO_MAXIMOS) {
			throw new PersonajeException("La cantidad de hechizos que puede aprender este personaje es de minimo " + HECHIZO_MINIMOS + " y  maximo " + HECHIZO_MAXIMOS);
		}
		
		hechizos = new Mago[cantidadHechizos];
	}

	public void aprenderHechizo(Mago hechizo) throws PersonajeException {
		
		int posicion;
		int posicionInsercion;
		
		posicion = buscarHechizo(hechizo.getHechizo());
		
		if (posicion != -1) {
			throw new PersonajeException("Este personaje ya sabe ese hechizo" + hechizo);
		}
		
		posicionInsercion = buscarPosicionLibre();
		
		hechizos[posicionInsercion] = hechizo;
			
		
	}

	private int buscarPosicionLibre() throws PersonajeException {

		int posicion = -1;
		boolean encontrado = false;
		
		for (int i = 0; i < hechizos.length && !encontrado; i++) {
			Personaje hechizo = hechizos[i];
			
			if (hechizo == null) {
				posicion = i;
				encontrado = true;
			}
			
		}
		
		if (!encontrado) {
			throw new PersonajeException("No se pueden aprender mas hechizos");
		}
		
		return posicion;
	}

	private int buscarHechizo(TipoHechizo tipoHechizo) {
		
		boolean existe = false;
		int posicion = -1;
		
		for (int i = 0; i < hechizos.length && existe == false; i++) {
			
			if (hechizos[i] != null && tipoHechizo.equals(((Mago) hechizos[i]).getHechizo())) {
				existe = true;
				posicion = i;
			}
			
		}

		return posicion;
	}
	
	public boolean lanzarHechizo(TipoHechizo hechizo) throws PersonajeException {
	
		int posicion;
		boolean lanzado;
		
		posicion = buscarHechizo(hechizo);
		
		if (posicion == -1) {
			throw new PersonajeException("No existe ese hechizo" +  hechizo);

		}
		
		lanzado = true;
		hechizos[posicion] = null;
		
		return lanzado;
		
	}
	
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < hechizos.length; i++) {

			if (hechizos[i] != null) {
				sb.append(hechizos[i].toString());
				sb.append("\n");
			}

		}

		return sb.toString();

	}
}
