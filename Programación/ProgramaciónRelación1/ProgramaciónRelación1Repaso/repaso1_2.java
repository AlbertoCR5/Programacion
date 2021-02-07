package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class repaso1_2 {
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		//VARIABLES
		int numero1;
		int numero2;
		
		//INICIO
			//ESCRIBIR
			System.out.println("Introduce dos números");
			//LEER
			numero1=Integer.parseInt(teclado.nextLine());
			numero2=Integer.parseInt(teclado.nextLine());
			
			if (numero1 == numero2) {
				//ESCRIBIR
				System.out.println("El número " + numero1 + " y el número " + numero2 + " son iguales");
			}
			else { 
				if (numero1 < numero2) {
					//ESCRIBIR
					System.out.println("El primer número es menor que el segundo");
				}
				else {
					System.out.println("El primer número es mayor que el segundo");
				}
				
			}
			


	}

}
