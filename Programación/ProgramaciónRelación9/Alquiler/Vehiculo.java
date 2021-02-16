package Alquiler;

public abstract class Vehiculo {

	private String matricula;
	private TipoGama gama;
	private double precio;
	
	public static final double PRECIO_BAJA = 30;
	public static final double PRECIO_MEDIA = 40;
	public static final double PRECIO_ALTA = 50;
	
	public abstract double calcularPrecioAlquiler(int dias);
	
	public Vehiculo(String matricula, TipoGama gama) throws AlquilerException {
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
			precio = PRECIO_BAJA;
			this.precio = precio;
			break;
		
		case MEDIA:
			precio = PRECIO_MEDIA;
			this.precio = precio;
			break;
			
		case ALTA:
			precio = PRECIO_ALTA;
			this.precio = precio;
			break;
		}
		
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", gama=" + gama + "]";
	}
	
	
}

