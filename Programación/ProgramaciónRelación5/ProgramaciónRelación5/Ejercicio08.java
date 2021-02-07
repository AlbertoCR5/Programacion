package Programaci�nRelaci�n5;
import java.util.Scanner;

/**
 * Realizar un programa que valide el nombre de usuario y contrase�a que
 *se soliciten.Deben cumplir las siguientes condiciones:
 *El nombre de usuario debe estar formado solo por caracteres alfab�ticos
 *(longitud m�xima 30 caracteres).
 *La contrase�a debe tener como m�nimo 7 caracteres y debe contener al
 *menos una letra, un d�gito y un car�cter no alfanum�rico
 **/

public class Ejercicio08 {
	
	private static final int Minimo_caracter_user = 1;
	private static final int Maximo_caracter_user = 30;
	private static final int Minimo_caracter_pass = 7;
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		String usuario, contrasenia;
		
		usuario = Ejercicio08.solicitarUsuario();
		contrasenia = Ejercicio08.solicitarContrasenia();
		
		if (compruebaUsuario(usuario) == true && compruebaContrasenia(contrasenia) == true) {
			System.out.println("Credenciales correctos, bienvenido");
		}
		else {
			System.out.println("Usuario y/o contrase�a incorrectos");
		}
		
	}
	
	/**
	 * M�todo que solicita un usuario
	 * 
	 * @return usuario
	 */
	
	public static String solicitarUsuario() {
		
		String usuario;
		
		System.out.println("Introduce el usuario");
		usuario = teclado.nextLine();
		
		return usuario;
	}
	
	/**
	 * M�todo que solicita una contrase�a
	 * 
	 * @return contrasenia
	 */
	
	public static String solicitarContrasenia() {
		
		String contrasenia;
		
		System.out.println("Introduce contrase�a");
		contrasenia = teclado.nextLine();
		
		return contrasenia;
	}
	
	/**
	 * M�todo al que se le pasa el usuario y comprueba su validez
	 * 
	 * @param usuarioValido
	 * @return comprueba
	 */
	
	public static boolean compruebaUsuario(String usuario) {
		
		boolean usuarioValido = true;
		char caracterUsuario;
		
		if (usuario.length() > Maximo_caracter_user || usuario.length() < Minimo_caracter_user) {
			usuarioValido = false;
		}
		else {
			for (int contador = 0; contador < usuario.length() && usuarioValido == true; contador++) {
				caracterUsuario = usuario.charAt(contador);
				if (!Character.isLetter(caracterUsuario)) {
					usuarioValido = false;
				}
			}
		}
		
		return usuarioValido;
	}
	
	/**
	 * M�todo al que se le pasa la contrase�a y comprueba su validez
	 * 
	 * @param usuario
	 * @param usuarioValido
	 * @return comprueba
	 */
	
	public static boolean compruebaContrasenia(String contrasenia) {
		
		boolean contraseniaValida = true;
		boolean letra = false;
		boolean caracterEspecial = false;
		boolean numero = false;
		char caracterContrasenia;
		
		if (contrasenia.length() < Minimo_caracter_pass) {
			contraseniaValida = false;
		}
		else {
			for (int contador = 0; contador < contrasenia.length(); contador++) {
				caracterContrasenia = contrasenia.charAt(contador);
				if (Character.isLetter(caracterContrasenia)) {
					letra = true;
				}
				else {
					if (Character.isDigit(caracterContrasenia)) {
						numero = true;
					}
					else {
						caracterEspecial = true;
					}
				}
			}
			if (numero == true && letra == true && caracterEspecial == true) {
				contraseniaValida = true;
			}
		}
		
		return contraseniaValida;
	}
		
	
}
