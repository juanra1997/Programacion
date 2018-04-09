package Herencias;

public class Television extends Electrodomestico {

	private int pulgadas;
	private boolean sintonizadorTDT;
	
	public Television() {
		this.pulgadas=20;
		this.sintonizadorTDT=false;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		this.pulgadas=20;
		this.sintonizadorTDT=false;
	}
	
	public Television(double precio, String color, char consumo, double peso, int pulgadas, boolean sintonizadorTDT) {
		super(precio, color, consumo, peso);
		this.pulgadas=pulgadas;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	public int getPulgadas() {
		return this.pulgadas;
	}
	
	public boolean getSintonizadorTDT() {
		return this.sintonizadorTDT;
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
		if(this.pulgadas>=40) {
			precio=precio*0.3+precio;
		}
		if(this.sintonizadorTDT==true) {
			precio+=50;
		}
		return precio;
	}
}
