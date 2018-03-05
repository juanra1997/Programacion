package Herencias;

public class ObjGeometrico {

	protected double px;
	protected double py;
	
	public ObjGeometrico(double x, double y) {
		this.px=x;
		this.py=y;
	}
	
	public ObjGeometrico() {
		this.px=this.py=0;
	}
	
	public void imprimirCentro() {
		System.out.println("El punto centro es: "+px+","+py);
	}
	
	public void setX(double px) {
		this.px=px;
	}
	
	public void setY(double py) {
		this.py=py;
	}
	
	public double getX() {
		return this.px;
	}
	
	public double getY() {
		return this.py;
	}
}
