package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class Repaso1_7 {

	// CONSTANTES
	private static final int EDAD_MAXIMA = 100;
	private static final int LIMITE_EDAD1 = 35;
	private static final int LIMITE_EDAD2 = 50;
	private static final double RETENCION1 = 12.0;
	private static final double RETENCION2 = 8.5;
	private static final double RETENCION3 = 11.3;
	private static final double RETENCION4 = 10.5;
	private static final char SOLTERO = 'S';
	private static final char CASADO = 'C';
	private static final char DIVORCIADO = 'D';
	private static final char VIUDO = 'V';

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		//VARIABLES
			int edad;
			double retencion;
			char estadoCivil;
		//AQUI COMIENZA EL PROGRAMA
			
		//INICIO
			System.out.println("Introduce una edad");
			edad=Integer.parseInt(teclado.nextLine());
			
 			if ((edad < 0) || (edad > EDAD_MAXIMA)) {
 				System.out.println("Edad incorrecta");
 			} else {
 				System.out.println("Introduce el estado civil (S-Soltero, C-Casado, D-Divorciado, V-Viudo)");
 				estadoCivil=teclado.nextLine().charAt(0);
 				estadoCivil=Character.toUpperCase(estadoCivil);
 				
 				if (! ((estadoCivil == SOLTERO) || (estadoCivil == CASADO) || (estadoCivil == DIVORCIADO) || (estadoCivil == VIUDO))) {
 					System.out.println("Estado civil incorrecto");
 				} else {
 					if (edad > LIMITE_EDAD2) {
 						retencion = RETENCION2;
 					} else { 
 						if (edad < LIMITE_EDAD1) {
 							if ((estadoCivil == SOLTERO) || (estadoCivil == DIVORCIADO)) {
 								retencion = RETENCION1;
 							} else { 
 								retencion = RETENCION3;
 							}
 					} else {
 						retencion = RETENCION4;
 					}
 				}
 				
 				System.out.println("Debe aplicarsele una retención del: " + retencion + " %");
 			}		

 			}
 	}
}