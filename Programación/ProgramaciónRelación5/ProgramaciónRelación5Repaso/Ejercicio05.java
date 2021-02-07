/**
 * Realizar un programa que reemplace una palabra por otra en un texto.
 */

package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio05 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena, cadenaBuscar, cadenaReemplazar, cadenaNueva;
		
		cadena = solicitarCadena();
		cadenaBuscar = solicitarCadenaBuscar();
		cadenaReemplazar = solicitarCadenaReemplazar();
		cadenaNueva = nuevaCadena(cadena, cadenaBuscar, cadenaReemplazar);
		
		System.out.println("El texto (" + cadena + ") ha sido reemplazado por el texto (" + cadenaNueva + ")");
	}

	/**
	 * Metodo que solicita una cadena
	 * @return cadena
	 */
	private static String solicitarCadena() {
		
		String cadena;
		
		System.out.println("Introduce un texto");
		cadena = teclado.nextLine();
		
		return cadena;
	}
	
	/**
	 * Metodo que solicita el texto a buscar dentro de la cadena
	 * @return
	 */

	private static String solicitarCadenaBuscar() {
		
		String cadenaBuscar;
		
		System.out.println("Introduce texto a buscar");
		cadenaBuscar = teclado.nextLine();
		
		return cadenaBuscar;
	}
	
	/**
	 * Metodo que solicita el texto a reemplazar en el texto original
	 * @return
	 */

	private static String solicitarCadenaReemplazar() {
		
		String cadenaReemplazar;
		
		System.out.println("Introduce texto a reemplazar");
		cadenaReemplazar = teclado.nextLine();
		
		return cadenaReemplazar;
	}

	/**
	 * Metodo donde se reemplazara el texto original por el nuevo
	 * @param cadena
	 * @param cadenaBuscar
	 * @param cadenaReemplazar
	 * @return  
	 */
	private static String nuevaCadena(String cadena, String cadenaBuscar, String cadenaReemplazar) {
		
		int posicionEncuentra;
		int posicionBusqueda = 0;
		
		//Se crea un stringBuilder con el texto original
		StringBuilder cadenaBuilder = new StringBuilder(cadena);
		
		//Se busca la cadena a buscar en el texto
		posicionEncuentra = cadena.indexOf(cadenaBuscar);
		
		//Mientras la encuentre
		while (posicionEncuentra >= 0) {
			
			cadenaBuilder.delete(posicionEncuentra, posicionEncuentra + cadenaBuscar.length());
			
			cadenaBuilder.insert(posicionEncuentra, cadenaReemplazar);
			
			//Se actualiza la posicion de busqueda
			posicionBusqueda = posicionEncuentra + cadenaReemplazar.length();
			
			posicionEncuentra = cadenaBuilder.indexOf(cadenaBuscar, posicionBusqueda);
		}
		
		
		return cadenaBuilder.toString();
	}


}
