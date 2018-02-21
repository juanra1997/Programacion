package Ajedrez;

public class Rey {
	private Color color;
	private Posicion posicion;
	
	public Rey() {
		Posicion posicionDefecto=new Posicion('e', 1);
		this.color=Color.BLANCO;
		this.posicion=posicionDefecto;
	}
	
	public Rey(Color color) {
		this.color=color;
		if(color==Color.BLANCO) {
			this.posicion=new Posicion ('e', 1);
		}
		else {
			this.posicion=new Posicion('e', 8);
		}
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Posicion getPosicion() {
		return this.posicion;
	}
	
	public void mueve(Direccion direccion) {
		this.posicion.mover(direccion);
	}
	
	public String toString() {
		String mss;
		mss="Rey "+color+" esta situado en "+posicion;
		return mss;
	}

}
