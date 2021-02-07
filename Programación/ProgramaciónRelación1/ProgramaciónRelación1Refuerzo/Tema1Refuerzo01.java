package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo01 {

	//Realizar un programa conversor de pesetas a euros.

	private static final double PESETAS_EUROS = 0.006;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		double euros;
		double cantidad = 0;

		
		System.out.println("introduce una cantidad (en pesetas)");
		cantidad = Integer.parseInt(teclado.nextLine());
		
		euros = cantidad * PESETAS_EUROS;
		
		System.out.println("La conversión de Pesetas/Euros de la cantidad introducida es: " + euros + "€");
		
	}

}
