import java.util.Scanner;

import Empleado.Directivo;
import Empleado.Informatico;
import Empleado.Operario;
import Empleado.TipoEspecialidad;

public class MainEmpleado {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//especialidad = TipoEspecialidad.valueOf(especialidad);
		//convertir String a enumerado

		System.out.println("Introduce la especialidad");
		String cadena = teclado.nextLine().toUpperCase();
		TipoEspecialidad especialidad = TipoEspecialidad.valueOf(cadena);
		
		try {
			
			Operario operario1 = new Operario("48923213R", "Manolo", 1000, 3);
			operario1.setSueldo(1150);
			Informatico informatico1 = new Informatico("51541511T", "Silvia", 2100, especialidad);
			Directivo directivo1 = new Directivo("12345678K", "Alberto", 3200, "Informatica");
			
			System.out.println(operario1);
			System.out.println();
			System.out.println(informatico1);
			System.out.println();
			System.out.println(directivo1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}