package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class MainRefran {

	private static final int MAXIMO_REFRANES = 50;
	private static final int PRIMERA_OPCION_MENU = 1;
	private static final int MENU = 4;

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Refran[] refranes = new Refran[MAXIMO_REFRANES];
		int numeroRefranes = 0;
		int opcion;

		do {
			opcion = mostrarMenu();
			numeroRefranes = tratarMenu(opcion, refranes, numeroRefranes);
		} while (opcion != MENU);
	}

	private static int mostrarMenu() {

		int opcion;

		do {
			System.out.println("Bienvenido al refranero, elija una opcion");
			System.out.println("(1) Nuevo refran");
			System.out.println("(2) Buscar refran");
			System.out.println("(3) Listar refranes");
			System.out.println("(4) Salir");
			opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < PRIMERA_OPCION_MENU || opcion > MENU);

		return opcion;
	}

	private static int tratarMenu(int opcion, Refran[] refranes, int numeroRefranes) {

		try {

			switch (opcion) {

			case 1: //Nuevo refran
				if (numeroRefranes == MAXIMO_REFRANES) {
					System.out.println("Se ha superado el numero maximo de refranes");
				} else {
					Refran refran = new Refran(solicitarTexto("Introduzca el texto del refran"), solicitarPopularidad());

					if (!estaRepetido(refran, refranes, numeroRefranes)) {
						refranes[numeroRefranes] = refran;
						numeroRefranes++;
					} else {
						System.out.println("Repetido, el refran introducido ya se encuentra en la lista");
					}
				}
				break;

			case 2:
				String palabra = solicitarTexto("Introduzca la palabra a buscar");
				buscarRefranPorPalabra(refranes, numeroRefranes, palabra);
				break;

			case 3:
				mostrarRefranesOrdenados(refranes, numeroRefranes);
				break;
			}

		} catch (RefranException e) {
			System.out.println(e.getMessage());
		}

		return numeroRefranes;
	}

	private static String solicitarTexto(String msg) {

		String texto;
		
		System.out.println(msg);
		texto = teclado.nextLine();

		return texto;
	}

	private static int solicitarPopularidad() {

		int popularidad;

		do {
			System.out.println("popularidad:");
			popularidad = Integer.parseInt(teclado.nextLine());
		} while (popularidad < 0 || popularidad > 100);

		return popularidad;
	}

	private static void buscarRefranPorPalabra(Refran[] refranes, int numeroRefranes, String palabra) {

		boolean encontrado = false;
		Refran refranEncontrado = null;
		palabra = palabra.toUpperCase();

		for (int i = 0; i < numeroRefranes && !encontrado; i++) {

			if (refranes[i].getTexto().contains(palabra)) {
				refranEncontrado = refranes[i];
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se ha encontrado refran con la palabra " + palabra);
		} else {
			System.out.println("Refran encontrado: " + refranEncontrado.getTexto());
		}
	}

	private static void mostrarRefranesOrdenados(Refran[] refranes, int numeroRefranes) {

		Refran[] arrayCopia = new Refran[numeroRefranes];

		// Copia de arrayRefranes al arrayCopia
		for (int i = 0; i < numeroRefranes; i++) {
			arrayCopia[i] = refranes[i];
		}

		Arrays.sort(arrayCopia);
		for (int i = 0; i < numeroRefranes; i++) {
			System.out.println(arrayCopia[i]);
		}
	}

	private static boolean estaRepetido(Refran nuevoRefran, Refran[] refranes, int numeroRefranes) {

		boolean repetido = false;

		for (int i = 0; i < numeroRefranes && repetido == false; i++) {

			if (nuevoRefran.equals(refranes[i])) {
				repetido = true;
			}

		}

		return repetido;
	}

}