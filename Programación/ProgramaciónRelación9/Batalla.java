import LordOfTheRings.ProblemaAtaque;
import LordOfTheRings.ProblemaAtaqueVariable;
import LordOfTheRings.Temporizador;
import LordOfTheRings.alternativa.AtaqueSimple;
import LordOfTheRings.alternativa.AtaqueVoraz;

/**
 * @version 2.0, 04/05/2021
 * @author y0rg
 *
 * Clase para simular las batallas y ver quien gana la guerra
 * 
 * TODO
 */
public class Batalla {

	public static void main (String[] args) {
		
		Temporizador t = new Temporizador();
		
		ProblemaAtaque pa = new ProblemaAtaque();
		ProblemaAtaqueVariable paV = new ProblemaAtaqueVariable();
		
		AtaqueSimple ataqueSimple = new AtaqueSimple(pa);
		t.cronometra(ataqueSimple);
		System.out.println("TiempoMInimo " + t.getTiempoMinimo());
		System.out.println(ataqueSimple.toString());
		
		AtaqueSimple ataqueSimpleVariable = new AtaqueSimple(paV);
		t.cronometra(ataqueSimpleVariable);
		System.out.println("TiempoMInimo " + t.getTiempoMinimo());
		System.out.println(ataqueSimpleVariable.toString());
		
		AtaqueVoraz ataqueVoraz = new AtaqueVoraz(pa);
		t.cronometra(ataqueVoraz);
		System.out.println("TiempoMInimo " + t.getTiempoMinimo());
		System.out.println(ataqueVoraz.toString());
		
		AtaqueVoraz ataqueVorazVariable = new AtaqueVoraz(paV);
		t.cronometra(ataqueVorazVariable);
		System.out.println("TiempoMInimo " + t.getTiempoMinimo());
		System.out.println(ataqueVorazVariable.toString());
		
	}

}
