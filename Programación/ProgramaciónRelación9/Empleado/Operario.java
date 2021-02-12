package Empleado;

public class Operario extends Empleado{

public static final int SUELDO_MAXIMO = 1200;
	
	private int numeroNave;

	public Operario(String dni, String nombre, int sueldo, int numeroNave) throws EmpleadoException {
		
		super(dni, nombre, sueldo);
		
		if(sueldo > SUELDO_MAXIMO || sueldo < 0) {
			throw  new EmpleadoException("Error, sueldo incorrecto" + sueldo);
		}
		if (numeroNave < 1 || numeroNave > 5) {
			throw  new EmpleadoException("Error, nave incorrecta" + numeroNave);
		}
		
		this.numeroNave = numeroNave;
		
	}

	public int getNumeroNave() {
		return numeroNave;
	}

	@Override
	public String toString() {
		return super.toString() + ", es operario y trabaja en la nave numero " + numeroNave + ".";
	}
	
}
