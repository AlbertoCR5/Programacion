package Ahorcado;

import java.util.Scanner;

/*Escribir un programa para jugar al ahorcado. El usuario deberá ir
introduciendo letras y el programa deberá ir mostrando la palabra si la
letra está, o bien, anotando fallos si son incorrectas. El programa acaba
si se adivina la palabra o si se produce un total de 7 fallos.
Nota: Para empezar utilizaremos una única palabra secreta aunque
mejoraremos el programa en el siguiente tema para seleccionar una
palabra aleatoriamente de entre un conjunto de palabras.
*/
public class Ejercicio5_11 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String palabraSecreta = "frigorifico";
		char letra;
		boolean algunAcierto;
		
		StringBuilder palabraJuego = new StringBuilder();
		
		//palabraJuego = construirPalabraJuego(palabraJuego);
		
		System.out.println("Introduce una letra");
		letra = teclado.nextLine().charAt(0);
		
		
		//algunAcierto = jugarConLetra(palabraJuego, palabraSecreta, letra);
	}

}
