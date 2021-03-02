import java.util.Arrays;
import java.util.Scanner;
import JuegoRol.Clerigo;
import JuegoRol.ListaPersonajes;
import JuegoRol.Mago;
import JuegoRol.Personaje;
import JuegoRol.PersonajeException;
import JuegoRol.TipoHechizo;
import JuegoRol.TipoRaza;

public class MainJuegoRol {

	private static final int INICIO_MENU = 1;
	private static final int MENU_SALIR = 7;
	private static final int CANTIDAD_PERSONAJES = 200;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;
		int numeroPersonajes = 0;
		ListaPersonajes listaPersonajes;


		listaPersonajes = crearListaPersonajes();

		do {
			mostrarMenu();
			opcion = elegirOpcion();
			tratarMenu(opcion, listaPersonajes, numeroPersonajes);
		} while (opcion != MENU_SALIR);

	}

	private static ListaPersonajes crearListaPersonajes() {

		boolean hayFallo;
		ListaPersonajes listaPersonajes = null;

		do {
			try {
				listaPersonajes = new ListaPersonajes(CANTIDAD_PERSONAJES);
				hayFallo = false;
			} catch (PersonajeException e) {
				System.out.println(e.getMessage());
				hayFallo = true;
				System.out.println(e.getMessage());
			}
		} while (hayFallo);

		return listaPersonajes;
	}

	private static void mostrarMenu() {

		System.out.println("1. Alta personaje");
		System.out.println("2. Mago aprende hechizo");
		System.out.println("3. Mago lanza hechizo");
		System.out.println("4. Clerigo cura al mago");
		System.out.println("5. Mostrar el listado de personajes");
		System.out.println("6. Mostrar el listado ordenados por puntos actuales de mayor a menor");
		System.out.println("7. Salir");

	}

	private static int elegirOpcion() {

		int opcion = 0;
		boolean hayFallo;

		do {
			try {
				System.out.println("Elige una opcion:");
				opcion = Integer.parseInt(teclado.nextLine());
				hayFallo = false;
			} catch (NumberFormatException e) {
				hayFallo = true;
				System.out.println("Error. Solo puedes introducir numeros");
			}
		} while (hayFallo || opcion < INICIO_MENU || opcion > MENU_SALIR);

		return opcion;
	}

	private static void tratarMenu(int opcion, ListaPersonajes listaPersonajes, int numeroPersonajes) {

		Personaje personaje = null;
		String personajeACurar, personajeObjetivo, clerigoNombre;
		TipoHechizo hechizo;

		try {
			switch (opcion) {
			case 1:
				if (numeroPersonajes == CANTIDAD_PERSONAJES) {
					System.out.println("Ya no se pueden crear mas personajes");
				}
				else {
					personaje = incorporarPersonaje();
					listaPersonajes.incorporarPersonaje(personaje);
					System.out.println("Personaje creado correctamente");
					numeroPersonajes++;					
				}
				break;

			case 2:
				personajeACurar = introducirCadena("Introduzca el nombre del mago:");
				hechizo = elegirHechizo("Elija un hechizo" + Arrays.toString(TipoHechizo.values()) + ":");
				listaPersonajes.aprenderHechizoMago(personajeACurar, hechizo);
				System.out.println("Hechizo aprendido");
				break;

			case 3:
				personajeACurar = introducirCadena("Introducir el nombre del mago que lanza el hechizo");
				hechizo = elegirHechizo("Elija el nombre del hechizo que va a lanzar " + personajeACurar.toUpperCase() + ":");
				personajeObjetivo = introducirCadena("Introduzca el nombre del personaje que desea atacar:");
				listaPersonajes.lanzarHechizoPersonaje(personajeACurar, personajeObjetivo, hechizo);
				break;

			case 4:
				clerigoNombre = introducirCadena("Introduzca el nombre del clerigo:");
				personajeACurar = introducirCadena("Introduzca el nombre del personaje que deseas curar");
				listaPersonajes.curarPersonaje(clerigoNombre, personajeACurar);
				break;

			case 5:
				System.out.println(listaPersonajes);
				break;

			case 6:
				System.out.println(listaPersonajes.mostrarListadoPuntosActuales());
				break;

			case 7:
				System.out.println("GAME OVER");
				break;

			}

		} catch (PersonajeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
	}

	private static Personaje incorporarPersonaje() throws PersonajeException {

		int fuerza, inteligencia, vidaMaxima, tipoPersonaje;
		String nombre, dios;
		TipoRaza raza;
		Personaje personajeCreado = null;
		
		nombre = introducirCadena("Introduzca el nombre del personaje");
		tipoPersonaje = introducirEntero("Introduzca el tipo de personaje \n (1)Mago \n (2)Clerigo");
		raza = introducirTipoRaza("Introduzca la raza de " + nombre.toUpperCase() + Arrays.toString(TipoRaza.values()) + ":");
		fuerza = introducirEntero("Introduzca la fuerza de " + nombre.toUpperCase());
		inteligencia = introducirEntero("Introduzca la inteligencia de " + nombre.toUpperCase());
		vidaMaxima = introducirEntero("Introduzca la vida maxima de " + nombre.toUpperCase());
		
		switch (tipoPersonaje) {
		case 1:
			personajeCreado = new Mago(nombre, raza, fuerza, inteligencia, vidaMaxima);
			break;
			
		case 2:
			dios = introducirCadena("Introduzca el dios de " + nombre.toUpperCase() + ":");
			personajeCreado = new Clerigo(nombre, raza, fuerza, inteligencia, vidaMaxima, dios);
			break;
			
		}
		return personajeCreado;
	}
	
	private static int introducirEntero(String string) {
		
		int numero = 0;
		boolean hayFallo;

		do {
			try {
				System.out.println(string);
				numero = Integer.parseInt(teclado.nextLine());
				hayFallo = false;
			} catch (NumberFormatException e) {
				hayFallo = true;
				System.out.println("Error, solo puedes introducir numeros");
			}
		} while (hayFallo);
		
		return numero;
	}

	private static TipoRaza introducirTipoRaza(String string) {

		boolean hayFallo;
		int numero = 0;
		TipoRaza raza = null;
		
		do {
			try {
				System.out.println(string);
				System.out.println("(1)" + TipoRaza.ELFO);
				System.out.println("(2)" + TipoRaza.ENANO);
				System.out.println("(3)" + TipoRaza.HUMANO);
				System.out.println("(4)" + TipoRaza.ORCO);
				numero = Integer.parseInt(teclado.nextLine());
				hayFallo = false;
			} catch (NumberFormatException e) {
				hayFallo = true;
				System.out.println("Error, solo puedes introducir numeros");
			}
		} while (hayFallo);
		
		switch (numero) {
		
		case 1:
			raza = TipoRaza.ELFO;
			break;
			
		case 2:
			raza = TipoRaza.ENANO;
			break;
			
		case 3:
			raza = TipoRaza.ENANO;
			break;
			
		case 4:
			raza = TipoRaza.ENANO;
			break;
			
		}
		
		return raza;
	}

	private static String introducirCadena(String string) {

		String cadena;
		
		System.out.println(string);
		cadena = teclado.nextLine();
		
		return cadena;
	}

	private static TipoHechizo elegirHechizo(String string) {
		boolean hayFallo;
		int numero = 0;
		TipoHechizo hechizo = null;
		
		do {
			try {
				System.out.println(string);
				System.out.println("(0)" + TipoHechizo.JUNIT);
				System.out.println("(1)" + TipoHechizo.PRUEBA_CAJAS_BLANCAS);
				System.out.println("(2)" + TipoHechizo.PRUEBA_CAJAS_NEGRAS);
				System.out.println("(3)" + TipoHechizo.SABOR_A_SUSPENSO);
				System.out.println("(4)" + TipoHechizo.ARRAYS);
				System.out.println("(5)" + TipoHechizo.BUSCAR_APARCAMIENTO);
				System.out.println("(6)" + TipoHechizo.CADENAS);
				System.out.println("(7)" + TipoHechizo.STRING_BUILDER);
				System.out.println("(8)" + TipoHechizo.TUNEL_DEL_VIENTO);
				System.out.println("(9)" + TipoHechizo.COVID);
				
				numero = Integer.parseInt(teclado.nextLine());
				hayFallo = false;
			} catch (NumberFormatException e) {
				hayFallo = true;
				System.out.println("Error, solo puedes introducir numeros");
			}
		} while (hayFallo);
		
		switch (numero) {
		
		case 0:
			hechizo = TipoHechizo.JUNIT;
			break;
			
		case 1:
			hechizo = TipoHechizo.PRUEBA_CAJAS_BLANCAS;
			break;
			
		case 2:
			hechizo = TipoHechizo.PRUEBA_CAJAS_NEGRAS;
			break;
			
		case 3:
			hechizo = TipoHechizo.SABOR_A_SUSPENSO;
			break;
			
		case 4:
			hechizo = TipoHechizo.ARRAYS;
			break;
			
		case 5:
			hechizo = TipoHechizo.BUSCAR_APARCAMIENTO;
			break;
			
		case 6:
			hechizo = TipoHechizo.CADENAS;
			break;
			
		case 7:
			hechizo = TipoHechizo.STRING_BUILDER;
			break;
			
		case 8:
			hechizo = TipoHechizo.TUNEL_DEL_VIENTO;
			break;
			
		case 9:
			hechizo = TipoHechizo.COVID;
			break;
			
		}
		
		return hechizo;
	}

}
