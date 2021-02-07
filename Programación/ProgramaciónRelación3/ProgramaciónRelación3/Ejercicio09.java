package ProgramaciónRelación3;


public class Ejercicio09 {
	
	//Realizar un programa que muestre todas las tablas de multiplicar (del 0 al 10).

	public static void main(String[] args) {

		int contador = 0;
		int contador1;
		int resultado;

		do {
			System.out.println("Tabla del " + contador);
			contador1 = 0;
			do {
				resultado = contador * contador1;
				System.out.println(+contador + "x" + contador1 + " = " + resultado);
				contador1++;
			} while (contador1 <= 10);
			contador++;
			System.out.println();
		} while (contador <= 10);
		System.out.println("FIN");

	}

}
