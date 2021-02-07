import java.util.Scanner;

public class Ejercicio3Refuerzo {
	public static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Realizar un método que reciba como entrada dos cadenas de caracteres y
		 * devuelva una tercera cadena intercalando los caracteres de las palabras de
		 * las cadenas recibidas.
		 */
		String cadena1;
		String cadena2;
		String cadenaUnida;
		
		System.out.println("Introduce la primera cadena: ");
		cadena1=teclado.nextLine();
		System.out.println("Introduce la segunda cadena: ");
		cadena2=teclado.nextLine();
		
		cadenaUnida=Ejercicio3Refuerzo.cadenasUnidas(cadena1, cadena2);
		
		System.out.println(cadenaUnida);
	}

	public static String cadenasUnidas(String cadena1, String cadena2) {
		StringBuilder cadenaUnidas=new StringBuilder();
		int longitudCadena1 = cadena1.length();
		int longitudCadena2 = cadena2.length();
		int contador=1;

		if (longitudCadena1 > longitudCadena2) {
			cadenaUnidas.append(cadena1);
			
			for (int i =0; i < longitudCadena2; i ++) {
				
				cadenaUnidas.insert(contador,cadena2.charAt(i));
				contador=contador+2;
			}
			
		} else {
			cadenaUnidas.append(cadena2);
			for (int i =0; i < longitudCadena1; i ++) {

				cadenaUnidas.insert(contador,cadena1.charAt(i));
				contador=contador+2;
			}
		}
		return cadenaUnidas.toString();
	}

}
