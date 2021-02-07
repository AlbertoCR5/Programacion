package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class Repaso1_4 {
	
	private static Scanner teclado =new Scanner(System.in);
	
		//CONSTANTES
			private static final int EDAD_MAXIMA = 99;
			private static final int LIMITE_NINHO = 12;
			private static final int LIMITE_ADOLESCENTE = 17;
			private static final int LIMITE_JOVEN = 29;

	public static void main(String[] args) {
		
		//VARIABLES
			int edad;
			
		//INICIO
			//ESCRIBIR
			System.out.println("Introduce tu edad");
			edad=Integer.parseInt(teclado.nextLine());
			//LEER
			
			if (edad < 0 || edad > EDAD_MAXIMA) {	
			System.out.println("Edad incorrecta");
			
			}else {
				if (edad <= LIMITE_NINHO) {
					System.out.println("Eres un niño");
					
				}else {
					if (edad <= LIMITE_ADOLESCENTE) {
						System.out.println("Eres un adolescente");
						
					}else {
						if (edad <= LIMITE_JOVEN) {
							System.out.println("Eres un joven");
						}else {
							System.out.println("Eres un adulto");
						}
							
					}
				
				}
			}
		}
}

	


