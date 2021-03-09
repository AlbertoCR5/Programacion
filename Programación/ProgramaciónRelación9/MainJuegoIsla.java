import JuegoIsla.JuegoException;
import JuegoIsla.Personaje;

public class MainJuegoIsla {

	public static void main(String[] args) {
		

		
		try {
			Personaje personaje = new Personaje("Canela", "Fidji", 12);
			System.out.println(personaje);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
			
		}
		try {			
			Personaje personaje2 = new Personaje("Aldeana", "Perejil", 12);
			System.out.println(personaje2);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Personaje personaje3 = new Personaje("Mickey", "Fidji", 12);
			Personaje personaje4 = new Personaje("Minnie", "Fidji", 12);
			System.out.println(personaje3);
			System.out.println(personaje4);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}

		
	}

}
