package Pruebas;
import java.util.Scanner;
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("¿Cuantos numeros vas a añadir al array?");
		num=sc.nextInt();
		int array[]=new int[num];
		for(int i=0; i<num; i++) {
			System.out.println("Introduce un numero");
			array[i]=sc.nextInt();
		}
		System.out.println("El array");
		for(int i=0; i<num; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nEl array invertido");
		for(int i=(num-1);i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}

}
