package Pruebas;
import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		String nom;
		System.out.println("Introduce el tamaño del array");
		i=sc.nextInt();
		if(i<=0) {
			while(i<=0) {
				System.out.println("Introduce un numero positvo para el array");
				i=sc.nextInt();
			}
		}
		String[] array1=new String[i];
		int[] array2=new int[i];
		for(int a=0; a<array1.length; a++) {
			System.out.println("Introduce el nombre "+(a+1));
			nom=sc.next();
			array1[a]=nom;
			array2[a]=nom.length();
		}
		for(int a=0; a<array1.length; a++) {
			System.out.println("El nombre <"+array1[a]+"> tiene "+array2[a]+" letras");
		}
		sc.close();
	}

}
