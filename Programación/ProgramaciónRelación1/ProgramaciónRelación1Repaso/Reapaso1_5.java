package Programaci�nRelaci�n1Repaso;
import java.util.Scanner;

public class Reapaso1_5 {
	
		//CONSTANTES
	private static final int TOTAL_NUMEROS = 4;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//VARIABLES
		double numero1, numero2, numero3, numero4;
		double media;
		
		//AQUI EMPIEZA EL PROGRAMA
		
		//INICIO
			
			//ESCRIBIR
				System.out.println("Introduce el primer n�mero");
				numero1=Integer.parseInt(teclado.nextLine());
			//LEER
				
			//ESCRIBIR
				System.out.println("Introduce el segundo n�mero");
				numero2=Integer.parseInt(teclado.nextLine());
			//LEER
				
			//ESCRIBIR
				System.out.println("Introduce el tercer n�mero");
				numero3=Integer.parseInt(teclado.nextLine());
			//LEER
				
			//ESCRIBIR
				System.out.println("Introduce el cuarto n�mero");
				numero4=Integer.parseInt(teclado.nextLine());
			//LEER	
				
				media = (numero1 + numero2 + numero3 + numero4) / TOTAL_NUMEROS;
				
				//ESCRIBIR
				System.out.println("La media vale: " + media);
				
				//ESCRIBIR
				System.out.println("Los n�meros superiores a la media son: ");
			
				if (numero1 > media) {
				System.out.println("El n�mero " + numero1 + " es superior a la media " +media);
				}
				if (numero2 > media) {
				System.out.println("El n�mero " + numero2 + " es superior a la media " +media);
				}	
				if (numero3 > media) {
				System.out.println("El n�mero " + numero3 + " es superior a la media " +media);
				}
				if (numero4 > media) {
				System.out.println("El n�mero " + numero4 + " es superior a la media " +media);
				}
	}

}
