package Ejercicios;

import java.io.Serializable;

public class Notas implements Serializable{

	private static final long serialVersionUID = 1L;
	String nombre;
	double nota1, nota2, nota3;
	
	public Notas() {
		
		this.nombre=null;
		this.nota1=0;
		this.nota2=0;
		this.nota3=0;
	}
	
	public Notas(String nom, double note1, double note2, double note3) {
	
		this.nombre=nom;
		this.nota1=note1;
		this.nota2=note2;
		this.nota3=note3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public String toString() {
		return "Alumno: "+this.nombre+"\nNota1: "+this.nota1+"\nNota2: "+this.nota2+"\nNota3: "+this.nota3;
	}
}
