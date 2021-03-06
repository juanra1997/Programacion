package Herencias;

public class Camion extends Vehiculo {
	
	private double precioPorDia;
	private static int numCamiones=0;
	private static int numCAlquilados=0;
	
	public Camion(String matricula, boolean alquilado, double precioPorDia, Fecha fechaAlquiler, Fecha fechaDevolucion) {
		super(matricula);
		this.precioPorDia=precioPorDia;
	}
	
	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia=precioPorDia;
	}
	
	public Fecha getFechaAlquiler() {
		return this.getFechaAlquiler();
	}
	
	public void setFechaAlquiler(Fecha fechaAlquiler) {
		this.setFechaAlquiler(fechaAlquiler);
	}
	
	public Fecha getFechaDevoucion() {
		return this.getFechaDevoucion();
	}
	
	public static int getNumCamiones() {
		return numCamiones;
	}

	public static void setNumCamiones(int numCamiones0) {
		numCamiones=numCamiones0;
	}

	public static int getNumCAlquilados() {
		return numCAlquilados;
	}

	public static void setNumCAlquilados(int numCAlquilados0) {
		numCAlquilados=numCAlquilados0;
	}

	public void setFechaDevolucion(Fecha fechaDevolucion) {
		this.setFechaDevolucion(fechaDevolucion);
	}
	
	public void alquilar() {
		
	}
	
	public void devolver() {
		
	}
	
	public void showInfo() {
		
	}
		
}
