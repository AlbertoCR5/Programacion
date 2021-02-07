package Ejercicio3Repaso;

public class MaquinaCafe {

	private static final int DOSIS_CAFE = 50;
	private static final int DOSIS_LECHE = 50;
	private static final int VASOS = 80;
	public static final double PRECIO_CAFE = 1.0;
	public static final double PRECIO_LECHE = 1.0;
	public static final double PRECIO_CAFELECHE = 1.5;

	private int vasos, dosisCafe, dosisLeche;
	private static int totalMaquinas;
	private double monedero;

	public MaquinaCafe(double monederoInicial) throws MaquinaCafeException {

		llenarDepositos();
		setMonedero(monederoInicial);
		totalMaquinas++;
	}

	public static int getTotalMaquinas() {
		return totalMaquinas++;
	}

	private void llenarDepositos() {

		dosisCafe = DOSIS_CAFE;
		dosisLeche = DOSIS_LECHE;
		vasos = VASOS;

	}

	public static double getCafe() {
		return PRECIO_CAFE;
	}

	public static double getLeche() {
		return PRECIO_LECHE;
	}

	public static double getCafeLeche() {
		return PRECIO_CAFELECHE;
	}

	public int getVasos() {
		return vasos;
	}

	public int getDosisCafe() {
		return dosisCafe;
	}

	public int getDosisLeche() {
		return dosisLeche;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) throws MaquinaCafeException {

		if (monedero <= 0) {
			throw new MaquinaCafeException("No puede darse valo " + monedero + " al monedero");
		}

		this.monedero = monedero;
	}

	public double servirCafe(double dinero) throws MaquinaCafeException {

		double cambio = 0;

		if (dinero < PRECIO_CAFE) {
			throw new MaquinaCafeException("Dinero introducido insuficiente, precio : " + PRECIO_CAFE);
		} else {
			cambio = dinero - PRECIO_CAFE;
			if (cambio > monedero) {
				throw new MaquinaCafeException("No hay suficiente cambio, recoga su dinero");
			} else {
				if (vasos == 0) {
					cambio = dinero;
					throw new MaquinaCafeException("Vasos fuera de existencias");

				} else {
					if (dosisCafe == 0) {
						cambio = dinero;
						throw new MaquinaCafeException("Producto seleccionado agotado");
					} else {
						dosisCafe--;
						vasos--;
						monedero = monedero + PRECIO_CAFE;

					}
				}
			}
		}
		return cambio;
	}

	public double servirLeche(double dinero) throws MaquinaCafeException {

		double cambio = 0;

		if (dinero < PRECIO_LECHE) {
			throw new MaquinaCafeException("Dinero introducido insuficiente, precio : " + PRECIO_LECHE);
		} else {
			cambio = dinero - PRECIO_LECHE;
			if (cambio > monedero) {
				throw new MaquinaCafeException("No hay suficiente cambio, recoga su dinero");
			} else {
				if (vasos == 0) {
					cambio = dinero;
					throw new MaquinaCafeException("Vasos fuera de existencias");

				} else {
					if (dosisCafe == 0) {
						cambio = dinero;
						throw new MaquinaCafeException("Producto seleccionado agotado");
					} else {
						dosisLeche--;
						vasos--;
						monedero = monedero + PRECIO_LECHE;

					}
				}
			}
		}
		return cambio;
	}

	public double servirCafeLeche(double dinero) throws MaquinaCafeException {

		double cambio = 0;

		if (dinero < PRECIO_CAFELECHE) {
			throw new MaquinaCafeException("Dinero introducido insuficiente, precio : " + PRECIO_CAFELECHE);
		} else {
			cambio = dinero - PRECIO_CAFELECHE;
			if (cambio > monedero) {
				throw new MaquinaCafeException("No hay suficiente cambio, recoga su dinero");
			} else {
				if (vasos == 0) {
					cambio = dinero;
					throw new MaquinaCafeException("Vasos fuera de existencias");

				} else {
					if (dosisCafe == 0) {
						cambio = dinero;
						throw new MaquinaCafeException("Producto seleccionado agotado");
					} else {
						dosisLeche--;
						dosisCafe--;
						vasos--;
						monedero = monedero + PRECIO_CAFELECHE;

					}
				}
			}
		}
		return cambio;
	}

	@Override
	public String toString() {
		return "EL monedero actual de la maquina es de: " + monedero + " Quedan " + dosisCafe + " dosis de cafe, "
				+ dosisLeche + " dosis de leche y " + vasos + " vasos.";
	}

}
