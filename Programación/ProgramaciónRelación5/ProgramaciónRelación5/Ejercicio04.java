package ProgramaciónRelación5;
import java.util.Scanner;

public class Ejercicio04 {
	
	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String cadena;
		String subCadena;
		
		cadena = Ejercicio04.solicitarCadena("Introduce una cadena: ");
		subCadena = Ejercicio04.solicitarCadena("Introduce una cadena para ver si está contenida en la anterior: ");
		
		if (Ejercicio04.estaEscondida(cadena, subCadena))
			System.out.println("Está contenida");
		else
			System.out.println("No  está contenida");
	}
	
	private static String solicitarCadena (String mensaje) {
		String cadena;
		
		do {
			System.out.println(mensaje);
			cadena = teclado.nextLine();
		} while (cadena.length() == 0);
		
		return cadena;
		
	}
	
	private static boolean estaEscondida(String cadena, String subCadena) {
		
		boolean escondida = true;
		int contador = 0;
		int indice;
		int desde = 0;
		char caracter;
		
		while (contador < subCadena.length() && escondida == true) {
			
			caracter = subCadena.charAt(contador);
			
			indice = cadena.indexOf(caracter, desde);
			
			if (indice ==-1) {
				escondida = false;
			}
			else {
				desde = indice +1;
				contador ++;
			}	
			
		}
		
		return escondida;
	
	

	}

}
