package Programaci�nRelaci�n4;
/*
 * Programa que usa un método que dado un número positivo devuelve su factorial.
 * Si el número es negativo se mostrará un mensaje de error y se devolverá un -1. 
 * 
 * Este método se usa desde el main para escribir los factoriales desde 0 hasta un número 
 * límite que se pida por teclado. 
 * 
 * */
import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Variables
		int numeroLimite;
		int contador;
		long factorial;
		
		//Se solicita el n�mero l�mite del factorial
		
		System.out.println("Introduce un n�mero limite para calcular factoriales: ");
		numeroLimite = Integer.parseInt(teclado.nextLine());
		
		//Se muestran los factoriales
		for (contador = 0; contador <= numeroLimite; contador++) {
			factorial = calcularFactorial(contador);
			System.out.println(contador + " != " + factorial);
		}
	}
	
	/**
	 * Método que calcula el factorial de un número positivo.
	 * Si el número es negativo muestra un mensaje de error y devuelve un -1
	 * 
	 * @param numero
	 *            numero
	 * @return factorial del numero, o -1 si es negativo
	 */
	
	public static long calcularFactorial(int numero) {
		
		long factorial = 1;
		int contador;
		
		if (numero < 0) {
			System.out.println("Error, no puede calcularse el factorial de un negativo");
			factorial = -1;
		} else {
			for (contador = 1; contador <= numero; contador++) {
				factorial = factorial * contador;
			}
		}
		
		return factorial;
	}
	
}
