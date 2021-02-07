package ProgramaciónRelación3;
import java.util.Scanner;

public class Ejercicio07 {
	
	//Realizar un programa que solicite dos números enteros mayores que 0, que
	//calcule el máximo común divisor entre ellos mediante el algoritmo de
	//Euclides y que muestre por pantalla el resultado.
	
	private static final int MINIMO = 0;
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1, numero2;
		int resto;
		int dividendo, divisor;
		
		do {
			System.out.println("Introduce dos números mayores que 0");
			numero1=Integer.parseInt(teclado.nextLine());
			numero2=Integer.parseInt(teclado.nextLine());
		} while (numero1 <= MINIMO || numero2 <= MINIMO);
		
		if (numero1 < numero2) {
			
			dividendo = numero2;
			divisor = numero1;
		}
		
		else {
			dividendo = numero1;
			divisor = numero2;
		}

			resto = dividendo % divisor;
			while (resto != 0) {
				dividendo = divisor;
				divisor = resto;
				resto = dividendo % divisor;
			}
		
		System.out.println("El Maximo común divisor de " + numero1 + " y " + numero2 + " es " + divisor);
	}

}
