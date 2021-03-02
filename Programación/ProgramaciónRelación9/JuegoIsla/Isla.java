package JuegoIsla;

public class Isla {

	public static final int PERSONAJES_MINIMOS = 2;
	public static final int PERSONAJES_MAXIMOS = 10;
	
	private Personaje personajes[];
	private String nombre;
	private int capacidad;
	public Isla(String nombre) {

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
