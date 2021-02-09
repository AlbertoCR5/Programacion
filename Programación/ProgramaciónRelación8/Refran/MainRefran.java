package Refran;

import java.util.Arrays;
import java.util.Scanner;

public class MainRefran {

	
	private static Scanner teclado = new Scanner(System.in);
	
	private static final int MAXIMO_REFRANES = 50;
	private static final int PRIMERA_OPCION_MENU = 1;
	private static final int ULTIMA_OPCION_MENU = 4;
	
	public static void main(String[] args) {
		
		Refran[] refranes = new Refran[MAXIMO_REFRANES];
		int numeroRefranes = 0;
		int opcion;
		
		
		do {
			opcion = mostrarMenu();
			numeroRefranes = tratarMenu(opcion, refranes, numeroRefranes);
		} while(opcion != ULTIMA_OPCION_MENU);
		
	}

	private static int mostrarMenu() {

		int opcion;
		
		do {
			System.out.println("1.Nuevo refran");
			System.out.println("2.Buscar refran");
			System.out.println("3.Listar refranes");
			System.out.println("4.Salir");
			System.out.println("Introduce opcion: ");
			opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < PRIMERA_OPCION_MENU || opcion > ULTIMA_OPCION_MENU);
		return opcion;
	}

	private static int tratarMenu(int opcion, Refran[] refranes, int numeroRefranes) {

		try {
			switch (opcion) {
			case 1: // nuevo refran
				if (numeroRefranes == MAXIMO_REFRANES)
					System.out.println("Se ha superado el número máximo de refranes");
				else {
					Refran refran = new Refran(solicitarTexto("Texto del refran:"), solicitarPopularidad("Popularidad (0-100)"));

					if (!estaRepetido(refran, refranes, numeroRefranes)) {
						refranes[numeroRefranes] = refran;
						numeroRefranes++;
					} else {
						System.out.println("Ya esta repetido");
					}
				}
				break;

			case 2:
				String palabra=solicitarTexto("Introduzca la palabra a buscar: ");
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

	private static String solicitarTexto(String string) {

		String texto;
		
		System.out.println(string);
		texto = teclado.nextLine();
		
		return texto;
	}



	private static int solicitarPopularidad(String string) {
		
		int popularidad;

		
		System.out.println(string);
		popularidad = Integer.parseInt(teclado.nextLine());

		return popularidad;
	}

	private static boolean estaRepetido(Refran nuevoRefran, Refran[] refranes, int numeroRefranes) {

		boolean refranRepetido = false;
		
		for (int i = 0; i <numeroRefranes && refranRepetido == false; i++) {
			if (nuevoRefran.equals(refranes[i])) {
				refranRepetido = true;
			}
		}
		return refranRepetido;
	}

	private static void buscarRefranPorPalabra(Refran[] refranes, int numeroRefranes, String palabra) {
		
		boolean palabraEncontrada = false;
		Refran refranEncontrado = null;
		
		palabra = palabra.toUpperCase();
		for (int i = 0; i < numeroRefranes && !palabraEncontrada; i++) {
			
			if (refranes[i].getTexto().contains(palabra)) {
				refranEncontrado = refranes[i];
				palabraEncontrada = true;
			}
			
		}
		
		if (!palabraEncontrada) {
			System.out.println("No se ha encontrado refran que contenga la palabra" + palabra);
		}
		else {
			System.out.println("Refran encontrado: " + refranEncontrado.getTexto());
		}
	}

	private static void mostrarRefranesOrdenados(Refran[] refranes, int numeroRefranes) {

		Refran[] arrayCopia = new Refran[numeroRefranes];

		// Copiar de el arrayRefranes al arrayCopia
		for (int i = 0; i < numeroRefranes; i++) {
			arrayCopia[i] = refranes[i];
		}

		Arrays.sort(arrayCopia);
		for (int i = 0; i < numeroRefranes; i++) {
			System.out.println(arrayCopia[i]);
		}
		
	}

}
