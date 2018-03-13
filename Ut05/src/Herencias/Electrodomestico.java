package Herencias;

public class Electrodomestico {

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	public Electrodomestico() {
		this.precioBase=100;
		this.color="BLANCO";
		this.consumoEnergetico='F';
		this.peso=5;
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precioBase=precio;
		this.color="BLANCO";
		this.consumoEnergetico='F';
		this.peso=peso;
	}
	
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precioBase=precio;
		this.color=color;
		this.consumoEnergetico=consumo;
		this.peso=peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase=precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color=color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico=consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public boolean comprobarConsumoEnergetico(char consumo) {
		if(Character.toUpperCase(consumo)=='A'||Character.toUpperCase(consumo)=='B'||Character.toUpperCase(consumo)=='C'||Character.toUpperCase(consumo)=='D'||Character.toUpperCase(consumo)=='E'||Character.toUpperCase(consumo)=='F') {
			return true;
		} else {
			return false;
		}
	}
	
	
}
