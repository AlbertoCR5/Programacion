package Profesores;

public class ProfesorSecundaria extends Profesor {

	public final static int NOTA_MAXIMA_SECUNDARIA = 10;
	public final static int ANTIGUEDAD_SECUNDARIA_CAMBIO = 2;
	
	private EspecialidadesSecundaria especialidad;
	private double notaMedia;

	public ProfesorSecundaria(String dni, String nombre, String centroAdjudicado, EspecialidadesSecundaria especialidad) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		setEspecialidad(especialidad);
		this.notaMedia = NO_EVALUADO;
	}

	public EspecialidadesSecundaria getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadesSecundaria especialidad) {

		this.especialidad = especialidad;
	}
	
	public double getNotaMedia() {
		return notaMedia;
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
		this.notaMedia = nota;
		
		super.incrementarAntiguedad(); // o incrementarAntiguedad()
	}

	
}
