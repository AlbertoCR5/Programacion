import java.util.Random;
import java.util.Scanner;

import alquiler.AlquilerException;
import alquiler.Furgoneta;
import alquiler.Microbus;
import alquiler.TipoCombustion;
import alquiler.TipoGama;
import alquiler.Turismo;
import alquiler.Vehiculo;



public class MainAlquiler {

	private static final int MAXIMO_VEHICULOS = 50;
	private static final int MAXIMO_MATRICULA = 9999;
	private static final int OPCION_UNO = 1;
	private static final int OPCION_DOS = 2;
	private static final int OPCION_TRES = 3;
	private static final int MENU = 4;

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Vehiculo[] vehiculos = new Vehiculo[MAXIMO_VEHICULOS];

		int numeroVehiculos = 0;
		int elegirVehiculo;

		elegirVehiculo = menuEleccionVehiculo();
		tratarMenu(elegirVehiculo, vehiculos, numeroVehiculos);

	}

	private static int solicitarDiasAlquiler() {

		int dias;
		
		System.out.println("Cuantos dias necesitara el vehiculo");
		dias = Integer.parseInt(teclado.nextLine());
		
		return dias;
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
		} while (elegirVehiculo < OPCION_UNO || elegirVehiculo > MENU);

		return elegirVehiculo;
	}

	private static int tratarMenu(int elegirVehiculo, Vehiculo[] vehiculos, int numeroVehiculos) {

		try {

			switch (elegirVehiculo) {

			case 1: // Nuevo Turismo
				if (numeroVehiculos == MAXIMO_VEHICULOS) {
					System.out.println("No disponemos de ningun vehiculo para alquiler");
				} else {
					Vehiculo turismo = new Turismo(obtenerMatricula(), solicitarGama(), solicitarCombustion());
					turismo.calcularPrecioAlquiler(solicitarDiasAlquiler());
					if (!estaAlquilado(turismo, vehiculos, numeroVehiculos)) {
						vehiculos[numeroVehiculos] = turismo;
						System.out.println(turismo.toString());
						numeroVehiculos++;

					} else {
						System.out.println("Alquilado, el vehiculo solicitado no se encuentra disponible");
					}
				}
				break;

			case 2: // Nueva Furgoneta
				if (numeroVehiculos == MAXIMO_VEHICULOS) {
					System.out.println("No disponemos de ningun vehiculo para alquiler");
				} else {
					Vehiculo furgoneta = new Furgoneta(obtenerMatricula(), solicitarGama(), solicitarPesoMaximoAutorizado());
					furgoneta.calcularPrecioAlquiler(solicitarDiasAlquiler());
					if (!estaAlquilado(furgoneta, vehiculos, numeroVehiculos)) {
						vehiculos[numeroVehiculos] = furgoneta;
						System.out.println(furgoneta.toString());
						numeroVehiculos++;
					} else {
						System.out.println("Alquilado, el vehiculo solicitado no se encuentra disponible");
					}
				}
				break;

			case 3: // Nuevo Microbus
				if (numeroVehiculos == MAXIMO_VEHICULOS) {
					System.out.println("No disponemos de ningun vehiculo para alquiler");
				} else {
					Vehiculo microbus = new Microbus(obtenerMatricula(), solicitarGama(), solicitarPlazas());
					microbus.calcularPrecioAlquiler(solicitarDiasAlquiler());
					if (!estaAlquilado(microbus, vehiculos, numeroVehiculos)) {
						vehiculos[numeroVehiculos] = microbus;
						System.out.println(microbus.toString());
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

	private static int solicitarPlazas() {

		int plazas;

		System.out.println("Introduce el numero de plazas que tendra el microbus");
		plazas = Integer.parseInt(teclado.nextLine());

		return plazas;
	}

	private static int solicitarPesoMaximoAutorizado() {

		int pesoMaximoAutorizado;

		System.out.println("Introduce el peso maximo autorizado requerido para su vehiculo");
		pesoMaximoAutorizado = Integer.parseInt(teclado.nextLine());

		return pesoMaximoAutorizado;
	}

	private static boolean estaAlquilado(Vehiculo nuevoVehiculo, Vehiculo[] vehiculos, int numeroVehiculos) {

		boolean alquilado = false;

		for (int i = 0; i < numeroVehiculos && alquilado == false; i++) {

			if (nuevoVehiculo.equals(vehiculos[i])) {
				alquilado = true;
			}
		}
		return alquilado;
	}

	private static TipoCombustion solicitarCombustion() {

		int elegirCombustible = 0;
		TipoCombustion combustion;

		do {
			System.out.println("Elige el combustible que utilizara el vehiculo ");
			System.out.println("(1) Gasolina");
			System.out.println("(2) Diesel");
			elegirCombustible = Integer.parseInt(teclado.nextLine());
		} while (elegirCombustible > OPCION_DOS || elegirCombustible < OPCION_UNO);

		if (elegirCombustible == 1) {
			combustion = TipoCombustion.GASOLINA;
		} else {
			combustion = TipoCombustion.DIESEL;
		}

		return combustion;
	}

	private static TipoGama solicitarGama() {

		int elegirGama;
		TipoGama gama;

		do {
			System.out.println("Elige la gama del vehiculo ");
			System.out.println("(1) Alta");
			System.out.println("(2) Media");
			System.out.println("(3) Baja");
			elegirGama = Integer.parseInt(teclado.nextLine());
		} while (elegirGama < OPCION_UNO || elegirGama > OPCION_TRES);

		if (elegirGama == 1) {
			gama = TipoGama.ALTA;
		} else {
			if (elegirGama == 2) {
				gama = TipoGama.MEDIA;
			} else {
				gama = TipoGama.BAJA;
			}
		}

		return gama;
	}

	private static String obtenerMatricula() {

		int numeroMatricula;
		String matricula;

		Random generarAleatorio = new Random(+1000);
		numeroMatricula = generarAleatorio.nextInt(MAXIMO_MATRICULA);
		matricula = String.valueOf(numeroMatricula);
		matricula = matricula + "KYZ";

		return matricula;
	}
}
