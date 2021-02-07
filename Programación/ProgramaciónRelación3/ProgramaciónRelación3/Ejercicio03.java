package Programaci�nRelaci�n3;
import java.util.Scanner;

public class Ejercicio03 {

	// Realizar un programa que solicite un n�mero entero y determine el n�mero
	// de cifras que tiene dicho n�mero.

	private final static int CUENTACIFRAS = 10;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int numeroBis;
		int numeroCifras = 0;

		System.out.println("Introduce un n�mero");
		numero = teclado.nextInt();

		numeroBis = numero;

		if (numero == 0) {
			numeroCifras = 1;
		} else {
			while (numero != 0) {
				numeroCifras++;
				numero = numero / CUENTACIFRAS;
			}
		}

		System.out.println("El n�mero " + numeroBis + " tiene " + numeroCifras + " cifras");
	}

}
