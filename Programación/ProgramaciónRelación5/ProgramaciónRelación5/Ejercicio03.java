package ProgramaciónRelación5;
import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena = solicitarCadena();
		
		if (esPalindromo(cadena)==true)
			System.out.println("La cadena " + cadena + " es un palíndromo");
		else
			System.out.println("La cadena " + cadena + " no es un palíndromo");

	}

	private static String solicitarCadena() {
		String cadena;
		
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();
		
		return cadena;
	}
	
	public static boolean esPalindromo(String cadena) {
		
		String cadenaSinEspacios;
		boolean esPalindromo = true;
		int inicio = 0;
		int fin;
		char caracterInicio;
		char caracterFin;
		
		cadenaSinEspacios = cadena.replaceAll(" ", "");
		cadenaSinEspacios = cadenaSinEspacios.toUpperCase();
		
		fin = cadenaSinEspacios.length()-1;
		
		while (inicio < fin && esPalindromo == true ) {
			
			caracterInicio = cadenaSinEspacios.charAt(inicio);
			caracterFin = cadenaSinEspacios.charAt(fin);
			
			if (caracterInicio != caracterFin) {
				esPalindromo = false;
			}
			inicio++;
			fin--;
		}
		
		return esPalindromo;
			
		}
	}

