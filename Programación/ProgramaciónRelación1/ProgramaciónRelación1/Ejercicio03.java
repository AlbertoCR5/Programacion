package Programaci�nRelaci�n1;
import java.util.Scanner;

public class Ejercicio03 {
	
	//Realizar un programa que lea un n�mero por teclado. El programa debe imprimir en
	//pantalla un mensaje con �El n�mero xx es m�ltiplo de 2� o un mensaje con �El n�mero xx
	//es m�ltiplo de 3�. Si es m�ltiplo de 2 y de 3 deben aparecer los dos mensajes. Si no es
	//m�ltiplo de ninguno de los dos el programa finaliza sin mostrar ning�n mensaje.
	
	//CONSTANTES
	private static final int NUM_CLAVE_2 = 3;
	private static final int NUM_CLAVE_1 = 2;
	
	private static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {
		//VARIABLES
		int numero;
		
		//INICIO
		System.out.println("Introduce un n�mero: ");
		numero = Integer.parseInt(teclado.nextLine()); //LEER
		
		if (numero % NUM_CLAVE_1 == 0){
			System.out.println("El n�mero " + numero + " es m�ltiplo de " + NUM_CLAVE_1);
		}
		if (numero % NUM_CLAVE_2 == 0){
			System.out.println("El n�mero " + numero + " es m�ltiplo de " + NUM_CLAVE_2);
	
		}
		

	}

}
