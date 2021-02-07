package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio04 {
	
	 //Realizar un programa que lea un número estrictamente positivo N y muestre la suma de los N primeros números.
	 //Diseña el programa de forma que si N es incorrecto vuelva a solicitarse.
	
	private static final int MIN_CANTIDAD_NUMEROS = 0;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		int contador;
		int resultado;
		
		do {
			System.out.println("Introduce un número");
			numero = Integer.parseInt(teclado.nextLine());
		}while (numero <= MIN_CANTIDAD_NUMEROS);
		
		resultado = 0;
		contador = 1;
		
		while (contador <= numero) {
			resultado = resultado + contador;
			contador++;
		}
		System.out.println("La suma de los " + numero + " primeros números es: " + resultado);

	}

}
