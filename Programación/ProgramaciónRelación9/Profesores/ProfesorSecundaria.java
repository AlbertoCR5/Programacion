package Profesores;

public class ProfesorSecundaria extends Profesor {

	public final static int NOTA_MAXIMA_SECUNDARIA = 10;
	public final static int ANTIGUEDAD_SECUNDARIA_CAMBIO = 2;
	
	private EspecialidadesSecundaria especialidad;
	private int sumaTodasNotas;
	private int numeroTotalEvaluaciones;
	

	public ProfesorSecundaria(String dni, String nombre, String centroAdjudicado, EspecialidadesSecundaria especialidad) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		this.especialidad = especialidad;
		this.sumaTodasNotas = NO_EVALUADO;
		this.numeroTotalEvaluaciones = NO_EVALUADO;
	}

	public EspecialidadesSecundaria getEspecialidad() {
		return especialidad;
	}

	//No es necesario el set de especialidad
//	public void setEspecialidad(EspecialidadesSecundaria especialidad) {
//
//		this.especialidad = especialidad;
//	}
	
	public double getNotaMedia() throws ProfesoresException {
		
		if (numeroTotalEvaluaciones == 0) {
			throw new ProfesoresException("No se ha evaluado aun");
		}
		return (double)sumaTodasNotas / numeroTotalEvaluaciones; //notaMedia
	}
	
	@Override
	public void setCentroAdjudicado(String centroAdjudicado) throws ProfesoresException {
		
		if(super.getAntiguedad() < ANTIGUEDAD_SECUNDARIA_CAMBIO) {
			throw new ProfesoresException("No dispones de la antiguedad suficiente para cambiar de centro. Minimo " + ANTIGUEDAD_SECUNDARIA_CAMBIO);
		}
		super.setCentroAdjudicado(centroAdjudicado);
	}

	@Override
	public void evaluacionAnual(int nota) throws ProfesoresException {
		
		if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA_SECUNDARIA) {
			throw new ProfesoresException("La nota de la evaluacion debe de estar entre " + NOTA_MINIMA + " y " + NOTA_MAXIMA_SECUNDARIA);
		}
		sumaTodasNotas += nota;
		numeroTotalEvaluaciones++;
		
		super.incrementarAntiguedad(); // o incrementarAntiguedad()
	}

	
}
