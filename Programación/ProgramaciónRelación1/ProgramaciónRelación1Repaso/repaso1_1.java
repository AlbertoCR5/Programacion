package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class repaso1_1 {
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		//VARIABLES
		int numero;
		
		//INICIO
			//ESCRIBIR
			System.out.println("introduce un numero");
			//LEER
			numero=Integer.parseInt(teclado.nextLine());
		
			if (numero % 2 == 0) {
				System.out.println("El número " + numero + " es par");
			}
			else {
				System.out.println("El número " + numero + " es impar");
			}

	}

}
