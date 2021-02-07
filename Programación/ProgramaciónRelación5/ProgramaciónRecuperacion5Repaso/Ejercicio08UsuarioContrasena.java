/*
 * Realizar un programa que valide el nombre de usuario y contraseña que
se soliciten.Deben cumplir las siguientes condiciones:
El nombre de usuario debe estar formado solo por caracteres alfabéticos
(longitud máxima 30 caracteres).
La contraseña debe tener como mínimo 7 caracteres y debe contener al
menos una letra, un dígito y un carácter no alfanumérico.
 */
package ProgramaciónRecuperacion5Repaso;

import java.util.Scanner;

public class Ejercicio08UsuarioContrasena {

	public static final int MINIMO_USUARIO = 1;
	public static final int MAXIMO_USUARIO = 30;
	public static final int MINIMO_PASSWORD = 7;
	public static final int MINIMO_VALIDACION = 1;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String usuario;
		String contrasena;

		usuario = solicitarUsuario();
		contrasena = solicitarContrasena();

		if (validarUsuario(usuario) == true && validarContrasenia(contrasena) == true) {
			System.out.println("Bienvenido " + usuario);
		} else {
			System.out.println("Usuario y/o contraseña incorrectos");
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
	 * Metodo que solicita una contraseña
	 * 
	 * @return contrasena
	 */
	private static String solicitarContrasena() {

		String contrasena;

		System.out.println("Introduce tu contraseña");
		contrasena = teclado.nextLine();

		return contrasena;
	}

	/**
	 * Metodo que valida que el nombre de usuario solo contenga letras, y que su
	 * tamaño este entre 1 y 30
	 * 
	 * @param usuario
	 * @return usuario valido o no
	 */
	private static boolean validarUsuario(String usuario) {

		char caracter;
		boolean esValido = true;

		for (int i = 0; i < usuario.length() && esValido == true; i++) {
			caracter = usuario.charAt(i);
			if (usuario.length() > MAXIMO_USUARIO || usuario.length() < MINIMO_USUARIO) {
				esValido = false;
			} else {
				if (Character.isLetter(caracter)) {
					esValido = true;
				} else {
					esValido = false;
				}
			}
		}
		return esValido;
	}

	/**
	 * Metodo que valida que la contraseña tenga minimo 7 caracteres; 1 letra, 1
	 * digito, y un caracter alfanumerico
	 * 
	 * @param contrasena
	 * @return contraseña valida o no
	 */
	private static boolean validarContrasenia(String contrasena) {

		int letra = 0, digito = 0, noAlfanumerico = 0;
		char caracter;
		boolean esValido = true;

		for (int i = 0; i < contrasena.length() && esValido == true; i++) {
			caracter = contrasena.charAt(i);
			if (contrasena.length() < MINIMO_PASSWORD) {
				esValido = false;
			} else {
				if (Character.isLetter(caracter)) {
					letra++;
				} else {
					if (Character.isDigit(caracter)) {
						digito++;
					} else {
						noAlfanumerico++;
					}
				}
			}
		}
		if (letra >= MINIMO_VALIDACION && digito >= MINIMO_VALIDACION && noAlfanumerico >= MINIMO_VALIDACION) {
			esValido = true;
		} else {
			esValido = false;
		}

		return esValido;

	}

}
