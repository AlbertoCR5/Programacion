package ProgramaciónRelación3;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04b {

	private static final int MINIMO = 0;
	private static final int MAXIMO = 100;
	private static final int MAXIMO_INTENTOS = 5;

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int intentos;
		int numero;
		int numeroAleatorio;
		boolean hasGanado = false;

		Random serieAleatoria = new Random();
		numeroAleatorio = serieAleatoria.nextInt(MAXIMO) + 1;

		intentos = 0;

		while (intentos < MAXIMO_INTENTOS && !hasGanado) {
			System.out.println("Introduce un número del 1 al 100, tienes " + (MAXIMO_INTENTOS - intentos) + " intentos");
			numero = Integer.parseInt(teclado.nextLine());

			if (numero <= MINIMO || numero > MAXIMO) {
				System.out.println("El número debe de estar entre " + (MINIMO + 1) + " y " + MAXIMO);
			}
			else {
				if (numero == numeroAleatorio) {
					hasGanado = true;
				}
				else {
					if (numero < numeroAleatorio) {
						System.out.println("Has Introducido un número menor...");
				}
				 else {
						System.out.println("has introducido un número mayor...");
					}
				}
			}

			intentos++;

		}

		if (hasGanado) {
			System.out.println("...:::YOU WIN:::...");
		} else {
			System.out.println("GAME OVER");
			System.out.println("Numero secreto " + numeroAleatorio);
		}

	}

}