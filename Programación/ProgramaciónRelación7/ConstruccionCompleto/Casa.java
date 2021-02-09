package ConstruccionCompleto;

/**
 * @author Jorge "y0rg" Taranc�n
 *
 *	Clase del objeto Casa, definida por los atributos:
 *   � Metros cuadrados: n�mero que indica la cantidad de espacio que se va a construir, m�nimo 1
 *   � Plantas: n�mero de plantas que tendr� la vivienda, m�nimo 1.
 *   � Habitaciones: n�mero de habitaciones que tendr� la vivienda, m�nimo 1.
 *   � Ba�os: n�mero de ba�os que tendr� la vivienda, m�nimo 1.
 *   � Calidades: calidad de los materiales utilizados. Se podr� seleccionar entre �Baja�, �Media� y �Alta�.
 *   � Piscina: si se va a construir tambi�n una piscina.
 *   � Garaje: si se va a construir tambi�n un garaje.
 *
 */
public class Casa {

	//Constantes
	
		//calidades
	public static final String CALIDAD_BAJA = "BAJA";
	public static final String CALIDAD_MEDIA = "MEDIA";
	public static final String CALIDAD_ALTA = "ALTA";
		
		//precio en euros por metro cuadrado segun calidades
	public static final float PRECIO_CALIDAD_BAJA = 700; 
	public static final float PRECIO_CALIDAD_MEDIA = 800;
	public static final float PRECIO_CALIDAD_ALTA = 900;
		
		//Incremento del precio por cada planta construida
	public static final float INCREMENTO_PRECIO_POR_PLANTA = 10;
		
		//precio especifico en euros
	public static final float PRECIO_HABITACION = 500;
	public static final float PRECIO_BANIO = 1000;
	public static final float PISCINA = 10000;
	public static final float GARAGE = 5000;
	
	//Especificaciones minimas
	public static final int ESPECIFICACION_MINIMA = 1;
	private int metrosCuadrados, plantas, habitaciones, banios;
	private String calidades; //BAJA, MEDIA, ALTA Constantes
	private boolean piscina, garage;

/**
 * Constructor de la clase Casa.
 * Lanza excepcion en caso de no tener los valores correctos
 * 
 * @param metrosCuadrados
 * @param plantas
 * @param habitaciones
 * @param banios
 * @param calidades
 * @param piscina
 * @param garage
 * @throws CasaImposibleException
 */
	public Casa(int metrosCuadrados, int plantas, int habitaciones, int banios, String calidades, boolean piscina, boolean garage) throws CasaImposibleException {
			
		super();
		if (metrosCuadrados < ESPECIFICACION_MINIMA || plantas < ESPECIFICACION_MINIMA || habitaciones < ESPECIFICACION_MINIMA || banios < ESPECIFICACION_MINIMA) {
			throw new CasaImposibleException("No pueden darse valores inferiores a 1 de metros cuadrados, plantas, habitaciones o ba�os");
		}
		
		this.metrosCuadrados = metrosCuadrados;
		this.plantas = plantas;
		this.habitaciones = habitaciones;
		this.banios = banios;
		this.calidades = calidades;
		this.piscina = piscina;
		this.garage = garage;
	}
	
	/**
	 * Metodo para calcular el precio de la casa en funcion de sus caracteristicas
	 * 
	 * @return precio
	 */
	public float getPrecio() {
		
		float precio = 0;
		
		//Calculo de precio por m� segun calidad de construccion
		switch (calidades) {
		
		case CALIDAD_BAJA:
			precio = metrosCuadrados * PRECIO_CALIDAD_BAJA;
			break;
			
		case CALIDAD_MEDIA:
			precio = metrosCuadrados * PRECIO_CALIDAD_MEDIA;
			break;
			
		case CALIDAD_ALTA:
			precio = metrosCuadrados * PRECIO_CALIDAD_ALTA;
			break;
		}
		
		//Calculo del precio segun las plantas construidas
		precio = (precio + (precio * plantas * INCREMENTO_PRECIO_POR_PLANTA) / 100);
		
		//Calculo del precio por habitaciones
		precio = precio + (PRECIO_HABITACION * habitaciones);
		
		//Calculo del precio por banios
		precio = precio + (PRECIO_BANIO * banios);
		
		//En caso de tener piscina 
		if (piscina)
			precio = precio + PISCINA;
		
		//En caso de tener garage
		if (garage)
			precio = precio + GARAGE;
		
		return precio;
	}

}
