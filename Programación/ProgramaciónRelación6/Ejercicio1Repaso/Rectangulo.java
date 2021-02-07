package Ejercicio1Repaso;

public class Rectangulo {

	private static final int LONGITUD_MINIMA = 0;
	private static final int LONGITUD_DEFECTO = 1;
	private static final int ANCHO_MINIMO = 0;
	private static final int LONGITUD_MAXIMA = 20;
	private static final int ANCHO_POR_DEFECTO = 1;
	private static final int ANCHO_MAXIMO = 20;
	private double longitud;
	private double ancho;

	// CONSTRUCTORES
	public Rectangulo() {

		longitud = LONGITUD_DEFECTO;
		ancho = ANCHO_POR_DEFECTO;
	}

	public Rectangulo(double longitud, double ancho) throws RectanguloException {

		setLongitud(longitud);
		setAncho(ancho);

	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) throws RectanguloException {

		if (longitud <= LONGITUD_MINIMA || longitud >= LONGITUD_MAXIMA) {
			throw new RectanguloException("Error, longitud introducida fuera de rango. " + longitud);
		}

		this.longitud = longitud;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) throws RectanguloException {

		if (ancho <= ANCHO_MINIMO || ancho >= ANCHO_MAXIMO) {
			throw new RectanguloException("Error, ancho introducido fuera de rango. " + ancho);
		}
		this.ancho = ancho;
	}

	public double calcularArea() {

		double area;

		area = longitud * ancho;

		return area;

	}

	public double calcularPerimetro() {

		double perimetro;

		perimetro = longitud + longitud + ancho + ancho;

		return perimetro;
	}

	@Override
	public String toString() {
		return "El area del réctangulo con " + longitud + " cm de longitud y " + ancho + " cm de ancho es de "
				+ calcularArea() + " cm. El perimetro del réctangulo con " + longitud + " cm de longitud y " + ancho
				+ " cm de ancho es de " + calcularPerimetro() + " cm.";
	}

}
