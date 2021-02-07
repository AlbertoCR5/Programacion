package Ejercicio4Repaso;

public class Jarra {

	// Constante
	private static final int MINIMO_JARRA = 1;

	// Atributos
	public int capacidadJarra;
	public int cantidadJarra;
	public static int totalAguaConsumida;

	public Jarra(int capcidadJarra) throws JarraException {

		if (capacidadJarra < MINIMO_JARRA) {
			throw new JarraException("Error, la capacidad minima de la jarra es 1. " + capacidadJarra);
		}

		this.capacidadJarra = capcidadJarra;
	}

	public int getCapacidadJarra() {
		return capacidadJarra;
	}

	public int getCantidadJarra() {
		return cantidadJarra;
	}

	public static int getTotalAguaConsumida() {
		return totalAguaConsumida;
	}

	public String toString() {
		return "La capacidad de la jarra es de " + capacidadJarra + "litros, y ahora contiene " + cantidadJarra
				+ "litros, y se ha consumido " + totalAguaConsumida + " litros";
	}

	public void llenarJarra() throws JarraException {
		
		int aguaServida;
		
		if (cantidadJarra == capacidadJarra) {
			throw new JarraException("Error, no se puede llenar la jarra porque ya esta llena"); 
		}
		
		aguaServida = capacidadJarra - cantidadJarra;
		totalAguaConsumida = capacidadJarra - cantidadJarra + aguaServida;
		cantidadJarra = capacidadJarra;
		
	}
	
	public void vaciarJarra() {

		cantidadJarra = 0;
	}

	public void volcarJarra(Jarra traspaso) throws JarraException {

		int cantidadAguaTraspasada;

		if (traspaso.cantidadJarra == traspaso.capacidadJarra) {
			throw new JarraException("Error, no se puede volcar la jarra porque ya esta llena");
		}
		if (this.cantidadJarra == 0) {
			throw new JarraException("Error, no se puede volcar la jara porque esta vacia");
		}

		cantidadAguaTraspasada = traspaso.capacidadJarra - traspaso.cantidadJarra;

		if (this.cantidadJarra <= cantidadAguaTraspasada) {
			traspaso.cantidadJarra = traspaso.cantidadJarra + this.cantidadJarra;
			this.cantidadJarra = 0;
		} else {
			this.cantidadJarra = this.cantidadJarra - cantidadAguaTraspasada;
			traspaso.cantidadJarra = traspaso.capacidadJarra;
		}

	}
}
