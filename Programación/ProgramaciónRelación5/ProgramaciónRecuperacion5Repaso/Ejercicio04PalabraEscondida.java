/*
 *  Realizar un programa que busque una palabra escondida dentro de un
texto. Por ejemplo, si la cadena es “shybaoxlna” y la palabra que
queremos buscar es “hola”, entonces si se encontrará.

 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio04PalabraEscondida {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String texto, palabraEscondida;
		
		texto = solicitarCadena();
		palabraEscondida = buscarPalabraEnTexto();
		
		if(palabraEsONoEncontrada(texto, palabraEscondida) == true){
			System.out.println("La palabra solicitada: " + palabraEscondida + " se encuentra en el texto: " + texto);			
		}
		else {
			System.out.println("La palabra solicitada: " + palabraEscondida + " no se encuentra en el texto: " + texto);
		}
		
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
	 * Metodo que solicita una palabra a buscar en el texto
	 * @return palabraEscondida
	 */
	private static String buscarPalabraEnTexto() {

		String palabraEscondida;

		System.out.println("Introduce la palabra que buscaremos en el texto");
		palabraEscondida = teclado.nextLine();
		
		return palabraEscondida;
	}
	
	/**
	 * Metodo que una vez dada la cadena y la palabra a buscar, comprobara si esta escondida o no
	 * @param texto
	 * @param palabraEscondida
	 * @return palabra es encontrada, o no
	 */

	private static boolean palabraEsONoEncontrada(String texto, String palabraEscondida) {

		boolean palabraEsONoEncontrada = true;
		int i = 0;
		int indice;
		int busqueda = 0;
		char caracter;

		while (i < palabraEscondida.length() && palabraEsONoEncontrada == true) {

			caracter = palabraEscondida.charAt(i);
			indice = texto.indexOf(caracter, busqueda);

			if (indice == -1) { // no esta, se sale
				palabraEsONoEncontrada = false;
			} else {
				busqueda = indice + 1;
				i++;
			}
		}

		return palabraEsONoEncontrada;

	}

}
