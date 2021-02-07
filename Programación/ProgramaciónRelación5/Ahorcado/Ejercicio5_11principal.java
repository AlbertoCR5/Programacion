package Ahorcado;
import java.util.Scanner;

public class Ejercicio5_11principal {
	
	private static final int MAXIMO_FALLOS = 7;
	
	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String palabraSecreta = "FRIGORIFICO";
		StringBuilder palabraJuego = null;
		
		char letra;
		boolean acierto;
		int numeroFallos = 0;
			
		
		palabraJuego = construirPalabraJuego(palabraSecreta);
		
		do {
			System.out.println("Palabra " + palabraJuego);
			System.out.println("Introduce una letra: ");
			letra = teclado.nextLine().charAt(0);
			letra = Character.toUpperCase(letra);
			
			acierto = jugarConLetra(palabraSecreta, palabraJuego, letra);
			if (!acierto) {
				numeroFallos++;
			}
			System.out.println("Llevas " + numeroFallos + "  fallo/s");
			
		} while (numeroFallos < MAXIMO_FALLOS && !palabraSecreta.equals(palabraJuego.toString()));
		
		if (palabraSecreta.equals(palabraJuego.toString())) {
			System.out.println("Has ganado");
		}
		else {
			System.out.println("Has perdido. La palabra secreta era: " + palabraSecreta);
		}

	}

	/**
	 * Método que oculta la palabra secreta
	 * 
	 * @return palabraJuego
	 */
	
	public static StringBuilder construirPalabraJuego(String palabraSecreta) {
		
		StringBuilder palabraJuego = new StringBuilder(palabraSecreta);
		
		for (int contador = 1; contador < palabraJuego.length(); contador++) {
			palabraJuego.setCharAt(contador, '*');
		}
		
		return palabraJuego;
		
	}
	
	public static boolean jugarConLetra(String palabraSecreta, StringBuilder palabraJuego, char letra) {
		
		boolean acierto = false;
		
		for ( int contador = 1; contador < palabraJuego.length(); contador++) {

			if (letra == palabraSecreta.charAt(contador)) {
				palabraJuego.setCharAt(contador, letra);
				acierto = true;
			}
			
			
		}
		
		return acierto;
		
	}
			
}
