package Cartas;

public class Cartas {
	
	//Constante
	public static final String[] PALOS = {"OROS", "COPAS", "BASTOS", "ESPADAS"};
	public static final int CARTAS_POR_PALO = 12;
	public static final int NUMERO_CARTA_MINIMA = 1;
	
	//Atributos
	private int numero;
	private String palo;
	
	//Constructor
	public Cartas(int numero, String palo) throws CartasException {
		
		if (numero < NUMERO_CARTA_MINIMA || numero > CARTAS_POR_PALO) {
			throw new CartasException("Numero de carta incorrecto" + numero);
		}

		if (!paloCorrecto(palo)) {
			throw new CartasException("Palo incorrecto");
		}
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Cartas [numero=" + numero + ", palo=" + palo + "]";
	}
	
	private boolean paloCorrecto(String palo) {
		
		boolean correcto = false;
		
		for (int i = 0; i < PALOS.length && correcto == false; i++) {
			
			if (PALOS[i].equals(palo)) {
				correcto = true;
			}
			
		}
		return correcto;
	}
	
	
}
