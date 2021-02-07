/*
 * Realizar un programa que solicite 10 direcciones webs y para cada una
de ellas informe si es o no válida. Las direcciones válidas deben tener el
formato:
 */
package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio10 {

	private static final String PROTOCOLO = "http://www.";
	private static final String EXTENSION1 = ".com";
	private static final String EXTENSION2 = ".es";
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String web;
		boolean esValida;

		web = solicitarWeb();
		esValida = validarWeb(web);

		if (esValida) {
			System.out.println("Direccion valida");
		} else {
			System.out.println("Direccion no valida");
		}

	}

	/**
	 * Metodo que solcita una direccion web
	 * 
	 * @return
	 */

	private static String solicitarWeb() {

		String web;

		System.out.println("Introduce una pagina web");
		web = teclado.nextLine();

		return web;
	}

	/**
	 * Metodo que comprueba que todas las partes de 
	 * una direccion web sean validas
	 * 
	 * @param web
	 * @return es valida, si o no.
	 */
	private static boolean validarWeb(String url) {

		boolean esValida = false;
		String dominio;

		esValida = validarProtocolo(url);

		if (esValida == true) {
			esValida = validarExtencion(url);
			if (esValida) {
				dominio = obtenerDireccion(url);
				esValida = comprobarDominio(dominio);
			}
		}

		return esValida;

	}

	/**
	 * Metodo que valida el protocolo de una pagina web
	 * @param url
	 * @return
	 */
	private static boolean validarProtocolo(String url) {

		boolean inicioValido;

		inicioValido = url.startsWith(PROTOCOLO);

		return inicioValido;
	}

	/**
	 * metodo que comprueba la parte intermedia de una pagina web
	 * @param direccionWeb
	 * @return
	 */
	private static boolean comprobarDominio(String direccionWeb) {

		boolean esValida = false;

		if (direccionWeb.length() == 0) {
			esValida = false;
		} else {
			if (!Character.isLetter(direccionWeb.charAt(0))) {
				esValida = false;
			} else {
				esValida = sonCaracteresAlfanumericos(direccionWeb);
			}

		}
		return esValida;
	}

	/**
	 * Metodo que comprueba que la direccion web solo tengo letras y digitos
	 * @param direccionWeb
	 * @return
	 */
	private static boolean sonCaracteresAlfanumericos(String direccionWeb) {

		char caracter;
		boolean esValido = true;

		for (int i = 0; i < direccionWeb.length() && esValido; i++) {
			caracter = direccionWeb.charAt(i);

			if (!Character.isLetterOrDigit(caracter)) {
				esValido = false;
			}

		}
		return esValido;
	}

	/**
	 * metodo que comprueba que la web contiene 2 puntos
	 * @param url
	 * @return
	 */
	private static String obtenerDireccion(String url) {

		String dominio;
		int primerPunto = url.indexOf('.');
		int ultimoPunto = url.lastIndexOf('.');

		if (primerPunto == ultimoPunto) {
			dominio = "";
		} else {
			dominio = url.substring(primerPunto + 1, ultimoPunto);
		}

		return dominio;
	}

	/**
	 * parametro que valida que el final de una pagina web es correcto
	 * @param url
	 * @return
	 */
	private static boolean validarExtencion(String url) {

		boolean extencionValida;

		extencionValida = url.endsWith(EXTENSION1) || url.endsWith(EXTENSION2);

		return extencionValida;
	}

}
