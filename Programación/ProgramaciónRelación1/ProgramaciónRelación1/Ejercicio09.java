package Programaci�nRelaci�n1;
import java.util.Scanner;

public class Ejercicio09 {
	
	//Realizar un programa que lea un car�cter y dos n�meros enteros por teclado. Si el car�cter le�do es un operador
	//aritm�tico, calcular la operaci�n correspondiente, si es cualquier otro debe mostrar un error.
	


	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1, numero2;
		double resultado = 0;
		char operador;
		boolean hayError= false;
		
		System.out.println("Introduce dos n�meros");
		numero1=Integer.parseInt(teclado.nextLine());
		numero2=Integer.parseInt(teclado.nextLine());
		
		System.out.println("Introduce operador");
		operador = teclado.nextLine().charAt(0);
		
		hayError = false;
		
		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			break;
		
		case '-':
			resultado = numero1 - numero2;
			break;
			
		case '*':
			resultado = numero1 * numero2;
			break;
			
		case '/':
			if (numero2 == 0) {
				hayError = true;
				System.out.println("Error, no puede dividirse por 0");
			} else {
				resultado = (double) numero1/numero2;
				}
			break;
		default :
			System.out.println("Operador incorrecto");
			hayError = true;
		}
		
		if (hayError == false) {
			System.out.println("El resultado es: " + resultado);
		}
		
		
		
		

	}

}
