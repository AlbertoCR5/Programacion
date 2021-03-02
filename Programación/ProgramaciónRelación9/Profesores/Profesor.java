package Profesores;

public abstract class Profesor {

	public final static int NOTA_MINIMA = 0;
	public final static int NOTA_MAXIMA_PRIMARIA = 5;
	public final static int NOTA_MAXIMA_SECUNDARIA = 10;
	public final static int ANTIGUEDAD_SECUNDARIA_CAMBIO = 2;
	public final static int ANTIGUEDAD_PRIMARIA_CAMBIO = 3;
	private String dni;
	private String nombre;
	private String centroAdjudicado;
	private int antiguedad;

	public abstract void evaluacionAnual(int nota);

	public Profesor(String dni, String nombre, String centroAdjudicado) throws ProfesoresException {
		setDni(dni);
		setNombre(nombre);
		setCentroAdjudicado(centroAdjudicado);
		this.antiguedad = 0;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCentroAdjudicado() {
		return centroAdjudicado;
	}

	public void setCentroAdjudicado(String centroAdjudicado) throws ProfesoresException {

		if (centroAdjudicado != this.centroAdjudicado) {
			throw new ProfesoresException("Error, centro incorrecto");
		}
		if (antiguedad < 0) {
			throw new ProfesoresException("Error, antiguedad no puede te4ner valor negativo");
		}

		this.centroAdjudicado = centroAdjudicado;
		this.antiguedad = 0;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void cambiarDeCentro(Profesor otro) throws ProfesoresException {

		if (otro instanceof ProfesorPrimaria) {
			if (antiguedad < ANTIGUEDAD_PRIMARIA_CAMBIO) {
				throw new ProfesoresException("No dispones de la antiguedad suficiente para el cambio");
			}
			setCentroAdjudicado(centroAdjudicado);
		} else {
			if (otro instanceof ProfesorSecundaria) {
				if (antiguedad < ANTIGUEDAD_SECUNDARIA_CAMBIO) {
					throw new ProfesoresException("No dispones de la antiguedad suficiente para el cambio");
				}
				setCentroAdjudicado(centroAdjudicado);
			}
		}

	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + " centroAdjudicado=" + centroAdjudicado + ", antiguedad=" + antiguedad;
	}

}
