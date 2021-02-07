package Ejercicio3Repaso;

import java.util.Scanner;

public class MainMaquinaCafe {

	private static Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {

		MaquinaCafe maquina;
		double monedero = 0;
		int opcion = 0;
	
		try {
			
			monedero = iniciarMaquina();
			maquina = new MaquinaCafe(monedero);
		
			do {
				opcion = mostrarMenu();
				tratarMenu(opcion, maquina);
			} while (opcion != 5);
			
		}catch (MaquinaCafeException e) {
			System.out.println(e.getMessage());	
		}
	}

	private static double iniciarMaquina() {

		double monedero;
		
		System.out.println("Introduce la cantidad incicial del monedero");
		monedero = Double.parseDouble(teclado.nextLine());
		
		return monedero;
	}

	private static int mostrarMenu() {
		
		int opcion;
		
		do {
		System.out.println("Bienvenido cliente");
		System.out.println("¿Que desea?");
		System.out.println("(1) Cafe " + MaquinaCafe.PRECIO_CAFE + "€");
		System.out.println("(2) Leche " + MaquinaCafe.PRECIO_LECHE + "€");
		System.out.println("(3) Cafe con leche " + MaquinaCafe.PRECIO_CAFELECHE + "€");
		System.out.println("(4) Consultar estado de la maquina");
		System.out.println("(5) Salir");
		opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < 1 || opcion > 5);
		
		return opcion;
		
	}

	private static int tratarMenu(int opcion, MaquinaCafe maquina) {
		
		double importe;
		double cambio;
		
		try {
			switch (opcion) {
		
			case 1:
				importe = solicitarImporte("Introduce importe del cafe");
				cambio = maquina.servirCafe(importe);
				System.out.println("Recoja su cambio, gracias " + cambio + "€");
				break;
			
			case 2:
				importe = solicitarImporte("Introduce importe de la leche");
				cambio = maquina.servirLeche(importe);
				System.out.println("Recoja su cambio, gracias " + cambio + "€");
				break;
			
			case 3:
				importe = solicitarImporte("Introduce importe del cafe con leche");
				cambio = maquina.servirCafeLeche(importe);
				System.out.println("Recoja su cambio, gracias " + cambio + "€");
				break;
		
			case 4:
				System.out.println(maquina.toString());
				break;
			
			case 5:
				System.out.println("Apagando, adios");
				break;
			}
			
		}catch (MaquinaCafeException e) {
			System.out.println(e.getMessage());		
		}
	
		return opcion;
	}

	private static double solicitarImporte(String mensaje) {
		
		double importe;
		
		System.out.println(mensaje);
		importe = Double.parseDouble(teclado.nextLine());
		
		return importe;

		
		
		
	}

}
