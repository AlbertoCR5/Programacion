package Cartas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainCartas {
	
	private static final int NUMERO_TOTAL_CARTAS = 48;
	private static final int MINIMO_REPARTO = 12;
	private static final int MAXIMO_REPARTO = 12;
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		Cartas[] baraja;
		Cartas[] repartoJugador1, repartoJugador2;
		int repartoCartas;
		
		baraja = crearBaraja();
		System.out.println(Arrays.toString(baraja));

		do {
			System.out.println("¿Cuantas cartas reparto?");
			repartoCartas = Integer.parseInt(teclado.nextLine());
		} while (repartoCartas < MINIMO_REPARTO || repartoCartas > MAXIMO_REPARTO);
		
		repartoJugador1 = repartir(baraja, repartoCartas);
		System.out.println("Para el jugador 1: " + Arrays.toString(repartoJugador1));
		
		repartoJugador2 = repartir(baraja, repartoCartas);
		System.out.println("Para el jugador 2: " + Arrays.toString(repartoJugador2));

	}

	private static Cartas[] crearBaraja() {
		
		Cartas[] baraja = new Cartas[NUMERO_TOTAL_CARTAS];
		
		int i = 0;
		
		try {
		
			for (int palo = 0; palo < Cartas.PALOS.length; palo++) {
				for (int numero = 1; numero < Cartas.CARTAS_POR_PALO; numero++) {
					baraja[i] = new Cartas(numero, Cartas.PALOS[palo]);
					i++;
				}
				
			}
			
		} catch (CartasException e) {
			System.out.println(e.getMessage());
		}

		return baraja;
	}
	
	private static Cartas[] repartir(Cartas[] baraja, int numeroCartas) {
		
		Cartas[] reparto = new Cartas[numeroCartas];
		
		Random generarAleatorio = new Random();
		int numero;
		int i = 0;
		
		while (i < reparto.length) {
			numero = generarAleatorio.nextInt(NUMERO_TOTAL_CARTAS);
			if (baraja[numero] != null) {
				reparto[i] = baraja[numero];
				i++;
				baraja[numero] = null;
			}
		}
		
		return reparto;
	}

}
