package Programaci�nRelaci�n5;
/**
 * Programa que utiliza un método que solicita una cadena de caracteres 
 * por teclado y visualiza por pantalla cuántos de esos caracteres son 
 * letras mayúsculas, cuántos son letras minúsculas y cuántos son 
 * caracteres numéricos.
 * 
 * Investigar en  los métodos de la clase  "is..." de la clase Character.
 */
import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		String cadena;
		
		cadena = Ejercicio02.solicitarCadena();
		
		Ejercicio02.cuentaMayusculaMinusculaNumeros(cadena);
	}

	/**
	 * Método que solicita una cadena.
	 * @return cadena
	 */
	
	private static String solicitarCadena() {
		
		String cadena;
		
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		
		return cadena;
	}
	
	/**
	 * Método que, dada una cadena, visualiza por pantalla:
	 *  - cuántos de esos caracteres son letras mayúsculas
	 *  - cuántos son letras minúsculas y 
	 *  - cuántos son caracteres numéricos.
	 * 
	 * Como no puede devolver tres datos, los escribe por pantalla. 
	 * Ojo: Este método no es en absoluto reutilizable
	 * @param cadena
	 */
	
	public static void cuentaMayusculaMinusculaNumeros(String cadena) {
		
		int contador;
		int contadorMayuscula = 0;
		int contadorMinuscula = 0;
		int contadorNumeros = 0;
		char caracter;
		
		for (contador = 0; contador < cadena.length(); contador++) {
			caracter = cadena.charAt(contador);
			
			if (Character.isUpperCase(caracter))
				contadorMayuscula++;
			else
				if (Character.isLowerCase(caracter))
					contadorMinuscula++;
				else
					if (Character.isDigit(caracter))
						contadorNumeros++;
			
		}
		
		System.out.println("La cadena tiene " + contadorMayuscula + " letras may�sculas.");
		System.out.println("La cadena tiene " + contadorMinuscula + " letras min�sculas.");
		System.out.println("La cadena tiene " + contadorNumeros + " caracteres num�ricos.");
	}
}
