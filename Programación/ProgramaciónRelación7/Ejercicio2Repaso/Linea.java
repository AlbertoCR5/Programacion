package Ejercicio2Repaso;

public class Linea {

	private final int MOVIMIENTO_INVALIDO = 0;
	private Punto puntoOrigen;
	private Punto puntoDestino;

	// constructor
	public Linea(Punto puntoOrigen, Punto puntoDestino) throws PuntoLineaException {

		if (puntoOrigen.equals(puntoDestino)) {
			throw new PuntoLineaException(
					"Error, los puntos de origen y destino deben ser diferentes (" + puntoOrigen + "," + puntoDestino);
		}
		this.puntoOrigen = puntoOrigen;
		this.puntoDestino = puntoDestino;
	}

	// getters y setters
	public Punto getPuntoOrigen() {
		return puntoOrigen;
	}

	public void setPuntoOrigen(Punto puntoOrigen) {
		this.puntoOrigen = puntoOrigen;
	}

	public Punto getPuntoDestino() {
		return puntoDestino;
	}

	public void setPuntoDestino(Punto puntoDestino) {
		this.puntoDestino = puntoDestino;
	}

	public String toString() {
		return "Linea [" + puntoOrigen + "," + puntoDestino + "]";
	}

	// Metodo que comprueba que la linea tenga algun tipo de desplazamiento
	public boolean equals(Linea otro) {

		boolean comprobar = false;

		if (this.puntoOrigen.equals(otro.puntoOrigen) && this.puntoDestino.equals(otro.puntoDestino)
				|| this.puntoOrigen.equals(otro.puntoDestino) && this.puntoDestino.equals(otro.puntoOrigen)) {
			comprobar = true;
		}

		return comprobar;

	}

	// Metodo que comprueba que el movimiento sea valido.
	public void comprobarMovimiento(double movimiento) throws PuntoLineaException {

		if (movimiento <= MOVIMIENTO_INVALIDO) {
			throw new PuntoLineaException("Error, no se puede mover con dato negativo");
		}
	}

	// Metodo que desplaza la linea hacia la izquierda
	public void moverIzquierda(double movimiento) throws PuntoLineaException {

		double moverPuntoOrigen, moverPuntoDestino;

		comprobarMovimiento(movimiento);

		moverPuntoOrigen = puntoOrigen.getPuntoX() - movimiento;
		puntoOrigen.setPuntoX(moverPuntoOrigen);

		moverPuntoDestino = puntoDestino.getPuntoX() - movimiento;
		puntoDestino.setPuntoX(moverPuntoDestino);

	}

	// Metodo que desplaza la linea hacia la derecha
	public void moverDerecha(double movimiento) throws PuntoLineaException {

		double moverPuntoOrigen, moverPuntoDestino;

		comprobarMovimiento(movimiento);

		moverPuntoOrigen = puntoOrigen.getPuntoX() + movimiento;
		puntoOrigen.setPuntoX(moverPuntoOrigen);

		moverPuntoDestino = puntoDestino.getPuntoX() + movimiento;
		puntoDestino.setPuntoX(moverPuntoDestino);

	}

	// Metodo que desplaza la linea hacia abajo
	public void moverAbajo(double movimiento) throws PuntoLineaException {

		double moverPuntoOrigen, moverPuntoDestino;

		comprobarMovimiento(movimiento);

		moverPuntoOrigen = puntoOrigen.getPuntoY() - movimiento;
		puntoOrigen.setPuntoY(moverPuntoOrigen);

		moverPuntoDestino = puntoDestino.getPuntoY() - movimiento;
		puntoDestino.setPuntoY(moverPuntoDestino);

	}

	// Metodo que desplaza la linea hacia arriba
	public void moverArriba(double movimiento) throws PuntoLineaException {

		double moverPuntoOrigen, moverPuntoDestino;

		comprobarMovimiento(movimiento);

		moverPuntoOrigen = puntoOrigen.getPuntoY() + movimiento;
		puntoOrigen.setPuntoY(moverPuntoOrigen);

		moverPuntoDestino = puntoDestino.getPuntoY() + movimiento;
		puntoDestino.setPuntoY(moverPuntoDestino);

	}
}
