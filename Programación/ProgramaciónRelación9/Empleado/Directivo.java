package Empleado;

public class Directivo extends Empleado{

public static final int SUELDO_MAXIMO = 3500;
	
	private String departamento;

	public Directivo(String dni, String nombre, int sueldo, String departamento) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		
		if(sueldo > SUELDO_MAXIMO || sueldo < 0) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
	
		
	}

	@Override
	public String toString() {
		return super.toString() + "Directivo [departamento=" + departamento + "]";
	}



}