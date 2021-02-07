package Ejercicio3Bis;

import java.util.Scanner;

import Ejercicio2.CartaException;

public class MainHotel {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		Hotel hotel;
		int opcion = 0;
		try {
			hotel = new Hotel("MONROY HOTEL", 5, null, 5, 3, 2);
		} catch (HabitacionHotelException e) {

			e.printStackTrace();
		}

		mostrarMenu(opcion);
		opcion = tratarMenu();
		
	}
	
	private static void mostrarMenu(int opcion) {

		do {
			System.out.println("Bienvenido a Monroy Hotel");
			System.out.println("¿Que opcion desea realizar?");
			System.out.println("(1)Check in");
			System.out.println("(2)Check out");
			System.out.println("(3) Salir");
			opcion = Integer.parseInt(teclado.nextLine());
		}while (opcion < 1 || opcion > 3);	
		
	}
	
	private static int tratarMenu() {
		
		int opcion = 0;
		String habitacion;
		
		switch (opcion) {
		
		case 1:
			System.out.println("Ha elegido hospedarse en Monroy hotel, que tipo de habitacion desea");
			System.out.println(Habitacion.SIMPLE);
			System.out.println(Habitacion.DOBLE);
			System.out.println(Habitacion.TRIPLE);
			habitacion = teclado.nextLine();
			break;
			
		case 2:
			
		}
		
		return opcion;
		
	}

}
