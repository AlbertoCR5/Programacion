package LordOfTheRings;

/**
 * @version 2.0, 04/05/2021
 * @author y0rg
 *
 * Clase con los datos del problema a resolver
 * 
 * TODO
 */
public class ProblemaAtaque {

	protected int[] orcos = {10, 15, 5, 50, 70};
	protected int[] aliados = {10, 10, 3, 100, 60};
	
	
	public ProblemaAtaque() {
		
	}
	public int[] getOrcos() {

		return orcos;
	}

	public int[] getAliados() {

		return aliados;
	}
	
	public void setOrcos(int[] orcos) {
		this.orcos = orcos;
	}

	public void setAliados(int[] aliados) {
		this.aliados = aliados;
	}



	
}
