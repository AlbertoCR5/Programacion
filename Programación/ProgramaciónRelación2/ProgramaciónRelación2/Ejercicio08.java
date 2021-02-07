package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio08 {

	//Realizar un programa que solicite un conjunto de números. Después de introducir cada número se realizará la pregunta:
	//"¿Desea introducir más números (S/N)". Si la respuesta es 'S' se solicitará otro número.
	//Cuando no desee introducir más números debe informar cual es el menor de los números introducidos.
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		double numero;
		char letra;
		double numeroMenor = Double.MAX_VALUE;
		
		do {
			System.out.println("introduce un número");
			numero=Integer.parseInt(teclado.nextLine());
			
			if (numero < numeroMenor) {
				numeroMenor = numero;
			}
			do {
			System.out.println("¿Desea introducir otro número? S/N");
			letra=teclado.nextLine().charAt(0);
			}while (letra != 's' && letra != 'n' );
			
		} while (letra == 's');
			System.out.println("El menor número introducido es el " + numeroMenor);
	}

}
