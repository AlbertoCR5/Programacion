
package MascotaV2;

import java.util.Scanner;

public class MainMascotaV2 {

	private static final int OPCION_SALIR = 5;
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		MascotaV2 mascota1, mascota2;
		int opcion;
		
		mascota1 = crearPet();
		mascota2 = crearPet();
		
		try {
			do { 
				mostrarMenu();
				opcion = solicitarOpcion();
				tratarMenu(mascota1, mascota2, opcion);				
			} while (opcion != 5);			
		} catch (MascotaV2ControlParentalException e) {

			e.printStackTrace();
		}	

	}

	private static MascotaV2 crearPet() {
		
		String tipo, nombre;
		MascotaV2 mascota = null;
		boolean error;
		
		System.out.println("Vamos a crear una mascota");
		
		do {
			try {
				tipo = solicitarCadena("Introduce tipo (PERRO, GATO)");
				nombre = solicitarCadena("Introduce nombre: ");
				mascota = new MascotaV2(nombre, tipo);
				error = false;
			} catch (MascotaV2Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Error al crear la mascota, intentelo de nuevo");
				error = true;
			}
		} while(error); 
		
		return mascota;
	}

	private static void mostrarMenu() {
		
		System.out.println("...:::Menu:::...");
		System.out.println("1. Dar comida");
		System.out.println("2. Comprar comida");
		System.out.println("3. Jugar");
		System.out.println("4. Información de mascotas");
		System.out.println("5. Salir");
		
	}

	private static int solicitarOpcion() {
		
		int opcion;
		
		do {
			opcion = solicitarInt("Introducir opcion (1 - " + OPCION_SALIR + "):");
		} while (opcion < 0 || opcion > OPCION_SALIR);
		
		return opcion;
	}

	private static void tratarMenu(MascotaV2 mascota1, MascotaV2 mascota2, int opcion) throws MascotaV2ControlParentalException  {
		
		MascotaV2 mascota;
		
		try {
			switch (opcion) {
			
			case 1: //Dar comida
				mascota = elegirMascota(mascota1, mascota2);
				mascota.darComida();
				System.out.println("Tu mascota ya ha comido");
				break;
				
			case 2: //Comprar Comida
				mascota = elegirMascota(mascota1, mascota2);
				mascota.comprarAlimentos(solicitarNumeroAlimentos());
				System.out.println("Compra realizada correctamente");
				break;
				
			case 3: //Jugar
				mascota = elegirMascota(mascota1, mascota2);
				mascota.jugar(solicitarMinutos());
				System.out.println("Ha sido divertido");
				break;
				
			case 4:
				System.out.println(mascota1);
				System.out.println(mascota2);
				break;
			}
		} catch (MascotaV2Exception e) {
			System.out.println(e.getMessage());
		}
	
	}


	private static MascotaV2 elegirMascota(MascotaV2 mascota1, MascotaV2 mascota2) {

		int numeroMascota;
		MascotaV2 mascota;
		
		numeroMascota = solicitarMascota();
		if (numeroMascota == 1) {
			mascota = mascota1;
		}
		else {
			mascota = mascota2;
		}
		
		return mascota;
	}

	private static int solicitarMascota() {

		int mascota;
		
		do {
			mascota = solicitarInt("Introduce la mascota(1-2): ");
		} while (!(mascota == 1 || mascota == 2));
		
		return mascota;
	}

	private static int solicitarNumeroAlimentos() {

		int alimentos;
		
		do {
			alimentos = solicitarInt("Introduce numero de alimentos");
		} while(alimentos < 0);
		
		return alimentos;
	}

	private static int solicitarMinutos() {
		
		int minutos;
		
		do {
			minutos = solicitarInt("Introduce numero de minutos: ");
		} while (minutos < 0);
		
		return minutos;
	}

	private static int solicitarInt(String mensaje) {
		
		String cadena;
		int numero = 0;
		boolean error;
		
		do {
			try {
				error = false;
				System.out.println(mensaje);
				cadena = teclado.nextLine().toUpperCase();
				numero = Integer.parseInt(cadena);
			} catch (NumberFormatException ex) {
				error = true;
				System.out.println("No es un numero");
			}
		} while (error);
		
		return numero;
	}
	
	private static String solicitarCadena(String mensaje) {
		
		String cadena;
		
		System.out.println(mensaje);
		cadena = teclado.nextLine().toUpperCase();

		return cadena;
	}
}
