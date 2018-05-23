package Ejercicio7;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private String NIF;
	private String Nombre;
	private char Sexo;
	private String Telefono;
	private String Direccion;
	private double deuda;
	
	public Cliente() {
		this.NIF=null;
		this.Nombre=null;
		this.Sexo=' ';
		this.Telefono=null;
		this.Direccion=null;
		this.deuda=0;
	}
	
	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cliente(String ni, String nom, char sex, String tel, String dir, double deuda) {
		this.NIF=ni;
		this.Nombre=nom;
		this.Sexo=sex;
		this.Telefono=tel;
		this.Direccion=dir;
		this.deuda=deuda;
	}
	public String toString() {
		return "NIF: "+this.NIF+"\nNombre: "+this.Nombre+"\nSexo: "+this.Sexo+"\nTelefono: "+this.Telefono+"\nDireccion: "+this.Direccion+"\nDeuda:"+this.deuda;
	}
	
	public void borrar() {
		this.NIF=null;
		this.Nombre=null;
		this.Sexo=' ';
		this.Telefono=null;
		this.Direccion=null;
		this.deuda=0;
	}
}
