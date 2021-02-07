/*
 * Realizar un método llamado cambiaConsonantesMayusculasMinusculas que reciba una cadena y
devuelva otra donde se cambian las letras consonantes mayúsculas por su correspondiente
minúscula y viceversa.
Realizar un programa principal que pruebe este método.
Ejemplo:
Introduce una cadena: Este examen es MUY FACIL
La cadena resultante es: ESTe eXaMeN eS mUy fAcIl
 */
package PruebaPractica;

public class IntercambioMayusMinus {

	public static void main(String[] args) {

		String cadena = "Este examen es MUY FACIL";
		String cadenaModificada;
		System.out.println(cadena);
		cadenaModificada = tratarCadena(cadena);

		System.out.println(cadenaModificada);
	}

	/**
	 * Metodo que convierte consonantes mayusculas en minusculas y viceversa
	 * @param cadena
	 * @return cadenaModificada
	 */
	private static String tratarCadena(String cadena) {

		StringBuilder cadenaModificada = new StringBuilder();
		char caracter;

		for (int i = 0; i < cadena.length(); i++) {
			caracter = cadena.charAt(i);
			if (esVocal(caracter)) {
				cadenaModificada.append(caracter);
			} else {
				if (!esVocal(caracter) && Character.isUpperCase(caracter)) {
					caracter = Character.toLowerCase(caracter);
					cadenaModificada.append(caracter);
				} else {
					if (!esVocal(caracter) && Character.isLowerCase(caracter)) {
						caracter = Character.toUpperCase(caracter);
						cadenaModificada.append(caracter);
					} else {
						cadenaModificada.append(caracter);
					}
				}
			}

		}

		return cadenaModificada.toString();

	}

	/**
	 * Metodo  que comprueba que un caracter sea una vocal o no
	 * @param caracter
	 * @return esVocal
	 */
	private static boolean esVocal(char caracter) {

		String vocal = "AEIOUaeiou";
		boolean esVocal = true;

		if (vocal.contains(String.valueOf(caracter)) == true) {
			esVocal = true;
		} else {
			esVocal = false;

		}
		return esVocal;
	}
}
