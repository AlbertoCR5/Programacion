package Ejercicio5Repaso;

import java.util.Scanner;

public class MainPartido {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Equipo sev = new Equipo("Sevilla FC", "Ramón Sanchez Pizjuan", "Sevilla");
		Equipo bet = new Equipo("Real Betis", "Benito Villamarin", "Sevilla");
//		Equipo rma = new Equipo("Real Madrid", "Santiago Bernabeu", "Madrid");
//		Equipo atm = new Equipo("Atletico de Madrid", "Wanda Metropolitano", "Madrid");
//		Equipo bar = new Equipo("Barcelona FC", "Nou Camp", "Barcelona");
//		Equipo val = new Equipo("Valencia", "Mestalla", "Valencia");
		
		crearPartido(sev, bet);
	}
		private static void crearPartido(Equipo sev, Equipo bet) {
			
			Partido partido1;
			int jornada;
			
			try {
				jornada = solicitarJornada("Introduzca la jornada en la que se disputa el partido");
				partido1 = new Partido(jornada, sev, bet);
				partido1.obtenerResultado("5-0");
			} catch (PartidoException e) {
				System.out.println(e.getMessage());
			}
	
		
	}
		private static int solicitarJornada(String string) {

			int jornada;
			
			System.out.println(string);
			jornada = Integer.parseInt(teclado.nextLine());
			
			return jornada;
		}

}
