/*Realizar un programa que busque una
palabra escondida dentro de un texto*/

package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio04b {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String texto;
		String buscarTexto;

		texto = solicitarTexto();
		buscarTexto = solicitarBuscarTexto();

		if (textoEscondido(texto, buscarTexto)) {
			System.out.println("El texto a buscar se encuentra escondido en el texto introducido");
		} else {
			System.out.println("El texto a buscar no se encuentra escondido");
		}

	}

	/**
	 * Metodo que solicita un texto
	 * 
	 * @param texto
	 * @return texto introducido
	 */

	private static String solicitarTexto() {

		String texto;

		System.out.println("Introduce un texto");
		texto = teclado.nextLine();
		return texto;
	}

	/**
	 * Metodo que solicita un texto a buscar
	 * 
	 * @param buscarTexto
	 * @return texto a buscar
	 */
	private static String solicitarBuscarTexto() {

		String buscarTexto;

		System.out.println("Introduce el texto a buscar");
		buscarTexto = teclado.nextLine();

		return buscarTexto;
	}

	/**
	 * metodo que busca un texto dentro de otro
	 * 
	 * @param texto
	 * @param buscarTexto
	 * @return true si la encuentra, false si no
	 */
	private static boolean textoEscondido(String texto, String buscarTexto) {

		boolean textoEscondido = false;
		int contadorEncontrados = 0;
		int contadorTexto = 0;
		int contadorBuscado = 0;
		char caracterTexto, caracterBuscado;

		while (contadorBuscado < buscarTexto.length() && contadorTexto < texto.length()) {
			caracterTexto = texto.charAt(contadorTexto);
			caracterBuscado = buscarTexto.charAt(contadorBuscado);

			if (caracterBuscado == caracterTexto) {
				contadorEncontrados++;
				contadorBuscado++;
			}

			contadorTexto++;

		}

		if (contadorEncontrados == buscarTexto.length()) {
			textoEscondido = true;
		} else {
			textoEscondido = false;
		}
		return textoEscondido;
	}

}
