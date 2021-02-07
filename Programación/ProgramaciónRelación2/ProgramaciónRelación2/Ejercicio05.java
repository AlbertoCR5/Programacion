package Programaci�nRelaci�n2;
import java.util.Scanner;

public class Ejercicio05 {
	
	//Realizar un programa que solicite n�meros hasta que se introduzca un n�mero
	//negativo. Cuando termine informar� de cuantos n�meros positivos se han introducido.
	//En este programa el n�mero 0 se considera positivo.

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int cantidadPositivos;

		cantidadPositivos = 0;
		do {
			System.out.println("introduce un n�mero (negativo para terminar)");
			numero = Integer.parseInt(teclado.nextLine());
			cantidadPositivos++;
		} while (numero >= 0);
		
		cantidadPositivos = cantidadPositivos -1;
		
		
		System.out.println("Ha introducido un total de: " + cantidadPositivos + " n�meros positivos");

	}

}
