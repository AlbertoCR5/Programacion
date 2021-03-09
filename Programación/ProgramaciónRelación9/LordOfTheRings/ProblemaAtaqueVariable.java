package LordOfTheRings;

import java.util.Random;

public class ProblemaAtaqueVariable extends ProblemaAtaque {
	
	public ProblemaAtaqueVariable() {
		
		Random numero = new Random(); //llamar a la API que genera numeros aleatorios
		
		int grupoEjercitos = numero.nextInt(100) + 1; //Genera grupos de 1 a 100
		
		aliados = new int[grupoEjercitos];
		orcos = new int[grupoEjercitos];
		
		for (int i = 0; i < grupoEjercitos; i++) {
			aliados[i] = numero.nextInt(901) + 100;
			orcos[i] = numero.nextInt(901) + 100; // Si indicas el numero del que partes tines que restarlo al definitivo -1
		}
	}

}
