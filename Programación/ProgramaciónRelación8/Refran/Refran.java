package Refran;

public class Refran {

	//Constantes 
	public final int POPULARIDAD_MINIMA = 0;
	public final int POPULARIDAD_MAXIMA = 100;
	
	//Atributos
	private String texto;
	private int popularidad;
	
	//Constructor
	public Refran(String texto, int popularidad) throws RefranException {

		setTexto(texto);
		setPopularidad(popularidad);
	}

	//Getters y setters
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
		
		if (popularidad < POPULARIDAD_MINIMA || popularidad > POPULARIDAD_MAXIMA) {
			throw new RefranException("Error, popularidad fuera de rango (0-100)" + popularidad);
		}
		
		this.popularidad = popularidad;
	}
	
	public boolean equals(Refran otroRefran) {
		
		return this.getTexto().equals(otroRefran.getTexto());
	}

	@Override
	public String toString() {
		return "El Refran: " + texto + ", obtuvo una puntuacion de " + popularidad;
	}

}
