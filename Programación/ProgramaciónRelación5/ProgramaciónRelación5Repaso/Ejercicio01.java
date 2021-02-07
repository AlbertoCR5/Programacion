/*Realizar un método que tenga como parámetros de entrada una cadena
de caracteres y un carácter y devuelva cuántas veces aparece ese
carácter en la cadena. No debe distinguir entre caracteres mayúsculas y
minúsculas.*/

package ProgramaciónRelación5Repaso;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena;
		int vecesRepetido;
		char caracter;
		
		//Se solicita una cadena
		cadena = solicitarCadena();
		
		//Se solicita un caracter
		caracter = solicitarCaracter();
		
		//Metodo que cuenta las veces que se repite un caracter
		vecesRepetido = vecesQueSeRepiteCaracter(cadena, caracter);
		
		System.out.println("El caracter " + caracter + " aparece " + vecesRepetido + " veces " + " en la frase: " + cadena);
		

	}

	private static String solicitarCadena() {
				
		System.out.println("Introduce una frase");
		String cadena = teclado.nextLine();
		
		return cadena;
	}

	private static char solicitarCaracter() {

		System.out.println("Introduce el caracter a buscar");
		char caracter = teclado.nextLine().charAt(0);
		
		return caracter;
	}

	private static int vecesQueSeRepiteCaracter(String cadena, char caracterRepetido) {
		
		int vecesRepetido = 0;
		char caracterBuscado;
		
		//Pasar un caracter de mayúscula a minuscula
		caracterRepetido = Character.toLowerCase(caracterRepetido);
		
		for (int i=0; i < cadena.length(); i++) {
			
			//obtenemos el caracter que se encuentra en la posicion que indica el contador
			caracterBuscado = cadena.charAt(i);
			
			caracterBuscado = Character.toLowerCase(caracterBuscado);
			
			if (caracterBuscado == caracterRepetido) {
				vecesRepetido++;
			}
			
		}


		return vecesRepetido;
	}

}
