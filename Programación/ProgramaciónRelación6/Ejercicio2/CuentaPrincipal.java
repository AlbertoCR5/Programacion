package Ejercicio2;

import java.util.Scanner;

public class CuentaPrincipal {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Cuenta cuenta;
		double saldo;
		String titular;
		double ingresarDinero, retirarDinero;

		System.out.println("Saldo de la cuenta");
		saldo = Integer.parseInt(teclado.nextLine());

		Cuenta cuenta1 = new Cuenta(saldo, "Tomás Jiménez");

		System.out.println("¿Que operación desea realizar?");

		int numero;
		do {
			System.out.println("Ingresar Dinero (1) " + "\n" + "Retirar Dinero (2)" + "\n" + "salir (3)");
			numero = Integer.parseInt(teclado.nextLine());

			try {
				switch (numero) {

				case (1):
					System.out.println("Introduce cantidad a ingresar");
					ingresarDinero = Integer.parseInt(teclado.nextLine());
					cuenta1.ingresarDinero(ingresarDinero);
					cuenta1.getContadorIngresos();
					System.out.println(cuenta1.toString());
					System.out.println();
					break;

				case (2):

					System.out.println("Introduce la cantidad a retirar");
					retirarDinero = Integer.parseInt(teclado.nextLine());
					cuenta1.retirarDinero(retirarDinero);
					cuenta1.getContadorReintegros();
					System.out.println(cuenta1.toString());
					System.out.println();

					break;

				case (3):
					System.out.println(cuenta1.toString());
					System.out.println("Fin de programa");
				}

			} catch (CuentaException exc) {
				System.out.println(exc.getMessage());
			}
		} while (numero != 3);

	}

}
