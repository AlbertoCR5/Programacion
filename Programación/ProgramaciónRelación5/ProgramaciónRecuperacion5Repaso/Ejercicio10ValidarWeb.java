/*
 * Realizar un programa que solicite 10 direcciones webs y para cada una
de ellas informe si es o no válida
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio10ValidarWeb {

	public static final String PROTOCOLO = "http://www.";
	public static final String EXTENSION1 = ".com";
	public static final String EXTENSION2 = ".es";
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String web;
		boolean esValida;

		web = solicitarDireccionWeb();
		esValida = validarDireccionWeb(web);

		if (esValida) {
			System.out.println("Redireccionando");
		} else {
			System.out.println("Pagina web no encontrada");
		}
	}

	/**
	 * Metodo que solicita una direccion web
	 * 
	 * @return web
	 */
	private static String solicitarDireccionWeb() {

		String web;

		System.out.println("Introduce una direccion web");
		web = teclado.nextLine().toLowerCase();

		return web;
	}

	/**
	 * Metodo que comprueba que todas las partes de una dirrecicon web sean validas
	 * 
	 * @param web
	 * @return esValida, o no
	 */
	private static boolean validarDireccionWeb(String url) {

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
	 * Metodo que comprueba que el protocolo introducido sea correcto
	 * 
	 * @param url
	 * @return protocoloValido
	 */
	private static boolean validarProtocolo(String url) {

		boolean protocoloValido;

		protocoloValido = url.startsWith(PROTOCOLO);

		return protocoloValido;
	}

	/**
	 * Metodo que comprueba que una de las extensiones recogidas sea valida
	 * 
	 * @param url
	 * @return extensionValida
	 */
	private static boolean validarExtencion(String url) {

		boolean extensionValida;

		extensionValida = url.endsWith(EXTENSION1) || url.endsWith(EXTENSION2);

		return extensionValida;
	}

	/**
	 * Metodo que comprueba que el dominio introducido sea correcto, es decir,
	 * empieza con una letra, y solo contiene letras o digitos
	 * 
	 * @param direccionWeb
	 * @return dominio valido
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
	 * Metodo que comprueba que la direccion web contenga 2 puntos
	 * 
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
	 * Metodo que valida que el dominio solo contenga letras y digitos
	 * 
	 * @param direccionWeb
	 * @return esValido
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
}
