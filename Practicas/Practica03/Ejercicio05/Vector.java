package Ejercicio05;

public class Vector {
	private int x;
	private int y;
	private int z;

	public Vector() {
		this.x=0;
		this.x=0;
		this.x=0;
	}
	
	public Vector(int x, int y, int z) {
		this.x=x; 
		this.y=y;
		this.z=z;
	}

	public Vector(Vector v) {
		this.x=v.x;
		this.y=v.y;
		this.z=v.z;
	}
	
	public int getCoordenadaX() {
		return x;
	}

	public void setCoordenadaX(int x) {
		this.x=x;
	}

	public int getCoordenadaY() {
		return y;
	}

	public void setCoordenadaY(int y) {
		this.y=y;
	}

	public int getCoordenadaZ() {
		return z;
	}

	public void setCoordenadaZ(int z) {
		this.z=z;
	}
	
	public String toString() {
		String mss;
		mss="(" + x + ", " + y + ", " + z + ")";
		return mss;
	}
	
	public boolean equal(Vector v) {
		boolean iguales=false;
		if (this.x==v.x&&this.y==v.y&&this.z==v.z) {
			iguales=true;
			System.out.println("Son iguales");
		} else System.out.println("No son iguales");
		return iguales;
	}
							
	public Vector trasladar(int moverX, int moverY, int moverZ) {
		Vector vector=new Vector();
		this.setCoordenadaX(this.x + moverX); 
		this.setCoordenadaY(this.y + moverY); 
		this.setCoordenadaZ(this.z + moverZ);
		return vector;
	}
}