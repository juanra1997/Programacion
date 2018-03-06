package Herencias;

public class Turismo extends Vehiculo {//Utilitarios y/o familiares
	
	private double precioKm;
	private int kmInicio;
	private int kmFin;
	private int numTurismos=0;
	private int numAlquilados=0;

	public Turismo(String matricula, double precioKm, int kmInicio, int kmFin, boolean alquilado) {
		super(matricula, alquilado);
		this.precioKm=precioKm;
		this.kmInicio=kmInicio;
		this.kmFin=kmFin;
	}

	public double getPrecioKm() {
		return precioKm;
	}

	public void setPrecioKm(double precioKm) {
		this.precioKm=precioKm;
	}

	public int getKmInicio() {
		return kmInicio;
	}

	public void setKmInicio(int kmInicio) {
		this.kmInicio=kmInicio;
	}

	public int getKmFin() {
		return kmFin;
	}

	public void setKmFin(int kmFin) {
		this.kmFin=kmFin;
	}

	public int getNumTurismos() {
		return this.numTurismos;
	}

	public void setNumTurismos(int numTurismos) {
		this.numTurismos=numTurismos;
	}

	public int getNumAlquilados() {
		return this.numAlquilados;
	}

	public void setNumAlquilados(int numAlquilados) {
		this.numAlquilados=numAlquilados;
	}

	public static void alquilar() {
		
	}
	
	public static void devolver() {
		
	}
	
	public static void showInfo() {
		
	}	
}
