package Programaci�nRelaci�n3;
import java.util.Scanner;

public class Ejercicio08 {
	
	//Realizar un programa que solicite el ancho y el alto de un rect�ngulo, as�
	//como el car�cter con el que se quiere dibujar. El programa pintar� un
	//rect�ngulo de dichas dimensiones con el car�cter

	private static Scanner teclado = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		int base;
		int altura;
		
		System.out.println("Introduce dos n�meros ( base y altura )");
		base = Integer.parseInt(teclado.nextLine());
		altura = Integer.parseInt(teclado.nextLine());
		
		for ( int contador1 = 1; contador1 <= altura; contador1++ ) {
			
			for ( int contador2 = 1; contador2 <= base; contador2++) {
				System.out.print("#");	
				
			}
			System.out.println("#");
		}
		
		


	}

}
