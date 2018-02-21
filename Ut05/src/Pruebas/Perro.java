package Pruebas;

public class Perro implements Animal {
	
	public void desplazamiento() {
		System.out.println("Anda");
	}
	
	public String sonido() {
		return "Ladra";
	}
	
	public String comida() {
		return "Pienso";
	}
}