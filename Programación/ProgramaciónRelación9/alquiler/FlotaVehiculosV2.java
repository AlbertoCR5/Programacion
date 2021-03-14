package alquiler;

public class FlotaVehiculosV2 {

	private Vehiculo vehiculos[];

	/**
	 * Variable que guarda donde se insertará el siguiente vehiculo Empieza con 0 y
	 * si vale vehiculos.length el almacen esta lleno
	 */

	public FlotaVehiculosV2(int capacidadAlmacen) throws AlquilerException {
		if (capacidadAlmacen <= 0)
			throw new AlquilerException("Numero de vehiculos no puede ser negativo o cero");
		vehiculos = new Vehiculo[capacidadAlmacen];

	}

	public void bajaVehiculo(String matricula) throws AlquilerException {

		int posicion;

		posicion = buscarMatricula(matricula);

		if (posicion == -1) {
			throw new AlquilerException("No existe el coche con la matricula " + matricula);
		}

		vehiculos[posicion] = null;
	}

	public void introducirVehiculo(Vehiculo vehiculo) throws AlquilerException {

		int posicion;
		int posicionInsercion;

		posicion = buscarMatricula(vehiculo.getMatricula());
		if (posicion != -1) { // Se encontro un coche con esa matricula
			throw new AlquilerException("Ya existe un coche con esa matricula " + vehiculo.getMatricula());
		}

		posicionInsercion = buscarPosicionLibre();

		vehiculos[posicionInsercion] = vehiculo;

	}

	private int buscarPosicionLibre() throws AlquilerException {

		int posicion = -1;
		boolean encontrado = false;
		
		for (int i = 0; i < vehiculos.length && !encontrado; i++) {
			Vehiculo vehiculo = vehiculos[i];

			if (vehiculo == null) {
				posicion = i;
				encontrado = true;
			}
		}

		if (!encontrado) {
			throw new AlquilerException("No se pueden incluir mas vehiculos");
		}
		return posicion;
	}

	private int buscarMatricula(String matricula) {

		boolean existe = false;
		int posicion = -1;
		int i = 0;
		
		while (i < vehiculos.length && existe == false) {

			if (vehiculos[i] != null && matricula.equalsIgnoreCase(vehiculos[i].getMatricula())) {
				existe = true;
				posicion = i;

			}
			i++;
		}

		return posicion;

	}

	public double precioAlquiler(String matricula, int dias) throws AlquilerException {

		int posicion;

		posicion = buscarMatricula(matricula);

		if (posicion == -1) {
			throw new AlquilerException("Este vehiculo no existe");
		}

		return vehiculos[posicion].calcularPrecioAlquiler(dias);

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < vehiculos.length; i++) {

			if (vehiculos[i] != null) {
				sb.append(vehiculos[i].toString());
				sb.append("\n");
			}

		}

		return sb.toString();

	}
}
