/*
 * Realizar un programa que lea una cadena de caracteres y muestre cual
es la suma de todos los números que hay en ella.
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio09SumarNumerosCadena {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena;
		int sumaNumeros;

		cadena = solicitarcadena();
		sumaNumeros = trataradena(cadena);

		System.out.println("La suma de los numeros introducidos en la cadena es: " + sumaNumeros);
	}

	/**
	 * Metodo que solicita una cadena
	 * 
	 * @return cadena
	 */
	private static String solicitarcadena() {

		String cadena;

		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();

		return cadena;
	}

	/**
	 * Metodo que calcula la suma de los numeros que hay en una cadena
	 * 
	 * @param cadena
	 * @return sumaNumeros
	 */
	private static int trataradena(String cadena) {

		StringBuilder cadenaNumeros = new StringBuilder();
		int sumaNumeros = 0;
		char caracter;
		boolean hayDigito = false;

		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);

			if (Character.isDigit(caracter)) {
				cadenaNumeros.append(caracter);
				hayDigito = true;
			} else {
				if (hayDigito == true) {
					sumaNumeros = sumaNumeros + Integer.parseInt(cadenaNumeros.toString());
					borrarSbNumeros(cadenaNumeros);
					hayDigito = false;
				}
			}

		}

		// Si hay un numero al final
		if (hayDigito == true) {
			sumaNumeros = sumaNumeros + Integer.parseInt(cadenaNumeros.toString());
		}
		return sumaNumeros;
	}

	/**
	 * Metodo que borra la cadena que sobra
	 * 
	 * @param cadenaNumeros
	 */
	private static void borrarSbNumeros(StringBuilder cadenaNumeros) {

		cadenaNumeros.delete(0, cadenaNumeros.length());
	}

}
