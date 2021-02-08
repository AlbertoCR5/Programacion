package Ejercicio5Repaso;

public class Partido {

	// Constantes
	private static final int PRIMERA_JORNADA = 1;
	private static final int ULTIMA_JORNADA = 38;
	private static final int MINIMO_GOLES = 0;
	private static final char SEPARADOR = '-';

	// Atributos
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
	 * @throws PartidoException
	 */
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws PartidoException {

		if (equipoLocal.equals(equipoVisitante)) {
			throw new PartidoException(
					"Un equipo no puede enfrentarse consigo mismo" + equipoLocal + " Vs " + equipoVisitante);
		}
		setJornada(jornada);
		setEquipoLocal(equipoLocal);
		setEquipoVisitante(equipoVisitante);
		jugado = false;
	}

	// Getters
	public int getJornada() {
		return jornada;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public int getGolesLocal() throws PartidoException {

		if (!jugado) {
			throw new PartidoException("Aun no se ha disputado el partido");
		}
		return golesLocal;
	}

	public int getGolesVisitante() throws PartidoException {

		if (!jugado) {
			throw new PartidoException("Aun no se ha disputado el partido");
		}

		return golesVisitante;
	}

	public char getResultadoQuiniela() throws PartidoException {

		if (!jugado) {
			throw new PartidoException("Aun no se ha disputado el partido");
		}

		return resultadoQuiniela;
	}

	public void setJornada(int jornada) throws PartidoException {

		if (jornada < PRIMERA_JORNADA || jornada > ULTIMA_JORNADA) {
			throw new PartidoException("Error, la jornada " + jornada + " no existe");
		}

		this.jornada = jornada;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public void setGolesLocal(int golesLocal) throws PartidoException {

		if (golesLocal < MINIMO_GOLES) {
			throw new PartidoException("Error, goles locales incorrectos" + golesLocal);
		}
		this.golesLocal = golesLocal;
	}

	public void setGolesVisitante(int golesVisitante) throws PartidoException {

		if (golesLocal < MINIMO_GOLES) {
			throw new PartidoException("Error, goles locales incorrectos" + golesVisitante);
		}
		this.golesVisitante = golesVisitante;
	}

	public void setResultadoQuiniela(char resultadoQuiniela) {
		this.resultadoQuiniela = resultadoQuiniela;
	}

	public void obtenerResultado(String cadenaResultado) throws PartidoException {

		int guion;

		guion = cadenaResultado.indexOf(SEPARADOR);

		if (guion < 0) {
			throw new PartidoException("Error, el formato del resultado es incorrecto");
		}

		try {
			setGolesLocal(Integer.parseInt(cadenaResultado.substring(0, guion)));
			setGolesVisitante(Integer.parseInt(cadenaResultado.substring(0, guion + 1)));
		} catch (NumberFormatException e) {
			throw new PartidoException("Error, el formato del resultado es incorrecto");
		}

		jugado = true;

		if (golesLocal > golesVisitante) {
			this.equipoLocal.incrementarPartidosGanados();
			this.resultadoQuiniela = '1';
		} else {
			if (golesLocal < golesVisitante) {
				this.equipoVisitante.incrementarPartidosGanados();
				this.resultadoQuiniela = '2';
			} else {
				this.resultadoQuiniela = 'X';
			}
		}
	}

	public String toString() {

		String info;

		if (!jugado) {
			info = "El partido entre " + equipoLocal + " y " + equipoVisitante + " de la jornada " + jornada
					+ " no se ha disputado aun";
		} else {
			info = "El partido entre " + equipoLocal + " y " + equipoVisitante + " de la jornada " + jornada
					+ " ha finalizado  con el resultado " + golesLocal + "-" + golesVisitante
					+ " y el resultado de la quiniela es: " + resultadoQuiniela;
		}

		return info;
	}

}
