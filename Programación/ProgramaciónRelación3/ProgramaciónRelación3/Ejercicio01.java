package ProgramaciónRelación3;
import java.util.Scanner;

public class Ejercicio01 {
	
	 //Realizar un programa que solicite 3 números cualesquiera 
	 //y los muestre por pantalla ordenados de menor a mayor.
	 
	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1, numero2, numero3;
		
		System.out.println("Introduce tres números");
		numero1= Integer.parseInt(teclado.nextLine());
		numero2= Integer.parseInt(teclado.nextLine());
		numero3= Integer.parseInt(teclado.nextLine());
		
		if (numero1 < numero2 && numero2 < numero3) 
			System.out.println("El orden de menor a mayor es el siguiente: " + numero1 + ", " + numero2 + " y " + numero3);
		 if(numero2 < numero1 && numero1 < numero3)
			System.out.println("El orden de menor a mayor es el siguiente: " + numero2 + ", " + numero1 + " y " + numero3);
			if (numero3 < numero1 && numero1 < numero2)
				System.out.println("El orden de menor a mayor es el siguiente: " + numero3 + ", " + numero1 + " y " + numero2);
				if(numero1 < numero3 && numero3 < numero2)
						System.out.println("El orden de menor a mayor es el siguiente: " + numero1 + ", " + numero3 + " y " + numero2);
					if(numero2 < numero3 && numero3 < numero1) 
							System.out.println("El orden de menor a mayor es el siguiente: " + numero2 + ", " + numero3 + " y " + numero1);
						if(numero3 < numero2 && numero2 < numero1) 
								System.out.println("El orden de menor a mayor es el siguiente: " + numero3 + ", " + numero2 + " y " + numero1);
				
							}
						}
					
				
			
			
	


