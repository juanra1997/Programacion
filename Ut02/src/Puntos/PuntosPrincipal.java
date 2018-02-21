package Puntos;
import java.util.Scanner;
public class PuntosPrincipal {
/*crear tres puntos
 * con C. por defecto: coordenada0
 * con C de clase: coordenada1
 * los valores x e y se leen desde teclado: coordenada3
 * Con C de copia
 * 
 * Cambiar los valores x e y de la coordenada1, valor anterior y valor nuevo
 * 
 * Calcular y escribir la distancia entre la coordenada0 y la coordenada1
 * 
 * Calcular punto medio entre coordenada1 y coordenada2
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x, y, a, b;
		//Introduccion y muestra de los puntos
		System.out.println("Introduce la coordenada X para el punto 2");
		x=teclado.nextInt();
		System.out.println("Introduce la coordenada Y para el punto 2");
		y=teclado.nextInt();
		Punto punto1=new Punto();
		System.out.println("punto1: "+punto1);
		Punto punto2=new Punto(x,y);
		System.out.println("punto2: "+punto2);
		Punto punto3=new Punto(punto2);
		System.out.println("punto3: "+punto3);
		//Cambio de valores del punto2
		System.out.println("Introduce las nuevas coordenadas para el punto 2");
		System.out.println("Antiguo punto2: "+punto2);
		System.out.println("Introduce la coordenada X para el punto 2");
		a=teclado.nextInt();
		System.out.println("Introduce la coordenada Y para el punto 2");
		b=teclado.nextInt();
		Punto nuevopunto2=new Punto(a, b);
		System.out.println("Nuevo punto2: "+nuevopunto2);
		//Distancia
		System.out.println("Distancia entre el punto 1 y punto 2: "+punto1.distancia(nuevopunto2));
		//Punto medio
		System.out.println("Punto medio entre punto2 y punto3: "+nuevopunto2.puntomedio(punto3));
		teclado.close();
	}

}
