package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class Repaso1_6 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		//VARIABLES
		char letra;
		
		//AQUI COMIENZA EL PROGRAMA
		//INICIO
			
		//ESCRIBIR
			System.out.println("Introduce una letra (en Mayúscula)");
			letra=teclado.nextLine().charAt(0);
			
			switch (letra) {
			
			case 'A':
				System.out.println("Es la primera vocal (A)");
				break;
			case 'E':
				System.out.println("Es la primera vocal (A)");
				break;
			case 'I':
				System.out.println("Es la primera vocal (A)");
				break;
			case 'O':
				System.out.println("Es la primera vocal (A)");
				break;
			case 'U':
				System.out.println("Es la primera vocal (A)");
				break;
			default:
				System.out.println("No es una vocal Mayúscula");
			}
		


	}

}
