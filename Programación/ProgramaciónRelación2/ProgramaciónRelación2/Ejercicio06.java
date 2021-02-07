package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio06 {
	
	//Realizar un programa que lea dos números enteros cualesquiera numeroA y numeroB,
	//y calcule el producto de A y B mediante sumas, es decir, sin usar el operador *.
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		int numero1, numero2;
		int contador;
		int resultado;
		boolean cambiarSigno;
		
		
		System.out.println("introduce dos números");
		numero1 = Integer.parseInt(teclado.nextLine());
		numero2 = Integer.parseInt(teclado.nextLine());
		
		cambiarSigno = false;
		
		if (numero2 < 0) {
			numero2 = - numero2;
			cambiarSigno= true;
		}
		
		resultado = 0;
		
		for ( contador = 1; contador <= numero2; contador++) {
			resultado = resultado + numero1;
		}
		
		if (cambiarSigno) {
			resultado = - resultado;
		}
			
			System.out.println("El producto de los números " + numero1 + " y " + numero2 + " es: " + resultado);
	}

}
