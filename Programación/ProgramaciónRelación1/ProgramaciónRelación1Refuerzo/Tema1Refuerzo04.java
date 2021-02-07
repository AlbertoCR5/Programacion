package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo04 {
	
	//Diseñar un programa que lea números hasta que el usuario introduzca el 0. Debe
	//informar de la media de los números leídos (sin tener en cuenta el 0) y el valor
	//máximo y mínimo introducido

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		double numero;
		double media;
		double minimo = Double.MAX_VALUE;
		double maximo = Double.MIN_VALUE;
		int totalNumeros = 0;
		double sumaNumeros = 0;
		
		do {
			System.out.println("Introduce número (0 para terminar)");
			numero = teclado.nextInt();
			if (numero != 0 ) {
				
				if (numero < minimo) {
				minimo = numero;
				}
				if (numero > maximo) {
				maximo = numero;
				}
			}	
			sumaNumeros = sumaNumeros + numero;
			totalNumeros++;
				
		} while (numero != 0);
		
		System.out.println("El máximo de los números introducidos es: " + maximo);
		System.out.println("El mínimo de los números introducidos es: " + minimo);
		
			if (totalNumeros ==0) {
				System.out.println("No se puede calcular la media");
			}
			else {
			media = sumaNumeros / totalNumeros;
		
			System.out.println("La media de los números leidos es: " + media);
			}
	}
}