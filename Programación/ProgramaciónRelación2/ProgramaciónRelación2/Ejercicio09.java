package Programaci�nRelaci�n2;
import java.util.Scanner;

public class Ejercicio09 {
	
	//Realizar un programa que lea un n�mero entero positivo y averig�e si es perfecto.
	//Un n�mero es perfecto cuando es igual a la suma de sus divisores excepto �l mismo.
	//Dise�ar el programa de forma que si alg�n dato es incorrecto vuelva a solicitarse.
	

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, divisorPosible, sumaDivisores;
		
		do {
			System.out.println("Introduce un numero entero positivo:");
			numero=Integer.parseInt(teclado.nextLine());
		}while (numero <=0);
		
		sumaDivisores=0;
		for (divisorPosible=1; divisorPosible<=numero/2; divisorPosible++) {
			
			if ( numero % divisorPosible==0) {
				sumaDivisores=sumaDivisores + divisorPosible;
			}
		}
		
		if ( numero==sumaDivisores) {
			System.out.println("El número " + numero + " es perfecto");
		}else {
			System.out.println("El número "+ numero + " NO es perfecto");
		}

	}

}
