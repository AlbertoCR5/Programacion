package Programaci�nRelaci�n1Repaso;
import java.util.Scanner;

public class repaso1_2 {
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		//VARIABLES
		int numero1;
		int numero2;
		
		//INICIO
			//ESCRIBIR
			System.out.println("Introduce dos n�meros");
			//LEER
			numero1=Integer.parseInt(teclado.nextLine());
			numero2=Integer.parseInt(teclado.nextLine());
			
			if (numero1 == numero2) {
				//ESCRIBIR
				System.out.println("El n�mero " + numero1 + " y el n�mero " + numero2 + " son iguales");
			}
			else { 
				if (numero1 < numero2) {
					//ESCRIBIR
					System.out.println("El primer n�mero es menor que el segundo");
				}
				else {
					System.out.println("El primer n�mero es mayor que el segundo");
				}
				
			}
			


	}

}
