package ArraysTrimestre1;
import java.util.Random;

public class LoteriaRandom {

	private static final int LOTERIA = 6;
	private static final int MAXIMO = 49;

	public static void main(String[] args) {

		Random serieAleatoria = new Random();

		int numeros[] = new int[LOTERIA];

		System.out.println("Los numeros premiados de la loteria son: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = serieAleatoria.nextInt(MAXIMO) + 1;

			System.out.print(numeros[i] + ", ");
		}

	}

}
