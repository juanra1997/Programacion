package Ejercicio01;

public class Rectangulo {
	private Punto puntoInfIzq;
	private Punto puntoInfDer;
	private Punto puntoSupIzq;
	private Punto puntoSupDer;
	private double base;
	private double altura;
	
	//Por defectos
	public Rectangulo() {
		Punto puntoInfIzq=new Punto(0, 0);
		Punto puntoInfDer=new Punto(0, 0);
		Punto puntoSupIzq=new Punto(0, 0);
		Punto puntoSupDer=new Punto(0, 0);
		this.base=puntoInfIzq.distancia(puntoInfDer);
		this.altura=(puntoInfIzq.distancia(puntoSupIzq)+puntoInfDer.distancia(puntoSupDer))/2;
	}
	
	public Rectangulo(Punto puntoInfIzq, Punto puntoInfDer, Punto puntoSupIzq, Punto puntoSupDer) {
		this.puntoInfIzq=puntoInfIzq;
		this.puntoInfDer=puntoInfDer;
		this.puntoSupIzq=puntoSupIzq;
		this.puntoSupDer=puntoSupDer;
		this.base=puntoInfIzq.distancia(puntoInfDer);
		this.altura=puntoInfIzq.distancia(puntoSupIzq);
	}
	
	public Rectangulo(double base, double altura) {
		puntoInfIzq.setcoordenadaX(0);
		puntoInfIzq.setcoordenadaY(0);
		this.base=base;
		this.altura=altura;
		puntoInfDer.setcoordenadaX((int)base);
		puntoSupIzq.setcoordenadaY((int)altura);
		puntoSupDer.setcoordenadaX((int)base); puntoSupDer.setcoordenadaY((int)altura);
	}
	
		public String toString() {
			String mss;
			mss="El rectangulo tiene los vértices: " + puntoInfIzq + ", " + puntoInfDer + ", " + puntoSupIzq + ", " + puntoSupDer + 
			", la base: " + base + " y la altura: " + altura;
			return mss;
		}
	
		public double area() {
			double result=this.base*this.altura;
			return result;
		}
		
		public double perimetro() {
			double perimetro=this.base*2+this.altura*2;
			return perimetro;
		}
		
		public Rectangulo  mover(Punto destino) {
			this.puntoInfIzq=destino;
			puntoInfDer.setcoordenadaX((int)puntoInfIzq.getcoordenadaX()+(int)base);
			puntoInfDer.setcoordenadaY((int)puntoInfIzq.getcoordenadaY());
			puntoSupIzq.setcoordenadaX((int)puntoInfIzq.getcoordenadaX());
			puntoSupIzq.setcoordenadaY((int)puntoInfIzq.getcoordenadaY() + (int)altura);
			puntoSupDer.setcoordenadaX((int)puntoInfDer.getcoordenadaX());
			puntoSupDer.setcoordenadaY((int)puntoInfDer.getcoordenadaY() + (int)altura);
			Rectangulo rectangulo=new Rectangulo(puntoInfIzq, puntoInfDer, puntoSupIzq, puntoSupDer);
			return rectangulo;
		}
		
		
}

