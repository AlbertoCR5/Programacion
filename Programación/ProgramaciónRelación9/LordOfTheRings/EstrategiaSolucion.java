package LordOfTheRings;

/**
 * @version 2.0, 04/05/2021
 * @author y0rg
 * 
 * Interfaz que implementarán las estrategias/soluciones para medir el tiempo que se tarda en procesarlas. 
 * _________________________________________________________
 * |	LEEME -> NO HACE FALTA MODIFICAR ESTA INTERFACE		|
 * |________________________________________________________|
 */

public interface EstrategiaSolucion {

	/**
	 * Debe contener lo que haya que hacer antes de ejecutar el algoritmo que queramos temporizar.
	 * Típicamente contiene inicializaciones o reinicializaciones de los datos del problema.
	 */
	public void procesamientoInicial();

	/**
	 * La función cuyo tiempo de ejecución se quiere medir. Típicamente contendrá una llamada al
	 * algoritmo que resuelva el problema planteado, pasándole los valores iniciales que necesite.
	 */
	public void solucion();

	/**
	 * Debe contener lo que haya que hacer después de ejecutar el algoritmo que se quiere temporizar.
	 */
	public void procesamientoFinal();

}
