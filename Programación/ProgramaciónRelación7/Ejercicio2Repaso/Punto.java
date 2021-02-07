package Ejercicio2Repaso;

public class Punto {
	
	private double x;
	private double y;
	
	//constructor
	public Punto(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	//getters and setters
	public double getPuntoX() {
		return x;
	}

	public void setPuntoX(double x){
		
		this.x = x;
	}

	public double getPuntoY() {
		return y;
	}

	public void setPuntoY(double y) {
		this.y = y;
	}


	public String toString() {
		return "Punto [" + x + "," + y + "]";
	}

	public boolean equals (Punto otro) {
		boolean iguales = false;
		
		if (this.x == otro.x && this.y == otro.y) {
			iguales = true;
		}
		
		return iguales;
 	}
}
