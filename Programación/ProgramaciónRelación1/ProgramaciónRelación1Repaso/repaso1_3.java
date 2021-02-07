package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class repaso1_3 {
	
	//CONSTANTES
	private static final int DIVISOR_1=2;
	private static final int DIVISOR_2=3;
	
	private static Scanner teclado=new Scanner(System.in);
				
	public static void main(String[] args) {
		
		//VARIABLES
		int numero;
		
		//INICIO
			//ESCRIBIR
			System.out.println("Introduce un número");
			//LEER
			numero=Integer.parseInt(teclado.nextLine());
			
				if (numero % DIVISOR_1 == 0 ) {
					System.out.println("El número " + numero + " es multiplo de " + DIVISOR_1);
				}
				if (numero % DIVISOR_2 == 0 ) {
					System.out.println("El número " + numero + " es múltiplo de " + DIVISOR_2);
					
				}
		
		

	}

}
