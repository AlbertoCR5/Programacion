package ArraysTrimestre1;
import java.util.Scanner;

public class BuscaAlumnos {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroAlumnos;
		String[] clase;
		String buscarAlumno;
		
		numeroAlumnos = solicitarNumeroAlumnos();
		
		clase = new String [numeroAlumnos];
		
		solicitarNombreAlumno(clase);
		
		System.out.println("Introduce el nombre del alumno a buscar");
		buscarAlumno = teclado.nextLine();
		
		boolean econtrado = alumnoABuscar(clase, buscarAlumno);

	}

	private static boolean alumnoABuscar(String[] clase, String buscarAlumno) {
		boolean encontrado = false;
		int i=0;
		
		if (clase[i].equalsIgnoreCase(buscarAlumno)) {
			encontrado = true;
			System.out.println("Alumno encontrado");
		}
		else {
			System.out.println("Alumno no encontrado");
		}
		
		return encontrado;
	}

	private static void solicitarNombreAlumno(String[] clase) {
		
		for (int i = 0; i < clase.length; i++) {
			System.out.println("Introduce el nommbre del alumno " + (i+1));
			clase[i] = teclado.nextLine();
		}

	}

	private static int solicitarNumeroAlumnos() {
		
		System.out.println("Introduce el número total de alumnos");
		int numeroAlumnos = Integer.parseInt(teclado.nextLine());
		
		return numeroAlumnos;
	}

}
