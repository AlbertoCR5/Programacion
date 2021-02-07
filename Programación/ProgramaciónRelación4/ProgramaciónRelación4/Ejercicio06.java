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

public class Ejercicio06 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Variables
		int dia, mes, anio;
		boolean fechaCorrecta;

		// Se Solicita la fecha de hoy
		do {
			dia = Ejercicio06.solicitarDia();
			mes = Ejercicio06.solicitarMes();
			anio = Ejercicio06.solicitarAnio();

			// Se comprueba que la fecha sea correcta
			fechaCorrecta = Ejercicio06.comprobarFechaCorrecta(dia, mes, anio);

		} while (fechaCorrecta == false);

		// Se muestra la fecha de hoy y la de mañana
		Ejercicio06.siguienteFecha(dia, mes, anio);

	}

	/**
	 * 
	 * @param diaActual  es un dÃ­a entre 1 y 31
	 * @param mesActual  es un mes entre 1 y 12
	 * @param annoActual es un nÃºmero positivo
	 */

	private static void siguienteFecha(int dia, int mes, int anio) {

		int diaSiguiente, mesSiguiente, anioSiguiente;
		int diasMes;

		// Se inicializan las variables
		mesSiguiente = mes;
		anioSiguiente = anio;

		// Se muestra la fecha actual
		System.out.println("La fecha de hoy es: " + dia + "-" + mes + "-" + anio);

		// Se calcula la siguiente fecha
		diasMes = Ejercicio04.calcularDiasMesAnio(mes, anio);

		if (diasMes == dia) {
			diaSiguiente = 1;
			if (mes == 12) {
				mesSiguiente = 1;
				anioSiguiente = anio + 1;
			} else {
				mesSiguiente = mes + 1;
			}
		} else {
			diaSiguiente = dia + 1;
		}

		// Se muestra la fecha del dÃ­a siguiente
		System.out.println("La fecha de maÃ±ana es: " + diaSiguiente + "-" + mesSiguiente + "-" + anioSiguiente);

	}

	/**
	 * MÃ©todo que comprueba que una fecha es correcta
	 * 
	 * @param diaActual  indica el dÃ­a entre 1 y 31
	 * @param mesActual  indica el mes entre 1 y 12
	 * @param annoActual indica el aÃ±o como un nÃºmero positivo
	 * @return true si la fecha es correcta o false si no es asÃ­
	 */

	private static boolean comprobarFechaCorrecta(int dia, int mes, int anio) {

		boolean fechaCorrecta = true;
		int diasMes;

		diasMes = Ejercicio04.calcularDiasMesAnio(mes, anio);

		if (diasMes < dia) {
			fechaCorrecta = false;
		}

		return fechaCorrecta;
	}

	/**
	 * Metodo que solicita el anno actual comprobando que su valor no es negativo ni
	 * cero
	 * 
	 * @return el anio expresado en un numero positivo
	 */

	private static int solicitarAnio() {

		int anio;

		do {
			System.out.println("Introduce el año: ");
			anio = Integer.parseInt(teclado.nextLine());
		} while (anio <= 0);

		return anio;
	}

	/**
	 * Metodo que solicita el mes actual comprobando que su valor esta entre 1 y 12
	 * 
	 * @return el mes expresado en un numero entre 1 y 12
	 */

	private static int solicitarMes() {

		int mes;

		do {
			System.out.println("Introduce el mes: ");
			mes = Integer.parseInt(teclado.nextLine());
		} while (mes < 0 || mes > 12);

		return mes;
	}

	/**
	 * Metodo que solicita el día actual comprobando que su valor esta entre 1 y 31
	 * 
	 * @return el dia expresado en un numero entre 1 y 31
	 */

	private static int solicitarDia() {

		int dia;

		do {
			System.out.println("Introduce el día: ");
			dia = Integer.parseInt(teclado.nextLine());
		} while (dia < 0 || dia > 31);

		return dia;
	}

}
