package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo21_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num;
		System.out.println("Introduce un numero positivo");
		num1=teclado.nextInt();
		while(num1<0) {
			System.out.println("Numero no valido");
			System.out.println("Introduce un numero valido");
			num1=teclado.nextInt();
		}
		System.out.println("Introduce otro numero positivo");
		num2=teclado.nextInt();
		while(num2<0) {
			System.out.println("Numero no valido");
			System.out.println("Introduce un numero valido");
			num2=teclado.nextInt();
		}
		if(num1>num2) {
			num=num1;
			num1=num2;
			num2=num;
		}
		System.out.println("Estos son los numeros primos que hay entre "+num1+" y "+num2+":");
		do {
			if(num1!=1&&num1%2!=0&&num1%3!=0&&num1%5!=0&&num1%7!=0) {
				System.out.println(num1);
			}
			if(num1==2) {
				System.out.println("2");
			}
			if(num1==3) {
				System.out.println("3");
			}
			if(num1==5) {
				System.out.println("5");
			}
			if(num1==7) {
				System.out.println("7");
			}
			num1++;
		}
		while(num1<=num2);
		teclado.close();
	}

}
