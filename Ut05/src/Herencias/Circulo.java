package Herencias;

public class Circulo extends ObjGeometrico{
	
	private double x1;
	private double y1;
	
	public Circulo(double px, double py, double x1, double y1) {
		super(px,py);
		this.x1=x1;
		this.y1=y1;
	}
	
	public void setX1(double x1) {
		this.x1=x1;
	}
	
	public void setY1(double y1) {
		this.y1=y1;
	}
	
	public double getX1() {
		return this.x1;
	}
	
	public double getY1() {
		return this.y1;
	}
	
	public double area() {
		return Math.pow(Math.pow(Math.pow((this.x1-this.px), 2)+Math.pow((this.y1-this.py), 2), 0.5),2)*3.14159;
	}
	
	public void imprimirDatos() {
		super.imprimirCentro();
		System.out.println("La esquina está en: "+x1+","+y1+"\nSu area es: "+area());
	}

}
