package JuegoRol;

public class PruebaMainJuegoRol {


	@SuppressWarnings("null")
	public static void main(String[] args) {

		Mago magoA = null;
		Mago magoB = null;
		Clerigo clerigo = null;
		Hechizo hechizo[] = null;
		
		
		try {
			magoA = new Mago("Atila", TipoRaza.ELFO, 15, 17, 100);
			magoB = new Mago("Genghis Khan", TipoRaza.ENANO, 15, 17, 100);
			clerigo = new Clerigo("Benedicto XVI", TipoRaza.ELFO, 18, 15, 100, "Baco");
			
			System.out.println(magoA);
			System.out.println(magoB);
			System.out.println(clerigo);
			
			magoA.setHechizo(TipoHechizo.SABOR_A_SUSPENSO);
			hechizo[0].aprenderHechizo(magoA);
			magoA.setHechizo(TipoHechizo.JUNIT);
			hechizo[1].aprenderHechizo(magoA);
			magoB.setHechizo(TipoHechizo.PRUEBA_CAJAS_BLANCAS);		
			hechizo[0].aprenderHechizo(magoB);
			
			System.out.println(magoA);
			System.out.println(magoB);
			
//			magoA.getHechizo();
//			hechizo[0].lanzarHechizo();
			
		} catch (PersonajeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}

}
