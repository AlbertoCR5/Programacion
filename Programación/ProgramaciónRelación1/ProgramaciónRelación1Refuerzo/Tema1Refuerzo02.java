package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo02 {
	
	//Realiza un programa que pida una hora por teclado y que muestre luego buenos
	//días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
	//12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas,
	//los minutos no se deben introducir por teclado.

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int hora;

		do {
			System.out.println("Introduce la hora que es ( 0 a 23)");
			hora = Integer.parseInt(teclado.nextLine());
		} while (hora < 0 && hora > 23);

		if (hora > 5 && hora < 13) {
			System.out.println("¡Buenos días!");
		} else {
			if (hora > 12 && hora < 21) {
				System.out.println("¡buenas tardes!");
			} else {
				System.out.println("¡Buenas noches!");
			}
		}

	}

}
