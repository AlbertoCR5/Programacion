package Ejercicio1;

import java.util.Scanner;

public class Rect�nguloPrincipal {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		double ancho, altura;
		Rect�ngulo rectangulo;

		try {
			// Aqui introducimos los datos
			System.out.println("Introduce la altura del rect�ngulo");
			ancho = Integer.parseInt(teclado.nextLine());

			System.out.println("Introduce el ancho del rect�ngulo");
			altura = Integer.parseInt(teclado.nextLine());

			rectangulo = new Rect�ngulo(ancho, altura);

			System.out.println("El perimetro del rect�ngulo es : " + rectangulo.perimetro());
			System.out.println("El �rea del rect�ngulo es: " + rectangulo.area());

			// Prueba de set
			System.out.println("Introduzca un nuevo ancho");
			ancho = Integer.parseInt(teclado.nextLine());
			rectangulo.setAncho(ancho);

			System.out.println("Introduzca una nueva altura");
			altura = Integer.parseInt(teclado.nextLine());
			rectangulo.setAltura(altura);

			System.out.println("El perimetro del rect�ngulo es : " + rectangulo.perimetro());
			System.out.println("El �rea del rect�ngulo es: " + rectangulo.area());
		} catch (Rect�nguloException exc) {
			System.out.println(exc.getMessage());
		}
	}

}
