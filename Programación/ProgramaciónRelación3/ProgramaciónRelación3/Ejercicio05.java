package Programaci�nRelaci�n3;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
	
	//Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras.
	//El programa nos pedir� la combinaci�n para abrirla. 
	//Si no acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la
	//combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
	//Tendremos cinco oportunidades para abrir la caja fuerte.
	
	private static final int MAXIMO = 9999;
	private static final int MAXIMO_INTENTOS = 5;

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int intentos;
		int numero;
		int numeroAleatorio;
		Random serieAleatoria = new Random();
		
		intentos = 0;
		do { 
			System.out.println("Introduce una combinaci�n, tienes " + (MAXIMO_INTENTOS - intentos) + " intentos");
			numero = Integer.parseInt(teclado.nextLine());
			numeroAleatorio = serieAleatoria.nextInt(MAXIMO) + 1;
			intentos++;
			
			if (numero != numeroAleatorio) {
				System.out.println("Esa no es la combianci�n");		
			}
			else {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}
		}while (intentos < MAXIMO_INTENTOS || numero == numeroAleatorio);
			
				System.out.println("Numero secreto " + numeroAleatorio);
			

	}

}
