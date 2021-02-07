package Ejercicio3;

public class Hotel {

	private static final int MINIMO_ESTRELLAS = 1;
	private static final int MAXIMO_ESTRELLAS = 5;
	private String nombre;
	private int estrellas;
	private Habitacion[] habitaciones;
	private int habitacionesSimples;
	private int habitacionesDobles;
	private int habitacionesTriples;
	
	public Hotel(String nombre, int estrellas, Habitacion[] habitaciones, int habitacionesSimples, int habitacionesDobles, int habitacionesTriples) {
		super();
		this.nombre = nombre;
		this.estrellas = estrellas;
		this.habitaciones = habitaciones;
		this.habitacionesSimples = habitacionesSimples;
		this.habitacionesDobles = habitacionesDobles;
		this.habitacionesTriples = habitacionesTriples;
	}
	
	
	

}
