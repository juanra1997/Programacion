package Ejercicio29;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	String nombre;
	String apellidos;
	int telefono;
	String nif;
	
	public Persona() {
		
		this.nombre="VACIO";
		this.apellidos="VACIO";
		this.telefono=0;
		this.nif="VACIO";
	}
	
	public Persona(String nom, String apel, int tel, String nif) {
		
		this.nombre=nom;
		this.apellidos=apel;
		this.telefono=tel;
		this.nif=nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif=nif;
	}
}
