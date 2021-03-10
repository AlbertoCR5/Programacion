package LordOfTheRings;

public class AtaqueSimple extends EsquemaVZ implements EstrategiaSolucion {

	int[] numOrcos;
	int[] numAliados;

	int[] aliadosContraatacaOrcos;
	
	int aliadosActual;
	int orcosAAtacar;
	
	boolean[] orcosContraatacados;
	
	/**
	 * TODO
	 * @param pa el problema con los datos de la batalla
	 */
	public AtaqueSimple(ProblemaAtaque pa) {
		
		this.numOrcos = pa.getOrcos();
		this.numAliados = pa.getAliados();
	}
	
	
	@Override
	public void procesamientoInicial() {
	}
	
	@Override
	public void procesamientoFinal() {
	}
	
	@Override
	protected void inicializa() {
		aliadosContraatacaOrcos = new int[numOrcos.length];
		orcosContraatacados = new boolean[numOrcos.length];
		for (int i = 0; i < orcosContraatacados.length; i++) {
			orcosContraatacados[i] = false;
		}
		aliadosActual = 0;
		orcosAAtacar = 0;
	}

	@Override
	protected boolean fin() {
		return (aliadosActual == numOrcos.length);
	}
	
	@Override
	protected boolean prometedor() {
		return true;
	}
	
	@Override
	public void solucion() {
		voraz();
	}


	public String toString() {

		int derrotas = 0;
		int victorias = 0;
		
		String reparto = "El resultado de la batalla ha sido sangriento:";
		for (int i = 0; i < aliadosContraatacaOrcos.length; i++) {
			if (aliadosContraatacaOrcos[i] != -1) {
				reparto += "\nEl grupo de aliados " + i + "("+numAliados[i]+") ataca al grupo de orcos " 
						+ aliadosContraatacaOrcos[i] + "("+numOrcos[i]+")";
			}
			//Resultado de la batalla entre los grupos
			if (numAliados[i] <numOrcos[i]) {
				reparto += "y cae DERROTADO";
				derrotas++;
			} else {
				reparto += "y sale VICTORIOSO";
				victorias++;
			}
		}
		
		if (derrotas <= victorias) {
			reparto += "\nAragorn ha aplastado a los orcos con " + victorias + " victorias y " + derrotas + " derrotas";
		} else {
			reparto += "\nLos orcos se han apoderado del mundo con " + victorias + " victorias y " + derrotas + " derrotas, se avecina tormenta";
		}
		//TODO calcular el numero de derrotas y victorias y mostrarlo. Individuales y total.
		
		return reparto;
	}



	@Override
	protected void seleccionaYElimina() {

	}



	/**
	 * Metodo que guarda que grupo de aliados ataca a que grupo de orcos
	 * TODO
	 */
	@Override
	protected void anotaEnSolucion() {
		//TODO
		aliadosContraatacaOrcos[aliadosActual] = orcosAAtacar;
		aliadosActual++;
		orcosAAtacar++;
	}

}
