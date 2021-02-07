package ArraysTrimestre1;

import java.util.Scanner;

public class DesgloseNumerosArrays1 {

	private static final int MAX_VALUE = 9999;
	private static final int MIN_VALUE = -9999;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidadNumeros;

		cantidadNumeros = solicitarCantidadNumeros();

		int[] numeros = new int[cantidadNumeros];

		solicitarNumeros(numeros);

		estadistica(numeros);

	}

	private static int solicitarCantidadNumeros() {

		int cantidadNumeros;

		System.out.println("Introduce la cantidad de numeros a solicitar");
		cantidadNumeros = Integer.parseInt(teclado.nextLine());

		return cantidadNumeros;
	}

	private static void solicitarNumeros(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce numero " + (i + 1) + " de " + numeros.length);
			numeros[i] = Integer.parseInt(teclado.nextLine());

		}

	}

	private static void estadistica(int[] numeros) {

		int numeroMayor = MIN_VALUE, numeroMenor = MAX_VALUE;
		int mayorRepetido = 0, menorRepetido = 0;
		int suma = 0;
		double media;

		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
			if (numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
			if (numeros[i] < numeroMenor) {
				numeroMenor = numeros[i];
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeroMayor == numeros[i]) {
				mayorRepetido++;
			}
			if (numeroMenor == numeros[i]) {
				menorRepetido++;
			}
		}
		System.out.println(suma);
		media = (double) suma / numeros.length;

		System.out.println("La media vale " + media);
		System.out.println("El numero mayor es el " + numeroMayor + " y se repite " + mayorRepetido + " veces.");
		System.out.println("El numero menor es el " + numeroMenor + " y se repite " + menorRepetido + " veces.");
	}

}
