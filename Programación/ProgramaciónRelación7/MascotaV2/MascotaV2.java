package MascotaV2;

public class MascotaV2 {

	private static final int PUNTOS_INICIALES = 0;
	public static final int ALIMENTO_INICIAL = 2;
	public static final int MINIMO_ALIMENTOS = 1;
	public static final int PUNTOS_POR_ALIMENTO = 30;
	public static final int PUNTOS_POR_MINUTO = 3;
	public static final int MINIMO_MINUTOS_JUGADO = 0;
	public static final int MAXIMO_MINUTOS_JUGADO = 20;
	public static final int MAXIMO_CONTROL_PARENTAL = 100;
	
	//Atributo estatico para almacenar el total de minutos jugados entre todas las mascotas
	private static int totalMinutosJugados = 0;
	
	//Atributos
	private String nombre, tipo;	//PERRO o GATO
	private int puntos, alimentos;	
	
	public MascotaV2(String nombre, String tipo) throws MascotaV2Exception {

		setNombre(nombre);
		setTipo(tipo);
		this.puntos = PUNTOS_INICIALES;
		this.alimentos = ALIMENTO_INICIAL;
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

	public void setTipo(String tipo) throws MascotaV2Exception {
		
		tipo = tipo.toUpperCase();
		if (!(tipo.equals("PERRO") || tipo.equals("GATO"))) {
			throw new MascotaV2Exception ("Error, El tipo de mascota introducida no se encuentra registrada");
		}
		
		this.tipo = tipo;
	}

	public int getAlimentos() {
		return alimentos;
	}

	public void comprarAlimentos(int comprarAlimentos) throws MascotaV2Exception {
		
		int invertirPuntos = comprarAlimentos * PUNTOS_POR_ALIMENTO;
		
		if (comprarAlimentos < MINIMO_ALIMENTOS) {
			throw new MascotaV2Exception ("Numero de alimentos incorrecto");
		}
		
		if (invertirPuntos > puntos) {
			throw new MascotaV2Exception ("No puedes comprar, puntos insuficientes");
		}
		
		puntos = puntos - invertirPuntos;
		alimentos = alimentos + comprarAlimentos;
		
	}
	
	public void darComida() throws MascotaV2Exception {
		
		if (alimentos == 0) {
			throw new MascotaV2Exception("No hay suficiente comida, deberias comprarla");
		}
		
		alimentos--;
	}

	public void jugar (int minutos) throws MascotaV2Exception, MascotaV2ControlParentalException {
		
		if(minutos < MINIMO_MINUTOS_JUGADO || minutos > MAXIMO_MINUTOS_JUGADO) {
			throw new MascotaV2Exception ("Minutos incorrectos, no puede superar el limite de tiempo juagado");
		}
		
		puntos = puntos + minutos * PUNTOS_POR_MINUTO;
		
		totalMinutosJugados = totalMinutosJugados + minutos;
		
		if (totalMinutosJugados > MAXIMO_CONTROL_PARENTAL) {
			throw new MascotaV2ControlParentalException("Has superados los minutos jugados " + MAXIMO_CONTROL_PARENTAL + ". Las mascotas se van a dormirzzzZZZZ");
			
		}
	}
	public static int getTotalMinutosJugados() {
		return totalMinutosJugados;
	}
	
	public boolean equals (MascotaV2 otro) {
		
		boolean repetido = false;
		
		if (this.nombre.equals(otro.nombre)&& this.tipo.equals(otro.tipo)) {
			repetido = true;
		}
		return repetido;
		
	}
	
	public String toString() {
		
		String info;
		if ( tipo.equals("PERRO"))
			info ="Pet nombre= " + nombre + ", tipo=" + tipo + ", huesos= " + alimentos
					+ "  puntos " + puntos;
		else
			info ="Pet nombre=" + nombre + ", tipo=" + tipo + ", pescados= " + alimentos
					+ "  puntos " + puntos;
		return info;
	}

}
