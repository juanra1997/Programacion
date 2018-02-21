package Ajedrez;

public class Posicion {
	private char columna;
	private int fila;
	
	public Posicion() { //Por defecto
		this.columna='e';
		this.fila=1;
	}
	
	public Posicion (char letra, int numero) { //Clase
		this.columna=letra;
		this.fila=numero;
	}
	
	public int getFila() { //Get
		return this.fila;
	}
	
	public void setFila(int numero) { //Set
		this.fila=numero;
	}
	
	public char getColumna() { //Get
		return this.columna;
	}
	
	public void setColumna(char letra) { //Set
		this.columna=letra;
	}
	
	public String toString() { //toString
		String mss;
		mss="Fila"+this.fila+". Columna"+this.columna;
		return mss;
	}
	
	public void mover(Direccion direccion) {
		if(direccion==Direccion.NORTE){
			this.fila=this.fila+1;
		}
		if(direccion==Direccion.NORESTE){
			this.fila=this.fila+1;
			//this.columna=this.columna+1;
		}
		if(direccion==Direccion.ESTE){
			this.fila=this.fila+1;
		}
		if(direccion==Direccion.SURESTE){
			this.fila=this.fila+1;
		}
		if(direccion==Direccion.SUR){
			this.fila=this.fila+1;
		}
		if(direccion==Direccion.SUROESTE){
			this.fila=this.fila+1;
		}
		if(direccion==Direccion.NORTE){
			this.fila=this.fila+1;
		}
	}

}
