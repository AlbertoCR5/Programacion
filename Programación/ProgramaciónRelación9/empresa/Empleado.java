package empresa;

public abstract class Empleado implements ActualizableSueldo {

	// Constantes
	private static final int SUELDO_MINIMO_EMPLEADO = 1100;
	// Constantes utilizadas por Enum: TipoPuesto
	public static final int SUELDO_INICIAL_ADMINISTRATIVO = 1150;
	public static final int SUELDO_INICIAL_OPERARIO = 1100;
	public static final int SUELDO_INICIAL_CONTABLE = 1350;

	// Atributos de Empleado
	private String dni;
	private String nombre;
	protected int sueldo; 

	public Empleado(String dni, String nombre, int sueldo) throws EmpresaException {
		setDni(dni);
		setNombre(nombre);
		setSueldo(sueldo);
	}

	/**
	 * Set de sueldo, si el sueldo es inferior al sueldo minimo, se lanzara una
	 * excepcion
	 * 
	 * @param sueldo
	 * @throws EmpresaException
	 */
	protected void setSueldo(int sueldo) throws EmpresaException {
		if (sueldo < SUELDO_MINIMO_EMPLEADO)
			throw new EmpresaException(
					"El sueldo de cualquier empleado nuna debe ser inferior de " + SUELDO_MINIMO_EMPLEADO + "  euros");
		this.sueldo = sueldo;
	}

	public int getSueldo() {
		return sueldo;
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
	
	public boolean equals (Empleado otro) {
		
		return this.dni.equals(otro.dni);
	}

	@Override
	public String toString() {
		return "Empleado DNI=" + dni + ", nombre=" + nombre + " sueldo " + sueldo;
	}

}
