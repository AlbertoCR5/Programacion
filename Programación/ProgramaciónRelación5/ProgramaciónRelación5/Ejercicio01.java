package Programaci�nRelaci�n5;
/**
 * Programa que usa un método que tiene como parámetros de entrada
 * una cadena de caracteres y un carácter.
 * Devuelve cuántas veces aparece ese carácter en la cadena.
 * 
 * No debe distinguir entre caracteres mayúsculas y minúsculas.
 */
import java.util.*;

public class Ejercicio01 {
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		String cadena;
		int numeroVeces;
		char caracter;
		
		// Se solicita la cadena
		cadena = solicitarCadena();
		
		// Se solicita un carácter
		caracter = solicitarCaracter();
		
		numeroVeces = cuentaCaracterEnCadena(cadena, caracter);
		
		System.out.println("El caracter " + caracter + " aparece " + numeroVeces + " veces " + " en la cadena " + cadena);

	}
	
	private static char solicitarCaracter() {
		char caracter;
		
		System.out.println("Introduce un car�cter");
		caracter = teclado.nextLine().charAt(0);
		
		return caracter;
	}
	
	private static String solicitarCadena() {
		String cadena;
		
		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();
		
		return cadena;
	}

	public static int cuentaCaracterEnCadena (String cadena, char caracterBuscado) {
		
		int numeroVeces = 0;
		int contador;
		int caracterDeLaCadena;
		
		caracterBuscado = Character.toLowerCase(caracterBuscado);
		
		for ( contador = 0; contador < cadena.length(); contador++ ) {
			
			caracterDeLaCadena = cadena.charAt(contador);
			
			caracterDeLaCadena = Character.toLowerCase(caracterDeLaCadena);
			
			if (caracterDeLaCadena == caracterBuscado)
				numeroVeces++;
		}
		
		return numeroVeces;
	}
}
