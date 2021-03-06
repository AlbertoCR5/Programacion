package alquiler;

public class Furgoneta extends Vehiculo {

	private int pesoMaximoAutorizado;
	private double precioAlquiler;
	
	public static final int MINIMO = 500;
	public static final int BAJO = 1000;
	public static final int MEDIO = 1400;
	public static final int MAXIMO = 1800;
	public static final double PRECIO_KILO = 0.05;
	
	public Furgoneta(String matricula, TipoGama gama, int PesoMaximoAutorizado) throws AlquilerException {
		super(matricula, gama);
		this.pesoMaximoAutorizado = PesoMaximoAutorizado;

	}

	public int getPesoMaximoAutorizado() {
		return pesoMaximoAutorizado;
	}

	public void setPma(int pesoMaximoAutorizado) throws AlquilerException {
		
		if (pesoMaximoAutorizado < MINIMO) {
			throw new AlquilerException("Alquile un turismo");
		}
		else {
			if (pesoMaximoAutorizado > MAXIMO) {
				throw new AlquilerException("No puede exceder el peso maximo autorizado: " + MAXIMO);
			}
		}
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
	}

	@Override
	public double calcularPrecioAlquiler(int dias) throws AlquilerException {
		
		double precioAlquiler = 0;
		
		if (dias < 1) {
			throw new AlquilerException("Error, alquiler minimo de un dia");
		}
		if (pesoMaximoAutorizado > BAJO) {
			precioAlquiler = precioAlquiler + BAJO * PRECIO_KILO * dias;
		}
		else {
			if (pesoMaximoAutorizado > MEDIO) {
				precioAlquiler = precioAlquiler + MEDIO * PRECIO_KILO * dias;
			}
			else {
				precioAlquiler = precioAlquiler + MAXIMO * PRECIO_KILO * dias;
			}
				
		}
				
		precioAlquiler = precioAlquiler + super.calcularAlquilerBase(dias);
		
		return precioAlquiler;
	}

	@Override
	public String toString() {
		return "Furgoneta " + super.toString() + "con  " + pesoMaximoAutorizado + "Kgs de peso maximo autorizado, tiene un precio de alquiler de " + precioAlquiler + " por los " + dias + " dias";
	}

	
}
