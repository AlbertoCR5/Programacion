package Ejercicio4Repaso;

import java.util.Scanner;

public class MainJarra {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int capacidad;
		int opcion;
		Jarra jarra1;
		Jarra jarra2;

		try {
			capacidad = crearJarra();
			jarra1 = new Jarra(capacidad);
			capacidad = crearJarra();
			jarra2 = new Jarra(capacidad);

			do {
				opcion = mostrarMenu();
				tratarMenu(jarra1, jarra2, opcion);
			} while (opcion < 1 || opcion > 5);

		} catch (JarraException e) {
			System.out.println(e.getMessage());
		}

	}

	private static int crearJarra() {

		int capacidad;

		System.out.println("Introduce la capacidad de la jarra");
		capacidad = Integer.parseInt(teclado.nextLine());

		return capacidad;
	}

	private static int mostrarMenu() {

		int opcion;

		do {
			System.out.println("¿Que desea realizar con la jarra?" + "\n" + "LLenar jarra (1)" + "\n"
					+ "Vaciar jarra (2)" + "\n" + "Volcar jarra1 en jarra2 (3)" + "\n" + "Volcar jarra2 en jarra1 (4)"
					+ "\n" + "Ver estado de las jarras (5)" + "\n" + "Salir (6)");
			System.out.println("Seleccione una opcion");
			opcion = teclado.nextInt();
		} while (opcion != 6);

		return opcion;

	}

	private static void tratarMenu(Jarra jarra1, Jarra jarra2, int opcion) {
		
		int respuesta;
		
		try {

			switch (opcion) {
			case 1: // llenar jarra
				respuesta = elegirJarra("¿Que jarra va a llenar? (1) Jarra 1, (2) Jarra 2");
				if (respuesta == '1') {
					jarra1.llenarJarra();
				} else {
					jarra2.llenarJarra();
				}
				break;

			case 2: // vaciar jarra
				respuesta = elegirJarra("¿Que jarra va a vaciar? (1) Jarra 1, (2) Jarra 2");
				if (respuesta == '1') {
					jarra1.vaciarJarra();
				} else {
					jarra2.vaciarJarra();
				}
				break;

			case 3: 
				jarra1.volcarJarra(jarra2);
				break;

			case 4:
				jarra2.volcarJarra(jarra1);
				break;

			case 5:
				System.out.println("Jarra 1: " + jarra1 + "\n" + "Jarra 2: " + jarra2);
				System.out.println();
				break;

			case 6:
				System.out.println("Litros de agua consumida " + Jarra.getTotalAguaConsumida());
				System.out.println("Hasta Luego");
				break;

			}

		} catch (JarraException e) {
			System.out.println(e.getMessage());
		}


	}

	private static int elegirJarra(String string) {
		
		int respuesta;
		
		do {
			System.out.println(string);
			respuesta = Integer.parseInt(teclado.nextLine());
		}while (respuesta < 1 || respuesta > 2);
		
		return respuesta;
	}

}
