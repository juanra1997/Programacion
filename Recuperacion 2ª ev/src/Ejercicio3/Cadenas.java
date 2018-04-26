package Ejercicio3;
import java.util.*;
public class Cadenas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena;
		int num, sum=0, posicion1=0, posicion2=0;
		boolean num1=false, num2=false, encontrado=false;
		System.out.println("Introduce la cadena");
		cadena=sc.nextLine();
		for( int i=0; i<cadena.length(); i++) {
			//System.out.println(cadena.charAt(i));
			if(encontrado==false&&(cadena.charAt(i)=='1'||cadena.charAt(i)=='2'||cadena.charAt(i)=='3'||cadena.charAt(i)=='4'||cadena.charAt(i)=='5'||cadena.charAt(i)=='6'||cadena.charAt(i)=='7'||cadena.charAt(i)=='8'||cadena.charAt(i)=='9'||cadena.charAt(i)=='0')) {
				posicion1=i;
				num1=true;
				encontrado=true;
				//System.out.println("Posicion1 "+posicion1);
			}
			if(cadena.charAt(i)==' '&&num1==true||i==cadena.length()-1) {
				if(i==cadena.length()-1) {
					posicion2=i+1;
				} else {
					posicion2=i;
				}
				num2=true;
				//System.out.println("Posicion2 "+posicion2);
			}
			if(num1==true&&num2==true) {
				num=Integer.parseInt(cadena.substring(posicion1, posicion2));
				sum=sum+num;
				//System.out.println(num);
				num1=false;
				num2=false;
				encontrado=false;
			}
			
		}
		sc.close();
		System.out.println("La suma de los numeros es "+sum);
	}

}
