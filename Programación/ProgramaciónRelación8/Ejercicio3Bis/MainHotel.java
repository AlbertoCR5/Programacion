package Ejercicio3Bis;

//import java.util.Scanner;


public class MainHotel {

	//private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Hotel hotel;
		int habitacionAsignada;
		
		try {
			hotel = new Hotel("Monroy Hotel", 5, 2, 2, 3);
			
			
			habitacionAsignada = hotel.checkIn(Habitacion.DOBLE);
			System.out.println("Tiene usted la habitacion " + habitacionAsignada);
			
			hotel.checkOut(habitacionAsignada);
			System.out.println("Habitacion libre " + habitacionAsignada);
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
		

//		int opcion = 0;
//		try {
//			hotel = new Hotel("MONROY HOTEL", 5, null, 5, 3, 2);
//		} catch (HabitacionHotelException e) {
//
//			e.printStackTrace();
//		}
//
//		opcion = mostrarMenu();
//		tratarMenu(hotel, opcion);
//		
//	}
//	
//	private static int mostrarMenu() {
//
//		int opcion;
//		
//		do {
//			System.out.println("Bienvenido a Monroy Hotel");
//			System.out.println("¿Que opcion desea realizar?");
//			System.out.println("(1)Check in");
//			System.out.println("(2)Check out");
//			System.out.println("(3) Salir");
//			opcion = Integer.parseInt(teclado.nextLine());
//		}while (opcion < 1 || opcion > 3);
//		
//		return opcion;	
//		
//	}
//	
//	private static int tratarMenu(Hotel hotel, int opcion) {
//		
//		int tipoHabitacion;
//		
//		switch (opcion) {
//		
//		case 1:
//			System.out.println("Ha elegido hospedarse en Monroy hotel, que tipo de habitacion desea");
//			System.out.println(Habitacion.SIMPLE);
//			System.out.println(Habitacion.DOBLE);
//			System.out.println(Habitacion.TRIPLE);
//			tipoHabitacion = Integer.parseInt(teclado.nextLine());
//			hotel.checkIn(tipoHabitacion);
//			break;
//			
//		case 2:
//			
//		}
//		
//		return opcion;
//		
//	}

	}
}