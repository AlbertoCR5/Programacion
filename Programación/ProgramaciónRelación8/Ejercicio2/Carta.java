package Ejercicio2;

public class Carta {

	public static final String[] PALOS = {"ORO", "COPA", "BASTO", "ESPADA"};
	public static final int CARTAS_POR_PALO = 12;
	private int numero;
	private String palo;
	
	public Carta(int numero, String palo) throws CartaException {
		if (numero < 1 || numero > CARTAS_POR_PALO) {
			throw new CartaException("Numero de carta incorrecto" + numero);
		}

		if(!paloCorrecto(palo)) {
			throw new CartaException("Palo incorrecto");
		}
		this.numero = numero;
		this.palo = palo;
	}

	private boolean paloCorrecto(String palo) {
		
		boolean encontrado = false;
		
		for (int i = 0; i < PALOS.length && encontrado == false; i++) {
			
			if (PALOS[i].equals(palo)) {
				encontrado = true;
			}
			
		}

		return encontrado;
	}

	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	public String toString() {
		return  numero + " de " + palo;
	}
	
	
	
		
}
