package JuegoIsla;

public class Isla {

	public static final int PERSONAJES_MINIMOS = 2;
	public static final int PERSONAJES_MAXIMOS = 10;
	
	private String nombre;
	private int capacidad;
	private int cantidadPersonajes;
	
	public Isla(String nombre, int capacidad) throws JuegoException {

		this.nombre = nombre;
		
		if (capacidad < PERSONAJES_MINIMOS) {
			throw new JuegoException("La capacidad no puede ser inferior a PERSONAJES_MINIMOS");
		}
		this.capacidad = capacidad;
		this.cantidadPersonajes = 0;
	}
		
	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getCantidadPersonajes() {
		return cantidadPersonajes;
	}

	public void incrementarNumeroPersonajesEnIsla() throws JuegoException {
		
		if (cantidadPersonajes == this.capacidad) {
			throw new JuegoException("No pueden crearse mas personajes en la isla " + this.nombre);
		}
		
		cantidadPersonajes++;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Isla other = (Isla) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
