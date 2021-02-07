/*Realizar un programa que busque una
palabra escondida dentro de un texto*/
package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio04 {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String texto;
		String textoABuscar;
		
		texto = solicitarTexto();
		
		textoABuscar = solicitarTextoABuscar();
		
		if (textoescondido(texto, textoABuscar)) {
			System.out.println("El texto a buscar se encuentra escondido en el texto introducido");
		}
		else {
			System.out.println("El texto a buscar no se encuentra escondido en el texto introducido");
		}

	}
	/**
	 * MÃ©todo que busca una texto "escondida" dentro de otro. 
	 * Los caracteres de la cadena buscada deben estar en el texto en el 
	 * mismo orden.
	 * @param texto
	 * @param textoABuscar
	 * @return true si la encuentra, false si no
	 */

	private static boolean textoescondido(String texto, String textoABuscar) {

		boolean escondida = true;
		int contador = 0;
		int indice;
		int desde = 0; //indica desde donde buscar
		char caracter;
		
		while (contador < textoABuscar.length() && escondida == true) {
			
			caracter = textoABuscar.charAt(contador);
			
			indice = texto.indexOf(caracter, desde);
			
			if (indice == -1) { //no esta, salimos
				escondida = false;
			}
			else {
				desde = indice +1;
				contador++;
			}
		}
		return escondida;
	}

	/**
	 * Metodo que solicita el texto que se desea buscar
	 * @param textoABuscar
	 * @return texto que se desea buscar
	 */
	private static String solicitarTextoABuscar() {

		String textoABuscar;

		System.out.println("Introduce texto a buscar");
		textoABuscar = teclado.nextLine();

		return textoABuscar;
	}

	/**
	 * Metodo que solicita un texto
	 * 
	 * @return texto introducido
	 */
	private static String solicitarTexto() {

		String texto;

		System.out.println("Introduce un texto");
		texto = teclado.nextLine();

		return texto;
	}

}
