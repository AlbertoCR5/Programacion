/*
 * Crear un método que, tomando una cadena de texto como entrada,
construya y devuelva otra cadena formada de la siguiente manera: el
método debe colocar todas las consonantes al principio y todas las
vocales al final de la misma, eliminando los blancos.
 */
package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio07 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		String cadena, nuevaCadena;
		
		cadena = solicitarCadena();
		
		nuevaCadena = modificarCadena(cadena);
		
		System.out.println("La nueva cadena es: " + nuevaCadena);


	}

	/**
	 * Metodo que solicita una cadena
	 * @return cadena
	 */
	private static String solicitarCadena() {

		String cadena;
		
		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();
		
		return cadena;
	}
	
	/**
	 * Metodo que modifica la cadena de manera que queden
	 * las consonantes al principio y las vocales al final
	 * @param cadena
	 * @return nuevaCadena
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
				}
				else {
					sbConsonantes.append(caracter);
				}
			}
		}
		
		sbConsonantes.append(sbVocales);
		
		return sbConsonantes.toString();
	}

	private static boolean esVocal(char caracter) {

		boolean resultado;
		String vocales = "AEIOUÁÉÍÓÚaeiouáéíóú";
		
		if (vocales.contains(String.valueOf(caracter)) == true) {//Si no es vocal
			resultado = true;
		}
		else {
			resultado = false;
		}
		
		return resultado;
	}

}
