package Ejercicio6;

public class Producto {

	String nombre;
	double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public String toString() {
		return "Nombre: "+this.nombre+"\nPrecio: "+this.precio;
	}
	
	public boolean equals() {
		return false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio=precio;
	}
}
