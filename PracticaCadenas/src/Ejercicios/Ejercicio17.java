package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Introducir numero entero menor o igual que 5000");
		num=sc.nextInt();
		while(num==5000) {
			System.out.print("|V|");
			num=num-5000;
		}
		while(num>=4000) {
			System.out.print("M|V|");
			num=num-4000;
		}
		while(num>=1000) {
			System.out.print("M");
			num=num-1000;
		}
		while(num>=900) {
			System.out.print("CM");
			num=num-900;
		}
		while(num>=800) {
			System.out.print("DCCC");
			num = num-800;
		}
		while(num>=700) {
			System.out.print("DCC");
			num=num-700;
		}
		while(num>=600) {
			System.out.print("DC");
			num=num-600;
		}
		while(num>=500) {
			System.out.print("D");
			num=num-500;
		}
		while(num>=400) {
			System.out.print("CD");
			num=num-400;
		}
		while(num>=300) {
			System.out.print("CCC");
			num=num-300;
		}
		while(num>=200) {
			System.out.print("CC");
			num=num-200;
		}
		while(num>=100) {
			System.out.print("C");
			num=num-100;
		}
		while(num>=90) {
			System.out.print("XC");
			num=num-90;
		}
		while(num>=80) {
			System.out.print("LXXX");
			num=num-80;
		}
		while(num>=70) {
			System.out.print("LXX");
			num=num-70;
		}
		while(num>=60) {
			System.out.print("LX");
			num=num-60;
		}
		while(num>=50) {
			System.out.print("L");
			num=num-50;
		}
		while(num>=40) {
			System.out.print("XL");
			num=num-40;
		}
		while(num>=10) {
			System.out.print("X");
			num=num-10;
		}
		while(num>=9) {
			System.out.print("IX");
			num=num-9;
		}
		while(num>=8) {
			System.out.print("VIII");
			num=num-8;
		}
		while(num>=7) {
			System.out.print("VII");
			num=num-7;
		}
		while(num>=6) {
			System.out.print("VI");
			num=num-6;
		}
		while(num>=5) {
			System.out.print("V");
			num=num-5;
		}
		while(num>=4) {
			System.out.print("IV");
			num=num-4;
		}
		while(num>=1) {
			System.out.print("I");
			num=num-1;
		}
		sc.close();
	}
}