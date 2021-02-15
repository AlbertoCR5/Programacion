package Empleado;

public class Informatico extends Empleado {

	private TipoEspecialidad especialidad;

	public Informatico(String dni, String nombre, int sueldo, TipoEspecialidad especialidad) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		this.especialidad = especialidad;
		
	}

	@Override
	public void setSueldo(int sueldo) throws EmpleadoException {
		
		if(sueldo > SUELDO_MAXIMO_INFORMATICO) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
		
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		
		return super.toString() + " y su especialidad es " + especialidad + ".";
	}
	
}