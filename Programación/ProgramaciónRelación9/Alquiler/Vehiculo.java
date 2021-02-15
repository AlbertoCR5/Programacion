package Alquiler;

public abstract class Vehiculo {

	private String matricula;
	private TipoGama gama;
	private double precio;
	
	public static final int BAJA = 30;
	public static final int MEDIA = 40;
	public static final int ALTA = 50;
	
	public abstract double calcularPrecioAlquiler(int dias);
	
	public Vehiculo(String matricula, TipoGama gama, double precio) throws AlquilerException {
		super();
		this.matricula = matricula;
		this.gama = gama;
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

	
	public double getPrecio() {

		return precio;
	}
	
	public void setPrecio(double precio) {
		
		switch (gama) {
		
		case BAJA:
			precio = BAJA;
			this.precio = precio;
			break;
		
		case MEDIA:
			precio = MEDIA;
			this.precio = precio;
			break;
			
		case ALTA:
			precio = ALTA;
			this.precio = precio;
			break;
		}
		
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", gama=" + gama + "]";
	}
	
	
}

