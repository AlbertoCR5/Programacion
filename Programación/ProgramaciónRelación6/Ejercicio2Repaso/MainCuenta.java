package Ejercicio2Repaso;

import java.util.Scanner;

public class MainCuenta {

	private final static int INICIO_MENU = 1;
	private final static int SALIDA_MENU = 4;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Cuenta cuenta = null;
		double saldoInicial;
		int opcion;

		try {

			saldoInicial = crearCuenta();
			cuenta = new Cuenta(saldoInicial);
			do {
				opcion = mostrarMenu();
				tratarMenu(opcion, cuenta);
			} while (opcion != SALIDA_MENU);

		} catch (CuentaException e) {
			System.out.println(e.getMessage());
		}

	}

	private static double crearCuenta() {

		double saldoInicial;

		System.out.println("Bienvenido");
		System.out.println("Introduce tu saldo inicial");
		saldoInicial = Double.parseDouble(teclado.nextLine());

		return saldoInicial;
	}

	private static int mostrarMenu() {

		int opcion;

		do {
			System.out.println("Bienvenido al menu, que operacion desea realizar");
			System.out.println("(1) Retirar dinero");
			System.out.println("(2) Ingresar dinero");
			System.out.println("(3) Consulta de saldo y movimientos");
			System.out.println("(4) Salir");
			opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < INICIO_MENU || opcion > SALIDA_MENU);

		return opcion;
	}

	private static int tratarMenu(int opcion, Cuenta cuenta) {

		double cantidad;
		char caracter = 'N';

		try {

			switch (opcion) {

			case 1:
				cantidad = solicitarCantidad("Cuanto dinero desea retirar");
				cuenta.realizarReintegro(cantidad);
				break;

			case 2:
				cantidad = solicitarCantidad("Cuento dinero desea ingresar");
				cuenta.realizarIngreso(cantidad);
				break;

			case 3:
				System.out.println(cuenta.toString());
				break;

			case 4:
				caracter = solicitarCaracter("¿Desea salir? (S/N)");
				if (caracter == 'N') {
					mostrarMenu();
				} else {
					System.out.println("Su saldo es: " + cuenta.getSaldo() + "€, adios.");
				}
				break;
			}

		} catch (CuentaException e) {
			System.out.println(e.getMessage());
		}

		return opcion;
	}

	private static char solicitarCaracter(String mensaje) {

		char caracter;
		do {
			System.out.println(mensaje);
			caracter = teclado.nextLine().toUpperCase().charAt(0);
		} while (caracter != 'S' && caracter != 'N');

		return caracter;

	}

	private static double solicitarCantidad(String mensaje) {

		double cantidad;

		System.out.println(mensaje);
		cantidad = Double.parseDouble(teclado.nextLine());

		return cantidad;
	}

}
