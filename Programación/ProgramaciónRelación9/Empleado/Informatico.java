package Empleado;

public class Informatico extends Empleado{
	
	public static final int SUELDO_MAXIMO=3000;
	
	private static final String DESARROLLO = "DESARROLLO";
	private static final String SISTEMAS = "SISTEMAS";
	private static final String BD = "BD";
	private String especialidad;

	public Informatico(String dni, String nombre, int sueldo, String especialidad) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		
		if(sueldo > SUELDO_MAXIMO || sueldo < 0) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
		if(!(especialidad.contains(BD) || especialidad.contains(DESARROLLO) || especialidad.contains(SISTEMAS))){
			throw  new EmpleadoException("Error, especialidad incorrecta" + especialidad);
		}
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public String toString() {
		return super.toString() + "Informatico [especialidad=" + especialidad + "]";
	}
	
}
