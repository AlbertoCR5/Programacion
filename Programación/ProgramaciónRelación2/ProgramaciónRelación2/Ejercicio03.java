package Programaci�nRelaci�n2;
import java.util.Scanner;

public class Ejercicio03 {
	
	//Realizar un programa que solicite una cantidad de n�meros que van a introducirse
	//por teclado. Despu�s, para cada uno de ellos que indique si el n�mero es par o impar.
	//Si la cantidad de n�meros introducida es 0 o negativa volver� a solicitarse el dato.
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int cantidad;
		int contador;

		do {
			System.out.println("indica la cantidad de n�meros que va a introducir");
			cantidad = Integer.parseInt(teclado.nextLine());
		} while (cantidad <= 0);

		contador = 1;
		while (contador <= cantidad) {
			System.out.println("Introduce numero (" + contador + ") de (" + cantidad + ")");
			numero = Integer.parseInt(teclado.nextLine());
			contador++;

			if (numero % 2 == 0) {
				System.out.println("N�mero par");
			} else {
				System.out.println("N�mero impar");

			}
		}

	}

}
