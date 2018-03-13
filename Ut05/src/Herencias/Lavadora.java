package Herencias;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	public Lavadora() {
		super();
		this.carga=5;
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga=5;
	}
	
	public Lavadora(double precio, String color, char consumo, double peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga=carga;
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	
}
