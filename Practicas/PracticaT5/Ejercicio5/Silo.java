package Ejercicio5;

import java.util.*;

public class Silo {

	Scanner sc=new Scanner(System.in);
	private final double MAX_NIVEL;
	private double nivel;
	
	public Silo() {
		this.MAX_NIVEL=100;
		this.nivel=0;
	}
	
	public Silo(double Max_nivel, double nivel) {
		this.MAX_NIVEL=Max_nivel;
		this.nivel=nivel;
	}
	
	public String estadoSilo() {
		return "El nivel maximo del silo es "+MAX_NIVEL+" y el nivel que alcanza es "+nivel;
	}

	public double getNivel() {
		return nivel;
	}

	public void setNivel(double nivel) {
		this.nivel=nivel;
	}

	public double getMAX_NIVEL() {
		return MAX_NIVEL;
	}
	
	public void llenaSilo(double cantidad) {
		if(cantidad>0) {
			this.nivel=this.nivel+cantidad;
			if(this.nivel>this.MAX_NIVEL) {
				System.out.println("El nivel ha excedido el nivel maximo del silo, por lo tanto vuelve a su estado anterior");
				this.nivel=this.nivel-cantidad;
			}
		} else {
			System.out.println("Numero no valido");
		}
	}

	
	public void vaciaSilo(double cantidad) {
		if(cantidad>0) {
			this.nivel=this.nivel-cantidad;
			if(this.nivel<0) {
				System.out.println("El nivel ha descendido a menor de 0, por lo tanto vuelve a su estado anterior");
				this.nivel=this.nivel+cantidad;
			}
		} else {
			System.out.println("Numero no valido");
		}
	}
}