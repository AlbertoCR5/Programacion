package JuegoRol;

public class Personaje {

	public static final int VALOR_MINIMO = 0;
	public static final int CARACTERISTICAS_MAXIMAS = 20;
	public static final int VIDA_MAXIMA = 100;
	
	private String nombre;
	private TipoRaza raza;
	private int fuerza;
	private int inteligencia;
	private int vidaMaxima;
	private int vidaActual;

	public Personaje(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.vidaMaxima = VIDA_MAXIMA;
		this.vidaActual = VIDA_MAXIMA;
	}

}
