import Profesores.EspecialidadesSecundaria;
import Profesores.Profesor;
import Profesores.ProfesorPrimaria;
import Profesores.ProfesorSecundaria;
import Profesores.ProfesoresException;

public class MainProfesores {

	public static void main(String[] args) {

		Profesor profesores = null;

		try {

			if (profesores instanceof ProfesorPrimaria) {
				profesores = new ProfesorPrimaria("53151313R", "Juan", "IES Cantely");

			} else {
				profesores = new ProfesorSecundaria("31313515U", "Manuel", "IES Arenal",
						EspecialidadesSecundaria.INFORMATICA);

			}

		} catch (ProfesoresException e) {
			System.out.println(e.getMessage());
		}
	}

}
