package Ejercicio3Repaso;

import java.util.Scanner;

public class MainVentas {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Producto producto1;
		Categoria categoria1;
		
		try {
			categoria1 = new Categoria("Alimentacion", 16);
			producto1 = crearProducto("Producto 1", categoria1);
			System.out.println("El precio con IVA del producto 1 es " + producto1.precioConIva());
		} catch (VentasException e) {
			System.out.println(e.getMessage());
		}
	}

	private static Producto crearProducto(String string, Categoria categoria) throws VentasException {
		
		Producto crearProducto = null;
		String descripcion;
		boolean error;
		double precio;
		
		do {
			error = false;
			try {
				
				System.out.println("Descricion: ");
				descripcion = teclado.nextLine().toString();
				
				System.out.println("Precio: ");
				precio = Double.parseDouble(teclado.nextLine());
				
				crearProducto = new Producto(descripcion, precio, categoria);
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				error = true;
			}
		} while (error);
		
		return crearProducto;
	}

}
