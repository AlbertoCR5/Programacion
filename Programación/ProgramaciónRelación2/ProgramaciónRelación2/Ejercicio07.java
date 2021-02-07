package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio07 {
	
	//Realizar un programa que solicite una cantidad de números que van a pedirse por teclado.
	//Una vez que solicite todos ellos debe informar de cual es la media de los números. Diseñar el
	//programa de forma que si la cantidad es incorrecta vuelva a solicitarse.
	
	private static final int CANTIDAD_MINIMA = 1;

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		int suma;
		int cantidadNumeros;
		int contador;
		double media;
		
		do {
			System.out.println("¿Cuantos numeros va a introducir?" );
			cantidadNumeros=Integer.parseInt(teclado.nextLine());
		} while ( cantidadNumeros < CANTIDAD_MINIMA); 
		
		suma = 0;
		
		for (contador = 1; contador <= cantidadNumeros; contador++)
		{
			System.out.println("Introduce el número " + contador + " de " + cantidadNumeros);
			numero = Integer.parseInt(teclado.nextLine());
			
			suma = suma + numero;
		}
		
		media = (double) suma / cantidadNumeros;
		
		System.out.println("La media de los números introducidos es: " + media);
	}

}
