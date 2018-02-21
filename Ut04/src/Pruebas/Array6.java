package Pruebas;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i, num;
		System.out.println("Introduce el tamaño del array");
		i=sc.nextInt();
		if(i<0) {
			while(i<0) {
				System.out.println("Introduce un numero positvo para el array");
				i=sc.nextInt();
			}
		}
		int[] array=new int[i];
		System.out.println("Introduce el numero a multiplicar");
		num=sc.nextInt();
		for(int a=0;a<array.length;a++) {
			array[a]=num*(a+1);
		}
		System.out.println("Estos son los multiplos");
		for(int a=0;a<array.length;a++) {
			System.out.println(array[a]);
		}
		sc.close();
	}

}
