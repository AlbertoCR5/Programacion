package Ejercicio3Bis;

public class Hotel {

	private static final int MINIMO_ESTRELLAS = 1;
	private static final int MAXIMO_ESTRELLAS = 5;
	private String nombre;	
	private Habitacion[] habitaciones;
	private int estrellas;
//	private int habitacionesSimples;
//	private int habitacionesDobles;
//	private int habitacionesTriples;
//	
	public Hotel(String nombre, int estrellas, Habitacion[] habitaciones, int simples, int dobles, int triples) throws HabitacionHotelException {

		if (simples < 0 || dobles < 0 || triples < 0) {
			throw new HabitacionHotelException ("Error, cantidad de  habitaciones ha de ser positivo");
		}		
		
		this.nombre = nombre;
		setEstrellas(estrellas);
		habitaciones = new Habitacion[simples + dobles + triples];
		crearHabitaciones(0, simples, Habitacion.SIMPLE);
		crearHabitaciones(simples, dobles, Habitacion.DOBLE);
		crearHabitaciones(simples, dobles + triples, Habitacion.TRIPLE);
		
	}

	private void crearHabitaciones(int posicionInicial, int cantidad, String tipo) {

		for (int i = posicionInicial; i < habitaciones.length; cantidad++) {
			
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) throws HabitacionHotelException {
		
		if (estrellas  < MINIMO_ESTRELLAS || estrellas > MAXIMO_ESTRELLAS) {
			throw new HabitacionHotelException ("Error, calidad del hotel fuera de rango(1* 2 ** 3 *** 4 **** 5*****" + estrellas);
		}
			
		this.estrellas = estrellas;
	}
	
	
	

}
