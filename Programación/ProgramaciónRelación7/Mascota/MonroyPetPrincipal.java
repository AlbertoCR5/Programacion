package Mascota;

import java.util.Scanner;

public class MonroyPetPrincipal {

	private static final int OPCION_SALIR = 5;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		MonroyPet mascota1, mascota2;
		boolean salir = false;
		int opcion;

		mascota1 = crearPet();
		mascota2 = crearPet();

		do {
			mostrarMenu();
			opcion = solicitarOpcionMenu();
			salir = tratarMenu(mascota1, mascota2, opcion);
		} while (salir == false);

	}

	/**
	 * Crea un objeto tipo MonroyPet, si al crearlo se produce algun tipo de error
	 * vuelve a solicitar los datos
	 * 
	 * @return mascota
	 */
	private static MonroyPet crearPet() {

		String tipo, nombre;
		MonroyPet mascota = null;
		boolean error;

		System.out.println("Vamos a crear una mascota");

		do {
			try {
				tipo = solicitarCadena("Introduce tipo (PERRO, GATO): ");
				nombre = solicitarCadena("Introduce nombre para la mascota");
				mascota = new MonroyPet(nombre, tipo);
				error = false;

			} catch (MonroyPetException e) {
				System.out.println(e.getMessage());
				System.out.println("Error al crear la mascota. Volvemos a intentarlo");
				error = true;
			}
		} while (error);

		return mascota;
	}

	// Muestras las opciones del menu
	private static void mostrarMenu() {

		System.out.println("(1) Dar comida");
		System.out.println("(2) Comprar comida");
		System.out.println("(3) Jugar");
		System.out.println("(4) Información de mascotas");
		System.out.println("(5) Salir");

	}

	/**
	 * Solicita una opcion validadndo que este entre 1 y la constante OPCION_SALIR
	 * 
	 * @return opcion
	 */
	private static int solicitarOpcionMenu() {

		int opcion;

		do {
			opcion = solicitarInt("Introduce opcion(1 - " + OPCION_SALIR + "):");
		} while (opcion < 0 || opcion > OPCION_SALIR);

		return opcion;
	}

	private static boolean tratarMenu(MonroyPet mascota1, MonroyPet mascota2, int opcion) {

		boolean salir = false;
		MonroyPet mascota;

		try {
			switch (opcion) {

			case 1: // Dar comida
				mascota = elegirMascota(mascota1, mascota2);
				mascota.darComida();
				System.out.println("Tu mascota ya ha comido");
				break;

			case 2: // Comprar comida
				mascota = elegirMascota(mascota1, mascota2);
				mascota.comprarComida(solicitarNumeroAlimentos());
				System.out.println("Compra realizada correctamente");
				break;

			case 3: // Jugar
				mascota = elegirMascota(mascota1, mascota2);
				mascota.jugar(solicitarMinutos());
				System.out.println("Lo hemos pasado bien");
				if (MonroyPet.getTotalTiempoJugado() > MonroyPet.MAXIMO_CONTROL_PARENTAL) {
					System.out.println("Las mascotas han jugado mucho, se van a dormirzzzZZZZZ");
					salir = true;
				}
				break;

			case 4:
				System.out.println(mascota1);
				System.out.println(mascota2);
				break;

			case 5:
				salir = true;
			}
		} catch (MonroyPetException e) {
			System.out.println(e.getMessage());
		}

		return salir;
	}

	private static MonroyPet elegirMascota(MonroyPet mascota1, MonroyPet mascota2) {

		int numMascota;
		MonroyPet mascota;

		numMascota = solicitarMascota();
		if (numMascota == 1) {
			mascota = mascota1;
		} else {
			mascota = mascota2;
		}

		return mascota;
	}

	/**
	 * Solicita el numero de mascota, validando que sea 1 o 2
	 * 
	 * @return mascota
	 */
	private static int solicitarMascota() {

		int mascota;

		do {
			mascota = solicitarInt("Introduce la mascota(1-2): ");
		} while (!(mascota == 1 || mascota == 2));

		return mascota;
	}

/**
 * Solicita el numero de alimentos
 * @return alimentos
 */
	private static int solicitarNumeroAlimentos() {
		
		int alimentos;
		
		do {
			alimentos = solicitarInt("Introduce numero de alimentos: ");
		}while (alimentos < 0);
		
		return alimentos;
	}

	/**
	 * solicita el numero de minutos jugados
	 * 
	 * @return
	 */
	private static int solicitarMinutos() {

		int minutos;

		do {
			minutos = solicitarInt("Introduce numero de minutos jugados");
		} while (minutos < 0);

		return minutos;
	}

	private static String solicitarCadena(String mensaje) {

		String cadena;

		System.out.println(mensaje);
		cadena = teclado.nextLine().toUpperCase();

		return cadena;
	}

	/**
	 * Metodo que solicita un entero. Si el dato que se introduce no es numerico lo
	 * vuelve a solicitar
	 * 
	 * @param mensaje mensaje que se mostrarÃ¡ antes de solicitar el numero
	 * @return numero
	 */
	private static int solicitarInt(String mensaje) {

		String cadena;
		int numero = 0;
		boolean error;

		do {
			try {
				error = false;
				System.out.println(mensaje);
				cadena = teclado.nextLine();
				numero = Integer.parseInt(cadena);
			} catch (NumberFormatException ex) {
				error = true;
				System.out.println("No es un numero");
			}
		} while (error);

		return numero;
	}
}
