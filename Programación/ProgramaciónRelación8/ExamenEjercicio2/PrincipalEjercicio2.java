package ExamenEjercicio2;

public class PrincipalEjercicio2 {

	public static void main(String[] args) {
		


	}
	
	private static double mediaPreciosModelosElectricos(Modelo[] modelos) throws ModeloException{
		
		int sumaPrecios = 0;
		int totalModelosElectricos = 0;
		
		for (int i = 0; i < modelos.length; i++) {
			
			if (modelos[i].isElectrico()) {
				sumaPrecios = sumaPrecios + modelos[i].getPrecio();
				totalModelosElectricos++;
			}
		}
		
		if (totalModelosElectricos == 0) {
			throw new ModeloException("No se puede calcular la media al no haber modelos electrios");
		}
		
		return (double)sumaPrecios / totalModelosElectricos;
		
	}
	
	private static Modelo modeloMasBarato(Modelo[] modelos) {
		
		Modelo modeloMasBarato = null;
		double precioMenor = Integer.MAX_VALUE;
		
		for (int i = 0; i < modelos.length; i++) {
			Modelo modelo = modelos[i];
			
			if (modelo.getPrecio() < precioMenor) {
				precioMenor = modelo.getPrecio();
				modeloMasBarato = modelo;
			}

		}
		
		return modeloMasBarato;
		
	}

}
