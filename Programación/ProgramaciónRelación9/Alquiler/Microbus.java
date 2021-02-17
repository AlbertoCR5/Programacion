package Alquiler;

public class Microbus extends Vehiculo {

	private int plazas;
	double precioAlquiler;
	
	public static final int PLAZAS_MINIMAS = 9;
	public static final int PLAZAS_MAXIMAS = 12;
	public static final int PRECIO_PLAZA = 5;

	public Microbus(String matricula, TipoGama gama, int plazas, int dias) throws AlquilerException {
		super(matricula, gama, dias);
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) throws AlquilerException {

		if (plazas < PLAZAS_MINIMAS || plazas > PLAZAS_MAXIMAS) {
			throw new AlquilerException("El numero de plazas del microbus debe de estar entre " + PLAZAS_MINIMAS + " y "
					+ PLAZAS_MAXIMAS + ". " + plazas);
		}
		this.plazas = plazas;
	}

	@Override
	public double calcularPrecioAlquiler(int dias) throws AlquilerException {

		double precioAlquiler = 0;

		if (dias < 1) {
			throw new AlquilerException("Error, alquiler minimo de un dia");
		}
		precioAlquiler = PRECIO_PLAZA * plazas * dias;

		return precioAlquiler + super.calcularAlquilerBase(dias);
	}

	@Override
	public String toString() {
		return "Microbus " + super.toString() + "con  " + plazas + " plazas, tiene un precio de alquiler de " + (precioAlquiler + super.calcularAlquilerBase(dias)) + " por los " + dias + " dias";
	}

}
