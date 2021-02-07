/*
 * Realizar un programa que lea en una cadena el nombre completo de una persona (nombre y
apellidos) y muestre por pantalla el nombre, apellido1 y apellido2. Si el nombre completo no
es correcto mostrará un mensaje de error.

 */
package ProgramaciónRelación5Refuerzo;

import java.util.Scanner;

public class EjercicioRefuerzo01 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		String nombreCompleto;
		String nombreFormateado;
		
		nombreCompleto = solicitarNombreCompleto();
		
		if(comprobarNombreCompleto(nombreCompleto) == true) {
			nombreFormateado = formatearNombre(nombreCompleto);
			System.out.println(nombreFormateado);
		}
		else {
			System.out.println("Error, nombre incorrecto");
		}
		
	}

	/**
	 * Metodo que solicita nombre completo
	 * @return nombre
	 */
	private static String solicitarNombreCompleto() {
		
		String nombre;
		
		System.out.println("Introduce un nombre y apellidos");
		nombre = teclado.nextLine();
		
		return nombre;
	}

	/**
	 * Metodo que comprueba que el nombre introducido no contenga digitos y entre 2 y 3 espacios
	 * @param nombre
	 * @return nombre correcto o no
	 */
	public static boolean comprobarNombreCompleto(String nombreCompleto) {
		
		boolean correcto = true;
		char caracter;
		int hayEspacio = 0;
		
		for (int i = 0; i < nombreCompleto.length() && correcto == true; i++) {
			caracter = nombreCompleto.charAt(i);
			if(Character.isDigit(caracter)) {
				correcto = false;
			}
			else {
				if (Character.isSpaceChar(caracter)) {
					hayEspacio++;
				}
			}
		}
		if (hayEspacio > 3 && hayEspacio < 2) {
			correcto = false;
		}
		
		return correcto;
	
	}
	

	private static String formatearNombre(String nombreCompleto) {
		
		String nombreFormateado;
		
		String[] parts = nombreCompleto.split(" ");              
		String nombre = parts[0];
		String apellido1 = parts[1];
		String apellido2 = parts[2];
		System.out.println("NOMBRE: "+nombre);
		System.out.println("APELLIDO1: "+apellido1);
		System.out.println("APELLIDO2: "+apellido2);
		
		return null;
	}
}
