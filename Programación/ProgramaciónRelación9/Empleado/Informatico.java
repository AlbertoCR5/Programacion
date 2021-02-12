package Empleado;

public class Informatico extends Empleado{
	


	private String especialidad;

	public Informatico(String dni, String nombre, int sueldo, String especialidad) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		setEspecialidad(especialidad);
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) throws EmpleadoException {
		
		if(!(especialidad.contains(BD) || especialidad.contains(DESARROLLO) || especialidad.contains(SISTEMAS))){
			throw  new EmpleadoException("Error, especialidad incorrecta" + especialidad);
		}
		
		this.especialidad = especialidad;
	}

	
	@Override
	public int getSueldo() {

		return super.getSueldo();
	}

	@Override
	public void setSueldo(int sueldo) throws EmpleadoException {
		
		if(sueldo > SUELDO_MAXIMO_INFORMATICO || sueldo < SUELDO_MINIMO) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
		this.sueldo = sueldo;
		
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		
		return super.toString() + " y su especialidad es " + especialidad + ".";
	}
	
}