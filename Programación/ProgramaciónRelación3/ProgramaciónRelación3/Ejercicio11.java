package ProgramaciónRelación3;
import java.util.Scanner;

public class Ejercicio11 {
	
	//Realizar un programa que solicite la base de un rombo (debe ser un número impar)
	//así como un carácter. El programa pintará por pantalla un rombo con esa base de esta forma
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int base;
		int totalLineas;
		int caracteresPorLinea;
		int espaciosPorLinea;
		char caracter;
		
		do {
			System.out.println("introduce un número impar ( base )");
			base = Integer.parseInt(teclado.nextLine());
		}while (base <= 0 || base %2 ==0);
		
			System.out.println("Introduce un caracter");
			caracter = teclado.nextLine().charAt(0);
				
			totalLineas = (base/2) +1;
			
			caracteresPorLinea=1;
			espaciosPorLinea = (base/2);
			
			for (int linea=1; linea <= totalLineas; linea++) {
				
				for (int contadorEspacios=1; contadorEspacios<=espaciosPorLinea; contadorEspacios++) {
					System.out.print(" ");
				}
				
				for (int contadorCaracteres=1; contadorCaracteres<=caracteresPorLinea; contadorCaracteres++) {
					System.out.print(caracter);
				}
				System.out.println();
				
				caracteresPorLinea= caracteresPorLinea +2;
				espaciosPorLinea--;
			}	
			
			espaciosPorLinea=1;
			caracteresPorLinea=base -2;
			for (int linea=1; linea<totalLineas; linea++) {
				
				for (int contadorEspacios=1; contadorEspacios<=espaciosPorLinea; contadorEspacios++) {
					System.out.print(" ");
				}
				
				for (int contadorCaracteres=1; contadorCaracteres<=caracteresPorLinea; contadorCaracteres++) {
					System.out.print(caracter);
				}
				System.out.println();
				
				caracteresPorLinea= caracteresPorLinea -2;
				espaciosPorLinea++;
				
			}
	}

}
