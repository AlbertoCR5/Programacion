package Examen18Marzo.ejercicio1;

public class LibroDigital extends Libro {
	
	private static final int VALORACION_MAXIMA = 10;
	public static final int VALORACION_MINIMA = 0;
	private TipoFormato formato;
	private int sumaOpiniones;
	private int totalOpiniones;
	
	public LibroDigital(String titulo, String autor, Editorial editorial, int anno, int precio, TipoFormato formato) throws LibroException {
		super(titulo, autor, editorial, anno, precio);
		int antiguedad = Libro.ANNO_ACTUAL - anno;
		
		if (antiguedad <= 1) {
			throw new LibroException("No se comercializa un libro con antiguedad inferior a un año");
		}
		
		this.formato = formato;
		this.totalOpiniones = 0;
		this.sumaOpiniones = 0;

	}
	
	public LibroDigital(String titulo, String autor, Editorial editorial, int anno, int precio) throws LibroException {
		super(titulo, autor, editorial, anno, precio);
		int antiguedad = Libro.ANNO_ACTUAL - anno;
		
		if (antiguedad <= 1) {
			throw new LibroException("No se comercializa un libro con antiguedad inferior a un año");
		}
		
		this.formato = TipoFormato.EPUB;
		this.totalOpiniones = 0;
		this.sumaOpiniones = 0;

	}

	public TipoFormato getFormato() {
		return formato;
	}

	@Override
	public void setPrecio(int nuevoPrecio) throws LibroException {
		
		if (nuevoPrecio > getEditorial().getMaximoPrecioLibrosDigitales()) {
			throw new LibroException("El precio del libro no puede ser superior al establecido por la editorial");
		}
		
		if (nuevoPrecio > getPrecio()) {
			throw new LibroException("Precio incorrecto");
		}

		super.setPrecio(nuevoPrecio);
	}

	public void valorar(int valoracion) throws LibroException {
		
		if (valoracion < VALORACION_MINIMA || valoracion > VALORACION_MAXIMA) {
			throw new LibroException("valoracion fuera de rango");
		}
		
		sumaOpiniones = sumaOpiniones + valoracion;
		totalOpiniones++;
		
	}

	@Override
	public String toString() {
		
		String info;
		
		if (totalOpiniones == 0) {
			info = super.toString() + " Formato " + formato + " Media opiniones " + sumaOpiniones / totalOpiniones;
		}
		else {
			info = super.toString() + " Formato " + formato + " Sin opiniones ";
		}
		
		return info;
	}
	
	@Override
	public int compareTo(Libro otro) {

		return this.getTitulo().compareTo(otro.getTitulo());
	}

}
