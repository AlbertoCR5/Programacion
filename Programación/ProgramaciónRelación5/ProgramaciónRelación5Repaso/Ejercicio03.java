/*Escribir un programa que lea una cadena de caracteres
por teclado, y determine si es un palíndromo o no*/

package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio03 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {

		String cadena;
		
		cadena = solicitarCadena();
		
		if (determinaPalindromo(cadena) == true) 
			System.out.println("La frase " + cadena + " es un palindromo.");
		
		else 
			System.out.println("La frase " + cadena + " no es un palindromo.");
		
		
	}

	private static boolean determinaPalindromo(String cadena) {
		
		String cadenaSinEspacios;
		boolean esPalindromo = true;
		int inicio = 0, fin;
		char caracterInicio, caracterFin;
		
		// Remplaza los blancos por cadena vacia, es decir, elimina espacios.
		cadenaSinEspacios = cadena.replaceAll(" ", "");
		cadenaSinEspacios = cadenaSinEspacios.toUpperCase();
		
		//Recorre hasta la mitad de la cadena, mientras i < j;
		
		fin = cadenaSinEspacios.length()-1;
		
		while (inicio < fin && esPalindromo == true) {
			caracterInicio = cadenaSinEspacios.charAt(inicio);
			caracterFin = cadenaSinEspacios.charAt(fin);
			if (caracterInicio != caracterFin) {
				esPalindromo = false;
			}
			inicio++;
			fin--;
		}
					
		return esPalindromo;
		
	}

	private static  String solicitarCadena() {

		String cadena;
		
		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();
				
		return cadena;
	}

}
