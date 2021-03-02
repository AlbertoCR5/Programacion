package JuegoRol;

public enum TipoHechizo {

	SABOR_A_SUSPENSO(40), PRUEBA_CAJAS_BLANCAS(10), PRUEBA_CAJAS_NEGRAS(12), JUNIT(25), ARRAYS(17), CADENAS(16), STRING_BUILDER(14), TUNEL_DEL_VIENTO(50), COVID(75), BUSCAR_APARCAMIENTO(20) ;
	
	private static int danio;
	
	private TipoHechizo (int danio) {
		
		setDanio(danio);	
	}

	public static int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		TipoHechizo.danio = danio;
	}
}
