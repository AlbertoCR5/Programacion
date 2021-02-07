/*
 * Diseñar un programa que determine la cantidad de vocales diferentes,
que tiene una palabra o frase introducida por teclado. Por ejemplo, la
cadena “Abaco”, devolvería 2.
 */
package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio06 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		String cadena;
		int vocalesDiferentes;
		
		cadena = solicitarCadena();
		vocalesDiferentes = cuentaVocalesDiferentes(cadena);

		System.out.println("La frase tiene " + vocalesDiferentes + " vocales diferentes.");
	}

/**
 * Metodo que solicita una cadena
 * @return cadena
 */
	private static String solicitarCadena() {
		
		String cadena;
		
		do {
		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();
		} while (cadena.length() == 0);
		
		return cadena;
	}

	/**
	 * Metodo que cuenta el numero de vocales diferentes que aparecen en la cadena
	 * @param cadena 
	 * @param cadena
	 * @return numero vocales diferentes
	 */
	private static int cuentaVocalesDiferentes(String cadena) {
		
		String vocales = "AEIOU";
		String mayusculas;
		int totalVocales = 0;
		char vocal;
		
		mayusculas = cadena.toUpperCase();
		
		for (int i = 0; i < vocales.length(); i++) {
			
			vocal = vocales.charAt(i);
			
			if (mayusculas.indexOf(vocal) !=-1) {//encuentra vocal
				totalVocales++;
			}
		}

		return totalVocales;
	}

}
