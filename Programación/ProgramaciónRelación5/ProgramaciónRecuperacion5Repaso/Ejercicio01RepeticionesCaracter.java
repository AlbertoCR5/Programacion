/*
 * Realizar un método que tenga como parámetros de entrada una cadena
de caracteres y un carácter y devuelva cuántas veces aparece ese
carácter en la cadena. No debe distinguir entre caracteres mayúsculas y
minúsculas.

 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio01RepeticionesCaracter {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena;
		char caracter;
		int cantidadApariciones;
		
		cadena = solicitarCadena();
		caracter = solicitarCaracter();
		cantidadApariciones = caracterRepetidoEnCadena(cadena, caracter);
		
		if (cantidadApariciones < 1) {
			System.out.println("El caracter: '" + caracter + "' no aparece en la frase: " + cadena);
		}
		else {
			if (cantidadApariciones == 1) {
				System.out.println("El caracter: '" + caracter + "' aparece " + cantidadApariciones + " vez en la frase: " + cadena);				
			}
			else {
				System.out.println("El caracter: '" + caracter + "' aparece " + cantidadApariciones + " veces en la frase: " + cadena);
			}
		}
		
		
	}
	
/**
 * metodo que solicita una frase
 * @return cadena
 */
	private static String solicitarCadena() {
		
		String cadena;
		
		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();
		
		return cadena;
	}
	
/**
 * Metodo que solicita un caracter y lo pasa a mayuscula.
 * @return carater
 */
	private static char solicitarCaracter() {
		
		char caracter;
		
		System.out.println("Introduce un caracter");
		caracter = teclado.nextLine().charAt(0);
		caracter = Character.toUpperCase(caracter);
		
		return caracter;
	}

	/**
	 * Metodo que una vez obtenido la frase y el caracter,
	 * lo busca dentro de la cadena y retorna la cantidad de veces que se repite
	 * @param cadena
	 * @param caracter
	 * @return cantidadApariciones
	 */
	private static int caracterRepetidoEnCadena(String cadena, char caracter) {

		int cantidadApariciones = 0;
		char caracterBuscado;
		
		for (int i = 0; i < cadena.length(); i++) {
			caracterBuscado = cadena.charAt(i);
			//Metodo que pasa los caracteres a mayusculas
			caracterBuscado = Character.toUpperCase(caracterBuscado);
			
			if (caracterBuscado == caracter) {
				cantidadApariciones++;
			}
		}
		return cantidadApariciones;
	}

}
