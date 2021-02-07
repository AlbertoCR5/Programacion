/*
 * Realiza un programa principal que solicite una cadena con todos sus caracteres numéricos.
 Si la cadena tiene caracteres no numéricos se mostrará un mensaje de error.
 Si la cadena está formada por caracteres numéricos, se mostrará la cadena
resultante de formatear en miles la original
 */
package PruebaPractica;

import java.util.Scanner;

public class FormateoMiles {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String numero;
		String numeroFormateado;

		numero = solicitarNumero();

		if (comprobarNumero(numero)) {
			numeroFormateado = formatearNumero(numero);
			System.out.println(numeroFormateado);
		} else {
			System.out.println("Error, no es una cadena numerica");
		}

	}

	private static String solicitarNumero() {

		String numero;

		System.out.println("Introduce una cadena de numeros");
		numero = teclado.nextLine();

		return numero;
	}

	public static boolean comprobarNumero(String numero) {

		boolean correcta = true;
		char caracter;

		for (int i = 0; i < numero.length(); i++) {
			caracter = numero.charAt(i);

			if (Character.isDigit(caracter) == false) {

				correcta = false;

			}
		}

		return correcta;
	}

	private static String formatearNumero(String numero) {

		StringBuilder sbNumeroFormateado = new StringBuilder(numero);

		sbNumeroFormateado.reverse();

		for (int i = 3; i < sbNumeroFormateado.length(); i = i + 4) {
			sbNumeroFormateado.insert(i, '.');
		}

		sbNumeroFormateado.reverse();

		return sbNumeroFormateado.toString();
	}

}
