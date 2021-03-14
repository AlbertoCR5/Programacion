package juegoTablero;


public class JuegoTablero {

	private static final int TAMANNO_TABLERO = 20;
	private char[] tablero;
	
	public JuegoTablero() {
		tablero=new char[TAMANNO_TABLERO];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i]='*';
		}
	}
	
	//TODO
	private int localizarJugador ( char ficha) {
		
		boolean encontrado = false;
		int posicion = -1;
		
		for (int i = 0; i < tablero.length && !encontrado; i++) {
			if (tablero[i] == ficha) {
				encontrado = true;
				posicion = i;
			}
			
		}
		
		return posicion;
	}
	
	//TODO
	public void moverJugador (char ficha, int dado) throws JuegoException {
		
		//Controlar la excepcion del dado
		char aux;
		int posicion = localizarJugador(ficha);
		int posicionSiguiente = posicion + dado;
		
		if (tablero[posicionSiguiente] != '*') {
			posicionSiguiente++;
		}
		if (posicionSiguiente > TAMANNO_TABLERO) {
			posicionSiguiente = TAMANNO_TABLERO - 1;
		}
		
		
	}
	
	public String toString() {
		StringBuilder info=new StringBuilder();
		for (int i = 0; i < tablero.length; i++) {
			info.append(tablero[i] + " ");
		}
		info.append("\n");
		return info.toString();
	}
}
