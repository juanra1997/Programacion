package Ejercicio01;

public class Prueba0 {

	public static void main(String[] args) {
		Rectangulo rectangulo=new Rectangulo();
		System.out.println(rectangulo);
		rectangulo.toString();
		rectangulo.area();
		rectangulo.perimetro();
		Punto punto=new Punto(0, 0);
		rectangulo.mover(punto);
		
	}

}
