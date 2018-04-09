package Ejercicio01;

public class Multimedia {

	private String titulo;
	private String autor;
	private String formato;
	private int duracion;
	//Constructor
	public Multimedia(String titulo, String autor, String formato, int duracion) {
		formato=formato.toUpperCase();
		this.titulo=titulo;
		this.autor=autor;
		this.formato=formato;
		this.duracion=duracion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	/*public void setTitulo(String titulo) {
		this.titulo=titulo;
	}*/
	
	public String getAutor() {
		return autor;
	}
	
	/*public void setAutor(String autor) {
		this.autor=autor;
	}*/
	
	public String getFormato() {
		return formato;
	}
	
	/*public void setFormato(String formato) {
		this.formato=formato;
	}*/
	
	public double getDuracion() {
		return duracion;
	}
	
	/*public void setDuracion(double duracion) {
		this.duracion=duracion;
	}*/
	
	public String toString() {
		return "Este objeto multimedia tiene las siguientes caracteristicas:\nTitulo: "+this.titulo+"\nAutor: "+this.autor+"\nFormato: "+this.formato+"\nDuracion "+this.duracion+" minutos";
	}
	
	public boolean equals() {
		if(this.autor.equals(this.titulo)) {
			return true;
		} else {
			return false;
		}
	}
}
