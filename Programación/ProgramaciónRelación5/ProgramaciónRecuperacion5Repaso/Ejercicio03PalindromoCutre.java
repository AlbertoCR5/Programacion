/*
 * Escribir un programa que lea una cadena de caracteres por teclado, y
determine si es un palíndromo o no.
Se denomina palíndromo, a una palabra o frase que, ignorando los
blancos, se lee igual de izquierda a derecha que de derecha a izquierda
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio03PalindromoCutre {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		String cadena;
		
		cadena = solicitarCadena();

		
			if (esPalindromo(cadena) == true) {
				System.out.println("La frase: " + cadena + " es un palindromo");
			}
			else {
				System.out.println("La frase: " + cadena + " no es un palindromo");
			}
	}

	private static String solicitarCadena() {

		String cadena;
		
		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();

		return cadena;
	}

	private static boolean esPalindromo(String cadena) {

		boolean esPalindromo = true;
		char caracter;
		char caracterBis;
		int j = cadena.length()-1;
		
		for (int i = 0; i < cadena.length() && esPalindromo == true; i++) {
			caracter = cadena.charAt(i);
			
			caracterBis = cadena.charAt(j);
			if (caracter != caracterBis) {
				esPalindromo = false;
			}				
			j--;
		}
		
		return esPalindromo;
	}

}
