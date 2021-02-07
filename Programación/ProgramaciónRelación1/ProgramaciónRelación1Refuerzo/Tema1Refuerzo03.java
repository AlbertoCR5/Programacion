package Programaci�nRelaci�n1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo03 {

	// Dise�ar un programa que calcule el per�metro de una figura geom�trica. Para
	// ello debemos preguntar
	// ��Cu�ntos lados tiene la figura?�. Luego debemos pedir la longitud de cada
	// uno de los lados
	// y mostrar el per�metro. Se debe garantizar que los datos son correctos.

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidad;
		double longitud;
		double perimetro;

		do {
			System.out.println("Introduce la cantidad de lados que tiene la figura");
			cantidad = teclado.nextInt();
		} while (cantidad < 3);

		perimetro = 0;

		for (int contador = 1; contador <= cantidad; contador++) {
			do {
				System.out.println("Introduce la longitud de el lado " + contador + "/" + cantidad);
				longitud = teclado.nextDouble();
			} while (longitud < 1);

			perimetro = perimetro + longitud;
		}

		System.out.println("El per�metro de la figura es: " + perimetro);

	}

}
