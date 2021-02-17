package Alquiler;

public abstract class Vehiculo {

	private String matricula;
	private TipoGama gama;
	protected int dias;
	
	public static final double PRECIO_BAJA = 30;
	public static final double PRECIO_MEDIA = 40;
	public static final double PRECIO_ALTA = 50;
	
	public abstract double calcularPrecioAlquiler(int dias) throws AlquilerException;
	
	public Vehiculo(String matricula, TipoGama gama, int dias) throws AlquilerException {
		super();
		this.matricula = matricula;
		this.gama = gama;
		this.dias = dias;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoGama getGama() {
		return gama;
	}

	public void setGama(TipoGama gama) {
		this.gama = gama;
	}
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	protected double calcularAlquilerBase(int dias) {
		
		double precio;
		
		precio = dias * gama.getPrecioBaseGama();
		
		return precio;
	}
		

	@Override
	public String toString() {
		return "con matricula " + matricula + ", de gama " + gama + ", " ;
	}
	
	
}

