package ProgramaciónRelación3;
import java.util.Scanner;

public class Ejercicio03 {

	// Realizar un programa que solicite un número entero y determine el número
	// de cifras que tiene dicho número.

	private final static int CUENTACIFRAS = 10;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int numeroBis;
		int numeroCifras = 0;

		System.out.println("Introduce un número");
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

		System.out.println("El número " + numeroBis + " tiene " + numeroCifras + " cifras");
	}

}
