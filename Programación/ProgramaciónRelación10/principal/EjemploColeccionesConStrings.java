package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemploColeccionesConStrings {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		//Crear una coleccion donde se puede guardar Strings.
		//Tienen un orden y se guardan contiguos.
		ArrayList<String> ciudades = new ArrayList<String>();

		ciudades.add("Sevilla"); //se van añadiendo al final
		ciudades.add("Madrid");
		ciudades.add("Cadiz");
		ciudades.add("Almeria");
		ciudades.add(2, "Malaga"); //Inserta en posicion en concreto
		
		System.out.println("Hay " + ciudades.size() + " ciudades."); //Size para saber la cantidad que hay actualmente en el array
		
		//for each
		for (String ciudad : ciudades) {
		System.out.println(ciudad);
		}
		System.out.println();
		//ambos tienen el mismo uso, pero el for each no se puede parar
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println(ciudades.get(i));
		}
		System.out.println();
		
		
		ciudades.remove("Malaga");//Eliminar
		//o ciudades.remove(2);
		
		for (String ciudad : ciudades) {
			System.out.println(ciudad);			
		}
		System.out.println();
		
		//añadir elementos a la coleccion
		System.out.println("Introduce una nueva ciudad");
		String ciudadNueva = teclado.nextLine();
		
		//Contains compara elementos
		if (ciudades.contains(ciudadNueva)) {
			System.out.println("Ya esta repetida");
		}
		else {
			System.out.println("Incluida");
			ciudades.add(ciudadNueva);
		}
		
		mostrarCiudades(ciudades);
	}

	private static void mostrarCiudades(ArrayList<String> ciudades) {

		for (String ciudad : ciudades) {
			System.out.println(ciudad);			
		}
	}
	
	private static <T> void mostrar(ArrayList<T> coleccion) { //generico (muestra numeros, string, objetos)
		
	}

}
