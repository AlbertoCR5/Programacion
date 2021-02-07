package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class Repaso1_8 {
	
	private static final int HORA_SEGUNDOS = 3600;
	private static final int MIN_SEGUNDOS = 60;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		 
		//VARIABLES
		int hora1, minutos1, segundos1;
		int hora2, minutos2, segundos2;
		int totalSegundos1,  totalSegundos2;
		
		
		//INICIO
			System.out.println("Introduce la primera marcación (Hora, Minutos, Segundos)");
			hora1=Integer.parseInt(teclado.nextLine());
			minutos1=Integer.parseInt(teclado.nextLine());
			segundos1=Integer.parseInt(teclado.nextLine());
			
			if ((hora1 < 0) || (hora1 > 60) || (minutos1 < 0) || (minutos1 > 60) || (segundos1 < 0) || (segundos1 > 60)) { 
				System.out.println("Primera marcación incorrecta");
			} else { 
				System.out.println("Introduce la segunda marcación (Hora, Minutos, Segundos)");
				hora2=Integer.parseInt(teclado.nextLine());
				minutos2=Integer.parseInt(teclado.nextLine());
				segundos2=Integer.parseInt(teclado.nextLine());
				if ((hora2 < 0) || (hora2 > 60) || (minutos2 < 0) || (minutos2 > 60) || (segundos2 < 0) || (segundos2 > 60)) {
					System.out.println("Segunda marcación incorrecta");
				}
				
				totalSegundos1 = segundos1 + (60 * MIN_SEGUNDOS) + (HORA_SEGUNDOS * hora1);
				totalSegundos2 = segundos2 + (60 * MIN_SEGUNDOS) + (HORA_SEGUNDOS * hora2);
				
				
				if (totalSegundos1 > totalSegundos2) {
					System.out.println("Hora 1 es mayor que hora 2");
				} else {
					if (totalSegundos1 < totalSegundos2) {
						System.out.println("Hora 1 es menor que hora 2");
					
					} else {
						System.out.println("Hora 1 es igual que hora 2");
					}
				}
			}
	}
}

