package Ejercicio1;

public class Refran implements Comparable<Refran> {

	private final int MINIMO_POPULARIDAD = 0;
	private final int MAXIMO_POPULARIDAD = 100;
	private String texto;
	private int popularidad;

	public Refran(String texto, int popularidad) throws RefranException {

		setTexto(texto);
		setPopularidad(popularidad);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto.toUpperCase();
	}

	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) throws RefranException {

		if (popularidad < MINIMO_POPULARIDAD || popularidad > MAXIMO_POPULARIDAD) {
			throw new RefranException("Error, la popularidad indicada esta fuera de rango (0-100)" + popularidad);
		}
		this.popularidad = popularidad;
	}

	public String toString() {
		return "Refran [texto=" + texto + ", popularidad=" + popularidad + "]";
	}

	public int compareTo(Refran otro) {

		return Integer.compare(otro.popularidad, this.popularidad);
	}

	public boolean equlas(Refran otroRefran) {

		return this.getTexto().equals(otroRefran.getTexto());

	}

}