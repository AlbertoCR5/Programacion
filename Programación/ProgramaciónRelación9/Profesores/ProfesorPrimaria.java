package Profesores;

public class ProfesorPrimaria extends Profesor {
	
	//Constantes
	public final static int NOTA_MAXIMA_PRIMARIA = 5; //Nota maxima de evaluacion para profesor de primaria
	public final static int ANTIGUEDAD_PRIMARIA_CAMBIO = 3; //Antiguedad minima del profesor de primaria para pode cambiar de centro 
	
	private EspecialidadesPrimaria especialidad;
	private double notaUltimaEvaluacion;
	
	//Constructores
	//Constructor sin eleccion de especialidad, asignamos general
	public ProfesorPrimaria(String dni, String nombre, String centroAdjudicado) throws ProfesoresException { 
		super(dni, nombre, centroAdjudicado);
		this.especialidad = EspecialidadesPrimaria.GENERAL;
		this.notaUltimaEvaluacion = NO_EVALUADO;
	}
	
	public ProfesorPrimaria(String dni, String nombre, String centroAdjudicado, EspecialidadesPrimaria especialidad) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		this.especialidad = especialidad; //
		this.notaUltimaEvaluacion = NO_EVALUADO;
	}
	
	public EspecialidadesPrimaria getEspecialidad() {
		return especialidad;
	}
	
	public double getNotaUltimaEvaluacion() {
		return notaUltimaEvaluacion;
	}

	
	@Override
	public void setCentroAdjudicado(String centroAdjudicado) throws ProfesoresException {
		
			//super.getAntiguedad() o this.getAntiguedad() tambien valen
		if(getAntiguedad() < ANTIGUEDAD_PRIMARIA_CAMBIO) {
			throw new ProfesoresException("No dispones de la antiguedad suficiente para cambiar de centro. Minimo " + ANTIGUEDAD_PRIMARIA_CAMBIO);
		}
		
		//Aqui es imprescindible el super.
		super.setCentroAdjudicado(centroAdjudicado);
	}

	@Override
	public void evaluacionAnual(int nota) throws ProfesoresException {

		if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA_PRIMARIA) {
			throw new ProfesoresException("La nota de la evaluacion debe de estar entre " + NOTA_MINIMA + " y " + NOTA_MAXIMA_PRIMARIA);
		}
		
		//o this.notaUltimaEvaluacion = nota;
		notaUltimaEvaluacion = nota;
		
		super.antiguedad++; //Haciendo de antiguedad un atributo protegido o super.incrementarAntiguedad();
	}

	@Override
	public String toString() {
		
		String cadena;
		
		if ( notaUltimaEvaluacion == NO_EVALUADO) {
			cadena=super.toString() + "  especialidad + " +  especialidad + "SIN NOTA";
		}
		else {
			cadena=super.toString() + "  especialidad + " +  especialidad + "Nota ultima evaluacion " + notaUltimaEvaluacion;
		}
		
		return cadena;
	}

	
}
