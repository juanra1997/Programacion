package Ejercicio2;

public abstract class Animal {

	public int patas;
	
	public void patas(int patas) {
		this.patas=patas;
	}
	
	public String caminar() {
		return "Este animal se desplaza usando "+this.patas;
	}
	
	public void comer() {
	}
}
