package Puntos;

public class TrianguloPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1=new Punto(2,3);
		Punto punto2=new Punto(4,5);
		Punto punto3=new Punto(6,7);
		Triangulo t1=new Triangulo(punto1, punto2, punto3);
		System.out.print(t1.toString());
	}

}
