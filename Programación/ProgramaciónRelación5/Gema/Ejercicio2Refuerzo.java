package Gema;

import java.util.Scanner;

public class Ejercicio2Refuerzo {
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Realizar un método al que se le pase una cadena con un número de teléfono
		 * (999999999) y devuelva una nueva cadena con el teléfono formateado de esta
		 * forma 999-99-99-99.
		 */
		String numero;
		do {
			System.out.println("Introduzca un número");
			numero=teclado.nextLine();
		} while (numero.length()>9||numero.length()<9);
	
		Ejercicio2Refuerzo.CadenaNumero(numero);
		
	}public static void CadenaNumero (String numero) {
		StringBuilder numeroGuion=new StringBuilder(numero);
		numeroGuion.insert(3, "-");
		numeroGuion.insert(6, "-");
		numeroGuion.insert(9, "-");
		
		System.out.println(numeroGuion);
	}

}
