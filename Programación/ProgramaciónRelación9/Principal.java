

import java.util.Arrays;
import java.util.Scanner;
import Alquiler.AlquilerException;
import Alquiler.FlotaVehiculos;
import Alquiler.Furgoneta;
import Alquiler.Microbus;
import Alquiler.TipoCombustion;
import Alquiler.TipoGama;
import Alquiler.Turismo;
import Alquiler.Vehiculo;

public class Principal {

	private static final int OPCION_SALIR = 4;
	private static Scanner teclado = new Scanner(System.in);
	public static final int MAXVEHICULOS = 3;

	public static void main(String[] args) {

		int opcion;
		FlotaVehiculos flotaVehiculos;
	

		try {
			flotaVehiculos = new FlotaVehiculos(MAXVEHICULOS);
			do {
				opcion = mostrarMenu();
				tratarMenu(opcion, flotaVehiculos);

			} while (opcion != OPCION_SALIR);
		} catch (AlquilerException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void tratarMenu(int opcion, FlotaVehiculos flotaVehiculos) {
		Vehiculo vehiculo;
		String matricula;
		int dias;
		double precioAlquiler;

		try {
			switch (opcion) {
			case 1: {
				vehiculo = elegirTipoVehiculo();
				flotaVehiculos.introducirVehiculo(vehiculo);
				break;
			}
			case 2: {

				matricula = introduceMatricula();
				dias = solicitarDias();
				precioAlquiler = flotaVehiculos.precioAlquiler(matricula, dias);

				System.out.println("El vehiculo con la matricula " + matricula + " tiene que pagar por alquiler "
						+ precioAlquiler);

				break;

			}
			case 3:{ // consulta
				System.out.println(flotaVehiculos);
			}

			}
		} catch (AlquilerException e) {
			System.out.println(e.getMessage());
		}

	}

	private static int solicitarDias() {

		int dias = -1;

		do {
			try {
				System.out.println("Introduce el numero de dias que el vehiculo ha estado alquilado");

				dias = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Introduce un numero positivo");
			}

		} while (dias < 0);

		return dias;
	}

	private static Vehiculo elegirTipoVehiculo() throws AlquilerException {
		Vehiculo vehiculo = null;
		String tipoVehiculo;
		String matricula;
		TipoGama gama;
		TipoCombustion combustion;
		int numPlazas;
		int pma;

		tipoVehiculo = solicitarTipoVehiculo();

		matricula = introduceMatricula();
		gama = introduceGama();

		switch (tipoVehiculo) {
		case "COCHE": {

			combustion = introduceCombustible();
			vehiculo = new Turismo(matricula, gama, combustion);
			break;
		}
		case "MICROBUS": {
			System.out.println("Numero de plazas que tiene");
			numPlazas = Integer.parseInt(teclado.nextLine());
			vehiculo = new Microbus(matricula, gama, numPlazas);

			break;
		}
		case "FURGONETA": {
			System.out.println("Introduce el peso minimo autorizado del vehiculo");
			pma = Integer.parseInt(teclado.nextLine());
			vehiculo = new Furgoneta(matricula, gama, pma);

			break;
		}

		}

		return vehiculo;

	}

	private static String solicitarTipoVehiculo() {
		String tipoVehiculo;
		do {
			System.out.println("Que tipo de veiculo va a dar de alta: Coche, Microbus, Furgoneta");
			tipoVehiculo = teclado.nextLine().toUpperCase();

		} while (!(tipoVehiculo.equals("COCHE") || tipoVehiculo.equals("MICROBUS")
				|| tipoVehiculo.equals("FURGONETA")));

		return tipoVehiculo;
	}

	private static String introduceMatricula() {
		String matricula;

		System.out.println("Introduce matricula");
		matricula = teclado.nextLine().toUpperCase();
		return matricula;
	}

	private static TipoGama introduceGama() {
		TipoGama gama = null;
		String cadena;
		boolean correcto = false;

		do {
			System.out.println("Introduce gama a la que pertenece " + Arrays.toString(TipoGama.values()));
			cadena = teclado.nextLine().toUpperCase();
			try {
				gama = TipoGama.valueOf(cadena);
				correcto = true;
			} catch (IllegalArgumentException e) {
				System.out.println("No ha introducido una gama correcta");
			}

		} while (correcto == false);

		return gama;

	}

	private static TipoCombustion introduceCombustible() {
		TipoCombustion combustible = null;
		String cadena;
		boolean correcto = false;
		do {
			System.out.println("Tipo de combustible que usa:" + Arrays.toString(TipoCombustion.values()));
			cadena = teclado.nextLine().toUpperCase();
			try {
				combustible = TipoCombustion.valueOf(cadena);
				correcto = true;
			} catch (IllegalArgumentException e) {
				System.out.println("No ha introducido un combustible correcto");
			}

		} while (correcto == false);

		return combustible;
	}

	// M�todo mostrar menu
	private static int mostrarMenu() {
		int op = 0;
		do {
			System.out.println("Menu vehiculos:");
			System.out.println("1.-Alta vehiculo");
			System.out.println("2.-Precio Alquiler");
			System.out.println("3.-Consultar Vehiculos");
			System.out.println("4.-Salir");
			try {
				op = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Introduzca un numero de 1 al "+ OPCION_SALIR);
			}
		} while (op < 1 || op > OPCION_SALIR);

		return op;
	}

}
