package Ventas;

public class Categoria {

	private static final int IVA_MAXIMO = 25;
	private String nombre;
	private int iva;
	
	public Categoria(String nombre, int iva) throws VentasException {
		
		if (iva < 0 || iva > IVA_MAXIMO) {
			throw new VentasException ("Iva de la categoría incorrecto " + iva);
		}

		this.nombre = nombre;
		this.iva = iva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public String toString() {
		return "Categoria " + nombre + ", iva" + iva + "%";
	}

}
