/*
 * Crear un método que, tomando una cadena de texto como entrada,
construya y devuelva otra cadena formada de la siguiente manera: el
método debe colocar todas las consonantes al principio y todas las
vocales al final de la misma, eliminando los blancos.
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio07OrdenCadena {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena, cadenaModificada;

		cadena = solicitarCadena();
		cadenaModificada = modificarCadena(cadena);
		
		System.out.println(cadenaModificada);
	}

	/**
	 * Metodo que solicita una cadena y la devuelve en mayusculas
	 * 
	 * @return cadena
	 */
	private static String solicitarCadena() {

		String cadena;

		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine().toUpperCase();

		return cadena;
	}

	/**
	 * Metodo que dada una cadena, devuelve otra con todas las consonantes al
	 * principio y las vocales al final de esta
	 * 
	 * @param cadena
	 * @return cadenaModificada
	 */
	private static String modificarCadena(String cadena) {

		StringBuilder sbConsonantes = new StringBuilder();
		StringBuilder sbVocales = new StringBuilder();
		char caracter;

		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);

			if (Character.isLetter(caracter)) {
				if (esVocal(caracter)) {
					sbVocales.append(caracter);
				} else {
					sbConsonantes.append(caracter);
				}
			}
		}

		sbConsonantes.append(sbVocales);

		return sbConsonantes.toString();
	}

	/**
	 * Metodo que compruba si un caracter es una vocal
	 * 
	 * @param caracter
	 * @return verdadero si es una vocal, falso si no lo es
	 */
	public static boolean esVocal(char caracter) {

		boolean resultado;
		String vocales = "AEIOUÁÉÍÓÚ";

		if (vocales.contains(String.valueOf(caracter)) == true) { // Si es vocal
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

}
