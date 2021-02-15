package Empleado;

public class Directivo extends Empleado{
	
	private String departamento;

	public Directivo(String dni, String nombre, int sueldo, String departamento) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		this.departamento = departamento;

	}


	@Override
	public void setSueldo(int sueldo) throws EmpleadoException {
		
		if(sueldo > SUELDO_MAXIMO_DIRECTIVO) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
	
		super.setSueldo(sueldo);
	}


	@Override
	public String toString() {
		return super.toString() + ", y es el directivo del departamento de " + departamento + ".";
	}



}
