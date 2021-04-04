package Examen18Marzo.ejercicio2;

public class PizzaAMiGusto {

	private static final int MAXIMO_INGREDIENTES = 5;
	private Ingrediente[] ingredientes;
	
	public PizzaAMiGusto() {
		ingredientes=new Ingrediente[MAXIMO_INGREDIENTES];
	}
	
	//TODO
	/**
	 * 
	 * @param nuevoIngrediente
	 * @throws PizzaException si ya no se pueden añadir más ingredientes
	 */
	public void annadirIngrediente(Ingrediente nuevoIngrediente) throws PizzaException {
		
		boolean huecoEencontrado = false;
		
		for (int i = 0; i < ingredientes.length && !huecoEencontrado; i++) {
			
			if (ingredientes[i] == null) {
				ingredientes[i] = nuevoIngrediente;
				huecoEencontrado = true;
			}
		}
		
		if (!huecoEencontrado) {
			throw new PizzaException("No es posible a�adir mas ingredientes");
		}
	}
	
	//TODO
	/**
	 * 
	 * @param ingredienteAEliminar
	 * @throws PizzaException si no se encuentra el ingrediente a eliminar
	 */
	public void eliminarIngrediente(Ingrediente ingredienteAEliminar) throws PizzaException{
		
		boolean encontrado = false;
		
		for (int i = 0; i < ingredientes.length; i++) {
															//Es lo mismo
			if (ingredientes[i] == ingredienteAEliminar) { //ingredientes[i] != null && ingredientes[i].equals(ingredienteAEliminar))
				ingredientes[i] = null;
				encontrado = true;
			}
		}
		
		if (!encontrado) {
			throw new PizzaException("No se puede eliminar, porque no se ha encontrado el ingrediente " + ingredienteAEliminar);
		}
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();

		sb.append("Pizza con ingredientes: ");
		for (int i = 0; i < ingredientes.length; i++) {
			
			if (ingredientes[i]!=null) {
				sb.append(ingredientes[i] + " ");
			}
		}
		return sb.toString();
	}
	
}
