package ProgramaciónRelación1;

/*
 * 
 */
import java.util.Scanner;

public class Ejercicio07 {

	//Realizar un programa que lea el estado civil de una persona (S-Soltero, C-Casado, V-Viudo
	//y D-Divorciado) y su edad. Después debe mostrar por pantalla el porcentaje de retención
	//que debe aplicarse de acuerdo con las siguientes reglas:
	//A los solteros o divorciados menores de 35 años, un 12%
	//Todas las personas mayores de 50 años, un 8.5%
	//A los viudos o casados menores de 35 años, un 11.3%
	//Al resto de casos se le aplica un 10.5%

	// CONSTANTES
	private static final int EDAD_MAXIMA = 100;
	private static final int LIMITE_EDAD1 = 35;
	private static final int LIMITE_EDAD2 = 50;
	private static final double RETENCION_1 = 12.0;
	private static final double RETENCION_2 = 8.5;
	private static final double RETENCION_3 = 11.3;
	private static final double RETENCION_4 = 10.5;
	private static final char SOLTERO = 'S';
	private static final char CASADO = 'C';
	private static final char VIUDO = 'V';
	private static final char DIVORCIADO = 'D';

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// VARIABLES
		int edad;
		char estadoCivil;
		double retencion;

		// AQUI EMPIEZA EL PROGRAMA

		// INICIO

		// ESCRIBIR
		System.out.println("Introduce una edad");
		// LEER
		edad = Integer.parseInt(teclado.nextLine());

		if ((edad < 0) || (edad > EDAD_MAXIMA)) {
			System.out.println("Edad incorrecta");
		} else {
			// ESCRIBIR estadoCivil
			System.out.println("introduce el estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado)");
			estadoCivil = teclado.nextLine().charAt(0);
			estadoCivil = Character.toUpperCase(estadoCivil);

			// LEER estadoCivil
			if (!((estadoCivil == SOLTERO) || (estadoCivil == CASADO) || (estadoCivil == VIUDO)
					|| (estadoCivil == DIVORCIADO))) {
				// ESCRIBIR
				System.out.println("Estado civil incorrecto");
			} else {
				if (edad > LIMITE_EDAD2) {
					retencion = RETENCION_2;
				} else {
					if (edad < LIMITE_EDAD1) {
						if ((estadoCivil == SOLTERO) || (estadoCivil == DIVORCIADO)) {
							retencion = RETENCION_1;
						} else {
							retencion = RETENCION_3;
						}

					} else {
						retencion = RETENCION_4;
					}
				}
				// ESCRIBIR
				System.out.println("Debe aplicï¿½rsele una retencion del " + retencion + "%");
			}

		}

	}

}
