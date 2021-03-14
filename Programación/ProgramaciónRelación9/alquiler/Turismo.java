package alquiler;

public class Turismo extends Vehiculo {
	
	private TipoCombustion combustion;
	double precioAlquiler;
	
	public static final double PRECIO_GASOLINA = 3.5;
	public static final double PRECIO_DIESEL = 2;

	public Turismo(String matricula, TipoGama gama, TipoCombustion combustion) throws AlquilerException {
		
		super(matricula, gama);
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
		precioAlquiler = precioAlquiler + combustion.getIncrementoCombustion() * dias;
		
		precioAlquiler = precioAlquiler + super.calcularAlquilerBase(dias);
		
		return precioAlquiler;
	
	}

	@Override
	public String toString() {
		return "Turismo " + super.toString() + "con motor propulsado por " + combustion + " tiene un precio de alquiler de " + precioAlquiler + "€ por los " + dias + " dias";
	}


	
}
