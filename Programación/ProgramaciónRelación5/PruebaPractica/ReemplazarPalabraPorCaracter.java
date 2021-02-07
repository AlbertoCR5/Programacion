/*
 * Realizar un método llamado censuraCadena que reciba una cadena y devuelva otra donde se
“censura” una palabra. La censura consiste en que esa palabra se sustituye por asteriscos (cada uno
de sus caracteres). No se tendrán cuenta mayúsculas ni minúsculas
 */
package PruebaPractica;

import java.util.Scanner;

public class ReemplazarPalabraPorCaracter {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena;
		String censura;
		String palabraCensurada;

		cadena = solicitarCadena();
		censura = solicitarCensura(cadena);
		palabraCensurada = censurarPalabra(cadena, censura);

		System.out.println(palabraCensurada);
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
	 * Metodo que solicita una plabra que sera reemplazada y comprueba que la
	 * palabra se encuentre en el texto
	 * 
	 * @param cadena
	 * @return censura
	 */
	private static String solicitarCensura(String cadena) {

		String censura;
		boolean aparece = true;
		int i = 0;
		int indice;
		int busqueda = 0;
		char caracter;

		do {
			System.out.println("Introduce la palabra a censurar");
			censura = teclado.nextLine();
			while (i < censura.length() && aparece && true) {
				caracter = censura.charAt(i);
				indice = cadena.indexOf(caracter, busqueda);

				if (indice == -1) {
					aparece = false;
				} else {
					busqueda = indice + 1;
					i++;
				}
			}

		} while (aparece = false);
		return censura;
	}

	/**
	 * Metodo que censura una palabra dentro de una cadena, imprimiendo en pantalla
	 * un * por cada letra de la plabra censurada luego se reemplaza la cadena
	 * oridinal por la nueva con la palabra ya censurada
	 * 
	 * @param cadena
	 * @param censura
	 * @return palabraCensurada
	 */
	private static String censurarPalabra(String cadena, String censura) {

		StringBuilder palabraCensurada = new StringBuilder();

		for (int i = 0; i < censura.length(); i++) {
			palabraCensurada.append('*');
		}

		cadena = cadena.replace(censura, palabraCensurada);

		return cadena;
	}

}
