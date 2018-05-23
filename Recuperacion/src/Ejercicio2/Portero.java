package Ejercicio2;

public class Portero extends Jugador{
	
	private int golesRecibidos;
	private int penaltisParados;
	
	public Portero(String n, String d, int p, int g, int a, int r, int gr, int pp) {
		
		super(n, d, p, g, a, r);
		golesRecibidos=gr;
		penaltisParados=pp;
	}
	
	public Portero() {
		this("sin nombre", "sin demarcacion", 0, 0, 0, 0, 0, 0);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Goles recibidos: "+golesRecibidos);
		System.out.println("Penaltis Parados: "+penaltisParados);
	}
}
