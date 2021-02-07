package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo08 {
	
	//Escribe un programa que diga cuál es la primera cifra de un número entero
	//introducido por teclado.
	
	private final static int PRIMERA_CIFRA = 10;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		int copiaNumero;
		
		System.out.println("introduce un múmero entero");
		numero=Integer.parseInt(teclado.nextLine());
		
		copiaNumero = numero;
		do {
			copiaNumero = copiaNumero / PRIMERA_CIFRA;
		} while (copiaNumero > 9);
		System.out.println("La primera cifra del número " + numero + " es el " + copiaNumero);
	}

}
