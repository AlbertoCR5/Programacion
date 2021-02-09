package PuntoLinea;

public class Punto {

	private double x, y;
	
	public Punto(double x, double y) {

		this.x = x; //this sirve para aclarar que private int x = public Punto x
		this.y = y;	// x seria xNuevo, y yNuevo
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}


	public String toString() {
		
		return "Punto [x = " + x + ", y = " + y + "]";
	}
	
	public boolean equals (Punto otro) {
		
		boolean iguales = false;
		
		if (this.x == otro.x && this.y == otro.y) {
			iguales = true;			
		}
		
		return iguales;
		
	}
	
}
