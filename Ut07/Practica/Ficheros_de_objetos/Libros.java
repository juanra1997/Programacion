package Ficheros_de_objetos;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Libros extends Publicaciones implements Serializable {

	private static final long serialVersionUID = 1L;
	private String isbn;
	private String autor;
	
	public Libros() {
		super();
		this.isbn = null;
		this.autor = null;
	}
	public Libros(String titulo, String editor, GregorianCalendar fecha, String isbn, String autor) {
		super(titulo, editor, fecha);
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		String msg  = super.toString() + " " + isbn + " " + autor;
		return msg;
	}
	
	
	
}
