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
		color=color.toUpperCase();
		consumo=Character.toUpperCase(consumo);
		this.precioBase=precio;
		if(Electrodomestico.comprobarColor(color)==true) {
			this.color=color;
		} else {
			this.color="BLANCO";
		}
		if(Electrodomestico.comprobarConsumoEnergetico(consumo)==true) {
			this.consumoEnergetico=consumo;
		}
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
	
	public static boolean comprobarConsumoEnergetico(char consumo) {
		consumo=Character.toUpperCase(consumo);
		if(consumo=='A'||consumo=='B'||consumo=='C'||consumo=='D'||consumo=='E'||consumo=='F') {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean comprobarColor(String color) {
		color=color.toUpperCase();
		if(color.equals("BLANCO")||color.equals("NEGRO")||color.equals("AZUL")||color.equals("ROJO")||color.equals("GRIS")) {
			return true;
		} else {
			return false;
		}
	}
	
	public double precioFinal() {
		double precio=this.precioBase;
		//System.out.println(precio);
		if(this.consumoEnergetico=='A') {
			precio+=100;
		} else if(this.consumoEnergetico=='B') {
			precio+=80;
		} else if(this.consumoEnergetico=='C') {
			precio+=60;
		} else if(this.consumoEnergetico=='D') {
			precio+=50;
		} else if(this.consumoEnergetico=='E') {
			precio+=30;
		} else if(this.consumoEnergetico=='F') {
			precio+=10;
		}
		if(this.peso<20) {
			precio+=10;
		} else if(this.peso>=20&&this.peso<50) {
			precio+=50;
		} else if(this.peso>=50&&this.peso<80) {
			precio+=80;
		} else if(this.peso>=80) {
			precio+=100;
		}
		//System.out.println(precio);
		return precio;
	}
}
