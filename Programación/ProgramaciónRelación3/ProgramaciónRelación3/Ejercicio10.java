package Programaci�nRelaci�n3;
import java.util.Scanner;

public class Ejercicio10 {
	
	//Realizar un programa que solicite la base de un tri�ngulo (debe ser un n�mero impar)
	//as� como un car�cter. El programa pintar� por pantalla un tri�ngulo con esa base de esta forma
			
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int base;
		int totalLineas;
		int caracteresPorLinea;
		char caracter;
		
		do {
			System.out.println("introduce un n�mero impar ( base )");
			base = Integer.parseInt(teclado.nextLine());
		}while (base <= 0 || base %2 ==0);
		
			System.out.println("Introduce un caracter");
			caracter = teclado.nextLine().charAt(0);
				
			totalLineas = (base/2) +1;
			
			caracteresPorLinea=1;
			
			for (int linea=1; linea <= totalLineas; linea++) {
				
				for (int contador=1; contador <= caracteresPorLinea; contador++) {
					System.out.print(caracter);
				}
				System.out.println();
				
				caracteresPorLinea = caracteresPorLinea +2;
		}

	}

}
