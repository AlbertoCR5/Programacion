package Examen18Marzo.ejercicio1;

import java.util.Arrays;

public class PrincipalEjercicio1 {
	
	public static void main(String[] args) {
		System.out.println(Libro.ANNO_ACTUAL);
	}

	//TODO
	private static int cantidadLibrosDigitales(Libro[] libros) {
		
		int cantidadLibrosDigitales = 0;
		
		for (int i = 0; i < libros.length; i++) {
			
			if (libros[i] instanceof LibroDigital) {
				cantidadLibrosDigitales++;
			}
		}
		
		return cantidadLibrosDigitales;
	}

	//TODO
	private static void listadoLibrosDigitalesOrdenados( Libro[] libros) {
		
		LibroDigital[] librosDigitales = new LibroDigital[cantidadLibrosDigitales(libros)];
	
		//Volcar solo los libros digitales al array
		int j = 0;
		for (int i = 0; i < libros.length; i++) {
			
			if (libros[i] instanceof LibroDigital) {
				librosDigitales[j] = (LibroDigital) libros [i];
				j++;
			}
		}

		//Ordenar y mostrar
		Arrays.sort(librosDigitales);
		
		for (int i = 0; i < librosDigitales.length; i++) {
			System.out.println(librosDigitales);
		}
	}
	


    
    

}
