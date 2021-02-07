package ProgramaciónRelación1;
import java.util.Scanner;

public class Ejercicio01 {
	//Realizar un programa que lea un número entero por teclado e informe de si el número es par o impar (el cero se considera par).
	
	//Creal el objeto teclado
	private static Scanner teclado=new Scanner(System.in);
	
	//CONSTANTES
	
	public static void main(String[] args) {
		//VARIABLES
		int numero;
		
		//INICIO
		
		System.out.println("Introduce el numero"); //ESCRIBIR...
		numero=Integer.parseInt(teclado.nextLine()); //LEER...
		
		if (numero % 2 == 0) {
			System.out.println(numero + " es par");
		}
		else {
			System.out.println(numero + " es impar");
		}

	}

}
