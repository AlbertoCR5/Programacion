package ProgramaciónRelación3;
import java.util.Scanner;

public class Ejercicio06 {
	
	//Realizar un programa que lea el número de alumnos que hay en una clase.
	//A continuación debe leer la nota de cada uno de ellos en un examen y nos
	//debe informar del número de suspensos y aprobados, así como los porcentajes.
	
	private static final double APROBADO = 5.0;

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int numeroAlumnos;
		double nota;
		int suspenso = 0;
		int aprobado = 0;
		double porcentajeAprobados;
		
		System.out.println("Introduce número total de alumnos");
		numeroAlumnos = Integer.parseInt(teclado.nextLine());
		
		for ( int contador = 1; contador<= numeroAlumnos; contador++) {
			do {
			System.out.println("introduce la nota del alumno " + contador + "/" + numeroAlumnos);
			nota = Double.parseDouble(teclado.nextLine());
			} while (nota > 10 || nota < 0);
				if ( nota < APROBADO) {
					System.out.println("Alumno suspenso");
					 suspenso++;
				}
				else {
					System.out.println("ALumno aprobado");
					 aprobado++;
				}
		}
		System.out.println("El número total de aprobados es: " + aprobado);
		System.out.println("El número total de suspensos es: " + suspenso);
		
		porcentajeAprobados = ((double)aprobado / numeroAlumnos) * 100;
		System.out.println("El porcentaje de alumnos aprobados es del: " + porcentajeAprobados + "%");

	}

}
