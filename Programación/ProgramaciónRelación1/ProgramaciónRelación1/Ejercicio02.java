package Programaci�nRelaci�n1;
import java.util.Scanner;

public class Ejercicio02 {
	
	//Realizar un programa que solicite dos n�meros por teclado e imprima en pantalla si son iguales, el primero mayor que el segundo o el primero m�s peque�o que el segundo.

	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {

		//AQUI EMPIEZA EL PROGRAMA
		
		//VARIABLES
		int numero1,numero2;
		
		//INICIO
		
		System.out.println("Introduce dos n�meros"); 
		//LEER numero1
		numero1= Integer.parseInt(teclado.nextLine());
		//LEER numero2
		numero2= Integer.parseInt(teclado.nextLine());
		
		if (numero1 == numero2) {
			System.out.println("son iguales");
		}
		else {
			if (numero1 > numero2) {
				System.out.println("El primer n�nero es mayor");
			}else {
				System.out.println("El primer numero es menor");
				
				
				
			}
			
		}
		

	}

}
