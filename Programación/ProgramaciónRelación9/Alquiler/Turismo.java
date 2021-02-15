package Alquiler;

public class Turismo extends Vehiculo {
	
	private TipoCombustion combustion;
//	public static final double GASOLINA = 3.5;
//	public static final double DIESEL = 2;

	public Turismo(String matricula, TipoGama gama, double precio, TipoCombustion combustion) throws AlquilerException {
		
		super(matricula, gama, precio);
		this.combustion = combustion;

	}

	public TipoCombustion getCombustion() {
		return combustion;
	}

	public void setCombustion(TipoCombustion combustion) {
		this.combustion = combustion;
	}

	@Override
	public double calcularPrecioAlquiler(int dias) {
		
		double precio = 0;
		
		switch (combustion) {
		
		case GASOLINA:
			precio = 3.5;
			precio = precio * dias;
			super.setPrecio(precio);
			break;
			
		case DIESEL:
			precio = 2;
			precio = precio * dias;
			super.setPrecio(precio);
			break;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + "con motor propulsado por " + combustion + ".";
	}


	
}
