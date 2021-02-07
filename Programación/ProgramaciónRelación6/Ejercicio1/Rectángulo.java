
package Ejercicio1;
	
public class Rectángulo {
	
	//Constantes
	public static final int ALTURA_MAXIMA = 20;
	public static final int ANCHO_MAXIMO = 20;
	public static final int ALTURA_POR_DEFECTO =1 ;
	public static final int ANCHO_POR_DEFECTO = 1;
	
	//Atributos
	private double ancho, altura;
	
	//Constructores
	public Rectángulo() {
		
		altura = ALTURA_POR_DEFECTO;
		ancho = ANCHO_POR_DEFECTO;
	}
	public Rectángulo(double ancho, double altura) throws RectánguloException {
		
		setAncho(ancho);
		setAltura(altura);
			
	}
	
	public double getAncho() {
		
		return ancho;
		
	}
	
	public double getAlto() {
		
		return altura;
		
	}
	
	public void setAncho(double anchoNuevo) throws RectánguloException {
		
		if(anchoNuevo > 0 && anchoNuevo < ANCHO_MAXIMO) {
			ancho = anchoNuevo;
		}
		else {
			throw new RectánguloException("Error " + ancho); //excepcion
		}
		
		
	}
	
	public void setAltura(double alturaNueva) throws RectánguloException {
		if(alturaNueva > 0 && alturaNueva < ALTURA_MAXIMA) {
			altura = alturaNueva;
		}
		else {
			throw new RectánguloException("Error " + altura); //excepcion
		}
		
		
	}
	
	public String toString() {
		
		String info;
		
		info = "Rectángulo con altura " + altura + " y con ancho " + ancho;
		
		return info;
		
	}
	
	public double perimetro() {
		
		double perimetro = (ancho + altura) * 2;
		
		return perimetro;
		
	}
	
	public double area() {
		
		double area = (ancho * altura);
		
		return area;
	}
	
}
