package ProgramaciónRelación3;

import java.util.Scanner;

public class Ejercicio02 {

	// Realizar un programa que solicite dos números, base y exponente, enteros
	// positivos (incluido el 0),
	// y que calcule la potencia (base elevado a exponente) a través de productos.
	// Si los datos son incorrectos deberán volverse a solicitar.

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int base;
		int exponente;
		int potencia;

		do {
			System.out.println("Introduce dos números (base y exponente)");
			base = Integer.parseInt(teclado.nextLine());
			exponente = Integer.parseInt(teclado.nextLine());
		} while (base < 0 || exponente < 0);

		if (base == 0 && exponente == 0) {
			System.out.println("No se puede calcular");
		} else {
			if (base == 0) {
				potencia = 0;
			} else {
				potencia = 1;
				for (int i = 1; i <= exponente; i++) {
					potencia = potencia * base;
				}
			}
			System.out.println("El resultado de la " + base + "^" + exponente + " es: " + potencia);
		}

	}

}
