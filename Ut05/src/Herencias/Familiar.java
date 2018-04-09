package Herencias;

public class Familiar extends Turismo {

	private final static String TIPO="Familiar";
	
	public Familiar(String matricula, double precioKm, int kmInicio, int kmFin) {
		super(matricula, precioKm, kmInicio, kmFin);
	}
	
	public static String getTipo() {
		return TIPO;
	}
	
	public void alquilar(int precio) {
		
	}
	
	public double devolver(int dias) {
		return dias*getPrecioKm();
	}
	
	public void showInfo(){
		
	}
}
