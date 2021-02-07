package Programaci�nRelaci�n2;
import java.util.Scanner;

public class Ejercicio10 {
	
	//Realizar un programa que dado un n�mero entero N calcule su factorial. Dise�ar el
	//programa de forma que si alg�n dato es incorrecto vuelva a solicitarse.

	private static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int numero; 
		int contador;
		long factorial;
		
		
		do {
			System.out.println("Introduce un n�mero mayor que 0");
			numero=Integer.parseInt(teclado.nextLine());
		} while (numero < 0);
		
		factorial=1;
		for ( contador = 1; contador <= numero; contador++) {
			factorial = factorial * contador;
		}
		System.out.println("El factorial de " + numero + " es " + factorial);
	}
	
}
