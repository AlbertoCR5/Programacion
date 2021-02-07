package Ejercicio2;

import java.util.Scanner;

public class MainPuntoLinea {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;
		Linea linea;

		try {

			linea = crearLinea();

			do {
				mostrarMenu();
				opcion = elegirOpcion();
				tratarMenu(opcion, linea);
			} while (opcion != 3);

		} catch (PuntoLineaException e) {
			System.out.println(e.getMessage());
		}

	}

	private static Linea crearLinea() throws PuntoLineaException {

		Linea linea1;
		Punto puntoOrigen, puntoDestino;

		puntoOrigen = crearPunto("PrimerPunto: ");
		puntoDestino = crearPunto("Segundo punto: ");

		linea1 = new Linea(puntoOrigen, puntoDestino);

		return linea1;
	}

	private static Punto crearPunto(String msg) {

		Punto punto;
		double coordenadaX, coordenadaY;

		System.out.println();

		coordenadaX = solicitarDouble("Introduzca la coordenada x del punto");
		coordenadaY = solicitarDouble("Introduzca la coordenada y del punto");

		punto = new Punto(coordenadaX, coordenadaY);

		return punto;
	}

	public static void mostrarMenu() {

		System.out.println("Menu");
		System.out.println(
				"(1)Mover línea: " + "\n" + "A-Arriba" + "\n" + "B-aBajo" + "\n" + "I-Izquierda" + "\n" + "D-Derecha");
		System.out.println("(2)Mostrar línea");
		System.out.println("(3)Salir");

	}

	public static int elegirOpcion() {

		int opcion;

		do {
			opcion = solicitarInt("Elige una opcion");
		} while (opcion < 1 || opcion > 3);

		return opcion;
	}

	private static void tratarMenu(int opcion, Linea linea1) {

		char direccionMovimiento;
		double movimiento;

		try {

			switch (opcion) {
			case '1': {
				direccionMovimiento = solicitarMovimiento();
				movimiento = solicitarDouble("¿Á cuanto los desea mover? Introduce un dato positivo");

				switch (direccionMovimiento) {
				case 'A':
					linea1.moverArriba(movimiento);
					break;

				case 'B':
					linea1.moverAbajo(movimiento);
					break;

				case 'D':
					linea1.moverDerecha(movimiento);
					break;

				case 'I':
					linea1.moverIzquierda(movimiento);
					break;
				}
				break;
			}
			case 2: {
				System.out.println(linea1);
				break;
			}
			}

		} catch (PuntoLineaException e) {
			System.out.println(e.getMessage());
		}
	}

	private static char solicitarMovimiento() {

		char direccionMovimiento;

		do {
			System.out.println("Introduzca donde quieres hacer el movimiento");
			direccionMovimiento = teclado.nextLine().toUpperCase().charAt(0);
		} while (direccionMovimiento != 'A' && direccionMovimiento != 'B' && direccionMovimiento != 'D'
				&& direccionMovimiento != 'I');

		return direccionMovimiento;
	}

	private static int solicitarInt(String mensaje) {

		int numero = 0;
		boolean error = false;

		do {
			try {
				error = false;
				System.out.println(mensaje);
				numero = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Debe introducer un número");
				error = true;
			}
		} while (error == true);

		return numero;
	}

	public static double solicitarDouble(String mensaje) {

		double numero = 0;
		boolean error = false;

		do {
			try {
				error = false;
				System.out.println(mensaje);
				numero = Double.parseDouble(teclado.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Debe introducer un número");
				error = true;
			}
		} while (error == true);

		return numero;
	}

}
