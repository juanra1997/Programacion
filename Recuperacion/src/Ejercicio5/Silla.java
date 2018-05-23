package Ejercicio5;

import java.io.*;

public class Silla extends Mueble implements Numerable, Serializable {

	private static final long serialVersionUID = 1L;

	private int numero;
	
	public Silla(String nombre) {
		super(nombre);
	}

	public Silla(String nombre, int numero) {
		super(nombre);
		this.numero=numero;
	}
	
	@Override
	public int establecerNumero(int numero) {
		this.numero=numero;
		return this.numero;
	}

	@Override
	public int devolverNumero() {
		return this.numero;
	}

	@Override
	public void incrementarNumero() {
		this.numero++;
	}

}
