/*
 * Temporizador.java
 */

package LordOfTheRings;

/**
 * @version 2.0, 04/05/2021
 * @author y0rg
 * 
 * Contiene toda la lógica necesaria para medir tiempos de ejecución de algoritmos. Para medir un
 * algoritmo, la clase que lo contenga tiene que implementar la interfaz <b>EstrategiaSolucion</b>.
 * Sus métodos se utilizan en esta clase. Para medir el tiempo de ejecución, se crea un objeto
 * Temporizador y se invoca al método cronometra, pasándole como argumento el objeto que implementa
 * la interfaz Temporizable. El método cronometra mide el tiempo de ejecución de su solucion.
 * Posteriormente se puede tomar su tiempo medio o su tiempo mínimo. Si se imprime un objeto
 * temporizador se obtiene información sobre el tiempo mínimo de ejecución. Los tiempos son medidos
 * en nanosegundos, usando la función System.nanoTime()
 * _________________________________________________________
 * |	LEEME -> NO HACE FALTA MODIFICAR ESTA CLASE			|
 * |________________________________________________________|
 */
public class Temporizador {

	/**
	 * El número de veces que queremos calcular el tiempo de ejecución del algoritmo a medir. El tiempo
	 * mínimo o el tiempo medio se toma de entre las numPruebas ejecuciones de éste.
	 */
	private int numPruebas;

	/**
	 * Almacena el tiempo de ejecución, en nanosegundos, de cada una de las numPruebas ejecuciones del
	 * algoritmo a medir. Sobre él se calcula la media y el mínimo.
	 */
	private long[] tiempos;

	/**
	 * Crea un objeto temporizador. Valida que el argumento sea mayor que cero.
	 *
	 * @param numPruebas el número de veces que se va a medir el tiempo.
	 * @throws IllegalArgumentException si el número de pruebas es cero o negativo.
	 */
	public Temporizador(int numPruebas) {
		if (numPruebas <= 0) {
			throw new IllegalArgumentException("Número de pruebas incorrecto");
		}
		this.numPruebas = numPruebas;
		tiempos = new long[numPruebas];
	}

	/**
	 * Crea un objeto temporizador que se ejecutará una sola vez.
	 */
	public Temporizador() {
		this(1);
	}

	/**
	 * Cálcula el tiempo mínimo de las numPruebas ejecuciones. Es la medida más útil.
	 *
	 * @return el tiempo mínimo.
	 */
	public long getTiempoMinimo() {
		long minimo;

		minimo = tiempos[0]; // al menos existe tiempos[0]
		for (int i = 1; i < numPruebas; i++) {
			if (tiempos[i] < minimo) {
				minimo = tiempos[i];
			}
		}
		return minimo;
	}

	/**
	 * Cálcula el tiempo máximo de las numPruebas ejecuciones. Es poco útil.
	 *
	 * @return el tiempo máximo.
	 */
	public long getTiempoMaximo() {
		long maximo;

		maximo = tiempos[0]; // al menos existe tiempos[0]
		for (int i = 1; i < numPruebas; i++) {
			if (tiempos[i] > maximo) {
				maximo = tiempos[i];
			}
		}
		return maximo;
	}

	/**
	 * Cálcula el tiempo medio de las numPruebas ejecuciones.
	 *
	 * @return el tiempo medio.
	 */
	public long getTiempoPromedio() {
		long sumaTiempos = 0;

		for (int i = 0; i < numPruebas; i++) {
			sumaTiempos += tiempos[i];
		}
		return sumaTiempos / (long) numPruebas;
	}

	/**
	 * Devuelve el número de pruebas.
	 *
	 * @return el número de pruebas.
	 */
	public float getNumPruebas() {
		return numPruebas;
	}

	/**
	 * Mide el tiempo de ejecución del método funcionAMedir del objeto que se le pasa. Hace numPruebas
	 * ejecuciones del método, almacenando el tiempo de cada una de ellas en un elemento de tiempos, de
	 * modo que, posteriormente, pueden calcularse medias, mínimo, etc. sobre él. Antes de cada
	 * ejecución de funcionAMedir se ejecuta el método procesamientoInicial del objeto temporizable, en
	 * el que se deben inicializar los elementos que lo necesiten para esta ejecucíon; después de cada
	 * ejecución se ejecuta el método procesamientoFinal del mismo objeto temporizable.
	 *
	 * @param f un objeto que implementa la interfaz Temporizable, cuyo método funcionAMedir se
	 *          cronometra.
	 * @see EstrategiaSolucion
	 * @see EstrategiaSolucion#solucion
	 * @see EstrategiaSolucion#procesamientoInicial
	 * @see EstrategiaSolucion#procesamientoFinal
	 */
	public void cronometra(EstrategiaSolucion f) {
		long inicio, fin;

		for (int i = 0; i < numPruebas; i++) {
			f.procesamientoInicial();
			inicio = System.nanoTime();
			f.solucion(); // la función que se mide
			fin = System.nanoTime();
			f.procesamientoFinal();
			tiempos[i] = fin - inicio;
		}
	}

	/**
	 * Devuelve una cadena con información sobre el tiempo promedio de ejecución.
	 *
	 * @return Una cadena con información sobre el tiempo promedio de ejecución.
	 */
	public String getInformeTiempoMedio() {
		String s = "Tiempo medio: " + getTiempoPromedio() + " ns";
		return s;
	}

	/**
	 * Devuelve una cadena con información sobre el tiempo mínimo de ejecución. Se usa en el método
	 * toString.
	 *
	 * @return Una cadena con información sobre el tiempo mínimo de ejecución.
	 */
	public String getInformeTiempoMinimo() {
		String s = "Tiempo mínimo: " + getTiempoMinimo() + " ns";
		return s;
	}

	/**
	 * Devuelve una representación en cadena de la información sobre el tiempo mínimo de ejecución.
	 *
	 * @return Una cadena con información sobre el tiempo mínimo de ejecución de la funcionAMedir.
	 */
	public String toString() {
		// por omisión, el mínimo
		return getInformeTiempoMinimo();
	}
}
