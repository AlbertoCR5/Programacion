package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio03 {
	
	//Realizar un programa que solicite una cantidad de números que van a introducirse
	//por teclado. Después, para cada uno de ellos que indique si el número es par o impar.
	//Si la cantidad de números introducida es 0 o negativa volverá a solicitarse el dato.
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int cantidad;
		int contador;

		do {
			System.out.println("indica la cantidad de números que va a introducir");
			cantidad = Integer.parseInt(teclado.nextLine());
		} while (cantidad <= 0);

		contador = 1;
		while (contador <= cantidad) {
			System.out.println("Introduce numero (" + contador + ") de (" + cantidad + ")");
			numero = Integer.parseInt(teclado.nextLine());
			contador++;

			if (numero % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Número impar");

			}
		}

	}

}
