package ProgramaciónRelación3;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04c {

	private static final int MINIMO = 0;
	private static final int MAXIMO = 100;
	private static final int MAXIMO_INTENTOS = 5;

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int intentos;
		int numero;
		int numeroAleatorio;
		Random serieAleatoria = new Random();

		
		intentos = 0;
		
		do {		
			System.out.println("Introduce un número del 1 al 100, tienes " + (MAXIMO_INTENTOS - intentos) + " intentos");
			numero = Integer.parseInt(teclado.nextLine());
			numeroAleatorio = serieAleatoria.nextInt(MAXIMO) + 1;	
			intentos++;
		} while (numero < MINIMO || numero > MAXIMO);

		do {
			if (numero == numeroAleatorio) {
				System.out.println("...:::YOU WIN:::...");
				break;
			} else {
				if (intentos == MAXIMO_INTENTOS) {
					System.out.println("Numero secreto " + numeroAleatorio);
					System.out.println("GAME OVER");
					break;
				} else {
					if (numero < numeroAleatorio) {
						System.out.println("Has Introducido un número menor...");
						System.out.println("Te quedan " + (MAXIMO_INTENTOS - intentos) + " intentos, introduce otro número");
						numero = Integer.parseInt(teclado.nextLine());

					} else {
						if (numero > numeroAleatorio) {
							System.out.println("has introducido un número mayor...");
							System.out.println("Te quedan " + (MAXIMO_INTENTOS - intentos) + " intentos, introduce otro número");
							numero = Integer.parseInt(teclado.nextLine());
						}
					}
				}

			}
			intentos++;

		} while (intentos <= MAXIMO_INTENTOS);

	}

}
