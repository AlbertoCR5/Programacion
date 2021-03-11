package JuegoIsla;

import java.util.Arrays;

public class Personaje {

	public static final int EDAD_MINIMA = 10;
	public static final int EDAD_MAXIMA = 20;
	public static final int PERTENENCIAS_MAXIMAS = 10;

	private String nombre;
	private Isla nombreIslaNacimiento;
	private String pertenencias[];
	private int edad;
	public int totalPertenencias;

	public Personaje(String nombre, Isla nombreIslaNacimiento) throws JuegoException {

		this.nombre = nombre;
		setNombreIslaNacimiento(nombreIslaNacimiento);
		this.edad = EDAD_MINIMA;
		pertenencias = new String[PERTENENCIAS_MAXIMAS];
	}

	public Personaje(String nombre, Isla nombreIslaNacimiento, int edad) throws JuegoException {

		this.nombre = nombre;
		setNombreIslaNacimiento(nombreIslaNacimiento);
		setEdad(edad);
		pertenencias = new String[PERTENENCIAS_MAXIMAS];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Isla getNombreIslaNacimiento() {
		return nombreIslaNacimiento;
	}

	public void setNombreIslaNacimiento(Isla nombreIslaNacimiento) throws JuegoException {

		if (nombreIslaNacimiento.equals(this.nombreIslaNacimiento)) {
			throw new JuegoException(
					"El personaje " + this.nombre + " ya esta en la isla " + this.nombreIslaNacimiento.getNombre());
		}

		nombreIslaNacimiento.incrementarNumeroPersonajesEnIsla();
		this.nombreIslaNacimiento = nombreIslaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws JuegoException {

		if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
			throw new JuegoException("Error, no puedes crear a un personaje con una edad menor a " + EDAD_MINIMA
					+ " o superior a " + EDAD_MAXIMA);
		}
		this.edad = edad;
	}

	public void cumpleanos() {
		edad++;
	}

	public int getTotalPertenencias() {
		return totalPertenencias;
	}

	public void adquirirPertenencia(String pertenencia) throws JuegoException {

		int posicionHueco = buscarHueco();

		pertenencias[posicionHueco] = pertenencia;

		totalPertenencias++;
	}

	private int buscarHueco() throws JuegoException {

		int posicionHueco = -1;

		for (int i = 0; i < pertenencias.length && posicionHueco == -1; i++) {

			if (pertenencias[i] == null) {
				posicionHueco = i; // sale del bucle
			}

		}

		if (posicionHueco == -1) {
			throw new JuegoException("Limite de pertenencias alcanzado");
		}

		return posicionHueco;

	}

	public void regalarPertenencia(Personaje otro, String pertenencia) throws JuegoException {

		boolean encontrada = false;
		int posicionPertenencia = 0;

		if (!this.nombreIslaNacimiento.equals(otro.nombreIslaNacimiento)) {
			throw new JuegoException("No puede regalar a un personaje que pertenece a otra isla");
		}

		for (int i = 0; i < pertenencias.length && !encontrada; i++) {

			if (pertenencia.equals(pertenencia)) {
				encontrada = true;
				posicionPertenencia = i;
			}
		}

		if (!encontrada) {
			throw new JuegoException("No puedes regalar un objeto que no posees");
		}

		// Busca la pertenencia y si la encuentra la pone a null
		otro.adquirirPertenencia(pertenencia);
		pertenencias[posicionPertenencia] = null; // Suelta la pertenencia al final, si no, hay error
		totalPertenencias--; // al utilizar el metodo (adquirirPertenencias) debo restar para que el numero
								// de objetos no aumente al ser regalado
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nombreIslaNacimiento=" + nombreIslaNacimiento + ", pertenencias="
				+ Arrays.toString(pertenencias) + ", edad=" + edad + ", totalPertenencias=" + totalPertenencias + "]";
	}

}
