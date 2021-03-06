
package Empleado;

public class Operario extends Empleado{

	private int numeroNave;

	public Operario(String dni, String nombre, int sueldo, int numeroNave) throws EmpleadoException {
		
		super(dni, nombre, sueldo); //Llama al constructor
		// setSueldo(sueldo);
		setNumeroNave(numeroNave);
		
	}

	public int getNumeroNave() {
		return numeroNave;
	}

	public void setNumeroNave(int numeroNave) throws EmpleadoException {
		
		if (numeroNave < 1 || numeroNave > 5) {
			throw  new EmpleadoException("Error, nave incorrecta" + numeroNave);
		}
		
		this.numeroNave = numeroNave;
	}

	//Primero controla el sueldo del operario, luego el sueldo minimo general
	@Override
	public void setSueldo(int sueldo) throws EmpleadoException {

		if(sueldo > SUELDO_MAXIMO_OPERARIO) {
			throw  new EmpleadoException("Error, sueldo incorrecto " + sueldo);
		}
		super.setSueldo(sueldo);
	}

	@Override
	public String toString() {
		return super.toString() + ", es operario y trabaja en la nave numero " + numeroNave + ".";
	}
	
}