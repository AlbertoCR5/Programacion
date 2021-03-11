import JuegoIsla.Isla;
import JuegoIsla.JuegoException;
import JuegoIsla.Personaje;

public class MainJuegoIsla {

	public static void main(String[] args) {
		
		Isla isla = null;
		try {
			isla = new Isla("fidji", 10);
		} catch (JuegoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
;		
		try {
			Personaje personaje = new Personaje("Canela",isla, 12);
			System.out.println(personaje);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
			
		}
		try {			
			Personaje personaje2 = new Personaje("Aldeana", isla, 12);
			System.out.println(personaje2);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Personaje personaje3 = new Personaje("Mickey", isla, 12);
			Personaje personaje4 = new Personaje("Minnie", isla, 12);
			System.out.println(personaje3);
			System.out.println(personaje4);
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}

		
	}

}
