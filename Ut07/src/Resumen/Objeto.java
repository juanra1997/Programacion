package Resumen;

import java.io.Serializable;

public class Objeto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String Nombre;
	private String Utilidad;
	
	public Objeto(String nombr, String uti) {
		this.Nombre=nombr;
		this.Utilidad=uti;
	}

	public Objeto() {
	}
	
	@Override
	public String toString() {
		return "Objeto [Nombre=" + Nombre + ", Utilidad=" + Utilidad + "]";
	}
	
	
}
