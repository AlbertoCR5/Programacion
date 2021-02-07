package Programaci�nRelaci�n4;
/**
 * Programa que usa un método llamado diasDeUnMes, que tenga como entrada 
 * un número de mes (entre 1 y 12) y un año y devuelva el número de días de ese mes y año.
 * Usar el método anterior para cuando el año sea bisiesto, febrero tenga 29 días.
*/


public class Ejercicio04 {

	private static final int ANIO_MAXIMO = 2050;
	
	public static void main(String[] args) {
		
		int mes;
		int a�o;
		int diasMesAnio;
		
		
		System.out.println("Introduzca el mes 1-12");
		mes = Ejercicio01.solicitarNumeroEnRango(1,12);
		System.out.println("Introduzca el a�o");
		a�o = Ejercicio01.solicitarNumeroEnRango(0, ANIO_MAXIMO);
		
	
		diasMesAnio = calcularDiasMesAnio(mes, a�o);
		
		System.out.println("El mes " + mes + " del a�o " + a�o + " tiene " + diasMesAnio + "d�as.");	
	}

	/**
	 * Metodo que calcula el numero de dias de un mes-anio.
	 * Supone que los parámetros de entrada son correctos
	 * @param mes
	 * @param anio
	 * @return numero de dias de ese mes-anio
	 */
	
	public static int calcularDiasMesAnio (int mes, int anio) {
		
		int dias;
		boolean esBisiesto;
		
		if (mes == 2) {
			// Se comprueba si el anio es bisiesto
			esBisiesto = Ejercicio03.comprobarBisiesto(anio);
			if (!esBisiesto) {
				dias = 28;
			}
			else {
				dias = 29;
			}
		}
		else {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			}
			else {
				dias = 31;
			}
		}
		
		return dias;
	}	
}
