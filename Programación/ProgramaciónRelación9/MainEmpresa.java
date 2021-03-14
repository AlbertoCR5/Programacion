import java.util.Arrays;
import java.util.Scanner;

import empresa.Empleado;
import empresa.EmpleadoBase;
import empresa.JefeDepartamento;
import empresa.TipoPuesto;

public class MainEmpresa {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Empleado[] empleados = new Empleado[5];
		TipoPuesto puesto;

		try {
			empleados[0] = new JefeDepartamento("1515153G", "Pepe", 3000, "Recursos humanos");
			empleados[1] = new JefeDepartamento("1515153G", "Manuel", 3100, "Logistica");
			empleados[2] = new EmpleadoBase("1515153G", "Rocio", TipoPuesto.CONTABLE);
			empleados[3] = new EmpleadoBase("1515153G", "Antonio", TipoPuesto.ADMINISTRATIVO);
			empleados[4] = new EmpleadoBase("1515153G", "Ruben", TipoPuesto.OPERARIO);

			// Conversion
			((JefeDepartamento) empleados[0]).incorporarSubordinado(empleados[2]);
			((JefeDepartamento) empleados[0]).incorporarSubordinado(empleados[3]);
			((JefeDepartamento) empleados[1]).incorporarSubordinado(empleados[4]);

			puesto = solicitarPuesto();
			mostrarEmpleadosConUnPuesto(empleados, puesto);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mostrarEmpleadosConUnPuesto(Empleado[] empleados, TipoPuesto puesto) {

		EmpleadoBase base;

		for (int i = 0; i < empleados.length; i++) {

			if (empleados[i] instanceof EmpleadoBase) {
				base = (EmpleadoBase) empleados[i];

				if (base.getPuesto().equals(puesto)) {
					System.out.println(base);
				}
			}

		}

	}

	private static TipoPuesto solicitarPuesto() {

		TipoPuesto puesto = null;
		boolean error;

		do {
			
			try {
				System.out.println("Introduce el puesto " + Arrays.toString(TipoPuesto.values()));//Llama a los arrays de enumerados
				puesto = TipoPuesto.valueOf(teclado.nextLine().toUpperCase()); // Convierrte enumerado a String(cadena)
				error = false;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				error = true;
			}
			
		} while (error);

		return puesto;
	}

}
