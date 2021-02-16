package Alquiler;

import java.util.Scanner;

import Ejercicio1.Refran;
import Ejercicio1.RefranException;

public class MainAlquiler {

	private static final int MAXIMO_VEHICULOS = 50;
	private static final int PRIMERA_OPCION_MENU = 1;
	private static final int MENU = 4;

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		Vehiculo[] vehiculos = new Vehiculo[MAXIMO_VEHICULOS];
		
		Furgoneta furgoneta;
		Microbus microbus;
		int numeroVehiculos = 0;
		int elegirVehiculo;
		
		
		elegirVehiculo = menuEleccionVehiculo();
		tratarMenu(elegirVehiculo, vehiculos, numeroVehiculos);
		

	}

	private static int menuEleccionVehiculo() {
		
		int elegirVehiculo;

		do {
			System.out.println("¿Que tipo de vehiculo desea alquilar?");
			System.out.println("(1) Turismo");
			System.out.println("(2) Furgoneta");
			System.out.println("(3) Microbus");
			System.out.println("(4) Salir");
			elegirVehiculo = Integer.parseInt(teclado.nextLine());
		} while (elegirVehiculo < PRIMERA_OPCION_MENU || elegirVehiculo > MENU);
		
		return elegirVehiculo;
	}

	private static int tratarMenu(int elegirVehiculo, Vehiculo[] vehiculos, int numeroVehiculos) {

		try {

			switch (elegirVehiculo) {

			case 1: //Nuevo refran
				if (numeroVehiculos == MAXIMO_VEHICULOS) {
					System.out.println("No disponemos de ningun vehiculo para alquiler");
				} else {
					Vehiculo turismo = new Turismo(obtenerMatricula(), solicitarGama(), solicitarCombustion());

					if (!estaAlquilado(turismo, vehiculos, numeroVehiculos)) {
						vehiculos[numeroVehiculos] = turismo;
						numeroVehiculos++;
					} else {
						System.out.println("Alquilado, el vehiculo solicitado no se encuentra disponible");
					}
				}
				break;

			case 2:
				if (numeroVehiculos == MAXIMO_VEHICULOS) {
					System.out.println("No disponemos de ningun vehiculo para alquiler");
				} else {
					Vehiculo furgoneta = new Turismo(obtenerMatricula(), solicitarGama(), solicitarCombustion());

					if (!estaAlquilado(furgoneta, vehiculos, numeroVehiculos)) {
						vehiculos[numeroVehiculos] = furgoneta;
						numeroVehiculos++;
					} else {
						System.out.println("Alquilado, el vehiculo solicitado no se encuentra disponible");
					}
				}
				break;

			case 3:
				if (numeroVehiculos == MAXIMO_VEHICULOS) {
					System.out.println("No disponemos de ningun vehiculo para alquiler");
				} else {
					Vehiculo microbus = new Turismo(obtenerMatricula(), solicitarGama(), solicitarCombustion());

					if (!estaAlquilado(microbus, vehiculos, numeroVehiculos)) {
						vehiculos[numeroVehiculos] = microbus;
						numeroVehiculos++;
					} else {
						System.out.println("Alquilado, el vehiculo solicitado no se encuentra disponible");
					}
				}
				break;
				
			case 4:
				System.out.println("Adios");
			}

		} catch (AlquilerException e) {
			System.out.println(e.getMessage());
		}

		return numeroVehiculos;
	}

	private static boolean estaAlquilado(Vehiculo microbus, Vehiculo[] vehiculos, int numeroVehiculos) {
		// TODO Auto-generated method stub
		return false;
	}

	private static TipoCombustion solicitarCombustion() {
		// TODO Auto-generated method stub
		return combustion;
	}

	private static TipoGama solicitarGama() {
		// TODO Auto-generated method stub
		return gama;
	}

	private static String obtenerMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}
	}


