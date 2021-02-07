/*Realizar un programa que solicite una cadena de caracteres por teclado
y visualice por pantalla cuántos de esos caracteres son letras
mayúsculas, cuántos son letras minúsculas y cuántos son caracteres
numéricos.*/
package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		String cadena;
		

		
		cadena = solicitarCadena();

		int cuentaMinuscula = cuentaMinusculas(cadena);
		int cuentaMayuscula = cuentaMayusculas(cadena);
		int cuentaNumero = cuentaNumeros(cadena);
		
		System.out.println("La frase introducida tiene un total de " + cuentaMinuscula + " minúsculas, " + cuentaMayuscula + " mayúsculas y " + cuentaNumero + " números");
	}

	private static String solicitarCadena() {

		System.out.println("Introduce una frase");
		String cadena = teclado.nextLine();
		
		return cadena;
	}

	private static int cuentaMinusculas(String cadena) {

		int cuentaMinuscula = 0;
		char minuscula = 0;
		for(int i=0; i < cadena.length(); i++) {
			minuscula = cadena.charAt(i);
			
			if (Character.isLowerCase(minuscula)) {
				cuentaMinuscula++;
			}
		}
		return cuentaMinuscula;
	}

	private static int cuentaMayusculas(String cadena) {

		int cuentaMayuscula = 0;
		char mayuscula = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			mayuscula = cadena.charAt(i);
			if (Character.isUpperCase(mayuscula)) {
				cuentaMayuscula++;
			}
		}
		return cuentaMayuscula;
	}

	private static int cuentaNumeros(String cadena) {
		
		int cuentaNumero = 0;
		char numero = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			numero = cadena.charAt(i);
			if (Character.isDigit(numero)) {
				cuentaNumero++;
			}
		}

		return cuentaNumero;
	}

	
	
}
