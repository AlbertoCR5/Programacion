package ProgramaciónRelación5;
import java.util.Scanner;

/*Crear un método que, tomando una cadena de texto como entrada,
construya y devuelva otra cadena formada de la siguiente manera: el
método debe colocar todas las consonantes al principio y todas las
vocales al final de la misma, eliminando los blancos.
*/
public class Ejercicio07 {

	private static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String cadena, cadenaModificada;
		
		cadena = Ejercicio07.solicitarCadena();
		
		cadenaModificada = Ejercicio07.crearCadenaConsonantesVocales(cadena);
		
		System.out.println("La nueva cadena es: " + cadenaModificada);

	}
	
	//Metodo que solicita una cadena y la devuelve
	
	private static String solicitarCadena() {
		
		String cadena;
		
		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();
		
		return cadena;
		
	}
	
	/* Método que dada una cadena, devuelve otra con todas 
	 * las consonantes al principio y las vocales al final
	 */
	
	public static String crearCadenaConsonantesVocales(String cadena) {
		
		StringBuilder tomarConsonantes = new StringBuilder();
		StringBuilder tomarVocales = new StringBuilder();
		
		char caracter;
		
		for(int contador = 0; contador < cadena.length(); contador++) {
			caracter = cadena.charAt(contador);
		
			if (Character.isLetter(caracter)) {
				if (esVocal(caracter))
					tomarVocales.append(caracter);
				else
					tomarConsonantes.append(caracter);
			}
		}
	
	tomarConsonantes.append(tomarVocales);
	
	return tomarConsonantes.toString();
	
	}
	
	/*
	 *Método que comprueba si un caracter es una vocal
	 */
	
	public static boolean esVocal (char caracter) {
		boolean resultado;
		String vocales = "AEIOUaeiouÁÉÍÓÚáéíóú";
		
		if (vocales.contains(String.valueOf(caracter))==true) {//si no es vocal
			resultado = true;
		}
		else {
			resultado = false;
		}
		
		return resultado;
	}
}