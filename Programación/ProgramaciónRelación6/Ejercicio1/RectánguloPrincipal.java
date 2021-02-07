package Ejercicio1;

import java.util.Scanner;

public class RectánguloPrincipal {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		double ancho, altura;
		Rectángulo rectangulo;

		try {
			// Aqui introducimos los datos
			System.out.println("Introduce la altura del rectángulo");
			ancho = Integer.parseInt(teclado.nextLine());

			System.out.println("Introduce el ancho del rectángulo");
			altura = Integer.parseInt(teclado.nextLine());

			rectangulo = new Rectángulo(ancho, altura);

			System.out.println("El perimetro del rectángulo es : " + rectangulo.perimetro());
			System.out.println("El área del rectángulo es: " + rectangulo.area());

			// Prueba de set
			System.out.println("Introduzca un nuevo ancho");
			ancho = Integer.parseInt(teclado.nextLine());
			rectangulo.setAncho(ancho);

			System.out.println("Introduzca una nueva altura");
			altura = Integer.parseInt(teclado.nextLine());
			rectangulo.setAltura(altura);

			System.out.println("El perimetro del rectángulo es : " + rectangulo.perimetro());
			System.out.println("El área del rectángulo es: " + rectangulo.area());
		} catch (RectánguloException exc) {
			System.out.println(exc.getMessage());
		}
	}

}
