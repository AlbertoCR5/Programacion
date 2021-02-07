
package Ejercicio1;
	
public class Rect�ngulo {
	
	//Constantes
	public static final int ALTURA_MAXIMA = 20;
	public static final int ANCHO_MAXIMO = 20;
	public static final int ALTURA_POR_DEFECTO =1 ;
	public static final int ANCHO_POR_DEFECTO = 1;
	
	//Atributos
	private double ancho, altura;
	
	//Constructores
	public Rect�ngulo() {
		
		altura = ALTURA_POR_DEFECTO;
		ancho = ANCHO_POR_DEFECTO;
	}
	public Rect�ngulo(double ancho, double altura) throws Rect�nguloException {
		
		setAncho(ancho);
		setAltura(altura);
			
	}
	
	public double getAncho() {
		
		return ancho;
		
	}
	
	public double getAlto() {
		
		return altura;
		
	}
	
	public void setAncho(double anchoNuevo) throws Rect�nguloException {
		
		if(anchoNuevo > 0 && anchoNuevo < ANCHO_MAXIMO) {
			ancho = anchoNuevo;
		}
		else {
			throw new Rect�nguloException("Error " + ancho); //excepcion
		}
		
		
	}
	
	public void setAltura(double alturaNueva) throws Rect�nguloException {
		if(alturaNueva > 0 && alturaNueva < ALTURA_MAXIMA) {
			altura = alturaNueva;
		}
		else {
			throw new Rect�nguloException("Error " + altura); //excepcion
		}
		
		
	}
	
	public String toString() {
		
		String info;
		
		info = "Rect�ngulo con altura " + altura + " y con ancho " + ancho;
		
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
