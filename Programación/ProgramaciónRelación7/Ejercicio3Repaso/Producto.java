package Ejercicio3Repaso;

public class Producto {

	private static final int PRECIO_MINIMO = 0;
	//Atributos
	private int codigo;
	private double precioSinIva;
	private String descripcion;
	private Categoria categoria;
	
	private static int generarCodigo = 0;

	public Producto(String descripcion, double precio, Categoria categoria) throws VentasException{
	
		setPrecioSinIva(precio);
		setDescripcion(descripcion);
		this.categoria = categoria;
		
		this.codigo = generarCodigo +1;
		generarCodigo++;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(double precioSinIva) throws VentasException {
		
		if (precioSinIva <= PRECIO_MINIMO) {
			throw new VentasException("Debe introducir un precio mayor que 0 " + precioSinIva);
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
	
	//Metodo que calcula el precio con iva dependiendo de la categoria del producto
	public double precioConIva() {
		
		double precioConIva;
		
		precioConIva = precioSinIva + (precioSinIva * categoria.getIva()/100);
		
		return precioConIva;
	}


	public String toString() {
		return "Producto " + descripcion + ", perteneciente a la categoria " + categoria + ", con codigo  " + codigo + ",  tiene un precio Sin IVA  de " + precioSinIva + "€, y con IVA de " + precioConIva();
	}
	
	public boolean equals (Producto otro) {
		
		boolean repetido = false;
		
		if (this.codigo == otro.codigo) {
			repetido = true;
		}
		
		return repetido;
	}
	
	
}
