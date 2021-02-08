package Ejercicio3Bis;

public class Hotel {

	private static final int MINIMO_ESTRELLAS = 1;
	private static final int MAXIMO_ESTRELLAS = 5;
	private String nombre;	
	private Habitacion[] habitaciones;
	private int estrellas;

	
	public Hotel(String nombre, int estrellas, int simples, int dobles, int triples) throws HabitacionHotelException {

		this.nombre = nombre;
		setEstrellas(estrellas);
		
		if (simples < 0 || dobles < 0 || triples < 0) {
			throw new HabitacionHotelException ("Error, cantidad de habitaciones ha de ser positivo");
		}		
		
		habitaciones = new Habitacion[simples + dobles + triples];
		crearHabitaciones(0, simples, Habitacion.SIMPLE);
		crearHabitaciones(simples, dobles, Habitacion.DOBLE);
		crearHabitaciones(simples, dobles + triples, Habitacion.TRIPLE);
		
	}

	private void crearHabitaciones(int posicionInicial, int cantidad, String tipo) throws HabitacionHotelException{

		for (int i = posicionInicial; i < posicionInicial; cantidad++) {
			habitaciones[i] = new Habitacion (i +1, tipo);
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
	
	public int checkIn(String tipoHabitacionSolicitada) throws HabitacionHotelException {
		
		boolean checkInOk = false;
		int habitacionAsignada= 0;
		
		if (!Habitacion.getTipoHabitacion(tipoHabitacionSolicitada)) {
			throw new HabitacionHotelException("Tipo de habitacion incorrecto " + tipoHabitacionSolicitada);
		}
		
		for (int i = 0; i < habitaciones.length && !checkInOk; i++) {
			if (habitaciones[i].getTipo().equals(tipoHabitacionSolicitada) && !habitaciones[i].isOcupada()){
				habitaciones[i].setOcupada(true); //queda ocupada
				habitacionAsignada = habitaciones[i].getNumero();
				checkInOk = true;
			}
			
		}
		
		if (!checkInOk) {
			throw new HabitacionHotelException("No quedan habitaciones del tipo " + tipoHabitacionSolicitada);
		}
		
		return habitacionAsignada;
		
		
	}
	
	public void checkOut (int habitacion) throws HabitacionHotelException {
		
		int numeroInterno = habitacion -1;
		
		if (numeroInterno < 0 || numeroInterno >= habitaciones.length) {
			throw new HabitacionHotelException("Numero de habitacion incorrecto " + habitacion);
		}
		if (!habitaciones[numeroInterno].isOcupada()) {
			throw new HabitacionHotelException("Error, no se puede realizar checkout de la habitacion " + numeroInterno);
		}
		
		habitaciones[numeroInterno].setOcupada(false); //queda libre
		
	}

}
