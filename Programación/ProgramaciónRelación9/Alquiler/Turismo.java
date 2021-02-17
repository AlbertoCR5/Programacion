package Alquiler;

public class Turismo extends Vehiculo {
	
	private TipoCombustion combustion;
	double precioAlquiler;
	
	public static final double PRECIO_GASOLINA = 3.5;
	public static final double PRECIO_DIESEL = 2;

	public Turismo(String matricula, TipoGama gama, TipoCombustion combustion, int dias) throws AlquilerException {
		
		super(matricula, gama, dias);
		this.combustion = combustion;
	}

	public TipoCombustion getCombustion() {
		return combustion;
	}

	public void setCombustion(TipoCombustion combustion) {
		this.combustion = combustion;
	}

	@Override
	public double calcularPrecioAlquiler(int dias) throws AlquilerException {
		
		double precioAlquiler = 0;
		
		if (dias < 1) {
			throw new AlquilerException("Error, alquiler minimo de un dia");
		}
		precioAlquiler = combustion.getIncrementoCombustion() + dias;
		
		return precioAlquiler + super.calcularAlquilerBase(dias);
	
	}

	@Override
	public String toString() {
		return "Turismo " + super.toString() + "con motor propulsado por " + combustion + " tiene un precio de alquiler de " + (precioAlquiler + super.calcularAlquilerBase(dias)) + "€ por los " + dias + " dias";
	}


	
}
