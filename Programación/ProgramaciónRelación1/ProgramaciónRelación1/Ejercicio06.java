package ProgramaciónRelación1;
import java.util.Scanner;

public class Ejercicio06 {
	
	//Realizar un programa que solicite un carácter por teclado e informe por pantalla si el
	//carácter es una vocal o no lo es. Si es una vocal mostrará el mensaje “Es la primera vocal
	//(A)” o “Es la segunda vocal (E)”, etc.

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//VARIABLES
		char letra;
		
		//INICIO
		System.out.println("introduce una letra (en mayúsculas): ");
		//LEER letra
		letra=teclado.nextLine().charAt(0);
		
		
		switch (letra) {
		
		case 'A': 
			System.out.println("Es la primera vocal (A)");
			break;
		case 'E': 
			System.out.println("Es la segunda vocal (E)");
			break;
		case 'I':
			System.out.println("Es la tercera vocal (I)");
			break;
		case 'O':
			System.out.println("Es la cuarta vocal (O)");
			break;
		case 'U':
			System.out.println("Es la quinta vocal (U)");
			break;
		default:
			System.out.println("No es una vocal mayÃºscula");
		}
			
		
	

	}

}
