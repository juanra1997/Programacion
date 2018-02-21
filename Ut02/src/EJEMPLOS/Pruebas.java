package EJEMPLOS;
import java.util.Scanner;
public class Pruebas {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce un valor");
		num1=teclado.nextInt();
		System.out.println("Introduce otro valor");
		num2=teclado.nextInt();
		
		System.out.println("La suma de "+num1+" + "+num2+" es "+(num1+num2));
		
		int num3;
		System.out.println("Introducir numero");
		num3=teclado.nextInt();
		if (num3>0) {System.out.println("Es un numero positivo");}
		else if (num3<0) {System.out.println("Es un numero negativo");}
		else {System.out.println("Es cero");}
		
		double radio;
		System.out.println("Escribe el radio");
		radio=teclado.nextDouble();
		System.out.println("La superficie de la esfera es: "+(4/3*Math.PI*radio*Math.pow(radio,3)));
		
		int num4,num5,num6;
		System.out.println("Escribe el primer numero");
		num4=teclado.nextInt();
		System.out.println("Escribe el segundo numero");
		num5=teclado.nextInt();
		System.out.println("Escribe el tercer numero");
		num6=teclado.nextInt();
		System.out.println("La media es "+(num4+num5+num6)/3);
		
		int base,altura;
		System.out.println("Introduce la base");
		base=teclado.nextInt();
		System.out.println("Introduce la altura");
		altura=teclado.nextInt();
		System.out.println("El area es "+base*altura);
		//Exercise 9
		double sueldobase,venta1,venta2,venta3;
		System.out.println("Introducir sueldo base");
		sueldobase=teclado.nextDouble();
		System.out.println("Introducir venta1");
		venta1=teclado.nextDouble();
		System.out.println("Introducir venta2");
		venta2=teclado.nextDouble();
		System.out.println("Introducir venta3");
		venta3=teclado.nextDouble();
		System.out.println("El sueldo de este mes es: "+sueldobase+(venta1+venta2+venta3)*0.1);
		teclado.close();
		
	}
}
