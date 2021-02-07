/*
 * Realizar un programa que valide el nombre de usuario y contrase�a que
se soliciten.Deben cumplir las siguientes condiciones:
El nombre de usuario debe estar formado solo por caracteres alfab�ticos
(longitud m�xima 30 caracteres).
La contrase�a debe tener como m�nimo 7 caracteres y debe contener al
menos una letra, un d�gito y un car�cter no alfanum�rico.

 */
package Programaci�nRelaci�n5Repaso;

import java.util.Scanner;

public class Ejercicio08 {

	public static final int MINIMO_USUARIO = 1;
	public static final int MAXIMO_USUARIO = 30;
	public static final int MINIMO_CONTRASENA = 7;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String usuario, contrasena;

		usuario = solicitarUsuario();
		contrasena = solicitarContrasena();

		if (comprobarUsuario(usuario) == true && comprobarContrasena(contrasena) == true) {
			System.out.println("Usuario y contrase�a correctos");
		} else {
			System.out.println("Usuario y/o contrase�a incorrectos");
		}
	}

	/**
	 * Metodo que solicita un usuario
	 * 
	 * @return usuario
	 */
	private static String solicitarUsuario() {

		String usuario;

		System.out.println("Introduce un nombre de usuario");
		usuario = teclado.nextLine();

		return usuario;
	}

	/**
	 * Metodo que solicita una contrasena
	 * 
	 * @return contrasena
	 */
	private static String solicitarContrasena() {

		String contrasena;

		System.out.println("Introduce una contrase�a");
		contrasena = teclado.nextLine();

		return contrasena;
	}

	/**
	 * Metodo que una vez solicitado el usuario, comprueba que contenga entre 1 y 30
	 * letras
	 * 
	 * @param usuario
	 * @return correcto
	 */
	private static boolean comprobarUsuario(String usuario) {

		boolean correcto = true;
		char caracterUsuario;
		
		if (usuario.length() > MAXIMO_USUARIO || usuario.length() < MINIMO_USUARIO) {
			correcto = false;
		} else {
			for (int i = 0; i < usuario.length() && correcto == true; i++) {
				caracterUsuario = usuario.charAt(i);
				if (!Character.isLetter(caracterUsuario)) {
					correcto = false;
				}
			}
		}
		return correcto;
	}

	/**
	 * Metodo que una vez solicitado la contrase�a, comprueba que contenga minimo 7
	 * caracteres, al menos 1 digito, 1 letra y un caracter no alfanumerico.
	 * 
	 * @param contrasena
	 * @return correcta
	 */
	private static boolean comprobarContrasena(String contrasena) {

		boolean correcta = false, digito = false, letra = false, noAlfanumerico = false;
		char caracterContrasena;
		
		if (contrasena.length() < MINIMO_CONTRASENA) {
			correcta = false;
		}
		else {
			for (int i = 0; i < contrasena.length(); i++) {
				caracterContrasena = contrasena.charAt(i);
				if (Character.isDigit(caracterContrasena)) {
					digito = true;
				} else {
					if (Character.isLetter(caracterContrasena)) {
						letra = true;
					} else {
						noAlfanumerico = true;
					}
				}

			}

			if (digito == true && letra == true && noAlfanumerico == true) {
				correcta = true;
			}
		}

		return correcta;
	}
}
