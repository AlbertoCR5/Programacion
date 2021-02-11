import Empleado.Directivo;
import Empleado.Informatico;
import Empleado.Operario;

public class MainEmpleado {

	public static void main(String[] args) {

		try {
			Operario operario1 = new Operario("48923213R", "Manolo", 1000, 3);
			Informatico informatico1 = new Informatico("51541511T", "Ruben", 2100, "SISTEMAS");
			Directivo directivo1 = new Directivo("12345678K", "Carlos", 3200, "");
			
			System.out.println(operario1);
			System.out.println(informatico1);
			System.out.println(directivo1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
