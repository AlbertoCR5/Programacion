package principal;

import java.util.ArrayList;

public class EjemploColeccionesConNumeros {

	public static void main(String[] args) {


			// Crear una coleccion donde se puede guardar Strings.
			// Tienen un orden y se guardan contiguos.
			ArrayList<Integer> numeros = new ArrayList<Integer>();

			numeros.add(33);
			numeros.add(55);
			numeros.add(21);
			numeros.add(81);

			// Inserta en posicion en concreto
			numeros.add(2, 85); // requiere desplazar

			System.out.println("Hay " + numeros.size() + " numeros."); // Size para saber la cantidad que hay
																			// actualmente en el array

			for (int i = 0; i < numeros.size(); i++) {
				System.out.println(numeros.get(i));
			}
			
			//private static <T> void mostrar(ArrayList<T> coleccion) { //generico
			//muestra numeros, string, objetos
	}
}
