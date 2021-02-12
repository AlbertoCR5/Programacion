package Empleado;

public class Informatico extends Empleado{
	
	public static final int SUELDO_MAXIMO=3000;

	private String especialidad;

	public Informatico(String dni, String nombre, int sueldo, String especialidad) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		
		if(!(especialidad.contains(BD) || especialidad.contains(DESARROLLO) || especialidad.contains(SISTEMAS))){
			throw  new EmpleadoException("Error, especialidad incorrecta" + especialidad);
		}
		
		if(sueldo > SUELDO_MAXIMO || sueldo < 0) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
			this.especialidad = especialidad;
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public String toString() {
		
		return super.toString() + " y su especialidad es " + especialidad + ".";
	}
	
}
