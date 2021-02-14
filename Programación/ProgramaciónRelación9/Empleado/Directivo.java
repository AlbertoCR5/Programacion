package Empleado;

public class Directivo extends Empleado{
	
	private TipoEspecialidad especialidad;

	public Directivo(String dni, String nombre, int sueldo, TipoEspecialidad departamento) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		especialidad = departamento;

	}


	@Override
	public void setSueldo(int sueldo) throws EmpleadoException {
		
		if(sueldo > SUELDO_MAXIMO_DIRECTIVO || sueldo < SUELDO_MINIMO) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
	
		super.setSueldo(sueldo);
	}


	@Override
	public String toString() {
		return super.toString() + ", y es el directivo del departamento de " + especialidad + ".";
	}



}
