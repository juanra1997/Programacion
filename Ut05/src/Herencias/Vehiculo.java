package Herencias;

public class Vehiculo {

	private String matricula;
	private boolean alquilado;
	
	public Vehiculo(String matricula, boolean alquilado) {
		this.matricula=matricula;
		this.alquilado=alquilado;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setAlquilado(boolean alquilado) {
		this.alquilado=alquilado;
	}
	
	public boolean getAlquilado() {
		return this.alquilado;
	}
	
	public static void alquilar() {
		
	}
	
	public static void devolver() {
		
	}
	
	public static void showInfo() {
		
	}
}
