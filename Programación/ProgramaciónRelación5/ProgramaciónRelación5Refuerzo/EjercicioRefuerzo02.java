/*
 * Realizar un método al que se le pase una cadena con un número de teléfono (999999999) y
devuelva una nueva cadena con el teléfono formateado de esta forma 999-99-99-99.
 */
package ProgramaciónRelación5Refuerzo;

import java.util.Scanner;

public class EjercicioRefuerzo02 {

	private static final int DIGITOS_NUMERO_TELEFONO = 9;
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		String telefono;
		String telefonoFormateado;
		
		telefono = solicitarTelefono();
		
		telefonoFormateado = formatearTelefono(telefono);
		
		System.out.println(telefonoFormateado);
	}

	/**
	 * Metodo que solicita un numero de telefono y comprueba que tenga 9 digitos,
	 * si no es asi, lo vuelve a pedir
	 * @return telefono
	 */
	private static String solicitarTelefono() {

		String telefono;
		
		do {
		System.out.println("Introduce un numero de telefono");	
		telefono = teclado.nextLine();
		}while (telefono.length() != DIGITOS_NUMERO_TELEFONO);
		
		return telefono;
	}

	/**
	 * Metodo que una vez dado el numero de telefono lo devuelve separado formateado 
	 * de manera (xxx-xx-xx-xx)
	 * @param telefono
	 * @return telefonoFormateado
	 */
	private static String formatearTelefono(String telefono) {

		StringBuilder sbTelefonoFormateado = new StringBuilder(telefono);
		
		sbTelefonoFormateado.insert(3, "-");
		sbTelefonoFormateado.insert(6, "-");
		sbTelefonoFormateado.insert(9, "-");
		
		return sbTelefonoFormateado.toString();
	}

}
