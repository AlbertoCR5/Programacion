package LordOfTheRings.alternativa;

import LordOfTheRings.EsquemaVZ;
import LordOfTheRings.EstrategiaSolucion;
import LordOfTheRings.ProblemaAtaque;

/**
 * @version 2.0, 04/05/2021
 * @author y0rg
 * 
 *         Clase que calcula una posible estrategia/solución a la batalla. Debe implementar la
 *         interfaz para calcular lo que tarda en procesarse 
 *         
 *         LEEME -> NO HACE FALTA MODIFICAR CODIGO
 *         EN ESTA CLASE SOLO HACER COMENTARIOS
 */
public class AtaqueVoraz extends EsquemaVZ implements EstrategiaSolucion {

	int[] numOrcos;
	int[] numAliados;

	int[] gruposAliadosAtacanOrcos;

	int aliadosActual;
	int orcosAAtacar;

	boolean[] gruposOrcosAtacados;


	public AtaqueVoraz(ProblemaAtaque pa) {
		this.numOrcos = pa.getOrcos();
		this.numAliados = pa.getAliados();
	}


	public void procesamientoInicial() {
	}


	protected void inicializa() {
		gruposAliadosAtacanOrcos = new int[numOrcos.length];
		gruposOrcosAtacados = new boolean[numOrcos.length];
		for (int i = 0; i < gruposOrcosAtacados.length; i++) {
			gruposOrcosAtacados[i] = false;
		}
		aliadosActual = 0;
	}


	protected boolean fin() {
		return (aliadosActual == numOrcos.length);
	}

	protected void seleccionaYElimina() {
		boolean sal = false;
		int maxValor = Integer.MIN_VALUE;
		orcosAAtacar = -1;
		for (int i = 0; i < numOrcos.length && !sal; i++) {
			if (!gruposOrcosAtacados[i] && numOrcos[i] <= numAliados[aliadosActual] && maxValor < numOrcos[i]) {
				if (numOrcos[i] == numAliados[aliadosActual]) {
					sal = true;
				}
				maxValor = numOrcos[i];
				orcosAAtacar = i;
			}
		}
		if (orcosAAtacar != -1)
			gruposOrcosAtacados[orcosAAtacar] = true;
	}

	protected boolean prometedor() {
		return true;
	}

	protected void anotaEnSolucion() {
		gruposAliadosAtacanOrcos[aliadosActual] = orcosAAtacar;
		aliadosActual++;
	}

	public void solucion() {
		voraz();
	}

	public String toString() {
		int derrotas = 0;
		int victorias = 0;
		
		String reparto = "El resultado de la batalla ha sido sangriento:";
		for (int i = 0; i < gruposAliadosAtacanOrcos.length; i++) {
			if (gruposAliadosAtacanOrcos[i] != -1) {
				reparto += "\nEl grupo de aliados " + i + "(" + numAliados[i] + ") ataca al grupo de orcos " + gruposAliadosAtacanOrcos[i] + "("
						+ numOrcos[i] + ")";

				if (numAliados[i] < numOrcos[i]) {
					reparto += "y cae DERROTADO";
					derrotas++;
				} else {
					reparto += "y sale VICTORIOSO";
					victorias++;
				}
			}
			else {
				reparto += "\nEl grupo de aliados " + i + "(" + numAliados[i] + ") huyó despaborido, DERROTA";
				derrotas++;
			}
		}


		if (derrotas <= victorias) {
			reparto += "\nAragorn ha aplastado a los orcos con " + victorias + " victorias y " + derrotas + " derrotas";
		} else {
			reparto += "\nLos orcos se han apoderado del mundo con " + victorias + " victorias y " + derrotas + " derrotas, se avecina tormenta";
		}
		return reparto;
	}

	public void procesamientoFinal() {
	}
}
