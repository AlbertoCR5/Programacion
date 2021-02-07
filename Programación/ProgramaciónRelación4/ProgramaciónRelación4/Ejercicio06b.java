package Programaci�nRelaci�n4;
import java.util.Scanner;

/**
 * Realizar un m�todo llamado siguienteFecha al que se le pasen 3 par�metros
 * enteros: � diaActual � mesActual � annoActual El m�todo no devuelve nada y
 * debe mostrar dos mensajes: La fecha de hoy es D-M-A La fecha de ma�ana es
 * D-M-A El m�todo supondr� que los datos de entrada son correctos. Esta
 * validaci�n de datos se realizar� desde el main. Probar el m�todo desde el
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

		//Se solicita el d�a, el mes y el anio.
		System.out.println("introduce el d�a del mes actual");
		dia = Integer.parseInt(teclado.nextLine());
		System.out.println("introduce el mes del a�o actual");
		mes = Integer.parseInt(teclado.nextLine());
		System.out.println("introduce el a�o actual");
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
		

		System.out.println("La fecha de ma�ana es: " + dia + "-" + mes + "-" + anio);
	}
} 

