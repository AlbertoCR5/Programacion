package Ejercicio2Repaso;

import java.util.Scanner;

public class MainPuntoLinea {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		Linea linea;
		int opcion;
		
		try {
			
			linea = crearLinea();
			
			do {
				mostrarmenu();
				opcion = elegirOpcion();
				tratarMenu(opcion, linea);
			}while (opcion != 3);
			
		}catch (PuntoLineaException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Linea crearLinea() throws PuntoLineaException {

		Linea linea1;
		Punto puntoOrigen, puntoDestino;
		
		
		puntoOrigen = crearPunto("Indique la ubicacion del punto de origen");
		puntoDestino = crearPunto("Indique la ubicacion del punto de destino");
		
		
		linea1 = new Linea(puntoOrigen, puntoDestino);
		
		
		return linea1;
	}

	private static Punto crearPunto(String mensaje){

		Punto punto;
		double coordenadaX, coordenadaY;
		
		System.out.println();
		
		coordenadaX = solicitarDouble("Introduzca la coordenada X del punto");
		coordenadaY = solicitarDouble("Introduzca la coordenada Y del punto");
		
		punto = new Punto(coordenadaX, coordenadaY);
		
		return punto;
	}

	private static double solicitarDouble(String mensaje) {
		
		double numero = 0;
		boolean error = false;
		
		do {
			try {
				error = false;
				System.out.println(mensaje);
				numero = Double.parseDouble(teclado.nextLine());
			}catch (NumberFormatException e) {
				System.out.println("Error, debe introducirse un numero");
				error = true;
			} 
			
		} while (error == true);
		
		return numero;
	}

	private static void mostrarmenu() {
		
		System.out.println("Menu");
		System.out.println("(1) Mover linea");
		System.out.println();
		System.out.println("(2) Mostrar linea");
		System.out.println();
		System.out.println("(3) Salir");
		
	}
	
	private static int elegirOpcion() {

		int opcion;
		do {
			System.out.println("Elige una opcion");
			opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < 1 || opcion > 3);
		
		return opcion;
	}	
	
	private static void tratarMenu(int opcion, Linea linea1) {
		
		char direccion;
		double movimiento;
		
		try {
			switch (opcion) {
			
			case 1: {
				direccion = solicitarMovimiento("A-Arriba" + "\n" + "B-aBajo" + "\n" + "I-Izquierda" + "\n" + "D-Derecha");
				movimiento = solicitarDouble("Introduce cuanta distancia desplazara la linea");
				
				switch (direccion) {
				
				case 'I':
					linea1.moverIzquierda(movimiento);
					break;
				
				case 'D':
					linea1.moverDerecha(movimiento);
					break;
					
				case 'B':
					linea1.moverAbajo(movimiento);
					break;
					
				case 'A':
					linea1.moverArriba(movimiento);
					break;
				}
				break;
				
			}
			
			case 2:
				System.out.println(linea1.toString());
				break;
				
			case 3:
				System.out.println("adios");
				break;
			}		
		
		} catch (PuntoLineaException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static char solicitarMovimiento(String mensaje) {

		char direccion;
		
		do {
			System.out.println(mensaje);
			direccion = teclado.nextLine().toUpperCase().charAt(0);
		} while ((!Character.isLetter(0))&& direccion != 'A' && direccion != 'B' && direccion != 'I' && direccion != 'D');
		
		
		return direccion;
	}

}
