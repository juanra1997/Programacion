import java.io.Serializable;

public class Objeto2 implements Serializable{
	private static final long serialVersionUID = 1L;
	private String Nombre; //22bytes
	private String Utilidad; //62bytes
	private static int tamano=84; //84bytes;
	
	public Objeto2(String nombr, String uti) {
		this.Nombre=nombr;
		this.Utilidad=uti;
	}

	public Objeto2() {
	}
	
	@Override
	public String toString() {
		return "********************\nNombre: " + Nombre + "\nUtilidad: " + Utilidad + "\n********************";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUtilidad() {
		return Utilidad;
	}

	public void setUtilidad(String utilidad) {
		Utilidad = utilidad;
	}

	public static int getTamano() {
		return tamano;
	}

	public static void setTamano(int tamano) {
		Objeto2.tamano = tamano;
	}
	
}
