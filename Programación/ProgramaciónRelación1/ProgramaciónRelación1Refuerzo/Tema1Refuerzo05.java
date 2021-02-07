package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo05 {
	
	//Diseñar un programa que muestre un menú con las siguientes opciones:
	//El programa debe pedir una opción, luego una cantidad según corresponda y
	//mostrar la conversión correspondientes. El programa terminará cuando pulse un 7.
	
	private static final double EUROS_DOLARES = 1.16;
	private static final double DOLARES_EUROS = 0.86;
	private static final double EUROS_LIBRAS = 0.90;
	private static final double LIBRAS_EUROS = 1.11;
	private static final double LIBRAS_DOLARES = 1.29;
	private static final double DOLARES_LIBRAS = 0.77;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		double euro, dolar, libra;
		double cantidad = 0;
		int comando;
		
		do {
			System.out.println("Introduce un comando");
			System.out.println("1. Cambio de euros a dólares\r\n"
				+ "2. Cambio de dólares a euros\r\n"
				+ "3. Cambio de euros a libras\r\n"
				+ "4. Cambio de libras a euros.\r\n"
				+ "5. Cambio de libras a dólares\r\n"
				+ "6. Cambio de dólares a libras\r\n"
				+ "7. Salir\r\n"
				+ "");
			comando = Integer.parseInt(teclado.nextLine());
		
		
			if (comando == 1) {
				System.out.println("Introduce la cantidad de Euros a convertir en Dolares");
				cantidad = Double.parseDouble(teclado.nextLine());
				dolar = cantidad * EUROS_DOLARES;
				System.out.println("La conversión de Euros/Dolares de la cantidad introducida es: " + dolar + "$");
			}
			else {
				if (comando == 2) {
					System.out.println("Introduce la cantidad de Dolares a convertir en Euros");
					cantidad = Double.parseDouble(teclado.nextLine());
					euro = cantidad * DOLARES_EUROS;
					System.out.println("La conversión de Dolares/Euros de la cantidad introducida es: " + euro + "€");
				}	
				else {
					if (comando == 3) {
						System.out.println("Introduce la cantidad de Euros a convertir en Libras");
						cantidad = Double.parseDouble(teclado.nextLine());
						libra = cantidad * EUROS_LIBRAS;
						System.out.println("La conversión de Euros/Libras de la cantidad introducida es: " + libra + "£");
					}
					else {
						if (comando == 4) {
							System.out.println("Introduce la cantidad de Libras a convertir en Euros");
							cantidad = Double.parseDouble(teclado.nextLine());
							euro = cantidad * LIBRAS_EUROS;
							System.out.println("La conversión de Libras/Euros de la cantidad introducida es: " + euro + "€");
						}
						else {
							if (comando == 5) {
								System.out.println("Introduce la cantidad de Libras a convertir en Dolares");
								cantidad = Double.parseDouble(teclado.nextLine());
								dolar = cantidad * LIBRAS_DOLARES;
								System.out.println("La conversión de Libras/Dolares de la cantidad introducida es: " + dolar + "$");
							}
							else {
								if (comando == 6) {
									System.out.println("Introduce la cantidad de Dolores a convertir en Libra");
									cantidad = Double.parseDouble(teclado.nextLine());
									libra = cantidad * DOLARES_LIBRAS;
									System.out.println("La conversión de Dolares/Libras de la cantidad introducida es: " + libra + "£");
								}
								else {
									System.out.println("Adios");		
								}
							}
						}
					}
				}
			}
		} while (comando != 7);
	}

}
