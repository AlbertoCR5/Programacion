package Ejercicio1Repaso;

import java.util.Scanner;

public class MainRectangulo {

	private static final int OPCIONES_MENU = 3;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Rectangulo rectangulo;
		double longitud = 1;//
		double ancho = 1;//

		int opcion;

		try {
			do {
				rectangulo = new Rectangulo(longitud, ancho);//
				opcion = mostrarMenu();
				tratarMenu(opcion, rectangulo);
			} while (opcion != OPCIONES_MENU);

		} catch (RectanguloException e) {
			System.out.println(e.getMessage());
		}

	}

	private static int mostrarMenu() throws RectanguloException {

		int opcion;

		System.out.println("Opciones de menu, que operacion desea realizar");
		System.out.println("(1)Dar valor a longitud y a ancho");
		System.out.println("(2)Dar valor a los sets de longitud y a ancho");
		System.out.println("(3)Salir");
		opcion = Integer.parseInt(teclado.nextLine());

		return opcion;
	}

	private static void tratarMenu(int opcion, Rectangulo rectangulo) {

		double longitud, ancho;

		try {
			switch (opcion) {

			case 1:
				longitud = solicitarDouble("Introduce la longitud del rectangulo en centimetros");
				ancho = solicitarDouble("Introduzca el ancho del rectangulo en centimetros");
				rectangulo = new Rectangulo(longitud, ancho);
				System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
				System.out.println("El perimeto del rectangulo es: " + rectangulo.calcularPerimetro());
				System.out.println(rectangulo.toString());
				break;

			case 2:
				longitud = solicitarDouble("Introduce la longitud del rectangulo en centimetros");
				rectangulo.setLongitud(longitud);
				ancho = solicitarDouble("Introduzca el ancho del rectangulo en centimetros");
				rectangulo.setAncho(ancho);
				System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
				System.out.println("El perimeto del rectangulo es: " + rectangulo.calcularPerimetro());
				System.out.println(rectangulo.toString());
				break;

			case 3:
				System.out.println("Adios");
				break;
			}

		} catch (RectanguloException e) {
			System.out.println(e.getMessage());
		}
	}

	private static double solicitarDouble(String mensaje) {

		double centimetros;

		System.out.println(mensaje);
		centimetros = Double.parseDouble(teclado.nextLine());

		return centimetros;
	}

}
