package Ejercicio05;

import java.util.Scanner;

public class Prueba00 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num;
		//int cont=0, numConvert=0;
		//BINARIO
		/*System.out.println("Introduce un numero en binario");
		num=sc.next();
		for(int i=num.length()-1; i>=0; i--) {
			if(num.charAt(i)=='1') {
				numConvert=numConvert+(int)Math.pow(2, cont);
			}
			cont++;
		}
		System.out.println("Numero convertido: "+numConvert);
		sc.close();*/
		//OCTAL
		/*System.out.println("Introduce un numero en octal");
		num=sc.next();
		for(int i=num.length()-1; i>=0; i--) {
			numConvert=numConvert+Integer.parseInt(Character.toString(num.charAt(i)))*(int)Math.pow(8, cont);
			cont++;
		}
		System.out.println("Numero convertido: "+numConvert);
		sc.close();*/
		//HEXADECIMAL
		/*System.out.println("Introduce un numero en binario");
		num=sc.next();
		for(int i=num.length()-1; i>=0; i--) {
			if(num.charAt(i)=='F'||num.charAt(i)=='f') {
				numConvert=numConvert+15*(int)Math.pow(16, cont);
			} else if(num.charAt(i)=='E'||num.charAt(i)=='e') {
				numConvert=numConvert+14*(int)Math.pow(16, cont);
			}else if(num.charAt(i)=='D'||num.charAt(i)=='d') {
				numConvert=numConvert+13*(int)Math.pow(16, cont);
			}else if(num.charAt(i)=='C'||num.charAt(i)=='c') {
				numConvert=numConvert+12*(int)Math.pow(16, cont);
			}else if(num.charAt(i)=='B'||num.charAt(i)=='b') {
				numConvert=numConvert+11*(int)Math.pow(16, cont);
			}else if(num.charAt(i)=='A'||num.charAt(i)=='a') {
				numConvert=numConvert+10*(int)Math.pow(16, cont);
			}else {
				numConvert=numConvert+Integer.parseInt(Character.toString(num.charAt(i)))*(int)Math.pow(16, cont);
			}
			cont++;
		}
		System.out.println("Numero convertido: "+numConvert);
		sc.close();*/
		System.out.println("Introduce un numero");
		num=sc.next();
		System.out.println(MetodosDeCambio.deHexadecimalADecimal(num));
		sc.close();
	}

}
