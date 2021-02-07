
package Ejercicio3;

import java.util.Scanner;

public class MainVentas {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Producto producto1;
		Producto producto2;
		Producto producto3;
		
		
		try {
			Categoria categoria1 = new Categoria("Alimentacion", 15);
			Categoria categoria2 = new Categoria("Limpieza", 18);
			producto1 = crearProducto("Producto 1", categoria1);
			producto2 = crearProducto("Producto 2", categoria1);
			producto3 = crearProducto("Producto 3", categoria2);
			System.out.println("El precio con IVA del producto 1 es " + producto1.precioConIva());
			System.out.println("El precio con IVA del producto 2 es " + producto2.precioConIva());
			System.out.println("El precio con IVA del producto 3 es " + producto3.precioConIva());
		} catch (VentasException e) {
			
			System.out.println(e.getMessage());
		}
			
		
	}

	private static Producto crearProducto(String string, Categoria categoria) throws VentasException {
		
		Producto crearProducto = null;
		boolean error;
		double precio;
		String descripcion;
		
		do {
			error = false;
			try {	

				System.out.println("Descripcion: ");
				descripcion = teclado.nextLine().toString();
			
				System.out.println("Precio: ");
				precio = Double.parseDouble(teclado.nextLine());
			
				crearProducto = new Producto(descripcion, precio, categoria);
				
			}  catch (NumberFormatException e) {
				
				System.out.println(e.getMessage());
				error = true;
			}
			
		} while (error);
		
		return crearProducto;
	}
	

}
