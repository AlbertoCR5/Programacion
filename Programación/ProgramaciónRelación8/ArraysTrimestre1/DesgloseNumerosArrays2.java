package ArraysTrimestre1;
import java.util.Random;

public class DesgloseNumerosArrays2 {

	private static final int MAXIMO = 100;

	public static void main(String[] args) {

		Random serieAleatoria = new Random();

		int numeros[] = new int[60];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = serieAleatoria.nextInt(MAXIMO) + 1;
		}

		double media = calcularMedia(numeros);
		System.out.println("la media vale " + media);

	}

	private static double calcularMedia(int[] numeros) {

		int cero = 0, uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0, siete = 0, ocho = 0, nueve = 0;
		double media;
		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
			if (numeros[i] % 10 == 0) {
				cero++;
			}
			if (numeros[i] % 10 == 1) {
				uno++;
			}
			if (numeros[i] % 10 == 2) {
				dos++;
			}
			if (numeros[i] % 10 == 3) {
				tres++;
			}
			if (numeros[i] % 10 == 4) {
				cuatro++;
			}
			if (numeros[i] % 10 == 5) {
				cinco++;
			}
			if (numeros[i] % 10 == 6) {
				seis++;
			}
			if (numeros[i] % 10 == 7) {
				siete++;
			}
			if (numeros[i] % 10 == 8) {
				ocho++;
			}
			if (numeros[i] % 10 == 9) {
				nueve++;
			}
		}
		System.out.println(cero + " veces se repite el 0");
		System.out.println(uno + " veces se repite el 1");
		System.out.println(dos + " veces se repite el 2");
		System.out.println(tres + " veces se repite el 3");
		System.out.println(cuatro + " veces se repite el 4");
		System.out.println(cinco + " veces se repite el 5");
		System.out.println(seis + " veces se repite el 6");
		System.out.println(siete + " veces se repite el 7");
		System.out.println(ocho + " veces se repite el 8");
		System.out.println(nueve + " veces se repite el 9");

		media = (double) suma / numeros.length;

		return media;
	}

}
