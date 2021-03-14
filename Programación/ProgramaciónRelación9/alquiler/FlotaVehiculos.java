package alquiler;

public class FlotaVehiculos {
	
	private Vehiculo vehiculos[];//

	/**
	 *  Variable que guarda donde se insertará el siguiente vehiculo
	 *  Empieza con 0 y si vale vehiculos.length el almacen esta lleno
	 */
	private int numeroRealDeVehiculos;

	public FlotaVehiculos(int capacidadAlmacen) throws AlquilerException {
		if (capacidadAlmacen <= 0)
			throw new AlquilerException("Numero de vehiculos no puede ser negativo o cero");
		vehiculos = new Vehiculo[capacidadAlmacen];
		numeroRealDeVehiculos = 0;
	}

	public void introducirVehiculo(Vehiculo vehiculo) throws AlquilerException {
		
		Vehiculo vehiculoEncontrado;
		
		vehiculoEncontrado = buscarMatricula(vehiculo.getMatricula());
		if (vehiculoEncontrado != null) { // Se encontro un coche con esa matricula
			throw new AlquilerException("Ya existe un coche con esa matricula" + vehiculo.getMatricula());
		}
		if (numeroRealDeVehiculos == vehiculos.length) {
			throw new AlquilerException("No se pueden introducir mas vehiculos");
		}
			
		vehiculos[numeroRealDeVehiculos] = vehiculo;
		numeroRealDeVehiculos++;
		
	}

	private Vehiculo buscarMatricula(String matricula) {
		
		Vehiculo vehiculo = null;
		boolean encontrado = false;
		
		for (int i = 0; i < numeroRealDeVehiculos && !encontrado; i++) {
			
			if (vehiculos[i].getMatricula().equals(matricula)) {
				encontrado = true;
				vehiculo = vehiculos[i];
					
			}
			i++;
		}
		
		return vehiculo;
		
	}

	public double precioAlquiler(String matricula, int dias) throws AlquilerException {
		
		Vehiculo vehiculo;
		double precioAlquiler = 0;
		
		vehiculo = buscarMatricula(matricula);
		
		if (vehiculo == null) {
			throw new AlquilerException("Este vehiculo no existe");
		}
		
		precioAlquiler = vehiculo.calcularPrecioAlquiler(dias);
		
		return precioAlquiler;
	
	}
	
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		
		for (int i = 0; i < numeroRealDeVehiculos; i++) {
			
			sb.append(vehiculos[i].toString());
			sb.append("\n");
			
		}
		
		
		return sb.toString();
		
		
	}
}
