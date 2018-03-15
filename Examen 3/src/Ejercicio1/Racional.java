package Ejercicio1;

public class Racional implements Operable{

	private int numerador;	//Atributos de tipo entero
	private int denominador;
	
	public Racional() {	//Constructor por defecto
		this.numerador=1;
		this.denominador=1;
	}
	
	public Racional(int numerador) {//Constructor parametrizado en el que solo se indica el numerador
		this.numerador=numerador;
	}
	
	public Racional(int numerador, int denominador) {//Constructor parametrizado en el que se indican tanto el numerador como el denominador
		this.numerador=numerador;
		this.denominador=denominador;
	}

	public int getNumerador() {	//getters and setters
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador=numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador=denominador;
	}
	
	public String toString() { //toString
		return this.numerador+"/"+denominador;
	}
	
	public void invertir() {	//Método que invierte una fracción
		int x=this.denominador;
		this.denominador=this.numerador;
		this.numerador=x;
	}

	@Override
	public double suma() {
		return this.numerador+this.denominador;
	}

	@Override
	public double resta() {
		if(this.numerador>this.denominador) {
			return this.numerador-this.denominador;
		} else {
			return this.denominador-this.numerador;
		}
	}

	@Override
	public double multiplica() {
		return this.numerador*this.denominador*Operable.constante;
	}

	@Override
	public double resto() {
		return this.numerador/this.denominador;
	}
	
}
