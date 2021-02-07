package ProgramaciónRelación5;
import java.util.Scanner;

/*Realizar un programa que reemplace una palabra por otra en un texto.
Introduce un texto original: El lenguaje Java es un lenguaje de alto nivel
Introduce el texto a buscar: lenguaje
Introduce el texto a reemplazar: lenguaje de programación
El texto modificado es:
El lenguaje de programación Java es un lenguaje de programación de alto nivel*/

public class Ejercicio05 {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		String textoOriginal, cadenaBuscar, cadenaReemplazar, textoNuevo;
		
		System.out.println("Texto original");
		textoOriginal = teclado.nextLine();
		
		System.out.println("Texto a buscar");
		cadenaBuscar = teclado.nextLine();
		
		System.out.println("Texto a reemplazar");
		cadenaReemplazar = teclado.nextLine();
		
		textoNuevo = reemplazarEnCadena(textoOriginal, cadenaBuscar, cadenaReemplazar);
		
		System.out.println("El texto modificado es: " + textoNuevo);

	}
	
	/**
	 Comentario pendiente
	 @param texto: Texto donde se va a reemplazar la cadena
  	 @param cadenaBuscar cadena que se busca
	 @param cadenaReemplazo cadena por la que se reemplaza
	 @return
	*/

	public static String reemplazarEnCadena (String texto, String cadenaBuscar, String cadenaReemplazo) {
		
		int posicionEncontrada;
		int posicionBusqueda;
		
		//Se crean un StringBuilder con el texto original
		StringBuilder textoBuilder = new StringBuilder(texto);
		
		//Se busca la cadenaBuscar en el texto
		posicionEncontrada = texto.indexOf(cadenaBuscar);
		
		//Mientras la encuentre
		while (posicionEncontrada >= 0) {
			
			textoBuilder.delete(posicionEncontrada, posicionEncontrada + cadenaBuscar.length());
			
			textoBuilder.insert(posicionEncontrada, cadenaReemplazo);
			
			
			//Se actualiza la posición de busqueda
			posicionBusqueda = posicionEncontrada + cadenaReemplazo.length();
			
			posicionEncontrada = textoBuilder.indexOf(cadenaBuscar, posicionBusqueda);
		}
		
		return textoBuilder.toString();
	}
}
