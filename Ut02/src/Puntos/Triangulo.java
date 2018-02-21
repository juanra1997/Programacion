package Puntos;
/**
 * 
 * @author Juanra
 *
 */
public class Triangulo {
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	/**
	 * Constructor por defecto que generea el punto (0,0)
	 */
	public Triangulo() { //Por defecto
		Punto punto1=new Punto();
		Punto punto2=new Punto(0,6);
		Punto punto3=new Punto(3,3);
		this.vertice1=punto1;
		this.vertice2=punto2;
		this.vertice3=punto3;
	}
	/**
	 * Constructor de clase
	 * @param coordenadaX2 entero
	 * @param coordenadaY2 entero
	 */
	public Triangulo(Punto lado1, Punto lado2, Punto lado3) { //Clase
		this.vertice1=lado1;
		this.vertice2=lado2;
		this.vertice3=lado3;
	}
	/**
	 * Constructor de copia
	 * @param p objeto de la clase punto
	 */
	public Triangulo(Triangulo t) { //Copia
		this.vertice1=t.vertice1;
		this.vertice2=t.vertice2;
		this.vertice3=t.vertice3;
	}
	
	public String toString() {
		String mss="Triangulo: vertice1="+vertice1.toString()+" vertice2="+vertice2.toString()+" vertice3="+vertice3.toString();
		return mss;
	}
	
	public Punto getvertice1() { //get
		return vertice1;
	}
	
	public Punto getvertice2() { //get
		return vertice2;
	}
	
	public Punto getvertice3() { //get
		return vertice3;
	}
	
	public void setvertice1(Punto vertice1) { //set
		this.vertice1=vertice1;
	}
	
	public void setvertice2(Punto vertice2) { //set
		this.vertice1=vertice2;
	}
	
	public void setvertice3(Punto vertice3) { //set
		this.vertice3=vertice3;
	}
	public double perimetro() {
		double perimetro;
		perimetro=(vertice1.distancia(vertice2))+(vertice2.distancia(vertice3))+(vertice3.distancia(vertice1));
		return perimetro;
	}
	public double area() {
		double s, area, casiarea;
		s=(vertice1.distancia(vertice2))+(vertice2.distancia(vertice3))+(vertice3.distancia(vertice1))/2;
		casiarea=s*(s-vertice1.distancia(vertice2))*(s-(vertice2.distancia(vertice3)))*(s-(vertice3.distancia(vertice1)));
		area=(double)Math.pow(casiarea, 0.5);
		return area;
	}
}