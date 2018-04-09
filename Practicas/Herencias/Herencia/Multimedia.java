package Herencia;

public class Multimedia {

	private String titulo;
	private String autor;
	private FORMATO formato;
	private double duracion;
	//Constructor
	public Multimedia(String titulo, String autor, FORMATO formato, double duracion) {
		this.titulo=titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public FORMATO getFormato() {
		return formato;
	}
	
	public void setFormato(FORMATO formato) {
		this.formato=formato;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public void setDuracion(double duracion) {
		this.duracion=duracion;
	}
	
	public String toString() {
		return "Este objeto multimedia tiene las siguientes caracteristicas:\nTitulo: "+this.titulo+"\nAutor: "+this.autor+"\nFormato: "+this.formato+"\nDuracion "+this.duracion;
	}
	
	public boolean equals() {
		if(this.autor.equals(this.titulo)) {
			return true;
		} else {
			return false;
		}
	}
}
