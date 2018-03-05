package Herencias;

public class Cuadrado extends ObjGeometrico {

	private double x1;
	private double y1;
	
	public Cuadrado(double px, double py, double x1, double y1) {
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
		return 2*(px-x1)*(py-y1);
	}
	
	public void imprimirDatos() {
		super.imprimirCentro();
		System.out.println("La esquina está en: "+x1+","+y1+"\nSu area es: "+area());
	}
}
