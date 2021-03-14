package empresa;

public class JefeDepartamento extends Empleado {

	private static final double AUMENTO_ALTO = 1.06;
	private static final double AUMENTO_MEDIO = 1.04;
	private static final double AUMENTO_BAJO = 1.03;
	private static final int CANTIDAD_MEDIA_SUBORDINADOS = 8;
	private static final int CANTIDAD_BAJA_SUBORDINADOS = 3;
	private static final int MINIMO_SUELDO_JEFE = 1350;
	private static final int LIMITE_SUBORDINADOS = 12;

	private String departamento;
	private Empleado[] subordinados = new Empleado[LIMITE_SUBORDINADOS];
	private int numeroRealSubordinados;

	public JefeDepartamento(String dni, String nombre, int sueldo, String departamento) throws EmpresaException {
		super(dni, nombre, sueldo);
		this.departamento = departamento;
		subordinados = new Empleado[LIMITE_SUBORDINADOS];

	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	protected void setSueldo(int sueldo) throws EmpresaException {

		if (sueldo < MINIMO_SUELDO_JEFE) {
			throw new EmpresaException("El sueldo no puede ser inferior a " + MINIMO_SUELDO_JEFE);
		}

		super.setSueldo(sueldo);
	}

	//Aprenderlo
	public void incorporarSubordinado(Empleado subordinado) throws EmpresaException {

		if (numeroRealSubordinados == LIMITE_SUBORDINADOS) {
			throw new EmpresaException("Error, no puedes incorporar mas subordinados");
		}

		if (this.getSueldo() < subordinado.getSueldo()) {
			throw new EmpresaException("Error, un empleado base no puede cobrar mas que un jefe");
		}

		int posicion = buscarHueco();
		if (posicion == -1) {
			throw new EmpresaException("Error, no puedes incorporar mas subordinados");
		}

		subordinados[posicion] = subordinado;
		numeroRealSubordinados++;

	}

	//Aprenderlo
	public void bajaSubordinado(Empleado subordinado) throws EmpresaException {

		boolean subordinadoEncontrado = false;

		for (int i = 0; i < subordinados.length && !subordinadoEncontrado; i++) {

			if (subordinados[i] != null && subordinados[i].equals(subordinado)) {
				subordinadoEncontrado = true;
				subordinados[i] = null;
				numeroRealSubordinados--;
			}

		}
		
		if (!subordinadoEncontrado) { //(subordinado = false;
			throw new EmpresaException("Error, no se ha podido dar de baja al subordinado " + subordinado.getNombre());			
		}
	}

	// Aprenderlo
	private int buscarHueco() {

		boolean encontrado = false;
		int posicionHueco = -1;

		for (int i = 0; i < subordinados.length && !encontrado; i++) {

			if (subordinados[i] == null) {
				posicionHueco = i;
				encontrado = true;
			}

		}
		return posicionHueco;
	}

	@Override
	public void actualizarSueldo() throws EmpresaException { // No se va a dar el error

		int sueldoFinal = 0;

		if (this.numeroRealSubordinados < CANTIDAD_BAJA_SUBORDINADOS) {
			sueldoFinal = (int) (super.getSueldo() + sueldo * AUMENTO_BAJO);
		} else {
			if (this.numeroRealSubordinados < CANTIDAD_MEDIA_SUBORDINADOS) {
				sueldoFinal = (int) (super.getSueldo() + sueldo * AUMENTO_MEDIO);
			} else {
				sueldoFinal = (int) (super.getSueldo() + sueldo * AUMENTO_ALTO);
			}
		}

		super.setSueldo(sueldoFinal);

	}

}
