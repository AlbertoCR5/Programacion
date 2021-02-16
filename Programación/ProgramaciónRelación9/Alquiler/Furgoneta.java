package Alquiler;

public class Furgoneta extends Vehiculo {

	private int pesoMaximoAutorizado;
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
	public double calcularPrecioAlquiler(int dias) {
		
		double precio = 0;
		
		if (pesoMaximoAutorizado > BAJO) {
			precio = BAJO * PRECIO_KILO;
			precio = precio * dias;
			super.setPrecio(precio);
		}
		else {
			if (pesoMaximoAutorizado > MEDIO) {
				precio = MEDIO * PRECIO_KILO;
				super.setPrecio(precio);
			}
			else {
				precio = MAXIMO * PRECIO_KILO;
				super.setPrecio(precio);
			}
				
		}
			
		
		return precio;
	}

}
