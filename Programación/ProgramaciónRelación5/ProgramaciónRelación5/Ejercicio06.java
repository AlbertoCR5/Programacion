package ProgramaciónRelación5;
import java.util.Scanner;

public class Ejercicio06 {
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		String cadena;
		int numeroVocales;
		
		cadena = Ejercicio06.solicitarCadenaVacia("Introduce una frase: ");
		numeroVocales = Ejercicio06.cuentaVocalesDiferentes(cadena);
		
		System.out.println("La frase tiene " + numeroVocales + " vocales diferentes"); 

	}
	
	private static String solicitarCadenaVacia (String mensaje) {
		
		String cadena;
		
		do {
			System.out.println(mensaje);
			cadena = teclado.nextLine();			
		} while (cadena.length() == 0);
		
		return cadena;
	}
	
	public static int cuentaVocalesDiferentes (String cadena) {
		
		String vocales = "AEIOU";
		String mayusculas;
		int totalVocales=0;
		char vocal;
		
		mayusculas = cadena.toUpperCase();
		
		for ( int contador = 0; contador < vocales.length(); contador++) {
		
			vocal = vocales.charAt(contador);
			
			if (mayusculas.indexOf(vocal) !=-1) {
				totalVocales++;
			}
		}
		
		return totalVocales;
		
	}
}
