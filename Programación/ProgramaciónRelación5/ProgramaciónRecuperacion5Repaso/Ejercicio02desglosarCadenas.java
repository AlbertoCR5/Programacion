/*
 *  Realizar un programa que solicite una cadena de caracteres por teclado
y visualice por pantalla cuántos de esos caracteres son letras
mayúsculas, cuántos son letras minúsculas y cuántos son caracteres
numéricos
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio02desglosarCadenas {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena;
		int mayuscula, minuscula, digito;

		cadena = solicitarCadena();
		mayuscula = contarMayusculas(cadena);
		minuscula = contarMinusculas(cadena);
		digito = contarDigitos(cadena);

		System.out.println("La frase: " + cadena + " contiene: " + mayuscula + " mayúsculas, " + minuscula
				+ " minúsculas, y " + digito + " dígitos");
	}

	/**
	 * Metodo que solicita una cadena
	 * 
	 * @return cadena
	 */
	private static String solicitarCadena() {

		String cadena;

		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();

		return cadena;
	}

	/**
	 * Metodo que una vez dada la cadena cuenta las mayusculas que hay en ella
	 * 
	 * @param cadena
	 * @return mayuscula 
	 */
	private static int contarMayusculas(String cadena) {

		int mayuscula = 0;
		char caracter;
		int i;

		for (i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);

			if (Character.isUpperCase(caracter)) {
				mayuscula++;
			}
		}

		return mayuscula;
	}

	/**
	 * Metodo que una vez dada la cadena cuenta las minusculas que hay en ella
	 * 
	 * @param cadena
	 * @return minuscula
	 */
	private static int contarMinusculas(String cadena) {

		int minuscula = 0;
		int i;
		char caracter;

		for (i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);

			if (Character.isLowerCase(caracter)) {
				minuscula++;
			}
		}

		return minuscula;
	}

	/**
	 * Metodo que una vez dada la cadena cuenta los digitos que hay en ella
	 * 
	 * @param cadena
	 * @return digito
	 */
	private static int contarDigitos(String cadena) {

		int digito = 0;
		int i;
		char caracter;

		for (i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);

			if (Character.isDigit(caracter)) {
				digito++;
			}
		}

		return digito;
	}

}
