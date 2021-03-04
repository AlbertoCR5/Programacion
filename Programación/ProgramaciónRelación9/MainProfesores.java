
import Profesores.Profesor;
import Profesores.ProfesorPrimaria;


public class MainProfesores {

	public static void main(String[] args) {


	}
	
	public static void profesoresDePrimariaConMasde4(Profesor[] profesores, int notaLimite) {
		
		for (int i = 0; i < profesores.length; i++) {
			
			Profesor profesor = profesores[i];
			
			if (profesor instanceof ProfesorPrimaria) {
				
				ProfesorPrimaria profesorPrimaria = (ProfesorPrimaria) profesor;
				
				if (profesorPrimaria.getNotaUltimaEvaluacion() > notaLimite) {
					System.out.println(profesor);
				}
			}
		}
	}
}
