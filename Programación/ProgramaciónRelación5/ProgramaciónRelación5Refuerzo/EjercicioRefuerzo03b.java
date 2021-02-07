package ProgramaciónRelación5Refuerzo;
import java.util.Scanner;

public class EjercicioRefuerzo03b {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena;
		
		cadena = solicitarCadena();
		
		if (esPalindromo(cadena) == true) {
			System.out.println("La cadena " + cadena + " es un palindromo.");
		}
		else {
			System.out.println("La cadena " + cadena + " no es un palindromo.");
		}
		
		

	}
/**
 * Metodo que solicita una cadena y la devuelve
 * @return cadena
 */
	private static String solicitarCadena() {

		String cadena;
		
		System.out.println("Introduce una frase");
		cadena = teclado.nextLine();
		
		return cadena;
		
	}
	/**
	 * Metodo que determina si una cadena es o no un palindromo
	 * @param cadena
	 * @return true si lo es, false si no es palindromo
	 */

	private static boolean esPalindromo(String cadena) {
		
		String cadenaInvertida;
		boolean esPalindromo;
		
		cadena = cadena.toUpperCase();
		cadena = cadena.replaceAll(" ", "");
		
		StringBuilder stringBuilderInvertido = new StringBuilder(cadena);
		stringBuilderInvertido.reverse();
		
		cadenaInvertida = stringBuilderInvertido.toString();
		if (cadenaInvertida.equals(cadena)) {
			esPalindromo = true;
		}
		else {
			esPalindromo = false;
		}
		return esPalindromo;
	}

}
