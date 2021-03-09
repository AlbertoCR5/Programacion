package JuegoIsla;

public class Isla {

	public static final int PERSONAJES_MINIMOS = 2;
	public static final int PERSONAJES_MAXIMOS = 10;
	
	private String nombre;
	private int capacidad;
	public static int cantidadPersonajes;
	
	public Isla(String nombre) throws JuegoException {

		this.nombre = nombre;
		setCapacidad(capacidad);
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCapacidad() {
		return capacidad;
	}


	private void setCapacidad(int capacidad) {
		
		if (capacidad < 2 || capacidad > 10) {
			
		}
		
	}
	
	
	
	
}
