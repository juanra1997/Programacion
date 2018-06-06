package Ficheros_Binarios;

import java.io.Serializable;

public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;

	String nombre;
	String direccion;
	int edad;
	double nota;
	
	public Alumno() {
		this.nombre="VACIO";
		this.direccion="VACIO";
		this.edad=0;
		this.nota=0;
	}
	
	public Alumno(String nom, String dir, int edad, double nota) {
		this.nombre=nom;
		this.direccion=dir;
		this.edad=edad;
		this.nota=nota;
	}
	
	public String toString() {
		return "Nombre: "+this.nombre+"\nDireccion: "+this.direccion+"\nEdad: "+this.edad+"\nNota media: "+this.nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
