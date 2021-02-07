package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio03Palindromo {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena, cadenaSinEspacios;

		cadena = solicitarCadena();
		cadenaSinEspacios = quitarEspacios(cadena);

		if (esONoPalindromo(cadenaSinEspacios) == true) {
			System.out.println("La frase: " + cadena + " es un palindromo");
		} else {
			System.out.println("La frase: " + cadena + " no es un palindromo");
		}

	}

	/**
	 * Metodo que solicita una cadena
	 * 
	 * @return cadena
	 */
	private static String solicitarCadena() {

		String cadena;

		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();

		return cadena;
	}

	/**
	 * Metodo que dada una cadena, la pasa a mayuscula y elimina los espacios
	 * 
	 * @param cadena
	 * @return cadenaSinEspacios
	 */
	private static String quitarEspacios(String cadena) {

		String cadenaSinEspacios;

		cadenaSinEspacios = cadena.replaceAll(" ", "");
		cadenaSinEspacios = cadenaSinEspacios.toUpperCase();

		return cadenaSinEspacios;
	}

	/**
	 * Metodo que comprueba que el texto introducido sea un palindromo o no
	 * 
	 * @param cadenaSinEspacios
	 * @return esPalindromo, true o false
	 */
	private static boolean esONoPalindromo(String cadenaSinEspacios) {

		boolean esPalindromo = true;
		int inicio = 0;
		int fin = cadenaSinEspacios.length() - 1;
		char caracterIni, caracterFin;

		while (inicio < fin && esPalindromo == true) {
			caracterIni = cadenaSinEspacios.charAt(inicio);
			caracterFin = cadenaSinEspacios.charAt(fin);
			if (caracterIni != caracterFin) {
				esPalindromo = false;
			}
			inicio++;
			fin--;
		}
		return esPalindromo;
	}

}
