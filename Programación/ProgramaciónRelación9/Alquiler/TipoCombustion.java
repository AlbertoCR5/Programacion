package Alquiler;

public enum TipoCombustion {
	
GASOLINA(Turismo.PRECIO_GASOLINA),
DIESEL(Turismo.PRECIO_DIESEL);
	
	private double incrementoCombustion;
	
	private TipoCombustion(double incrementoCombustion) {
		
		this.incrementoCombustion = incrementoCombustion;
	}
	
	public double getIncrementoCombustion() {
		
		return incrementoCombustion;
	}
}
