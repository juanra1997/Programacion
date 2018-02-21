package Empleado;

public class Empleado {

private String nombre;
private String apellido;
private int edad;
private double sueldo;

	public Empleado() {
	this.nombre=null;
	this.apellido=null;
	this.edad=0;
	this.sueldo=0;
	}

	public Empleado(String nombre, String apellido, int edad, double sueldo) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.sueldo=sueldo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	public String toString() {
		return "Nombre: "+this.nombre+"\nApellido: "+this.apellido+"\nEdad: "+this.edad+"\nSueldo: "+this.sueldo;
	}
}
