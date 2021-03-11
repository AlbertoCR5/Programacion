package Empresa;

public enum TipoPuesto {

	ADMINISTRATIVO(Empleado.SUELDO_INICIAL_ADMINISTRATIVO), 
	OPERARIO(Empleado.SUELDO_INICIAL_OPERARIO),
	CONTABLE(Empleado.SUELDO_INICIAL_CONTABLE);

	private int sueldoInicial;

	TipoPuesto(int sueldoInicial) {
		this.sueldoInicial = sueldoInicial;
	}

	public int getSueldoInicial() {
		return sueldoInicial;
	}
}
