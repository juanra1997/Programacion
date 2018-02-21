package Ejercicio05;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector=new Vector(3, 4, 6);
		Vector vector1=new Vector(4, 2, 7);
		vector.equal(vector1);
		vector.getCoordenadaX();
		vector.getCoordenadaY();
		vector.getCoordenadaZ();
		vector.setCoordenadaY(1);
		vector.setCoordenadaY(2);
		vector.setCoordenadaZ(3);
		vector.toString();
		vector.trasladar(2, 3, 54);
		vector.toString();
	}
}
