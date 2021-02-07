package ArraysTrimestre1;
/*Crea un programa que solicite números 
 * y luego los muestre en el orden inverso al
 * que se introdujeron
 */

import java.util.Scanner;

public class InvertirArrays {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int cantidadNumeros = solicitarCantidadNumeros();
		
		int[] numeros = new int [cantidadNumeros];
		
		solicitarNumeros(numeros);
		
		
		System.out.println("Impresion de numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("Impresion de numeros en orden invertido");
		for (int i = numeros.length-1; i>= 0; i--) {
			System.out.println(numeros[i]);
		}
		

	}

	public static void solicitarNumeros(int[] numeros) {
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce numero " + (i+1) + " de " + (numeros.length));
			numeros[i] = Integer.parseInt(teclado.nextLine());
		}
		
	}

	public static int solicitarCantidadNumeros() {
		
		System.out.println("Introduce la cantidad de números");
		int cantidadNumeros = Integer.parseInt(teclado.nextLine());
		
		return cantidadNumeros;
	}

}
