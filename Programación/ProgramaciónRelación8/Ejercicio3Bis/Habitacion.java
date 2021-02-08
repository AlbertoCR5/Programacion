package Ejercicio3Bis;

public class Habitacion {
	
	private int numero;
	private String tipo;
	private boolean ocupada;
	public static final String SIMPLE = "SIMPLE";
	public static final String DOBLE = "DOBLE";
	public static final String TRIPLE = "TRIPLE";
	
	public Habitacion(int numero, String tipo) throws HabitacionHotelException {

		if (!(tipo.equals(SIMPLE) || tipo.equals(DOBLE) || tipo.equals(TRIPLE))) {
			throw new HabitacionHotelException("Error, tipo de habitacion no disponible" + tipo);
		}
		if (numero < 1) {
			throw new HabitacionHotelException ("Error, numero de habitacion no disponible" + numero);
		}
		this.numero = numero;
		this.tipo = tipo;
		this.ocupada = false;
	}

	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public static boolean getTipoHabitacion(String tipo) {
		return tipo.equals(SIMPLE) || tipo.equals(DOBLE) ||  tipo.equals(TRIPLE);
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


}
