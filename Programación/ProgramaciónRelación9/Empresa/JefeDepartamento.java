package Empresa;

public class JefeDepartamento extends Empleado {

	private static final double AUMENTO_ALTO = 1.06;
	private static final double AUMENTO_MEDIO = 1.04;
	private static final double AUMENTO_BAJO = 1.03;
	private static final int CANTIDAD_MEDIA_SUBORDINADOS = 8;
	private static final int CANTIDAD_BAJA_SUBORDINADOS = 3;
	private static final int MINIMO_SUELDO_JEFE = 1350;
	private static final int LIMITE_SUBORDINADOS = 12;
	private String departamento;
	private Empleado[] arraySubordinados = new Empleado[LIMITE_SUBORDINADOS];
	private int numeroRealSubordinados;

	public JefeDepartamento(String dni, String nombre, int sueldo, String departamento) throws EmpresaException {
		super(dni, nombre, sueldo);
		this.departamento = departamento;

	}

	public String getDepartamento() {
		return departamento;
	}

	protected void setSueldo(int sueldo) throws EmpresaException {

		if (sueldo < MINIMO_SUELDO_JEFE) {
			throw new EmpresaException("El sueldo no puede ser inferior a " + MINIMO_SUELDO_JEFE);
		}

		super.setSueldo(sueldo);
	}
	
	public void incorporarSubordinado(Empleado subordinado) throws EmpresaException {
		
		if (numeroRealSubordinados == LIMITE_SUBORDINADOS) {
			throw new EmpresaException("Erro, no puedes incorporar mas subordinados");
		}
		
		if (super.getSueldo() < subordinado.getSueldo() ) {
			throw new EmpresaException("Error, un empleado base no puede cobrar mas que un jefe");
		}
		arraySubordinados[numeroRealSubordinados] = subordinado;			
		numeroRealSubordinados++;		
	
	}

	public Empleado[] getArraySubordinados() {
		return arraySubordinados;
	}

	public int getNumeroRealSubordinados() {
		return numeroRealSubordinados;
	}

	public void setArraySubordinados(Empleado[] arraySubordinados) {
		this.arraySubordinados = arraySubordinados;
	}

	@Override
	public void actualizarSueldo() throws EmpresaException {

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
