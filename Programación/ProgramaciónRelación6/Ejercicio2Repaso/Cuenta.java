package Ejercicio2Repaso;

public class Cuenta {

	private final int SALDO_MINIMO = 0;
	private double saldo;
	private int numeroIngresos;
	private int numeroReintegros;

	public Cuenta() {

		saldo = 0;
		numeroIngresos = 0;
		numeroReintegros = 0;
	}

	public Cuenta(double saldo) throws CuentaException {

		if (saldo < SALDO_MINIMO) {
			throw new CuentaException("Error, saldo insuficiente" + saldo);
		}

		this.saldo = saldo;
		numeroIngresos = 0;
		numeroReintegros = 0;

	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumeroIngresos() {
		return numeroIngresos;
	}

	public int getNumeroReintegros() {
		return numeroReintegros;
	}

	public String toString() {
		return "Disponse de un saldo de: " + saldo + "€. Has realizado " + numeroIngresos + " ingresos, y  "
				+ numeroReintegros + " reintegros.";

	}

	public void realizarIngreso(double ingreso) throws CuentaException {

		if (ingreso <= SALDO_MINIMO) {
			throw new CuentaException("Error, un ingreso debe ser positivo " + ingreso);
		}

		this.saldo = this.saldo + ingreso;
		this.numeroIngresos++;

	}

	public void realizarReintegro(double reintegro) throws CuentaException {

		if (reintegro > saldo) {
			throw new CuentaException("Error, cantidad superior al saldo " + reintegro + " tu saldo es: " + saldo);
		}

		if (reintegro <= SALDO_MINIMO) {
			throw new CuentaException("Error, debes retirar una cantidad positiva " + reintegro);
		}
		
		this.saldo = this.saldo - reintegro;
		this.numeroReintegros++;
	}

}
