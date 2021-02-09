package PuntoLinea;

public class Linea {

	private Punto puntoOrigen;
	private Punto puntoDestino;

	public Linea(Punto puntoOrigen, Punto puntoDestino) throws PuntoLineaException {

		if (puntoOrigen.equals(puntoDestino)) {
			throw new PuntoLineaException("No se puede crear una linea si dos puntos son iguales");
		}
		this.puntoOrigen = puntoOrigen;
		this.puntoDestino = puntoDestino;
	}

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
		return "Linea [punto1=" + puntoOrigen + ", punto2=" + puntoDestino + "]";
	}

	public boolean equals(Linea otro) {
		boolean comprobar = false;

		if (this.puntoOrigen.equals(otro.puntoOrigen) && this.puntoDestino.equals(otro.puntoDestino)
				|| this.puntoOrigen.equals(otro.puntoDestino) && this.puntoDestino.equals(otro.puntoOrigen)) {

			comprobar = true;
		}
		return comprobar;
	}

	private void comprobarMovimientoCorrecto(double movimiento) throws PuntoLineaException {

		if (movimiento <= 0) {
			throw new PuntoLineaException("No se puede mover con dato negativo");
		}

	}

	public void moverDerecha(double movimiento) throws PuntoLineaException {

		double resultadoPuntoOrigen, resultadoPuntoDestino;

		this.comprobarMovimientoCorrecto(movimiento);

		resultadoPuntoOrigen = puntoOrigen.getX() + movimiento;
		puntoOrigen.setX(resultadoPuntoOrigen);

		resultadoPuntoDestino = puntoDestino.getX() + movimiento;
		puntoDestino.setX(resultadoPuntoDestino);

	}

	public void moverIzquierda(double movimiento) throws PuntoLineaException {

		double resultadoPuntoOrigen, resultadoPuntoDestino;

		comprobarMovimientoCorrecto(movimiento);

		resultadoPuntoOrigen = puntoOrigen.getX() - movimiento;
		puntoOrigen.setX(resultadoPuntoOrigen);

		resultadoPuntoDestino = puntoDestino.getX() - movimiento;
		puntoDestino.setX(resultadoPuntoDestino);

	}

	public void moverArriba(double movimiento) throws PuntoLineaException {

		double resultadoPuntoOrigen, resultadoPuntoDestino;

		comprobarMovimientoCorrecto(movimiento);

		resultadoPuntoOrigen = puntoOrigen.getY() + movimiento;
		puntoOrigen.setY(resultadoPuntoOrigen);

		resultadoPuntoDestino = puntoDestino.getY() + movimiento;
		puntoDestino.setY(resultadoPuntoDestino);

	}

	public void moverAbajo(double movimiento) throws PuntoLineaException {

		double resultadoPuntoOrigen, resultadoPuntoDestino;

		comprobarMovimientoCorrecto(movimiento);

		resultadoPuntoOrigen = puntoOrigen.getY() - movimiento;
		puntoOrigen.setY(resultadoPuntoOrigen);

		resultadoPuntoDestino = puntoDestino.getY() - movimiento;
		puntoDestino.setY(resultadoPuntoDestino);

	}
}
