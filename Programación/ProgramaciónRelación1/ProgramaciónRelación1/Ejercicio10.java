package ProgramaciónRelación1;
import java.util.Scanner;

public class Ejercicio10 {
	
	//Una pastelería nos ha pedido realizar un programa que calcule el presupuesto de las tartas que fabrica.
	//El programa preguntará primero de qué tipo quiere la tarta (M- Manzana, F-Fresa o C-Chocolate).
	//La tarta de manzana vale 12 euros y la de fresa 16. En caso de seleccionar la
	//tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco;
	//la primera opción vale 14 euros y la segunda 15.
	//Por último, en cualquiera de los tipos de tarta, se pregunta si se añade nata y si se
	//personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.


	private static final double TARTA_MANZANA = 12.0;
	private static final double TARTA_FRESA = 16.0;
	private static final double TARTA_CHOCOLATE_BLANCO = 15.0;
	private static final double TARTA_CHOCOLATE_NEGRO = 14.0;
	private static final double EXTRA_NATA = 2.50;
	private static final double EXTRA_PERSONALIZACION = 2.75;
	
	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
	
	double precioFinal = 0;
	char tipoTarta = 0;
	char tipoChocolate;
	char respuesta;
	
		System.out.println("introduce el tipo de tarta: (M-Manzana, F-Fresa, C-Cholate)");
		tipoTarta=teclado.nextLine().charAt(0);
		tipoTarta=Character.toUpperCase(tipoTarta);
		
		switch (tipoTarta) {
		case 'M':
			precioFinal=TARTA_MANZANA;
			break;
		case 'F':
			precioFinal=TARTA_FRESA;
			break;
		case 'C':
			System.out.println("introduce tipo de chocolate (B-Blanco, N-Negro)");
			tipoChocolate=teclado.nextLine().charAt(0);
			tipoChocolate=Character.toUpperCase(tipoChocolate);
			
			if (tipoChocolate=='B') {
			precioFinal=TARTA_CHOCOLATE_BLANCO;
			} else {
				precioFinal=TARTA_CHOCOLATE_NEGRO;
			}
			break;
			
		}
		System.out.println("¿Desea añadir nata (S/N)?");
		respuesta=teclado.nextLine().charAt(0);
		respuesta=Character.toUpperCase(respuesta);
	
		if ( respuesta == 'S' ) {
			 precioFinal = precioFinal + EXTRA_NATA;
		}
		
		System.out.println("¿Desea añadir personalizacion (S/N)");
		respuesta=teclado.nextLine().charAt(0);
		respuesta=Character.toUpperCase(respuesta);
		if (respuesta == 'S') {
			precioFinal = precioFinal + EXTRA_PERSONALIZACION;
			}
		
		System.out.println("El precio de su tarta es: " + precioFinal);
	}	
}
