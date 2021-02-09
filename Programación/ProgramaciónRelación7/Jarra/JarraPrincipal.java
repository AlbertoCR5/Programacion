package Jarra;

import java.util.Scanner;

public class JarraPrincipal {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int capacidad;
		
		Jarra jarra1;
		Jarra jarra2;
		
		try {
			capacidad = JarraPrincipal.solicitarCapacidadJarra();
			jarra1 = new Jarra(capacidad);
			capacidad = JarraPrincipal.solicitarCapacidadJarra();
			jarra2 = new Jarra(capacidad);
		
		
		int opcion;
		
		do {
			opcion = mostrarMenuJarra();
			JarraPrincipal.tratarMenu(jarra1, jarra2, opcion);
		}while (opcion < 1 ||opcion > 5);
		
		} catch (JarraException e) {
			e.getMessage();
		}
	}

	private static int mostrarMenuJarra() {

		int opcion;
		
		do {
			System.out.println("¿Que desea realizar con la jarra?" + "\n" + "LLenar jarra (1)" + "\n" + "Vaciar jarra (2)" + "\n" + "Volcar jarra1 en jarra2 (3)" + "\n" + "Volcar jarra2 en jarra1 (4)" + "\n" + "Ver estado de las jarras (5)" + "\n" + "Salir (6)");
			System.out.println("Seleccione una opcion");
			opcion = teclado.nextInt();
		}while (opcion != 6);
		
		return opcion;
	}

	private static void tratarMenu(Jarra jarra1, Jarra jarra2, int opcion) {
		
		
		int opcionBis;
		
		switch(opcion) {
			case 1:
				System.out.println("¿Qúe jarra desea llenar? Jarra1(1) o Jarra2(2)");
				opcionBis = teclado.nextInt();
				try {
					if (opcionBis == 1) {
						jarra1.llenarJarra();
					
					}
					else {
						jarra2.llenarJarra();
					}
				} catch (JarraException e) {
					e.getMessage();
					}
				break;
				
			case 2:
				System.out.println("¿Que jarra desea vaciar? Jarra1(1) o Jarra2(2)");
				opcionBis = teclado.nextInt();
				
				if (opcionBis == 1) {
					jarra1.vaciarJarra();
				}
				else {
					jarra2.vaciarJarra();
				}
				break;
				
			case 3:
			case 4:
			case 5:
				System.out.println(jarra1.toString());
				System.out.println(jarra2.toString());
				break;
			
				
		}
	}

	private static int solicitarCapacidadJarra() {

		int capacidad;
		
		do { 
			System.out.println("Introduce la capacidad de la jarra: ");
			capacidad = teclado.nextInt();
		}while (capacidad < 1);
		
		return capacidad;
		
	}

}
