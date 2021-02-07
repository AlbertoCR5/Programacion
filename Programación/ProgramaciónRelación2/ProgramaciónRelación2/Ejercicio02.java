package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio02 {
	
	//Realizar un programa que lea un número entero entre 0 y 10 y visualice su tabla de multiplicar.
	
	private static final int MINIMO_NUMERO_TABLA = 1;
	private static final int MAXIMO_NUMERO_TABLA = 10;
	private static final int MINIMO_FACTOR = 0;
	private static final int MAXIMO_FACTOR = 10;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero;
		int contador;
		int resultado;
		
		do {
			System.out.println("introduce un número (" + MINIMO_NUMERO_TABLA + " a " + MAXIMO_NUMERO_TABLA + "): ");
			numero = Integer.parseInt(teclado.nextLine());
		} while (!(numero >= MINIMO_NUMERO_TABLA && numero <= MAXIMO_NUMERO_TABLA));

		System.out.println("Tabla del " + numero);
			
		contador = MINIMO_FACTOR;
		while (contador <= MAXIMO_FACTOR) {
			resultado = contador * numero;
			System.out.println(numero + "x" + contador + "=" + resultado);
			contador++;
		}
	}

}
