package Examen18Marzo.ejercicio1;

public enum Editorial {
ALFAGUARA(20), ALIANZA(30), ANAGRAMA(40);
	
	private double maximoPrecioLibrosDigitales;
	
	private Editorial(double maximoPrecioLibrosDigitales) {
		this.maximoPrecioLibrosDigitales = maximoPrecioLibrosDigitales;
	}

	public double getMaximoPrecioLibrosDigitales() {
		return maximoPrecioLibrosDigitales;
	}
	
}
