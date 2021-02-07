package ProgramaciónRelación1;

import java.util.Scanner;

public class Ejercicio04 {

	// Realizar un programa que lea la edad de una persona menor a 100 años e
	// informe de si es
	// un niño (0-12 años), un adolescente (13-17), un joven (18-29) o un adulto.

	// CONSTANTES
	private static final int EDAD_MAXIMA = 99;
	private static final int LIMITE_NINHO = 12;
	private static final int LIMITE_ADOLESCENTE = 17;
	private static final int LIMITE_JOVEN = 29;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		int edad;

		// AQUI EMPIEZA EL PROGRAMA

		// INICIO
		System.out.println("Introduce la edad, mÃ¡ximo " + EDAD_MAXIMA);
		edad = Integer.parseInt(teclado.nextLine()); // LEER

		if (edad < 0 || edad > EDAD_MAXIMA) {
			System.out.println("Edad incorrecta, no estÃ¡ en el rango indicado");
		} else {
			if (edad <= LIMITE_NINHO) {
				System.out.println("Es un niÃ‘o");
			} else {
				if (edad <= LIMITE_ADOLESCENTE) {
					System.out.println("Es un adolescente");
				} else {
					if (edad <= LIMITE_JOVEN) {
						System.out.println("Es un joven");
					} else {
						System.out.println("Es un adulto");

					}
				}

			}

		}

	}

}
