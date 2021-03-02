package Profesores;

public class ProfesorPrimaria extends Profesor {
	
	private EspecialidadesPrimaria especialidad;
	
	public ProfesorPrimaria(String dni, String nombre, String centroAdjudicado) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);

	}

	public ProfesorPrimaria(String dni, String nombre, String centroAdjudicado, EspecialidadesPrimaria especialidad)
			throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		this.especialidad = especialidad;
	}

	public EspecialidadesPrimaria getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadesPrimaria especialidad) {
		
		if (especialidad == null) {
			this.especialidad = EspecialidadesPrimaria.GENERAL;
		}
		else {
			this.especialidad = especialidad;
		}
		
	}

	@Override
	public void evaluacionAnual(int nota) {

		
	}

}
