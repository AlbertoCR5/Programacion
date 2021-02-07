/*
*Realizar un programa que permita gestionar el saldo de una cuenta corriente. Una
*vez introducido el saldo inicial, se mostrará un menú que permitirá efectuar las
*siguientes operaciones:
*1. Hacer un reintegro, se pedirá la cantidad a retirar.
*2. Hacer un ingreso, se pedirá la cantidad a ingresar.
*3. Consultar el saldo y el número de reintegros e ingresos
*realizados.
*4. Finalizar las operaciones. Debe confirmar si realmente desea
*salir e informar del saldo al final de todas las operaciones. 
*/
package Ejercicio2;

public class Cuenta {

	// Atributos
	private double saldo;
	private int contadorIngresos, contadorReintegros;
	private String titular;

	// Constructores
	public Cuenta(double actualizarSaldo, String nuevoTitular) {

		saldo = actualizarSaldo;
		titular = nuevoTitular;

	}

	public Cuenta(String titular) {

	}

	public String getTitular() {

		return titular;

	}

	public double getSaldo() {

		return saldo;

	}

	public int getContadorIngresos() {

		return contadorIngresos;

	}

	public int getContadorReintegros() {

		return contadorReintegros;

	}

	public String toString() {

		String info;

		info = "El saldo de la cuenta del titular " + titular + " es: " + saldo + " y ha realizado " + contadorIngresos
				+ " ingresos y " + contadorReintegros + " reintegros.";

		return info;

	}

	public void ingresarDinero(double ingresarDinero) {

		saldo = saldo + ingresarDinero;

		contadorIngresos++;

	}

	public void retirarDinero(double retirarDinero) throws CuentaException {

		if (saldo < retirarDinero) {
			throw new CuentaException("Cantidad incorrecta"); // Exepcion
		} else {
			saldo = saldo - retirarDinero;

			contadorReintegros++;
		}

	}

}
