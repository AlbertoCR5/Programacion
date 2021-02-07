package ProgramaciónRelación4;
/**Realizar un método llamado pintarNuevaHora al que se le pasen 4
*parámetros enteros:
*• horaActual
*• minutosActuales
*• segundosActuales
*• segundosASumar
*El método no devuelve nada
*/

import java.util.Scanner;

public class Ejercicio05 {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//variables
		int hora;
		int minutos;
		int segundos;
		int segundosASumar;
		
		
		//Se Solicita la hora actual
		hora = Ejercicio05.solicitarHora();		
		minutos = Ejercicio05.solicitarMinutos();
		segundos = Ejercicio05.solicitarSegundos();
		
		//Se solicita el numero de segundos a sumar
		segundosASumar = Ejercicio05.solicitarSegundosASumar();
		
		imprimirNuevaHora(hora, minutos, segundos, segundosASumar);
		
	}
	
	private static int solicitarHora() {
		int hora;
		
		do{
			System.out.println("Introduce la hora actual: ");
			hora = Integer.parseInt(teclado.nextLine());
		}while (hora < 0 || hora > 23);
		
		return hora;
		
	}
	
	private static int solicitarMinutos() {
		int minutos;
		
		do{
			System.out.println("Introduce los minutos: ");
			minutos = Integer.parseInt(teclado.nextLine());
		}while (minutos < 0 || minutos > 59);
		
		return minutos;
		
	}
	
	private static int solicitarSegundos() {
		int segundos;
		
		do{
			System.out.println("Introduce los segundos");
			segundos = Integer.parseInt(teclado.nextLine());
		}while (segundos < 0 || segundos > 59);
		
		return segundos;
	}
	
	private static int solicitarSegundosASumar() {
		int segundosASumar;
		
		System.out.println("Introduce los segundos a sumar: ");
		segundosASumar = Integer.parseInt(teclado.nextLine());
		
		return segundosASumar;
	}
	public static void imprimirNuevaHora (int hora, int minutos, int segundos, int segundosASumar) {
		int horaNueva;
		int minutosNuevos;
		int segundosNuevos;
		int segundosTotales;
		
		System.out.println("La Hora anterior era: " + hora + " : " + minutos + " : " + segundos);
		
		//Se calculan los segundos de la nueva hora
		segundosTotales = hora * 3600 + minutos * 60 + segundos + segundosASumar;
		
		// En el caso de que los segundos a sumar sean negativos,
		//es decir, que se atrase el reloj
		if (segundosTotales < 0) {
			segundosTotales = 24 * 3600 + segundosTotales;
		}
		
		horaNueva = segundosTotales / 3600; 
		horaNueva = horaNueva % 24;
		
		
		minutosNuevos = (segundosTotales %3600) / 60;
		minutosNuevos = minutosNuevos % 60;
		
		segundosNuevos = (segundosTotales & 3600) % 60;
		
		System.out.println("La nueva hora es: " + horaNueva + " : " + minutosNuevos + " : " + segundosNuevos);
	}	
}
