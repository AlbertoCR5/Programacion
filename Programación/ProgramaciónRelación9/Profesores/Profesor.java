package Profesores;

public abstract class Profesor implements EvaluableAnualmente {

	public final static int NOTA_MINIMA = 0;
	public final static int NO_EVALUADO = -1;
	public static final int DNI_ALFANUMERICO = 9;
	
	private String dni;
	private String nombre;
	private String centroAdjudicado;
	protected int antiguedad;

	public Profesor(String dni, String nombre, String centroAdjudicado) throws ProfesoresException {
		setDni(dni);
		setNombre(nombre);
		setCentroAdjudicado(centroAdjudicado);
		this.antiguedad = 0;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws ProfesoresException {
		
		if (dni.length() != DNI_ALFANUMERICO ) {
			throw new ProfesoresException("El DNI debe tener " + DNI_ALFANUMERICO + " caracteres");
		}
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCentroAdjudicado() throws ProfesoresException {
		return centroAdjudicado;
	}

	public void setCentroAdjudicado(String centroAdjudicado) throws ProfesoresException {
		this.centroAdjudicado = centroAdjudicado;
		this.antiguedad = 0;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	//Metodo que sirve para hacer antiguedad protegida y asi poder llamar al metodo desde otra clase
	protected void incrementarAntiguedad() {
		antiguedad++;
	}
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + " centroAdjudicado=" + centroAdjudicado + ", antiguedad=" + antiguedad;
	}

}
