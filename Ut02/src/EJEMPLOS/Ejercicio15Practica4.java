package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio15Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double L1,L2,L3,sp,area;
		System.out.println("Introduce el primer lado");
		L1=teclado.nextInt();
		System.out.println("Introduce el segundo lado");
		L2=teclado.nextInt();
		System.out.println("Introduce el tercer lado");
		L3=teclado.nextInt();
		sp=(L1+L2+L3)/2;
		area=(Math.pow(sp*(sp-L1)*(sp-L2)*(sp-L3), (1/2)));
		System.out.println("El area del triangulo es: "+area);
		teclado.close();
	}

}
