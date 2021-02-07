package Ejercicio3;

public class MaquinaCafe {

	private double monedero;
	private int vasos;
	private int dosisCafe, dosisLeche;
	private static int totalMaquinas = 0;
	private static final int MAXIMO_DOSIS_CAFE = 50, MAXIMO_DOSIS_LECHE = 50, MAXIMO_VASOS = 80;
	private static final double PRECIO_CAFE = 0.8, PRECIO_LECHE = 1, PRECIO_CAFE_LECHE = 1.5;

	// Contructor
	public MaquinaCafe(double monederoInicial) throws MaquinaCafeException {

		llenarDepositos();
		setMonedero(monederoInicial);
		totalMaquinas++;
		
	}

	public static int getTotalMaquinas() {

		return totalMaquinas++;

	}

	public void llenarDepositos() {

		dosisCafe = MAXIMO_DOSIS_CAFE;
		dosisLeche = MAXIMO_DOSIS_LECHE;
		vasos = MAXIMO_VASOS;
	}

	public static double getPRECIO_CAFE() {

		return PRECIO_CAFE;
	}

	public static double getPRECIO_LECHE() {

		return PRECIO_LECHE;
	}

	public static double getPRECIO_CAFE_LECHE() {

		return PRECIO_CAFE_LECHE;
	}

	public int getDosisCafe() {

		return dosisCafe;
	}

	public int getDosisLeche() {

		return dosisLeche;
	}

	public int getVasos() {

		return vasos;
	}

	public double getMonedero() {

		return monedero;
	}

	public void setMonedero(double monedero) throws MaquinaCafeException {

		if (monedero <= 0)
			throw new MaquinaCafeException("No puede darse valor " + monedero + " al monedero");
		else {
			this.monedero = monedero;
		}
	}

	public double servirCafe(double dinero) {

		double cambio = 0;

		if (dinero < PRECIO_CAFE) {
			System.out.println("No has introducido suficiente dinero. Cuesta: " + PRECIO_CAFE);
			cambio = dinero;
		} else {
			cambio = dinero - PRECIO_CAFE;
			if (cambio > monedero) {
				System.out.println("No hay cambio suficiente. Recoge tu dinero.");
				cambio = dinero;
			} else {
				if (vasos == 0) {
					System.out.println("Vasos agotados.");
					cambio = dinero;
				} else {
					if (dosisCafe == 0) {
						System.out.println("Café agotado");
						cambio = dinero;
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

	public double servirLeche(double dinero) {

		double cambio = 0;

		if (dinero < PRECIO_LECHE) {
			System.out.println("No has introducido suficiente dinero. Cuesta: " + PRECIO_LECHE);
			cambio = dinero;
		} else {
			cambio = dinero - PRECIO_LECHE;
			if (cambio > monedero) {
				System.out.println("No hay cambio suficiente. Recoge tu dinero.");
				cambio = dinero;
			} else {
				if (vasos == 0) {
					System.out.println("Vasos agotados.");
					cambio = dinero;
				} else {
					if (dosisLeche == 0) {
						System.out.println("Leche agotada");
						cambio = dinero;
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

	public double servirCafeconLeche(double dinero) {

		double cambio = 0;

		if (dinero < PRECIO_CAFE_LECHE) {
			System.out.println("No has introducido suficiente dinero. Cuesta: " + PRECIO_CAFE_LECHE);
			cambio = dinero;
		} else {
			cambio = dinero - PRECIO_CAFE_LECHE;
			if (cambio > monedero) {
				System.out.println("No hay cambio suficiente. Recoge tu dinero.");
				cambio = dinero;
			} else {
				if (vasos == 0) {
					System.out.println("Vasos agotados.");
					cambio = dinero;
				} else {
					if (dosisLeche == 0) {
						System.out.println("Leche agotada");
						cambio = dinero;
					} else {
						if (dosisCafe == 0) {
							System.out.println("Café agotado");
							cambio = dinero;
						} else {

							dosisCafe--;
							dosisLeche--;
							vasos--;
							monedero = monedero + PRECIO_LECHE;
						}

					}
				}
			}
		}

		return cambio;

	}

	public double vaciarMonedero() {
		
		double monederoVacio;
		monederoVacio = this.monedero;
		this.monedero = 0;
		
		return monederoVacio;
		
	}

	/**
	 * Estado de maquina. Metodo para mostrar la informacion de la maquina de cafe
	 */
	public String toString() {

		String info;

		info = "El monedero actual es de " + monedero + "Euros" + "\n" + "Quedan " + dosisCafe + " dosis de cafe,"
				+ "\n" + dosisLeche + " dosis de leche y " + "\n" + vasos + " vasos.";

		return info;
	}
	
}