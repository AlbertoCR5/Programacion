package Ejercicio3;

public class Producto {

	//Atributos
	private int codigo;
	private double precioSinIva;
	private String descripcion;
	private Categoria categoria;
	
	private static int generaCodigo = 0;

	public Producto(String descripcion, double precio,  Categoria categoria) throws VentasException {
		
		setPrecioSinIva(precio);
		setDescripcion(descripcion);
		this.categoria = categoria;
		
		this.codigo = generaCodigo +1;
		generaCodigo++;
		
	}

	// set y get
	
	public int getCodigo() {
		
		return codigo;
	}

	public double getPrecioSinIva() {
		
		return precioSinIva;
	}
	
	public void setPrecioSinIva(double precioSinIva) throws VentasException {
		
		if (precioSinIva <= 0) {
			throw new VentasException ("Debe introducir un número mayor que 0");		
		}
		
		this.precioSinIva = precioSinIva;
		
	}

	public String getDescripcion() {
		
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		
		this.categoria = categoria;
	}

	//Metodo calculador precio con iva
	
	public double precioConIva() {
		
		double resultado;
	
		resultado = precioSinIva + (precioSinIva * categoria.getIva()/100);
		
		return resultado;
		
	}
	
	

	public String toString() {
		
		return "Producto codigo: " + codigo + " , Descripcion: " + descripcion + " , PrecioSinIva:" + precioSinIva + " precio con iva: " +precioConIva() + " euros";
	}
	
	public boolean equals (Producto otro) {
		
		boolean iguales = false;
		
		
		if (this.codigo == otro.codigo) {
			iguales = true;
		}
		
		return iguales;
		
	}

}
