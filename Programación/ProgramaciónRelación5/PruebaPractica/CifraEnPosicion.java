/*
 * Realizar un método llamado cifraEnPosicion que reciba un número entero y una posición (número
entero positivo) y devuelva un número entero con la cifra del número que se encuentra en esa
posición. Tener en cuenta que
 Las posiciones empiezan por 1 desde la derecha.
 Si es correcta la cifra devuelta será positiva (aunque el número sea negativo).
 Si no se puede obtener dicha cifra devolverá un -1.
 */
package PruebaPractica;

import java.util.Scanner;

public class CifraEnPosicion {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int posicion;
		int devuelveNumero;

		numero = solicitarCadenaDeNumeros();
		posicion = introducePosicion();
		devuelveNumero = busquedaDelNumeroEnPosicion(numero, posicion);

		System.out.println(devuelveNumero);
	}

	/**
	 * Metodo que solicita un numero entero
	 * 
	 * @return numero
	 */
	private static int solicitarCadenaDeNumeros() {

		int numero;

		System.out.println("Introduce una cadena de numeros");
		numero = teclado.nextInt();

		return numero;
	}

	/**
	 * Metodo que solicita la posicion de busqueda y comprueba que sea un numero entero positivo
	 * @return posicion
	 */
	private static int introducePosicion() {

		int posicion;

		do {
			System.out.println("Introduce un numero entero positivo");
			posicion = teclado.nextInt();
		} while (posicion < 1);

		return posicion;
	}
	
	/**
	 * Metodo que una vez dado un numero y la posicion de busqueda
	 * transforma el entero a String, le damos la vuelta a la cadena para empezar a contar
	 * desde la derecha y transformamos el numero encontrado en posicion a entero y lo devuelve
	 * si la posicion es mayor que la cantidad de numeros, devolvera -1
	 * @param numero
	 * @param posicion
	 * @return devuelveNumero;
	 */
	private static int busquedaDelNumeroEnPosicion(int numero, int posicion) {
		
		String numeroCadena = String.valueOf(numero); //Pasamos int a String
		char digito;
		int devuelveNumero;
		
		if (posicion <= numeroCadena.length()) {
			
			StringBuilder sbNumero = new StringBuilder (numeroCadena);
			sbNumero.reverse();
			
			digito = sbNumero.charAt(posicion-1);
			devuelveNumero = Integer.parseInt(String.valueOf(digito));
		}
		else {
			devuelveNumero = -1;
		}
		
		return devuelveNumero;
	}
}
