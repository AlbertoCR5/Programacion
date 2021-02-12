package Empleado;

public class Empleado {
	
	public static final int SUELDO_MINIMO = 800;
	public static final String DESARROLLO = "DESARROLLO";
	public static final String SISTEMAS = "SISTEMAS";
	public static final String BD = "BASE DE DATOS";
	public static final int SUELDO_MAXIMO_DIRECTIVO = 3500;
	public static final int SUELDO_MAXIMO_INFORMATICO = 3000;
	public static final int SUELDO_MAXIMO_OPERARIO = 1200;
	
	private String dni;
	private String nombre;
	protected int sueldo;
	
	
	public Empleado(String dni, String nombre, int sueldo) throws EmpleadoException {
		super();
		this.dni = dni;
		this.nombre = nombre;
		setSueldo(sueldo);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) throws EmpleadoException {
		if (sueldo < SUELDO_MINIMO)
			throw new EmpleadoException(" Sueldo incorrecto");
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado " + nombre + " con DNI: " + dni + ", tiene un sueldo de " + sueldo + "€";
	}
	
	
	
	
}