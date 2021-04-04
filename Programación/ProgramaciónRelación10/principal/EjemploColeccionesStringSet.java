package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EjemploColeccionesStringSet {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		//Crear una coleccion donde se puede guardar Strings.
		//Tienen un orden y se guardan contiguos.
		HashSet<String> ciudades = new HashSet<String>();
		
		//Añadir a la bolsa, ni al principio ni al final
		ciudades.add("Sevilla"); //se van añadiendo al final
		ciudades.add("Madrid");
		ciudades.add("Cadiz");
		ciudades.add("Almeria");
		ciudades.add("Sevilla"); //repetido, no entra

		
		System.out.println("Hay " + ciudades.size() + " ciudades."); //Size para saber la cantidad que hay actualmente en el array
		
		
		mostrar(ciudades);
		
	}

	private static void mostrar(HashSet<String> coleccion) {
	
		for (String ciudad : coleccion) { // no se pueded parar
			System.out.println(ciudad);
		}
		
		String ciudad;
		Iterator<String> it = coleccion.iterator(); // si se puede parar
		boolean terminado = false;
		
		while (it.hasNext() == true && !terminado) { //no es necesario el  == true
			ciudad = it.next();
			System.out.println();
			if (ciudad.startsWith("S")) { // terminado para salir del bucle cuando se encuentre lo buscado
				terminado = true;
			}
		}
		
		while (it.hasNext() == true && !terminado) { //no es necesario el  == true
			ciudad = it.next();
			System.out.println();
			if (ciudad.startsWith("S")) { // terminado para salir del bucle cuando se encuentre lo buscado
				it.remove();//Elimina el elemento o elementos buscados
			}
		}
	}
	
//		//for each
//		for (String ciudad : ciudades) {
//		System.out.println(ciudad);
//		}
//		System.out.println();
//		//ambos tienen el mismo uso, pero el for each no se puede parar
//		for (int i = 0; i < ciudades.size(); i++) {
//			System.out.println(ciudades.get(i));
//		}
//		System.out.println();
//		
//		
//		ciudades.remove("Malaga");//Eliminar
//		//o ciudades.remove(2);
//		
//		for (String ciudad : ciudades) {
//			System.out.println(ciudad);			
//		}
//		System.out.println();
//		
//		//añadir elementos a la coleccion
//		System.out.println("Introduce una nueva ciudad");
//		String ciudadNueva = teclado.nextLine();
//		
//		//Contains compara elementos
//		if (ciudades.contains(ciudadNueva)) {
//			System.out.println("Ya esta repetida");
//		}
//		else {
//			System.out.println("Incluida");
//			ciudades.add(ciudadNueva);
//		}
//		
//		mostrarCiudades(ciudades);
//	}
//
//	private static void mostrarCiudades(ArrayList<String> ciudades) {
//
//		for (String ciudad : ciudades) {
//			System.out.println(ciudad);			
//		}
//	}
//	
//	private static <T> void mostrar(ArrayList<T> coleccion) { //generico (muestra numeros, string, objetos)
//		
	

	

	

}
