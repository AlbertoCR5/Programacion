package Empleado;

public class Directivo extends Empleado{

public static final int SUELDO_MAXIMO = 3500;
	
	private String departamento;

	public Directivo(String dni, String nombre, int sueldo, String departamento) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		
		if(!(departamento.contains(BD) || departamento.contains(DESARROLLO) || departamento.contains(SISTEMAS))){
			throw  new EmpleadoException("Error, especialidad incorrecta" + departamento);
		}
		if(sueldo > SUELDO_MAXIMO || sueldo < 0) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
	
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return super.toString() + ", y es el directivo del departamento de " + departamento + ".";
	}



}