package ProgramaciónRelación1;

/*
 * 
 */
import java.util.Scanner;

public class Ejercicio07b {

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
		do {
			System.out.println("Introduce una edad");
			// LEER edad
			edad = Integer.parseInt(teclado.nextLine());
		} while ((edad < 0) || (edad > EDAD_MAXIMA));

		// ESCRIBIR estadoCivil
		do {
			System.out.println("introduce el estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado)");
			estadoCivil = teclado.nextLine().charAt(0);
			estadoCivil = Character.toUpperCase(estadoCivil);
		} while (!((estadoCivil == SOLTERO) || (estadoCivil == CASADO) || (estadoCivil == VIUDO)
				|| (estadoCivil == DIVORCIADO)));

		if (edad < LIMITE_EDAD2) {
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
