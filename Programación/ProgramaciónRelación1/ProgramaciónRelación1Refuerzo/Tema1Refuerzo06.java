package ProgramaciónRelación1Refuerzo;
import java.util.Scanner;

public class Tema1Refuerzo06 {
	
	//Realizar un programa que solicite la coordenada x e y de un punto e informe si se
	//encuentre en el primer, segundo, tercer o cuarto cuadrante.
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		double latitud;
		double longitud;
		
		System.out.println("Introduce las cordenadas Latitud y Longitud");
		latitud = Double.parseDouble(teclado.nextLine());
		longitud = Double.parseDouble(teclado.nextLine());
		if (latitud > 0 && longitud > 0) {
			System.out.println("Las coordenadas pertecen al cuadrante 1");
		}
		else {
			if (latitud < 0 && longitud > 0) {
				System.out.println("Las coordenadas pertecen al cuadrante 2");
			}
			else { 
				if (latitud < 0 && longitud < 0) {
					System.out.println("Las coordenadas pertecen al cuadrante 3");
				}
				else {
					if (latitud > 0 && longitud <0) {
						System.out.println("Las coordenadas pertecen al cuadrante 4");
					}
					else {
						if (latitud == 0 && longitud == 0) {
							System.out.println("punto intermedio");
						}
						else {
							if (latitud == 0 && longitud > 0) {
								System.out.println("Las coordenadas pertecen a un punto intermedio del cuadrante entre 1 y 4");
							}
							else {
								if (latitud == 0 && longitud < 0) {
									System.out.println("Las coordenadas pertecen a un punto intermedio del cuadrante entre 2 y 3");
								}
								else {
									if (latitud > 0 && longitud == 0) {
										System.out.println("Las coordenadas pertecen a un punto intermedio del cuadrante entre 1 y 2");
									}
									else {
										System.out.println("Las coordenadas pertecen a un punto intermedio del cuadrante entre 3 y 4");
									}
								}
							}
						}
					} 
				}
			}
				 
		}

	}

}
