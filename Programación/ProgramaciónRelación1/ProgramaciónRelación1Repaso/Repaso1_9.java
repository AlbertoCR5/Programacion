package ProgramaciónRelación1Repaso;
import java.util.Scanner;

public class Repaso1_9 {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		double resultado = 0;
		int numero1, numero2;
		char operador;
		boolean hayError=false;
		
		System.out.println("introduce dos numeros y un operador ('+', '-', '*', ó '/',");
		numero1=Integer.parseInt(teclado.nextLine());
		numero2=Integer.parseInt(teclado.nextLine());
		operador= teclado.nextLine().charAt(0);
		
		switch (operador) {
		case '+':
			resultado=numero1+numero2;
			break;
		case '-':
			resultado=numero1-numero2;
			break;
		case '*':
			resultado=numero1*numero2;
			break;
		case '/':
			if (numero2==0) {
				hayError=true;	
				System.out.println("Error. No se puede dividir entre 0");
			}
			else {
				resultado=(double)numero1/numero2;
			}
			break;
		default:
			System.out.println("Operador incorrecto");
			hayError=true;
		}
		if (hayError==false) {
			System.out.println("El resultado es " + resultado);
			
		}
	}
}
