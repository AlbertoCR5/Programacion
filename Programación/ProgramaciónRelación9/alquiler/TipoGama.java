package alquiler;

public enum TipoGama {
	
BAJA(Vehiculo.PRECIO_BAJA),
MEDIA(Vehiculo.PRECIO_MEDIA),
ALTA(Vehiculo.PRECIO_ALTA);

	private double precioBaseGama;
	
	private TipoGama(double precioBaseGama) {
		
		this.precioBaseGama = precioBaseGama;
	}
	
	public double getPrecioBaseGama() {
		
		return precioBaseGama;
	}
}
