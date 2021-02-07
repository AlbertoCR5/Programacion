/*
 * Diseñar un programa que determine la cantidad de vocales diferentes,
que tiene una palabra o frase introducida por teclado.
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio06VocalesDiferentes {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena;
		String vocales;
		int vocalesDiferentes;

		cadena = solicitarCadena();
		vocales = asignamientoVocales();
		vocalesDiferentes = tratarCadena(cadena, vocales);

		System.out.println("La cadena " + cadena + ", contiene " + vocalesDiferentes + " vocales diferentes.");

	}

	/**
	 * Metodo que solicita una cadena y la pasa a mayusculas
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
	 * Metodo que asigna vocales a un String
	 * 
	 * @return vocales
	 */
	private static String asignamientoVocales() {
		
		String vocales = "AEIOU";

		return vocales;
	}

	/**
	 * Metodo que una vez dada la cadena y asignada las vocales comprueba cuantas
	 * diferentes hay (distingue tildes :'( )
	 * 
	 * @param cadena
	 * @param vocales
	 * @return vocalesDiferentes
	 */
	private static int tratarCadena(String cadena, String vocales) {


		int vocalesDiferentes = 0;
		char vocal;
		
		for (int i = 0; i < vocales.length(); i++) {
			vocal = vocales.charAt(i);
			
			if (cadena.indexOf(vocal) != -1) {
				vocalesDiferentes++;
			}
		}

		return vocalesDiferentes;
	}

}
