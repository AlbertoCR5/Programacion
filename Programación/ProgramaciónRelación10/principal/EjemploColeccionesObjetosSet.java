package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import Empleado.Empleado;
import Empleado.EmpleadoException;
import Empleado.Informatico;
import Empleado.Operario;
import Empleado.TipoEspecialidad;

public class EjemploColeccionesObjetosSet {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		try {

			// Crear una coleccion donde se puede guardar Strings.
			// Tienen un orden y se guardan contiguos.
			HashSet<Empleado> empleados = new HashSet<Empleado>();

			empleados.add(new Informatico("22", "Alberto", 1450, TipoEspecialidad.DESARROLLO));
			empleados.add(new Informatico("28", "Juan", 1350, TipoEspecialidad.DESARROLLO));
			empleados.add(new Operario("30", "Rosa", 1150, 1));
			empleados.add(new Operario("25", "Silvia", 1100, 2));



			System.out.println("Hay " + empleados.size() + " empleados."); // Size para saber la cantidad que hay

		
		Operario nuevo = new Operario("33", "Novato", 1000, 4);
		
		if (empleados.contains(nuevo)) {
			System.out.println("Ya esta repetida");
		}
		else {
			System.out.println("Incluida");
			empleados.add(nuevo);
		}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//IMPORTANTE PROGRAMAR EL METODO EQUALS CON EL ATRIBUTO QUE NO QIERE QUE SE REPITA, GENERANDO LOS METDOS HASHCODE Y EQUALS
	private static void mostrar(HashSet<Empleado> coleccion) {
		
	}

}
