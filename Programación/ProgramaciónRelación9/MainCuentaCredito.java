import java.util.Scanner;

import Banco.CuentaCredito;
import Banco.CuentaException;

public class MainCuentaCredito {

	private final static int INICIO_MENU = 1;
	private final static int SALIDA_MENU = 4;
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

//		try {
//			CuentaCredito cc = new CuentaCredito(3000, "AlbertoCastro", 200);
//
//			System.out.println(cc.getSaldo());
//			System.out.println(cc.getTitular());
//			System.out.println(cc.getCredito());
//
//			cc.realizarIngreso(500);
//			System.out.println(cc);
//			cc.realizarReintegro(3600);
//			System.out.println(cc);
//
//		} catch (CuentaException e) {
//
//			System.out.println(e.getMessage());
//		}

		CuentaCredito cuentaCredito = null;
		String titular;
		int credito;
		double saldoInicial;
		int opcion;
		
		try {
			
			titular = crearNuevoTitular("Introduce nombre completo del cliente");
			saldoInicial = establecerSaldoInicial("Introduce el saldo inicial de la cuenta perteneciente al cliente " + titular);
			credito = darCredito("Establece un credito maximo para el cliente " + titular);
			cuentaCredito = new CuentaCredito(titular, saldoInicial, credito);
			
			do {
				opcion = mostrarMenu();
				tratarMenu(opcion, cuentaCredito);
			} while (opcion != SALIDA_MENU);
			
		} catch (CuentaException e) {
			System.out.println(e.getMessage());
		}
	}


	private static String crearNuevoTitular(String msg) {

		String titular;
		
		System.out.println(msg);
		titular = teclado.nextLine().toUpperCase();
		
		return titular;
	}


	private static double establecerSaldoInicial(String msg) {
		
		double saldoInicial;
		
		System.out.println(msg);
		saldoInicial = Integer.parseInt(teclado.nextLine());
		
		return saldoInicial;
	}


	private static int darCredito(String msg) {

		int credito;
		
		System.out.println(msg);
		credito = Integer.parseInt(teclado.nextLine());
		
		return credito;
	}


	private static int mostrarMenu() {

		int opcion;

		do {
			System.out.println("Bienvenido al menu, que operacion desea realizar");
			System.out.println("(1) Ingresar dinero");
			System.out.println("(2) Retirar dinero");
			System.out.println("(3) Consulta de saldo y credito");
			System.out.println("(4) Salir");
			opcion = Integer.parseInt(teclado.nextLine());
		} while (opcion < INICIO_MENU || opcion > SALIDA_MENU);

		return opcion;
	}

	private static void tratarMenu(int opcion, CuentaCredito cuentaCredito) {

		double cantidad;
		
		try {
			
			switch (opcion) {
			
			case 1:
				cantidad = solicitarCantidad("¿Cuanto dinero desea ingresar?");
				cuentaCredito.realizarIngreso(cantidad);
				break;
				
			case 2:
				cantidad = solicitarCantidad("¿Cuanto dinero desea retirar?");
				cuentaCredito.realizarReintegro(cantidad);
				
			case 3:
				System.out.println(cuentaCredito.toString());
				break;
				
			case 4:
				System.out.println("Adios");
			}
			
		} catch (CuentaException e) {
			System.out.println(e.getMessage());
		}
		
	}


	private static double solicitarCantidad(String msg) {
		
		double cantidad;
		
		System.out.println(msg);
		cantidad = Integer.parseInt(teclado.nextLine());
		
		return cantidad;
	}

}
