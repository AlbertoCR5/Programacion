package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo09 {
	
	//Escribe un programa que, dado un número entero positivo, diga cuánto suman los
	//dígitos pares. LUsa long en lugar de int donde sea necesario para admitir
	//números largos.

	private final static int CUENTACIFRAS = 10;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		int numeroBis;
		int cifra;
		int numeroCifras = 0;
		int sumaPares = 0;
		
		
			System.out.println("introduce un número, 0 para terminar");
			numero=Integer.parseInt(teclado.nextLine());
			
			numeroBis = numero;
			
			if (numero == 0)
				numeroCifras = 1;
			else {
				
				while (numero != 0) {
					cifra = numero % 10;
					if (cifra % 2 == 0) {
						System.out.println(cifra);
						sumaPares = sumaPares + cifra;
					}
					numeroCifras++;
					numero = numero / CUENTACIFRAS;
				}
			}			
		
			System.out.println("La suma de las cifras pares es: " + sumaPares);
			
	}

}
