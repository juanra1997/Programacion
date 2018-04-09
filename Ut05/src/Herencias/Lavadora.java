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
	
	public double precioFinal() {
		double precio=this.getPrecioBase();
		if(this.getConsumoEnergetico()=='A') {
			precio+=100;
		} else if(this.getConsumoEnergetico()=='B') {
			precio+=80;
		} else if(this.getConsumoEnergetico()=='C') {
			precio+=60;
		} else if(this.getConsumoEnergetico()=='D') {
			precio+=50;
		} else if(this.getConsumoEnergetico()=='E') {
			precio+=30;
		} else if(this.getConsumoEnergetico()=='F') {
			precio+=10;
		}
		if(this.getPeso()<20) {
			precio+=10;
		} else if(this.getPeso()>=20&&this.getPeso()<50) {
			precio+=50;
		} else if(this.getPeso()>=50&&this.getPeso()<80) {
			precio+=80;
		} else if(this.getPeso()>=80) {
			precio+=100;
		}
		if(this.carga>30) {
			precio+=50;
		}
		return precio;
	}
}
