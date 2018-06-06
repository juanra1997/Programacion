package Ficheros_de_objetos;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Revistas extends Publicaciones implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numeorsPorAnyo;
	private long circulacion;
	

	public Revistas() {
		super();
		this.numeorsPorAnyo = 0;
		this.circulacion = 0;
	}

	public Revistas(String titulo, String editor, GregorianCalendar fecha, int numeorsPorAnyo, long circulacion) {
		super(titulo, editor, fecha);
		this.numeorsPorAnyo = numeorsPorAnyo;
		this.circulacion = circulacion;
	}

	
	public int getNumeorsPorAnyo() {
		return numeorsPorAnyo;
	}

	public void setNumeorsPorAnyo(int numeorsPorAnyo) {
		this.numeorsPorAnyo = numeorsPorAnyo;
	}

	public long getCirculacion() {
		return circulacion;
	}

	public void setCirculacion(long circulacion) {
		this.circulacion = circulacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	 @Override
	public String toString() {
		 String msg = super.toString() + " " + this.numeorsPorAnyo + " " + this.circulacion;
		 return msg;
	}
	
	
	
}
