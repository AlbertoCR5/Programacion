package Programaci�nRelaci�n1;
import java.util.Scanner;

public class Ejercicio05 {
	
	//Realizar un programa que solicite 4 n�meros e imprima la media de los n�meros. Tambi�n
	//debe imprimir aquellos n�meros que son superiores a la media.

	
	//CONSTANTES
	private static final int CANTIDAD_DE_NUMEROS =4;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		//AQUI EMPIEZA EL PROGRAMA
		
		//VARIABLES
		double numero1,numero2,numero3,numero4;
		double media;
		
		//INICIO
		System.out.println("Introduce el primer número"); 
		//LEER numero1
		numero1= Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el segundo número");
		//LEER numero2
		numero2= Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el tercer número");
		//LEER numero3
		numero3= Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el cuarto número");
		//LEER numero4
		numero4= Integer.parseInt(teclado.nextLine());
		
		media = (numero1 + numero2 + numero3 + numero4) / CANTIDAD_DE_NUMEROS;
		
		System.out.println("La media vale " + media);
		System.out.println("Los números superiores a la media son: ");
		
		if (numero1 > media) {
		System.out.println(+ numero1);
		}
		if (numero2 > media) {
		System.out.println(+ numero2);
		}
		if (numero3 > media) {
		System.out.println(+ numero3);
		}
		if (numero4 > media) {
		System.out.println(+ numero4);
		}
		
		
		
		
		
		
		
		
		
		


	}

}
