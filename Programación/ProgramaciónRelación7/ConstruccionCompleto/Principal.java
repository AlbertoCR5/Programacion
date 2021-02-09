package ConstruccionCompleto;

import java.util.Scanner;

/**
 * @author Jorge "y0rg" Tarancón
 * 
 * Clase principal donde se ejecutará el programa
 * Recoge los datos de la casa por teclado y devuelve un veredicto
 *
 */
public class Principal {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String args[]) {

		System.out.println("Bienvenido a la inmobiliaria");
		System.out.println("¿Cual es su nombre?");
		String nombre = teclado.nextLine();
		
		System.out.println("Construyamos su casa");
		
		System.out.println();
		System.out.println("¿Que calidad desea en los acabados? \n1. BAJA \n2. MEDIA \n3. ALTA");
		String calidades = "";
		int calidad = teclado.nextInt();
		 
		switch (calidad) {
		
		case 1:
			calidades = Casa.CALIDAD_BAJA;
			break;
		
		case 2:
			calidades = Casa.CALIDAD_MEDIA;
			break;
			
		case 3:
			calidades = Casa.CALIDAD_ALTA;
			break;			
		}
		
		System.out.println("¿Cuantos m² desea construir?");
		int metrosCuadrados = teclado.nextInt();
		
		System.out.println("¿Cuantas plantas tendra la vivienda?");
		int plantas = teclado.nextInt();
		
		System.out.println("¿Cuantas habitaciones?");
		int habitaciones = teclado.nextInt();
		
		System.out.println("¿Cuantos baños?");
		int banios = teclado.nextInt();
		
		System.out.println("¿Tendra piscina? (true o false)");
		boolean piscina = teclado.nextBoolean();
		
		System.out.println("¿Tendrá garage? (true o false)");
		boolean garage = teclado.nextBoolean();
		
		System.out.println("¿Cuanto se quiere gastar?");
		float presupuesto = teclado.nextFloat();
		

		teclado.close();
		try {
			Cliente cliente = new Cliente (nombre, new Casa(metrosCuadrados, plantas, habitaciones, banios, calidades, piscina, garage), presupuesto);
			System.out.println(cliente.veredicto());
		} catch (CasaImposibleException e) {
			System.out.println(e.getMessage());
		}

	}
}
