package Programaci�nRelaci�n4;
//* Programa que usa un método que informa de si un a�o es bisiesto o no. 
//es o no bisiesto.

import java.util.Scanner;

public class Ejercicio4_3 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int anio;
		
		// Se solicita el a�o
		anio = Ejercicio4_3.solicitarAnio();
		
		if (comprobarBisiesto(anio)) {
			System.out.println("El a�o " + anio + " es bisiesto.");
		}
		else {
			System.out.println("El a�o " + anio + " no es bisiesto");
		}
	}
	/**
	 * Comprueba si el a�o es bisiesto
	 * @param anio
	 * @return true si bisiesto, false si no
	 */
	public static boolean comprobarBisiesto(int anio) {
		boolean esBisiesto = false;
		
		//Un a�o es bisiesto si es m�ltiplo de 4, a excepci�n de los que,
		//siendo m�ltiplos de 4 son m�ltiplos de 100 y no de 400.
		if (anio % 4 == 0) {
			esBisiesto = true;
			
			if (anio % 100 == 0 && anio % 400 != 0) {
				esBisiesto = false;
			}
		}
		
		return esBisiesto;
	}
	/**
	 * Método que solicita un a�o.
	 */
	public static int solicitarAnio() {
		int anio;
		
		do {
			System.out.println("Introduzca un a�o: ");
			anio = Integer.parseInt(teclado.nextLine());
		} while (anio < 0);
		
		return anio;
		
	}
}
