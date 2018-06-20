package Ejercicio2;

import java.io.Serializable;

public class Inversor implements Serializable {

	private static final long serialVersionUID = 1L;
	public String DNI;
	public String nombre;
	public double capital;
	
	public Inversor(String dc, String nom, double cp) {
		this.DNI=dc;
		this.nombre=nom;
		this.capital=cp;
	}
	
	public Inversor() {
		this.DNI=null;
		this.nombre=null;
		this.capital=0;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getCapital() {
		return this.capital;
	}
	
	public String toString() {
		return "DNI "+this.DNI+"\nNombre "+this.nombre+"\nCapital "+this.capital;
	}
}
