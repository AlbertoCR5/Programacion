package Programaci�nRelaci�n1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo08 {
	
	//Escribe un programa que diga cu�l es la primera cifra de un n�mero entero
	//introducido por teclado.
	
	private final static int PRIMERA_CIFRA = 10;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		int copiaNumero;
		
		System.out.println("introduce un m�mero entero");
		numero=Integer.parseInt(teclado.nextLine());
		
		copiaNumero = numero;
		do {
			copiaNumero = copiaNumero / PRIMERA_CIFRA;
		} while (copiaNumero > 9);
		System.out.println("La primera cifra del n�mero " + numero + " es el " + copiaNumero);
	}

}
