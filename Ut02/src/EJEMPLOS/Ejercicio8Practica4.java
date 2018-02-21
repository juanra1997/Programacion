package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio8Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double x, y;
		System.out.println("Introduce un valor de x para calcular y en y=6x2+8x-17");
		x=teclado.nextDouble();
		y=6*Math.pow(x, 2)+8*x-17;
		System.out.println("El valor de y en y=6x2+8x-17 es: "+y);
		teclado.close();
	}

}
