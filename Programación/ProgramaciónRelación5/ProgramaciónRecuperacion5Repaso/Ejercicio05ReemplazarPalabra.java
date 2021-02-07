/*
 * Realizar un programa que reemplace una palabra por otra en un texto.
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio05ReemplazarPalabra {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena, nuevaCadena;
		String palabraAntigua, nuevaPalabra;

		cadena = solicitarCadena();
		palabraAntigua = solicitarPalabraAReemplazar(cadena);
		nuevaPalabra = solicitarPalabraReemplazadora();
		
		nuevaCadena = crearNuevaCadena(cadena, palabraAntigua, nuevaPalabra);

		System.out.println("El texto (" + cadena + ") ha sido reemplazado por el texto (" + nuevaCadena + ")");
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
	 * @return palabraAntigua
	 */
	private static String solicitarPalabraAReemplazar(String cadena) {

		String palabraAntigua;
		boolean aparece = true;
		int i = 0;
		int indice;
		int busqueda = 0; // indica desde donde buscar
		char caracter;

		do {
			System.out.println("Introduce la plabra que será reemplazada");
			palabraAntigua = teclado.nextLine();
			while (i < palabraAntigua.length() && aparece == true) {
				caracter = palabraAntigua.charAt(i);
				indice = cadena.indexOf(caracter, busqueda);

				if (indice == -1) { // no aparece, se sale
					aparece = false;
				} else {
					busqueda = indice + 1;
					i++;
				}
			}
		} while (aparece == false);

		return palabraAntigua;
	}

	/**
	 * Metodo que solicita una palabra que reemplazara a la anterior dada
	 * 
	 * @return nueva palabra
	 */
	private static String solicitarPalabraReemplazadora() {

		String nuevaPalabra;

		System.out.println("Introduce una palabra que reemplazara a la anterior");
		nuevaPalabra = teclado.nextLine();

		return nuevaPalabra;
	}

	/**
	 * Metodo que una vez obtenido todos los datos reemplaza el antiguo texto por el
	 * nuevo
	 * 
	 * @param cadena
	 * @param palabraAntigua
	 * @param nuevaPalabra
	 * @return nuevaCadena
	 */
	private static String crearNuevaCadena(String cadena, String palabraAntigua, String nuevaPalabra) {

		int iniciarBusqueda = 0;
		int busqueda;

		// StringBuilder con el texto original
		StringBuilder textoBuilder = new StringBuilder(cadena);

		// Se busca la cadenaBuscar en el texto
		busqueda = cadena.indexOf(palabraAntigua);

		// Mientras la encuentre
		while (busqueda >= 0) {
			textoBuilder.delete(busqueda, busqueda + palabraAntigua.length());

			textoBuilder.insert(busqueda, nuevaPalabra);

			// Se actualiza la posicion de busqueda
			iniciarBusqueda = busqueda + nuevaPalabra.length();

			busqueda = textoBuilder.indexOf(palabraAntigua, iniciarBusqueda);

		}

		return textoBuilder.toString();

	}

}
