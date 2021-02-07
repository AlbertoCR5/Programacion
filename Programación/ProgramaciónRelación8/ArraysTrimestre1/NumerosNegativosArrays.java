package ArraysTrimestre1;

import java.util.Scanner;

public class NumerosNegativosArrays {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidadNumeros;

		cantidadNumeros = solicitarCantidadNumeros("Introduce la cantidad de numeros a solicitar");
		int[] numeros = new int[cantidadNumeros];

		int negativos = solicitarNumeros(numeros);

		System.out.println("El numero de negativos introducidos es " + negativos);

	}

	private static int solicitarNumeros(int[] numeros) {

		int negativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero " + (i + 1) + " de " + numeros.length);
			numeros[i] = Integer.parseInt(teclado.nextLine());

			if (numeros[i] < 0) {
				negativos++;
			}
		}

		return negativos;
	}

	private static int solicitarCantidadNumeros(String msg) {

		int cantidadNumeros;

		System.out.println(msg);
		cantidadNumeros = Integer.parseInt(teclado.nextLine());

		return cantidadNumeros;
	}

}
