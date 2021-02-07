package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio05 {
	
	//Realizar un programa que solicite números hasta que se introduzca un número
	//negativo. Cuando termine informará de cuantos números positivos se han introducido.
	//En este programa el número 0 se considera positivo.

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int cantidadPositivos;

		cantidadPositivos = 0;
		do {
			System.out.println("introduce un número (negativo para terminar)");
			numero = Integer.parseInt(teclado.nextLine());
			cantidadPositivos++;
		} while (numero >= 0);
		
		cantidadPositivos = cantidadPositivos -1;
		
		
		System.out.println("Ha introducido un total de: " + cantidadPositivos + " números positivos");

	}

}
