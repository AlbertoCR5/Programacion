package Gema;

import java.util.Scanner;

public class Ejercicio1Refuerzo {
public static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		/***
		 * Realizar un programa que lea en una cadena el nombre completo de una persona
		 * (nombre y apellidos) y muestre por pantalla el nombre, apellido1 y apellido2.
		 * Si el nombre completo no es correcto mostrará un mensaje de error.
		 * 
		 */
String nombreCompleto;

System.out.println("Introduce tu nombre completo");
System.out.println("(Si tienes nombre/apellidos compuestos ponlos juntos)");
nombreCompleto=teclado.nextLine();

Ejercicio1Refuerzo.ValidacionNombre(nombreCompleto);

	}public static void ValidacionNombre (String nombreCompleto) {
		
		char caracter;
		int hayEspacio=0;
		
		for(int i=0; i<nombreCompleto.length(); i++) {
			caracter=nombreCompleto.charAt(i);
			if(Character.isSpaceChar(caracter)) {
				hayEspacio++;
			}
		}
		
		if(hayEspacio==2) {
		
		String[] partes = nombreCompleto.split(" ");
		String nombre = partes[0]; 
		String apellido1 = partes[1]; 
		String apellido2=partes[2];
		
		System.out.println("NOMBRE: "+nombre);
		System.out.println("APELLIDO1: "+apellido1);
		System.out.println("APELLIDO2: "+apellido2);
		}else {
			System.out.println("Los datos son incorrectos");
		}
	
	}




}
