package Ejercicio3;

public class Habitacion {
	
	private int numero;
	private String tipo;
	private boolean ocupada;
	private static final String INDIVIDUAL = "simple";
	private static final String DOBLE = "doble";
	private static final String TRIPLE = "triple";
	
	public Habitacion(int numero, String tipo, boolean ocupada) {

		this.numero = numero;
		this.tipo = tipo;
		this.ocupada = ocupada;
	}

	public int getNumero() {
		return numero;
	}


	public String getTipo() {
		return tipo;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


}
