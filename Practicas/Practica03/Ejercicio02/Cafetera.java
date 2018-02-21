package Ejercicio02;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		this.capacidadMaxima=1000;
		this.cantidadActual=0;
	}
	
	public void CafeteraMaxima() {
		this.capacidadMaxima=1000;
		this.cantidadActual=1000;
	}
	
	public void LlenarCafetera(int cantidadActual) {
		if (cantidadActual>this.capacidadMaxima) {
			cantidadActual=this.capacidadMaxima;
		}
	}
	
	public int getCantidadActual() {
		return cantidadActual;
	}
	
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	
	public void setCantidadActual(int cantidad) {
		this.cantidadActual=cantidad;
	}
	
	public void setCapacidadMaxima(int capacidad) {
		this.capacidadMaxima=capacidad;
	}
	
	public void llenarCafetera() {
		this.cantidadActual=this.capacidadMaxima;
	}
	
	public void servirTaza(int cantidad) {
		if (this.cantidadActual<cantidad) {
			cantidad=this.cantidadActual;
		}
		if (cantidad==0) {
			System.out.println("La cafetera esta vacia");
		}
		else {
		this.cantidadActual=this.cantidadActual-cantidad;
		}
	}
	
	public void vaciarCafetera() {
		this.cantidadActual=0;
	}
	
	public void agregarCafe(int cantidad) {
		this.cantidadActual=this.cantidadActual+cantidad;
		if (this.cantidadActual>this.capacidadMaxima) {
			System.out.println("Se desborda");
			this.cantidadActual=this.cantidadActual-cantidad;
		}
	}
}
