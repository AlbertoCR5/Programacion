package Partido;

public class Partido {

	//Constantes
	private static final int JORNADA_MINIMA = 1;
	private static final int JORNADA_MAXIMA = 38;
	private static final char SEPARADOR = '-';
	
	//Atributos
	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private char resultadoQuiniela;
	private boolean jugado;

	/**
	 * Constructor de la clase Partido
	 * 
	 * @param jornada
	 * @param equipoLocal
	 * @param equipoVisitante
	 * @throws PartidoLigaException
	 */
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws PartidoLigaException {
		
		if (equipoLocal.equals(equipoVisitante)) {
			throw new PartidoLigaException ("No puede enfrentarse el mismo equipo");
		}
	
		setJornada(jornada);
		setEquipoLocal(equipoLocal);
		setEquipoVisitante(equipoVisitante);
		jugado = false;
		
	}
	
	//Getters
	
	public int getJornada() {
		return jornada;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesLocal() throws PartidoLigaException {
		
		if (!jugado) {
			throw new PartidoLigaException("El partido aun no se ha jugado");
		}
		
		return golesLocal;
	}

	public int getGolesVisitante() throws PartidoLigaException {
		
		if (!jugado) {
			throw new PartidoLigaException("El partido aun no se ha jugado");
		}
		
		return golesVisitante;
	}

	public char getResultadoQuiniela() throws PartidoLigaException {
		
		if (!jugado) {
			throw new PartidoLigaException("El partido aun no se ha jugado");
		}
		
		return resultadoQuiniela;
	}

	/**
	 * Metodo que establece la jornada del Partido
	 * 
	 * @param nuevaJornada
	 * 			Se establece la jornada
	 * @throws PartidoLigaException
	 * 			Se lanza si el partido esta fuera de los limtes
	 */
	public void setJornada(int nuevaJornada) throws PartidoLigaException {
		
		if (nuevaJornada < JORNADA_MINIMA || nuevaJornada > JORNADA_MAXIMA) {
			throw new PartidoLigaException("Error, la jornada " + jornada + " no existe.");
		}
		this.jornada = nuevaJornada;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		
		this.equipoLocal = equipoLocal;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		
		this.equipoVisitante = equipoVisitante;
	}

	public String toString() {
		String info;

		if (jugado = false) {
			info = "El partido entre " + equipoLocal + "y" + equipoVisitante + " no se ha jugado aun.";
		} else {
			info = "El partido de la jornada " + jornada + " que se disputó entre " + equipoLocal + " y el "
					+ equipoVisitante + " finalizo con el resultado de " + golesLocal + "-" + golesVisitante
					+ " y el resultado de la quiniela es " + resultadoQuiniela;
		}
		
		return info;
	}

	public void ponerRestultado(String cadenaEntrada) throws PartidoLigaException {
		
		int guion;
		
		guion = cadenaEntrada.indexOf(SEPARADOR);
		
		if (guion < 0) {
			throw new PartidoLigaException("Error, el formato del resultado es incorrecto");
		}
		
		try {
			setGolesLocal(Integer.parseInt(cadenaEntrada.substring(0, guion)));
			setGolesVisitante(Integer.parseInt(cadenaEntrada.substring(guion, +1)));
		} catch (NumberFormatException e) {
			throw new PartidoLigaException("Error. El formato del resultado es incorrecto");
		}
		
		jugado = true;
		
		if (golesLocal > golesVisitante) {
			this.equipoLocal.incrementarPartidosGanados();
			this.resultadoQuiniela = '1';
		}
		else {
			if (this.golesLocal < this.golesVisitante) {
				this.equipoVisitante.incrementarPartidosGanados();
				this.resultadoQuiniela = '2';
			}
			else {
				this.resultadoQuiniela = 'X';
			}
		}
	}
	
	public void setGolesLocal(int golesLocal) throws PartidoLigaException {
		
		if (golesLocal < 0) {
			throw new PartidoLigaException("Error, goles locales incorrectos");
		}
		
		this.golesLocal = golesLocal;
	}

	public void setGolesVisitante(int golesVisitante) throws PartidoLigaException {
		
		if (golesVisitante < 0) {
			throw new PartidoLigaException("Error, goles locales incorrectos");
		}
		
		this.golesVisitante = golesVisitante;
	}




}
