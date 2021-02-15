package Alquiler;

public class Microbus extends Vehiculo {
	
	private int plazas;
	public static final int PLAZAS_MINIMAS = 9;
	public static final int PLAZAS_MAXIMAS = 12;
	public static final int PRECIO_PLAZA = 5;

	public Microbus(String matricula, TipoGama gama, double precio, int plazas) throws AlquilerException {
		super(matricula, gama, precio);
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) throws AlquilerException {
		
		if (plazas < PLAZAS_MINIMAS || plazas > PLAZAS_MAXIMAS) {
			throw new AlquilerException("El numero de plazas del microbus debe de estar entre " + PLAZAS_MINIMAS + " y " + PLAZAS_MAXIMAS + ". " + plazas);
		}
		this.plazas = plazas;
	}
	
	@Override
	public double calcularPrecioAlquiler(int dias) {
		
		double precio = 0;
		
		precio = PRECIO_PLAZA * plazas;
		super.setPrecio(precio);
		
		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + "Microbus [plazas=" + plazas + "]";
	}



	
}
