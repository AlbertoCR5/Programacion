package LordOfTheRings;

/**
 * @version 2.0, 04/05/2021
 * @author y0rg
 *
 * Clase abstracta que resuelve algoritmos siguiendo un patron de busqueda de caso mejor.
 * Las clases que hereden de ella, implementar�n los m�todos del algoritmo Voraz.
 * Algunos de los m�todos pueden no ser necesarios en funci�n del tipo de soluci�n planteada.
 *  _________________________________________________________
 * |	LEEME -> NO HACE FALTA MODIFICAR ESTA CLASE			|
 * |________________________________________________________|
 */
public abstract class EsquemaVZ {
	
	public void voraz() {
		inicializa();
		while (!fin()) {
			seleccionaYElimina();
			if (prometedor()) {
				anotaEnSolucion();
			}
		}
    }

	abstract protected void inicializa();

	abstract protected boolean fin();

	abstract protected void seleccionaYElimina();

	abstract protected boolean prometedor();

	abstract protected void anotaEnSolucion();

}

