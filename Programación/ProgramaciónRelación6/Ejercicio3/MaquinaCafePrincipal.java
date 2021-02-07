package Ejercicio3;
import java.util.Scanner;

public class MaquinaCafePrincipal {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws MaquinaCafeException {

		MaquinaCafe maquinaCafe;
		double monedero;
		int opcion;
		
		try {
			monedero = MaquinaCafePrincipal.solicitarDinero("Introduce la cantidad inicial del monedero: ");		
			maquinaCafe = new MaquinaCafe(monedero);
		
			do {
				opcion = MaquinaCafePrincipal.mostrarMenuMaquina();
				MaquinaCafePrincipal.tratarMenuMaquina(maquinaCafe, opcion);
			} while (opcion != 5);
		} catch (MaquinaCafeException e) {
		System.out.println(e.getMessage());
		}
	}
			
	private static int mostrarMenuMaquina() {
		
		int opcion = 0;
		
		do {
			try {
				System.out.println("¿Que opción desea elegir?" + "\n" + "1-Café" + "\n" + "2-Leche" + "\n" + "3-Cafe con leche" + "\n" + "4-Estado Máquina" + "\n" + "5-Salir");
				opcion = Integer.parseInt(teclado.nextLine());//introduce opcion menu
				if (opcion < 1 || opcion > 5)
					System.out.println("Error. Opción incorrecta.");

			} catch (NumberFormatException e) {
				System.out.println("Error. Opción incorrecta.");
			}
		} while (opcion < 1 || opcion > 5);

		return opcion;
	}


	private static void tratarMenuMaquina(MaquinaCafe maquinaCafe, int opcion) {

		double dinero;
		double cambio = 0;
		
		switch (opcion) {

			case 1:
				dinero = solicitarDinero("El precio del café es " + MaquinaCafe.getPRECIO_CAFE() + ", introduzca el dinero ");
				cambio = maquinaCafe.servirCafe(dinero);
				MaquinaCafePrincipal.mostrarCambio(cambio);
				break;
		
			case 2:
				dinero = solicitarDinero("El precio de la leche es " + MaquinaCafe.getPRECIO_LECHE() + ", introduzca el dinero ");
				cambio = maquinaCafe.servirLeche(dinero);
				MaquinaCafePrincipal.mostrarCambio(cambio);
				break;
		
			case 3:
				dinero = solicitarDinero("El precio del café con leche es " + MaquinaCafe.getPRECIO_CAFE_LECHE() + ", introduzca el dinero ");
				cambio=maquinaCafe.servirCafeconLeche(dinero);
				MaquinaCafePrincipal.mostrarCambio(cambio);
				break;
		
			case 4:
				System.out.println(maquinaCafe.toString());
				break;
		
			case (5): ///////Desconexion			
				System.out.println("Desconectando, adios");
				break;
		}
	}

		private static double solicitarDinero(String mensaje) {
			
			String cadena;
			double monedero = 0;
			boolean hayError;
			
			do {	
				try {
					System.out.println(mensaje);
					cadena = teclado.nextLine();
					monedero = Double.parseDouble(cadena);
					hayError = false;
				} catch (NumberFormatException ex) {
					System.out.println("Error. No es un nÃºmero.");
					hayError = true;
				}
			} while (monedero <= 0 || hayError == true);

			return monedero;
		}
		
		private static void mostrarCambio(double cambio) {
			if (cambio > 0) {
				System.out.printf("Recoge tu cambio %.2f" , cambio);
			}
		}

}
