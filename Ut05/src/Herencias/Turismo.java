package Herencias;

public class Turismo extends Vehiculo {//Utilitarios y/o familiares
	
	private double precioKm;
	private int kmInicio;
	private int kmFin;
	private static int numTurismos=0;
	private static int numAlquilados=0;

	public Turismo(String matricula, double precioKm, int kmInicio, int kmFin) {
		super(matricula);
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

	public static int getNumTurismos() {
		return numTurismos;
	}

	public static void setNumTurismos(int numTurismos0) {
		numTurismos=numTurismos0;
	}

	public static int getNumAlquilados() {
		return numAlquilados;
	}

	public static void setNumAlquilados(int numAlquilados0) {
		numAlquilados=numAlquilados0;
	}

	public void alquilar() {
		
	}
	
	public void devolver() {
		
	}
	
	public void showInfo() {
		
	}
	
}
