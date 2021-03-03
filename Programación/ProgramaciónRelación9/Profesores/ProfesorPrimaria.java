package Profesores;

public class ProfesorPrimaria extends Profesor {
	
	//Constantes
	public final static int NOTA_MAXIMA_PRIMARIA = 5; //Nota maxima de evaluacion para profesor de primaria
	public final static int ANTIGUEDAD_PRIMARIA_CAMBIO = 3; //Antiguedad minima del profesor de primaria para pode cambiar de centro 
	
	private EspecialidadesPrimaria especialidad;
	private double notaUltimaEvaluacion;
	
	//Constructores
	public ProfesorPrimaria(String dni, String nombre, String centroAdjudicado, EspecialidadesPrimaria especialidad) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		this.especialidad = especialidad; //
		this.notaUltimaEvaluacion = NO_EVALUADO;
	}
	
	public ProfesorPrimaria(String dni, String nombre, String centroAdjudicado) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		this.especialidad = EspecialidadesPrimaria.GENERAL;
		this.notaUltimaEvaluacion = NO_EVALUADO;
	}

	public EspecialidadesPrimaria getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadesPrimaria especialidad) {
			this.especialidad = especialidad;
	}	
	
	public double getNotaUltimaEvaluacion() {
		return notaUltimaEvaluacion;
	}
	
	@Override
	public void setCentroAdjudicado(String centroAdjudicado) throws ProfesoresException {
		
		if(super.getAntiguedad() < ANTIGUEDAD_PRIMARIA_CAMBIO) {
			throw new ProfesoresException("No dispones de la antiguedad suficiente para cambiar de centro. Minimo " + ANTIGUEDAD_PRIMARIA_CAMBIO);
		}
		super.setCentroAdjudicado(centroAdjudicado);
	}

	@Override
	public void evaluacionAnual(int nota) throws ProfesoresException {

		if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA_PRIMARIA) {
			throw new ProfesoresException("La nota de la evaluacion debe de estar entre " + NOTA_MINIMA + " y " + NOTA_MAXIMA_PRIMARIA);
		}
		this.notaUltimaEvaluacion = nota;
		
		super.antiguedad++; //Haciendo de antiguedad un atributo protegido
	}

	@Override
	public String toString() {
		
		return super.toString() + "ProfesorPrimaria [especialidad=" + especialidad + ", notaUltimaEvaluacion=" + notaUltimaEvaluacion
				+ "]";
	}



}
