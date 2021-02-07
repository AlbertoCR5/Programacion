package Ejercicio4;

public class Jarra {

	public int capacidadJarra;
	public int cantidadJarra;
	public static int totalAguaServida;
	
	public Jarra (int capacidadJarra) throws JarraException {
		if (capacidadJarra < 1) {
			throw new JarraException("Error, no puede haber capacidades menores a 1" + capacidadJarra);
		}
			this.capacidadJarra = capacidadJarra;
	}

	public int getCapacidadJarra() {

		return capacidadJarra;
		
	}
	
	public int getCantidadJarra() {
		
		return cantidadJarra;
		
	}

	public static int getTotalAguaBebida() {
		
		return totalAguaServida;
		
	}
	
	public String toString() {
		
		String info = "La jarra contiene " + capacidadJarra + " litros de capacidad y le quedan " + cantidadJarra + " litros, y se han servido " + totalAguaServida + " litros.";
		
		return info;
	}
	
	public void llenarJarra() throws JarraException {
		
		int aguaServida;
		
		if (cantidadJarra == capacidadJarra) {
			throw new JarraException("Error, no se puede llenar la jarra porque ya esta llena");
		}
		aguaServida = capacidadJarra - cantidadJarra;
		totalAguaServida = capacidadJarra - cantidadJarra + aguaServida;
		cantidadJarra = capacidadJarra;
	}
	
	public void vaciarJarra() {
		
		cantidadJarra = 0;
	}
	
	public void volcarJarra(Jarra vuelco) throws JarraException {
		int cantidadAguaVolcada;
		
		if (vuelco.cantidadJarra == vuelco.capacidadJarra) {
			throw new JarraException("Error, no se puede volcar la jarra porque ya se esta llena");
		}
		if (this.cantidadJarra == 0) {
			throw new JarraException("Error, no se puede volcar la jarra porque esta vacía");
		}
		
		cantidadAguaVolcada = vuelco.cantidadJarra - vuelco.capacidadJarra;
		
		if (this.cantidadJarra <= cantidadAguaVolcada) { 
			vuelco.cantidadJarra = vuelco.cantidadJarra + this.cantidadJarra;
			this.cantidadJarra = 0;
		}
		else {
			this.cantidadJarra = this.cantidadJarra - cantidadAguaVolcada;
			vuelco.cantidadJarra = vuelco.capacidadJarra;
		}
	}
	
}
