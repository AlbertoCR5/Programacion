package Mascota;

public class MonroyPet {
	
	private static final int PUNTOS_INICIAL = 0;
	public static final int COMIDA_INICIAL = 2;
	public static final int PUNTOS_POR_ALIMENTO = 30;
	public static final int PUNTOS_POR_MINUTO = 3;
	public static final int MAXIMO_MINUTOS_JUGADOS = 20;
	public static final int MAXIMO_CONTROL_PARENTAL = 100;
	
	// Atributo estatico para almacenar el total de minutos jugados entre todas las mascotas
	private static int totalTiempoJugado;
	
	//Atributos
	private String nombre;
	private String tipo;
	private int puntos;
	private int comida;

	public MonroyPet(String nombre, String tipo) throws MonroyPetException {

		setNombre(nombre);
		setTipo(tipo);
		this.puntos = PUNTOS_INICIAL;
		this.comida = COMIDA_INICIAL;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	//Privada, no se admite cambios de tipo de mascota
	private void setTipo(String tipo) throws MonroyPetException {
		
		tipo = tipo.toUpperCase();
		
		if(!(tipo.equals("PERRO") || tipo.equals("GATO"))) {
			throw new MonroyPetException("El tipo de la mascota no es correcto");
		}
		
		this.tipo = tipo;
	}

	public int getComida() {
		return comida;
	}

	public static int getTotalTiempoJugado() {
		return totalTiempoJugado;
	}

	public boolean equals (MonroyPet otro) {
		
		boolean esIgual = true;
		
		if (this.nombre.equals(otro.nombre) && this.tipo.equals(otro.tipo)) {
			esIgual = true;
		}
		
		return esIgual;
		
	}

	public String toString() {
		
		String info;
		
		if ( tipo.equals("PERRO"))
			info = "Pet nombre= " + nombre + ", tipo=" + tipo + ", huesos = " + comida
					+ "  puntos " + puntos;
		else
			info = "Pet nombre=" + nombre + ", tipo=" + tipo + ", pescados= " + comida
					+ "  puntos " + puntos;
		
		return info;
	}
	
	public void darComida() throws MonroyPetException {
		
		if (comida < 1) {
			throw new MonroyPetException ("No podemos dar comida");
		}
		comida--;
	}
	
	public void comprarComida(int alimentosAComprar) throws MonroyPetException {
		
		int puntosInvertidos = alimentosAComprar * PUNTOS_POR_ALIMENTO;
		
		if (alimentosAComprar < 1) {
			throw new MonroyPetException ("El numero de alimentos en stock no puede ser negativo");
		}
								//puntos
		if(puntosInvertidos > this.puntos) {
			throw new MonroyPetException ("No puedes comprar esa cantidad de comida");
		}
		//puntos		//puntos
		this.puntos = this.puntos - puntosInvertidos;
		//comida		//comida
		this.comida = this.comida + alimentosAComprar;
		
	}
	
	public void jugar(int minutosJugados) throws MonroyPetException {
		
		if (minutosJugados < 1 || minutosJugados > MAXIMO_MINUTOS_JUGADOS) {
			throw new MonroyPetException("Minutos incorrectos, no puede superar los " + MAXIMO_MINUTOS_JUGADOS);
		}
		
		puntos = puntos + minutosJugados * PUNTOS_POR_MINUTO;
		
		//Control parental, acumulo el numero de minutos jugados entre todas las mascotas
		totalTiempoJugado = totalTiempoJugado + minutosJugados;
		
	}
	
}
