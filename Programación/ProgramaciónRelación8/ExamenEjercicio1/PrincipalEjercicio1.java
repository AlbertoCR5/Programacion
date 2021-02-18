package ExamenEjercicio1;
import java.util.Scanner;

public class PrincipalEjercicio1 {
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		Categoria categoria=crearCategoria();
		
		try {
			Parking parking1 = new Parking("Orchia", categoria, 100);
		} catch (ParkingException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Parking parking2 = new Parking("Orchian", categoria, 100);
			Parking parking3 = new Parking("Orchia2", categoria, 100);
			
			parking3.cocheEntraEnParking();
			
			double precio = parking3.cobrarYSalirDelParking(10);
			System.out.println("Ha pagado " + precio);
		} catch (ParkingException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	private static Categoria crearCategoria() {
		
		Categoria categoria=null;
		String nombre;
		double precioPorMinuto;
		boolean error = false;
		
		do {

			System.out.println("Introduce el nombre de la categoria");
			nombre=teclado.nextLine();
		
			System.out.println("Introduce el precio por minuto:");
			precioPorMinuto=Double.parseDouble(teclado.nextLine());
		
			try {
				categoria=new Categoria(nombre, precioPorMinuto);
				error = false;
			} catch (ParkingException e) {
				System.out.println(e.getMessage());
				error = true;
			}
		
		} while (error);
		
		return categoria;
	}

}
