package JuegoIsla;

import java.util.Arrays;

public class Personaje {
	
	public static final int EDAD_MINIMA = 10;
	public static final int EDAD_MAXIMA = 20;
	public static final int PERTENENCIAS_MAXIMAS = 10;
	
	private String nombre;
	private String nombreIslaNacimiento;
	private String pertenencias[];
	private int edad;
	public int totalPertenencias;
	
	public Personaje(String nombre, String nombreIslaNacimiento) throws JuegoException {
		
		this.nombre = nombre;
		this.nombreIslaNacimiento = nombreIslaNacimiento;
		setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreIslaNacimiento() {
		return nombreIslaNacimiento;
	}

	public void setNombreIslaNacimiento(String nombreIslaNacimiento) {
		this.nombreIslaNacimiento = nombreIslaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws JuegoException {
		
		if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
			throw new JuegoException("Error, no puedes crear a un personaje con una edad menor a " + EDAD_MINIMA + " o superior a " + EDAD_MAXIMA);
		}
		this.edad = edad;
	}

	public String[] getPertenencias() {
		return pertenencias;
	}

	public void setPertenencias(String pertenencias[]) {
		this.pertenencias = pertenencias;
	}

	public void adquirirPertenencia(String pertenencia) throws JuegoException {
	
		int posicion = -1;
		int posicionInsercion;
		
		posicion = buscarPertenencia(pertenencia);
		
		if (posicion != -1) {
			throw new JuegoException("Este personaje ya posee esa pertenencia " + pertenencia);
		}
		
		posicionInsercion = buscarPosicionLibre();
		
		pertenencias[posicionInsercion] = pertenencia;
	}
	private int buscarPosicionLibre() throws JuegoException {

		int posicion = -1;
		boolean encontrado = false;
		
		for (int i = 0; i < PERTENENCIAS_MAXIMAS && !encontrado; i++) {
	
			if (pertenencias[i] == null) {
				posicion = i;
				encontrado = true;
			}
			
			if (!encontrado) {
				throw new JuegoException("Limite de pertenencias alcanzado");
			}
			
		}
			return posicion;
	
	}

	private int buscarPertenencia(String pertenencia) {

		boolean existe = false;
		int posicion = -1;
		
		for (int i = 0; i < pertenencias.length && existe == false; i++) {
			
			if (pertenencias[i] != null && pertenencias[i].equals(pertenencia)) {
				existe = true;
				posicion = i;
			}
			
		}
		
		return posicion;
	}

	public void regalarPertenencia(String pertenencia, Personaje otro) throws JuegoException {
		
		int posicion;
		
		if (this.equals(otro)) {
			throw new JuegoException("No se puede regalar algo a si mismo");
		}
		posicion = buscarPertenencia(pertenencia);
		
		if (posicion == -1) {
			throw new JuegoException("No existe ese objeto" +  pertenencia);

		}
		
		hacerRegalo(otro);
		
		pertenencias[posicion] = null;
		
	}
	
	private void hacerRegalo(Personaje otro) {
		
		
		
		if (otro.nombreIslaNacimiento != otro.getNombreIslaNacimiento()) {
			
		}
		
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nombreIslaNacimiento=" + nombreIslaNacimiento + ", pertenencias="
				+ Arrays.toString(pertenencias) + ", edad=" + edad + ", totalPertenencias=" + totalPertenencias + "]";
	}
	
	
	
}
