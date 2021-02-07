package ProgramaciónRelación4;
import java.util.Scanner;

/**Realizar un método llamado diaDe1laSemana al que se le pasen 3
*parámetros enteros:
*• dia
*• mes
*• anno
*El método debe devolver en un String el día de la semana que era esa
*fecha. Para ello se tendrá en cuenta el siguiente algoritmo:
*a = (14 - mes) / 12
*y = anno – a
*m = mes + 12 * a – 2
*d = (día + y + y/4 - y/100 + y/400 + (31*m)/12) mod 7
*Si el resultado de d es es un cero (0) era domingo, 1 para el lunes... 6 para
*el sábado.
*/

public class Ejercicio07 {
	
	static Scanner teclado=new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int dia;
		int mes;
		int anno;
		String diaSemana;
		
		System.out.println("Introduce el dia del mes");
		dia = Ejercicio01.solicitarNumeroEnRango(1, 31);
		//dia = Integer.parseInt(teclado.nextLine());		
		System.out.println("Introduce el mes del año");
		mes = Ejercicio01.solicitarNumeroEnRango(1, 12);
		//mes = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el año");
		anno = Ejercicio01.solicitarNumeroEnRango(1900, 3100);
		//anno = Integer.parseInt(teclado.nextLine());
		
				
					
		
		
		
		diaSemana = diaDeLaSemana(dia, mes, anno);
		
		System.out.println("El día de la semana es: " + diaSemana);
	}
	
	public static String diaDeLaSemana(int dia, int mes, int anno) {
		String diaSemana = null;
		int a;
		int y;
		int m;
		int d;
		
		
		a = (14 - mes) / 12;
		y = anno - a;
		m = mes + 12 * a - 2;
		d = (dia + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
		
		switch ( d ) {
		case 0:
			diaSemana = new String("Domingo");
			break;
		case 1:
			diaSemana = new String("Lunes");
			break;
		case 2:
			diaSemana = new String ("Martes");
			break;
		case 3:
			diaSemana = new String ("Miércoles");
			break;
		case 4:
			diaSemana = new String ("Jueves");
			break;
		case 5:
			diaSemana = new String ("Viernes");
			break;
		case 6:
			diaSemana = new String ("Sabado");
			break;
			
		}	
	
			return diaSemana;
	}

}
