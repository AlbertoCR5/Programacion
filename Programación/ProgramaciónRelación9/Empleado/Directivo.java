package Empleado;

public class Directivo extends Empleado{
	
	private String departamento;

	public Directivo(String dni, String nombre, int sueldo, String departamento) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		setDepartamento(departamento);

	}
	
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) throws EmpleadoException {
		
		if(!(departamento.contains(BD) || departamento.contains(DESARROLLO) || departamento.contains(SISTEMAS))){
			throw  new EmpleadoException("Error, especialidad incorrecta" + departamento);
		}
		
		this.departamento = departamento;
	}

	
	@Override
	public int getSueldo() {
		return super.getSueldo();
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
		return super.toString() + ", y es el directivo del departamento de " + departamento + ".";
	}



}
