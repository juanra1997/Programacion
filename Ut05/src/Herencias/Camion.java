package Herencias;

public class Camion extends Vehiculo {
	
	private double precioPorDia;
	private int numCamiones=0;
	private int numCAlquilados=0;
	
	public Camion(String matricula, boolean alquilado, double precioPorDia, Fecha fechaAlquiler, Fecha fechaDevolucion) {
		super(matricula, alquilado);
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
	
	public int getNumCamiones() {
		return numCamiones;
	}

	public void setNumCamiones(int numCamiones) {
		this.numCamiones=numCamiones;
	}

	public int getNumCAlquilados() {
		return numCAlquilados;
	}

	public void setNumCAlquilados(int numCAlquilados) {
		this.numCAlquilados=numCAlquilados;
	}

	public void setFechaDevolucion(Fecha fechaDevolucion) {
		this.setFechaDevolucion(fechaDevolucion);
	}
	
	public static void alquilar() {
		
	}
	
	public static void devolver() {
		
	}
	
	public static void showInfo() {
		
	}

}
