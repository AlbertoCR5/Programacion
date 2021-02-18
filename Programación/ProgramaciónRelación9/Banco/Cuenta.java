package Banco;

/**
 * Realizar un programa que permita gestionar el saldo de una cuenta corriente.
 * Una vez introducido el saldo inicial, se mostrará un menú que permitirá
 * efectuar las siguientes operaciones: 1. Hacer un reintegro, se pedirá la
 * cantidad a retirar. 2. Hacer un ingreso, se pedirá la cantidad a ingresar. 3.
 * Consultar el saldo y el número de reintegros e ingresos realizados. 4.
 * Finalizar las operaciones. Debe confirmar si realmente desea salir e informar
 * del saldo al final de todas las operaciones. Debe realizarse una clase Cuenta
 * y la clase Principal.
 */
public class Cuenta {

	// Protected metodo protegido(que solo los tienen los metodos que lo llaman)
	protected double saldo;
	private String titular;
	private int contadorIngresos;
	protected int contadorReintegros;

	// Contructores
	public Cuenta(String titular) { // Porque dos constructores?
		saldo = 0;
		contadorIngresos = 0;
		contadorReintegros = 0;
		this.titular = titular;
	}

	public Cuenta(String titular, double saldo) throws CuentaException {

		setSaldo(saldo);

		this.titular = titular;

	}

	// Métodos gets
	public String getTitular() {
		return titular;
	}

	// Final blinda un metodo para que no se pueda usar o modificar desde otra clase
	public final double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) throws CuentaException {

		if (saldo < 0) {
			throw new CuentaException("No puede crear una  cuenta con un saldo negativo");
		}
		this.saldo = saldo;
	}

	public int getContadorIngresos() {
		return contadorIngresos;
	}

	public int getContadorReintegros() {
		return contadorReintegros;
	}

	/**
	 * Método que realiza un reintegro en la cuenta.
	 * 
	 * @param reintegro
	 * @throws CuentaException
	 */
	public void realizarReintegro(double reintegro) throws CuentaException {
		if (reintegro <= 0) {
			throw new CuentaException("El reintegro solo puede realizarse con cantidades positivas.");
		}
		if (reintegro > this.saldo) {
			throw new CuentaException("No tienes suficiente saldo.");
		}

		this.saldo = this.saldo - reintegro;
		this.contadorReintegros++;
	}

	/**
	 * Método que realiza un ingreso en la cuenta
	 * 
	 * @param ingreso
	 * @throws CuentaException
	 */
	public void realizarIngreso(double ingreso) throws CuentaException {
		if (ingreso <= 0) {
			throw new CuentaException("El ingreso solo puede realizarse con cantidades positivas.");
		}
		this.saldo = this.saldo + ingreso;
		this.contadorIngresos++;
	}

	/**
	 * Método que muestra el saldo y el número de ingresos y reintegros.
	 */
	public String toString() {
		return "La cuenta perteneciente a " + titular + " con saldo de " + saldo + "€, ha realizado "
				+ contadorReintegros + " de reintegros,  y " + contadorIngresos + " de ingresos.";
	}
}