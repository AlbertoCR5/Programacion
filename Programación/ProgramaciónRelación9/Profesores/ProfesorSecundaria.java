package Profesores;

public class ProfesorSecundaria extends Profesor {

	private EspecialidadesSecundaria especialidad;

	public ProfesorSecundaria(String dni, String nombre, String centroAdjudicado, EspecialidadesSecundaria especialidad) throws ProfesoresException {
		super(dni, nombre, centroAdjudicado);
		setEspecialidad(especialidad);
	}

	public EspecialidadesSecundaria getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadesSecundaria especialidad) {

		this.especialidad = especialidad;
	}

	@Override
	public void evaluacionAnual(int nota) {
		
	}

}
