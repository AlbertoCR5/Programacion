/*
 * Realizar un programa que lea en una cadena el nombre completo de una persona (nombre y
apellidos) y muestre por pantalla el nombre, apellido1 y apellido2. Si el nombre completo no
es correcto mostrará un mensaje de error.

 */
package ProgramacionRefuerzo5Repaso;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nombreCompleto;
		String nombre, apellido1, apellido2;
		
		nombreCompleto = solicitarNombreCompleto();
		

	}

	/**
	 * Metodo que solicita el nombre completo de una persona
	 * @return
	 */
	private static String solicitarNombreCompleto() {
		
		String nombreCompleto;
		
		System.out.println("Introduce tu nombre completo");
		nombreCompleto = teclado.nextLine();
		
		return nombreCompleto;
	}

}
