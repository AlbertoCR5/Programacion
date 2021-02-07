package Programaci�nRelaci�n2;
import java.util.Scanner;

public class Ejercicio08 {

	//Realizar un programa que solicite un conjunto de n�meros. Despu�s de introducir cada n�mero se realizar� la pregunta:
	//"�Desea introducir m�s n�meros (S/N)". Si la respuesta es 'S' se solicitar� otro n�mero.
	//Cuando no desee introducir m�s n�meros debe informar cual es el menor de los n�meros introducidos.
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		double numero;
		char letra;
		double numeroMenor = Double.MAX_VALUE;
		
		do {
			System.out.println("introduce un n�mero");
			numero=Integer.parseInt(teclado.nextLine());
			
			if (numero < numeroMenor) {
				numeroMenor = numero;
			}
			do {
			System.out.println("�Desea introducir otro n�mero? S/N");
			letra=teclado.nextLine().charAt(0);
			}while (letra != 's' && letra != 'n' );
			
		} while (letra == 's');
			System.out.println("El menor n�mero introducido es el " + numeroMenor);
	}

}
