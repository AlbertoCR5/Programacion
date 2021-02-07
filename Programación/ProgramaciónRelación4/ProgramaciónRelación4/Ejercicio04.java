package ProgramaciÛnRelaciÛn4;
/**
 * Programa que usa un m√©todo llamado diasDeUnMes, que tenga como entrada 
 * un n√∫mero de mes (entre 1 y 12) y un a√±o y devuelva el n√∫mero de d√≠as de ese mes y a√±o.
 * Usar el m√©todo anterior para cuando el a√±o sea bisiesto, febrero tenga 29 d√≠as.
*/


public class Ejercicio04 {

	private static final int ANIO_MAXIMO = 2050;
	
	public static void main(String[] args) {
		
		int mes;
		int aÒo;
		int diasMesAnio;
		
		
		System.out.println("Introduzca el mes 1-12");
		mes = Ejercicio01.solicitarNumeroEnRango(1,12);
		System.out.println("Introduzca el aÒo");
		aÒo = Ejercicio01.solicitarNumeroEnRango(0, ANIO_MAXIMO);
		
	
		diasMesAnio = calcularDiasMesAnio(mes, aÒo);
		
		System.out.println("El mes " + mes + " del aÒo " + aÒo + " tiene " + diasMesAnio + "dÌas.");	
	}

	/**
	 * Metodo que calcula el numero de dias de un mes-anio.
	 * Supone que los par√°metros de entrada son correctos
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
