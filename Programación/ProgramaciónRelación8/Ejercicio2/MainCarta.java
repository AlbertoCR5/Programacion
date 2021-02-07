package Ejercicio2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainCarta {

	private static final int NUMERO_CARTAS_BARAJA_ESPANOLA = 48;
	private static final int MAXIMO = 12;
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Carta[] baraja;
		Carta[] repartoJugador1, repartoJugador2;
		int repartoCartas;
		
		baraja = crearBaraja();
		System.out.println(Arrays.toString(baraja));
		
		do {
			System.out.println("¿Cuantas cartas reparto?");
			repartoCartas = Integer.parseInt(teclado.nextLine());
		} while (repartoCartas < 1 || repartoCartas > MAXIMO);
		
		repartoJugador1 = repartir(baraja, repartoCartas);
		System.out.println("Para el jugador 1: " + Arrays.toString(repartoJugador1));
		
		repartoJugador2 = repartir(baraja, repartoCartas);
		System.out.println("Para el jugador 2: " + Arrays.toString(repartoJugador2));

	}

	private static Carta[] crearBaraja() {
		
		Carta[] baraja = new Carta[NUMERO_CARTAS_BARAJA_ESPANOLA];
		
		int i = 0;
			
		try {
			for (int palo = 0; palo < Carta.PALOS.length; palo++) {
				for (int numero = 1; numero <= Carta.CARTAS_POR_PALO; numero++) {
					baraja[i] = new Carta(numero, Carta.PALOS[palo]);
					i++;
				}
					
			}
		} catch (CartaException e) {
			//Este error no debe darse nunca
			System.out.println(e.getMessage());
		}
		
		return baraja;
	}

	private static Carta[] repartir(Carta[] baraja, int numeroCartas) {

		Carta [] reparto = new Carta[numeroCartas];
		
		Random generarAleatorio = new Random();
		int numero, i = 0;
		
		while (i < reparto.length) {
			numero = generarAleatorio.nextInt(NUMERO_CARTAS_BARAJA_ESPANOLA);
			if (baraja[numero] != null) {
				reparto[i] = baraja[numero];
				i++;
				baraja[numero] = null;
			}
		}
		
		return reparto;
	}

}
