package ProgramaciónRelación4;
import java.util.Scanner;

/**
 * Realizar un método llamado siguienteFecha al que se le pasen 3 parámetros
 * enteros: • diaActual • mesActual • annoActual El método no devuelve nada y
 * debe mostrar dos mensajes: La fecha de hoy es D-M-A La fecha de mañana es
 * D-M-A El método supondrá que los datos de entrada son correctos. Esta
 * validación de datos se realizará desde el main. Probar el método desde el
 * main.
 **/

public class Ejercicio06b {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		//Variables
		int dia;
		int mes;
		int anio;
		int diasMesAnio;

		//Se solicita el día, el mes y el anio.
		System.out.println("introduce el día del mes actual");
		dia = Integer.parseInt(teclado.nextLine());
		System.out.println("introduce el mes del año actual");
		mes = Integer.parseInt(teclado.nextLine());
		System.out.println("introduce el año actual");
		anio = Integer.parseInt(teclado.nextLine());

		System.out.println("La fecha de hoy es: " + dia + "-" + mes + "-" + anio);
		
		if (mes <= 12) {
			
			diasMesAnio = Ejercicio04.calcularDiasMesAnio(mes, anio);
			if (dia <= diasMesAnio) {
				siguienteFecha(dia, mes, anio);
			} 
			else {
				System.out.println("La fecha introducida no es correcta");
			}
		} else {
			System.out.println("La fecha no es correcta");
			
			
		}
	}
	public static void siguienteFecha (int dia, int mes, int anio) {
		
		int diasMesAnio;
		diasMesAnio = Ejercicio04.calcularDiasMesAnio(mes, anio);
		
		if (dia < diasMesAnio) {
			dia = dia +1;
		}
		else {
			dia = 1;
			if (mes < 12 ) {
				mes = mes +1;
			}
			else {
				mes = 1;
				anio = anio +1;
			}
		}		
		

		System.out.println("La fecha de mañana es: " + dia + "-" + mes + "-" + anio);
	}
} 

