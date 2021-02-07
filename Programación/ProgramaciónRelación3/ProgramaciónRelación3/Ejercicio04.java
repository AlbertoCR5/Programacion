package Programaci�nRelaci�n3;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
	
	//Se desea realizar un programa que implemente un juego que consiste en acertar un n�mero secreto.
	//El ordenador deber� generar aleatoriamente un n�mero secreto entre 1 y 100 y el jugador tratar� de acertarlo.
	// Cada vez que el jugador introduzca un n�mero, se comprobar� si es el n�mero secreto, en cuyo caso termina el juego.
	//Si no lo es, se informar� que el n�mero introducido es mayor o menor que el n�mero secreto.
	//El programa termina cuando acierta el n�mero (gana) o cuando agota el n�mero de intentos
	//( en nuestro caso 5) sin acertar el n�mero , en cuyo caso pierde.
	//Si es n�mero no estuviese en el rango de 1-100, debe mostrar un mensaje
	//�El n�mero debe estar entre 1 y 100� y tambi�n debe contarse como un fallo.

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
			System.out.println("Introduce un n�mero del 1 al 100, tienes " + (MAXIMO_INTENTOS - intentos) + " intentos");
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
						System.out.println("Has Introducido un n�mero menor...");
						System.out.println(
								"Te quedan " + (MAXIMO_INTENTOS - intentos) + " intentos, introduce otro n�mero");
						numero = Integer.parseInt(teclado.nextLine());

					} else {
						if (numero > numeroAleatorio) {
							System.out.println("has introducido un n�mero mayor...");
							System.out.println("Te quedan " + (MAXIMO_INTENTOS - intentos) + " intentos, introduce otro n�mero");
							numero = Integer.parseInt(teclado.nextLine());
						}
					}
				}

			}
			intentos++;

		} while (intentos <= MAXIMO_INTENTOS);

	}

}
