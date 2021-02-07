import java.util.Scanner;

public class Ejercicio5Refuerzo {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena;
		String cadenaMayuscula;
		
		System.out.println("Introduce una palabra");
		cadena = teclado.nextLine();
		cadenaMayuscula=cadena.toUpperCase(); //convertir la cadena en mayúsculas
		cadenaDiminutivo(cadenaMayuscula); //llama al método
		
	}
/**
 * cadena que transforma una cadena en el dimunitivo en función de las condiciones
 * @param cadenaMayuscula
 * @return
 */
	public static String cadenaDiminutivo(String cadenaMayuscula) {
		
		StringBuilder cadenaChiquita = new StringBuilder(cadenaMayuscula);
		boolean terminaVocal = false;
		char respuesta;
		int posicion;
		posicion=cadenaMayuscula.length();
		// Para saber si la palabra termina en una vocal
		if (cadenaMayuscula.endsWith("A")) {
			cadenaChiquita.replace(posicion-1,posicion,"ITA");
			terminaVocal=true;
		} else {
			if (cadenaMayuscula.endsWith("O")) {
				cadenaChiquita.replace(posicion-1, posicion,"ITO");
				terminaVocal=true;
			}
		}
			if (cadenaMayuscula.endsWith("E") || cadenaMayuscula.endsWith("I") || cadenaMayuscula.endsWith("U")) {
				terminaVocal=true;
			respuesta=respuesta();
			if (respuesta == 'F') {
				cadenaChiquita.replace(posicion-1, posicion,"ITA");
			} else {
				cadenaChiquita.replace(posicion-1, posicion,"ITO");
			}
		}
			if (terminaVocal==false && Character.isLetter(cadenaMayuscula.charAt(posicion-1))) {
				respuesta=respuesta();
				if (respuesta == 'F') {
					cadenaChiquita.append( "ITA");
				} else {
					cadenaChiquita.append("ITO");
				}
				
		}
			if(Character.isLetter(cadenaMayuscula.charAt(posicion-1))==false){
			System.out.println("Nombre incorrecto");
		}else {
			System.out.println("El diminutivo de "+cadenaMayuscula+" es "+ cadenaChiquita);
		}
		return cadenaChiquita.toString();
	}
	/**
	 * Devuelve la respuesta de la pregunta masculino/femenino
	 * @return
	 */
	public static char respuesta () {
		char respuesta;
		
		do {
			System.out.println("¿Es masculino o feminino?(F/M)");
			respuesta = teclado.nextLine().charAt(0);
			respuesta = Character.toUpperCase(respuesta);
			if (respuesta != 'F' && respuesta != 'M') {
				System.out.println("Respuesta incorrecta");
			}
		} while (respuesta != 'F' && respuesta != 'M');
		
		return respuesta;
	}
}
