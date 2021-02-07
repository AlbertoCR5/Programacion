import java.util.Scanner;

public class Ejercicio4Refuerzo {
	public static Scanner teclado=new Scanner(System.in);

	private static final int POSICION = 4;
	public static void main(String[] args) {
		/**
		 * Realizar un método que permita saber si un texto es o no “Guay del Paraguay”.
		 * Se considera que una cadena es “Guay del Paraguay” si las 4 primeras letras y
		 * las 4 últimas son iguales entre sí. El número 4 debe crearse como constante
		 * de manera que el programa siga funcionando si se cambia el valor de dicha
		 * constante.
		 */
		String cadena;
		boolean esGuay;
		System.out.println("Introduzca una cadena guay del paraguay: ");
		cadena=teclado.nextLine();
		esGuay=Ejercicio4Refuerzo.GuayDelParaguay(cadena);
		
		if(esGuay==true) {
			System.out.println("La frase es guay del paraguay");
		}else {
			System.out.println("La frase no es guay del paraguay");
		}
	}public static boolean GuayDelParaguay (String cadena) {
		StringBuilder cadenaPrincipio=new StringBuilder();
		boolean esGuay;
		
		for(int i=0; i<POSICION; i++) {
			cadenaPrincipio.append(cadena.charAt(i));
		}
		
		 if(cadena.endsWith(cadenaPrincipio.toString())) {
			esGuay=true;
		 }else {
			 esGuay=false;
		 }
		 return esGuay;
	}

}
