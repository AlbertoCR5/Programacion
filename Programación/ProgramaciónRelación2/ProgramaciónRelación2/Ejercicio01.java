package ProgramaciónRelación2;
import java.util.Scanner;

public class Ejercicio01 {
	
	//Realizar un programa que solicite 10 números por teclado e indique para cada uno
	//de ellos si es positivo o negativo. El cero se considera positivo.
	
	private static final int CANTIDAD_NUMEROS = 10;
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero;
		int contador;
		
		contador=1;
		
		while (contador <= CANTIDAD_NUMEROS) {
			System.out.println("Introduce número " + contador + " de " + CANTIDAD_NUMEROS);
			numero=Integer.parseInt(teclado.nextLine());
		
			if (numero < 0) {
				System.out.println("Número negativo");
			}else {
				System.out.println("Número positivo");
			}
			contador++;
		}

	}

}
