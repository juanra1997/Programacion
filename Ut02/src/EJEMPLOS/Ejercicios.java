package EJEMPLOS;
import java.util.Scanner;
public class Ejercicios {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
int anno=2016;
System.out.print(anno);
System.out.println(anno%400==0||anno%4==0&&anno%100!=0? " Es bisiesto": anno+ " No es bisiesto");

final double pi=3.14159;
System.out.println("El resultado de pi^2 es: " +pi*pi);

int a=7;
int b=5;
int c=-2;
System.out.println(-b+(((b^2))-4*a*c)^(1/2)/(2*a));
int r=4;
int m=3;
int i=9;
int n=1;
System.out.println(r*(pi*(1+i/m*n)-1));

int num=6;
System.out.println(num%3==0&&num%5==0&&num%7!=0);

int num1,num2,suma,resta,multiplicar,dividir,resto;
num1=12;
num2=4;
suma=num1+num2;
resta=num1-num2;
multiplicar=num1*num2;
dividir=num1/num2;
resto=num1%num2;
System.out.println("La suma de "+num1+" y "+num2+" es igual a: "+suma);
System.out.println("La resta de "+num1+" y "+num2+" es igual a: "+resta);
System.out.println("La multiplicación de "+num1+" y "+num2+" es igual a: "+multiplicar);
System.out.println("La división de "+num1+" y "+num2+" es igual a "+dividir);
System.out.println("Y el resto es: "+resto);
teclado.close();


	}

}
